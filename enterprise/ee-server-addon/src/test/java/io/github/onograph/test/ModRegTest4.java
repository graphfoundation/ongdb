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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("doubles/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster" + "'", str9,
        "doubles/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2002");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str11,
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2003");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/cluster" + "'", str17, "/cluster");
  }

  @Test
  public void test2004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2004");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integer/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "path/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str6, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "path/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str10, "path/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2005");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2006");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integer/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster/cluster/cluster" + "'", str7,
        "/cluster/cluster/cluster");
  }

  @Test
  public void test2007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2007");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response21 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
    org.junit.Assert.assertNotNull(response21);
  }

  @Test
  public void test2008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2008");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str13,
        "dbms/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2009");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
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
  public void test2010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2010");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("byte/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str10, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "byte/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "byte/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2011");
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
  public void test2012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2012");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-type/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2013");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str11,
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2014");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
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
  public void test2015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2015");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str6,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2016");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("index/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "index/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "index/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2017");
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
  public void test2018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2018");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster/cluster" + "'", str6,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test2019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2019");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "long", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2020");
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
  public void test2021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2021");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "long", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("float/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "float/cluster/cluster/cluster/cluster" + "'", str8,
        "float/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2022");
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
  public void test2023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2023");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2024");
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
  public void test2025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2025");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str7, "booleans/cluster/cluster/cluster");
  }

  @Test
  public void test2026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2026");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2027");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
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
  public void test2028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2028");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("doubles/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "doubles/cluster/cluster" + "'", str9,
        "doubles/cluster/cluster");
  }

  @Test
  public void test2029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2029");
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
  public void test2030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2030");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "db/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2031");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2032");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "character/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "character/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str16, "character/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2033");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test2034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2034");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2035");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2036");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
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
  public void test2037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2037");
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
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
  }

  @Test
  public void test2038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2038");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2039");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2040");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "booleans/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster" + "'", str6,
        "bytes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "booleans/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str14, "booleans/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2041");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2042");
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
    java.lang.Class<?> wildcardClass19 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2043");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
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
  }

  @Test
  public void test2044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2044");
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
  public void test2045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2045");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "boolean/cluster", outputFormat3);
  }

  @Test
  public void test2046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2046");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("map/cluster");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "map/cluster/cluster" + "'", str16,
        "map/cluster/cluster");
  }

  @Test
  public void test2047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2047");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2048");
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
  public void test2049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2049");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("string/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "string/cluster/cluster" + "'", str17,
        "string/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test2050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2050");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2051");
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
    java.lang.Class<?> wildcardClass16 = response15.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2052");
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
  public void test2053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2053");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("map");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "map/cluster" + "'", str8, "map/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "doubles/cluster/cluster/cluster/cluster" + "'", str10,
        "doubles/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2054");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "map/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2055");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("strings/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str18, "strings/cluster/cluster/cluster");
  }

  @Test
  public void test2056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2056");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2057");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("strings/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship-type/cluster/cluster/cluster" + "'", str11,
        "relationship-type/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "strings/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test2058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2058");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str11,
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2059");
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
  public void test2060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2060");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster" + "'", str6,
        "bytes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2061");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "character/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster" + "'", str10,
        "nodes/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "character/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "character/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2062");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2063");
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
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2064");
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
  public void test2065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2065");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/cluster" + "'", str12, "/cluster");
  }

  @Test
  public void test2066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2066");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2067");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2068");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("byte");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "byte/cluster" + "'", str8,
        "byte/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2069");
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
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "db/cluster/cluster" + "'", str8,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2070");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
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
  public void test2071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2071");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2072");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2073");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("character");
    java.lang.String str14 = gdbClusterApi4.reavpaString("boolean");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "character/cluster" + "'", str12,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "boolean/cluster" + "'", str14,
        "boolean/cluster");
  }

  @Test
  public void test2074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2074");
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
    javax.servlet.FilterConfig filterConfig19 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig19);
    javax.servlet.FilterConfig filterConfig21 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig21);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig24 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig24);
  }

  @Test
  public void test2075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2075");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2076");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "path/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2077");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("exception/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "exception/cluster/cluster/cluster/cluster" + "'", str8,
        "exception/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2078");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
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
  public void test2079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2079");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2080");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "shorts/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2081");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2082");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("strings/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "strings/cluster/cluster/cluster/cluster" + "'", str8,
        "strings/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2083");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "strings/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str7, "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2084");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "db/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("nodes");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nodes/cluster" + "'", str8,
        "nodes/cluster");
  }

  @Test
  public void test2085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2085");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2086");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster" + "'", str8,
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2087");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("uri/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "uri/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "uri/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2088");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "node/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("string/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "string/cluster/cluster" + "'", str6,
        "string/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster/cluster" + "'", str8,
        "graphdb/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2089");
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
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
  }

  @Test
  public void test2090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2090");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster/cluster/cluster",
        outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test2091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2091");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2092");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
    java.lang.String str20 = gdbClusterApi4.reavpaString(
        "characters/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response21 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "map/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "characters/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str20, "characters/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response21);
  }

  @Test
  public void test2093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2093");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str10, "strings/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/cluster" + "'", str13, "/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2094");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("index/cluster/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("map");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "index/cluster/cluster/cluster/cluster" + "'", str10,
        "index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str12, "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "map/cluster" + "'", str14,
        "map/cluster");
  }

  @Test
  public void test2095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2095");
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
    java.lang.String str19 = gdbClusterApi4.reavpaString("path/cluster/cluster/cluster");
    java.lang.String str21 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response22 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "path/cluster/cluster/cluster/cluster" + "'", str19,
        "path/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'",
        str21, "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response22);
  }

  @Test
  public void test2096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2096");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2097");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str18 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str16, "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str18, "nodes/cluster/cluster/cluster");
  }

  @Test
  public void test2098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2098");
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
  public void test2099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2099");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster" + "'", str12,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2100");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("plugins/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "plugins/cluster/cluster" + "'", str14,
        "plugins/cluster/cluster");
  }

  @Test
  public void test2101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2101");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2102");
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
    authorizationModuleEnterpriseImpl22.stop();
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
  public void test2103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2103");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "properties/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2104");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "relationships/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationships/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "relationships/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2105");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "index/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2106");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "shorts/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2107");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationships/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2108");
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
  public void test2109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2109");
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
    javax.ws.rs.core.Response response19 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test2110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2110");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "relationship/cluster/cluster" + "'",
        str9, "relationship/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2111");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugin/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs/cluster/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("short/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "longs/cluster/cluster/cluster/cluster" + "'", str8,
        "longs/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster/cluster" + "'", str10,
        "short/cluster/cluster");
  }

  @Test
  public void test2112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2112");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("plugin/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str8, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "plugin/cluster/cluster/cluster" + "'",
        str10, "plugin/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2113");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("long");
    java.lang.String str8 = gdbClusterApi4.reavpaString("bytes/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long/cluster" + "'", str6,
        "long/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bytes/cluster/cluster/cluster" + "'",
        str8, "bytes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2114");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2115");
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
    java.lang.String str24 = gdbClusterApi4.reavpaString("dbms/cluster");
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
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "dbms/cluster/cluster" + "'", str24,
        "dbms/cluster/cluster");
  }

  @Test
  public void test2116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2116");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("/cluster/cluster/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("db/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster/cluster/cluster/cluster" + "'",
        str11, "/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "db/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2117");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
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
  }

  @Test
  public void test2118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2118");
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
    javax.servlet.FilterConfig filterConfig20 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig20);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2119");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("node/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "node/cluster/cluster/cluster/cluster" + "'", str9,
        "node/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2120");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str13,
        "characters/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2121");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str12, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2122");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2123");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2124");
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
  public void test2125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2125");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    java.lang.String str8 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2126");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster/cluster" + "'", str8,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2127");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2128");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "booleans/cluster" + "'", str12,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2129");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("path");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "path/cluster" + "'", str12,
        "path/cluster");
  }

  @Test
  public void test2130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2130");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "map", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationships");
    java.lang.String str8 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("string/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationships/cluster" + "'", str6,
        "relationships/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str8, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "string/cluster/cluster" + "'", str10,
        "string/cluster/cluster");
  }

  @Test
  public void test2131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2131");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2132");
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
    authorizationModuleEnterpriseImpl27.stop();
    authorizationModuleEnterpriseImpl27.stop();
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test2133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2133");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "double/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2134");
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
  public void test2135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2135");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str8, "graphdb/cluster/cluster/cluster");
  }

  @Test
  public void test2136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2136");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
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
  public void test2137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2137");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test2138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2138");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test2139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2139");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster/cluster" + "'", str7,
        "integer/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster" + "'", str12,
        "integers/cluster");
  }

  @Test
  public void test2140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2140");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2141");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("bytes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "bytes/cluster/cluster/cluster/cluster" + "'", str8,
        "bytes/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2142");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "characters/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2143");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("relationships/cluster/cluster");
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "booleans/cluster" + "'", str12,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationships/cluster/cluster/cluster" + "'", str16,
        "relationships/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2144");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "map/cluster/cluster/cluster/cluster" + "'", str10,
        "map/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "nodes/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2145");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2146");
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
  public void test2147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2147");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "string/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "string/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str15, "string/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2148");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
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
  public void test2149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2149");
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
    javax.ws.rs.core.Response response22 = gdbClusterApi4.avllResponse();
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
  public void test2150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2150");
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
  public void test2151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2151");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("hi!/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "hi!/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "hi!/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2152");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2153");
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
    authorizationModuleEnterpriseImpl27.stop();
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
  public void test2154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2154");
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
  public void test2155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2155");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("node/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "node/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "node/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2156");
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
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2157");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integer/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2158");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("characters/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "characters/cluster/cluster" + "'", str6,
        "characters/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2159");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2160");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("paths/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
        "'" + str15 + "' != '" + "paths/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "paths/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2161");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/cluster" + "'", str15, "/cluster");
  }

  @Test
  public void test2162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2162");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "db/cluster/cluster" + "'", str8,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2163");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("");
    java.lang.String str18 = gdbClusterApi4.reavpaString(
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/cluster" + "'", str16, "/cluster");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str18,
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2164");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
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
  public void test2165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2165");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test2166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2166");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
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
  public void test2167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2167");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "character/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2168");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
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
  public void test2169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2169");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str8, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str11, "long/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2170");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
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
  public void test2171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2171");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
    java.lang.String str20 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
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
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str20,
        "characters/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2172");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2173");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2174");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2175");
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
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2176");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2177");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugin/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2178");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2179");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2180");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2181");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationships/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationship-type/cluster" + "'", str6,
        "relationship-type/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str8, "paths/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationships/cluster/cluster/cluster/cluster" + "'", str12,
        "relationships/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2182");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
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
  }

  @Test
  public void test2183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2183");
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
    javax.ws.rs.core.Response response19 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response21 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response21);
  }

  @Test
  public void test2184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2184");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
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
  public void test2185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2185");
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
  public void test2186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2186");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("long/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "long/cluster/cluster" + "'", str11,
        "long/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2187");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("floats");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "floats/cluster" + "'", str11,
        "floats/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2188");
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
  public void test2189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2189");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("map/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster/cluster" + "'", str13,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2190");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2191");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2192");
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
  public void test2193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2193");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str12, "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2194");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "properties/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("path/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "path/cluster/cluster/cluster/cluster" + "'", str6,
        "path/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test2195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2195");
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
  public void test2196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2196");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "characters/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2197");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
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
  public void test2198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2198");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2199");
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
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster/cluster" + "'", str7,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2200");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "boolean/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "boolean/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str14, "boolean/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2201");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "relationships/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationships/cluster/cluster/cluster/cluster/cluster" + "'",
        str11, "relationships/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2202");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2203");
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
    javax.servlet.FilterConfig filterConfig19 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig19);
    javax.servlet.FilterConfig filterConfig21 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig21);
    javax.servlet.FilterConfig filterConfig23 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig23);
  }

  @Test
  public void test2204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2204");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2205");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "boolean", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("character/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "character/cluster/cluster" + "'", str6,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2206");
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
  public void test2207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2207");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("boolean/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "graphdb/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "boolean/cluster/cluster" + "'", str7,
        "boolean/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "graphdb/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str10, "graphdb/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2208");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str15,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2209");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2210");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("");
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/cluster" + "'", str13, "/cluster");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2211");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2212");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster/cluster" + "'", str7,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "exception/cluster/cluster" + "'", str11,
        "exception/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2213");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString("doubles/cluster");
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "doubles/cluster/cluster" + "'", str19,
        "doubles/cluster/cluster");
  }

  @Test
  public void test2214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2214");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test2215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2215");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test2216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2216");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("exception/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "exception/cluster/cluster/cluster" + "'",
        str7, "exception/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2217");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2218");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
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
  }

  @Test
  public void test2219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2219");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2220");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("plugin/cluster/cluster/cluster");
    java.lang.String str19 = gdbClusterApi4.reavpaString(
        "string/cluster/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "plugin/cluster/cluster/cluster/cluster" + "'", str17,
        "plugin/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "string/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str19, "string/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2221");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
  }

  @Test
  public void test2222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2222");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'",
        str18, "relationship/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2223");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
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
  public void test2224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2224");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "characters/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str10, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "characters/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str13, "characters/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2225");
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
  public void test2226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2226");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str8, "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2227");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2228");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2229");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("integer/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "integer/cluster/cluster/cluster/cluster" + "'", str12,
        "integer/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2230");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2231");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass20 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test2232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2232");
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
    authorizationModuleEnterpriseImpl28.stop();
    org.junit.Assert.assertNotNull(pattern5);
    org.junit.Assert.assertEquals(pattern5.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test2233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2233");
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
  public void test2234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2234");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "db/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2235");
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
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
  }

  @Test
  public void test2236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2236");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("characters/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "characters/cluster/cluster/cluster" + "'", str12,
        "characters/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test2237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2237");
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
    java.lang.String str22 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str22, "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2238");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "dbms/cluster/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2239");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2240");
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
  public void test2241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2241");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("nodes/cluster");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nodes/cluster/cluster" + "'", str16,
        "nodes/cluster/cluster");
  }

  @Test
  public void test2242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2242");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str12, "index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str15, "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2243");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2244");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2245");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test2246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2246");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2247");
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
    javax.servlet.FilterConfig filterConfig20 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig20);
  }

  @Test
  public void test2248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2248");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
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
  public void test2249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2249");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "db/cluster/cluster/cluster" + "'",
        str15, "db/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test2250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2250");
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
  public void test2251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2251");
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
  public void test2252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2252");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "boolean", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2253");
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
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2254");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
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
  public void test2255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2255");
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
    authorizationModuleEnterpriseImpl58.stop();
    authorizationModuleEnterpriseImpl58.stop();
    authorizationModuleEnterpriseImpl58.stop();
    authorizationModuleEnterpriseImpl58.stop();
    authorizationModuleEnterpriseImpl58.stop();
    org.junit.Assert.assertNotNull(pattern11);
    org.junit.Assert.assertEquals(pattern11.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test2256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2256");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2257");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "plugins/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2258");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("floats/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "floats/cluster/cluster/cluster" + "'",
        str14, "floats/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2259");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("bytes");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bytes/cluster" + "'", str7,
        "bytes/cluster");
  }

  @Test
  public void test2260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2260");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2261");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2262");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "paths/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "character/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "character/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str7, "character/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2263");
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
    authorizationModuleEnterpriseImpl82.stop();
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
  public void test2264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2264");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test2265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2265");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("graphdb/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "graphdb/cluster/cluster" + "'", str9,
        "graphdb/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2266");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "booleans/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationships/cluster" + "'", str12,
        "relationships/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "booleans/cluster/cluster/cluster/cluster/cluster" + "'", str16,
        "booleans/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2267");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2268");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2269");
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
    java.lang.Class<?> wildcardClass12 = response11.getClass();
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
  public void test2270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2270");
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
    authorizationModuleEnterpriseImpl62.stop();
    authorizationModuleEnterpriseImpl62.stop();
    authorizationModuleEnterpriseImpl62.stop();
    authorizationModuleEnterpriseImpl62.stop();
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
  public void test2271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2271");
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
  public void test2272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2272");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2273");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "properties/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test2274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2274");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2275");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass18 = response17.getClass();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2276");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/cluster" + "'", str12, "/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2277");
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
  public void test2278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2278");
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
    java.lang.Class<?> wildcardClass11 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2279");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str11,
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2280");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("bytes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationships/cluster/cluster/cluster" + "'", str10,
        "relationships/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "characters/cluster" + "'", str12,
        "characters/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "bytes/cluster/cluster/cluster/cluster" + "'", str16,
        "bytes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2281");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("paths/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("paths/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "paths/cluster/cluster" + "'", str10,
        "paths/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "paths/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "paths/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2282");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2283");
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
    authorizationModuleEnterpriseImpl58.stop();
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
  public void test2284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2284");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
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
  public void test2285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2285");
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
    javax.servlet.FilterConfig filterConfig19 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig19);
    java.lang.Class<?> wildcardClass21 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2286");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "plugins/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2287");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.reoyResponse();
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
        "'" + str17 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str17,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test2288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2288");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("path/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "path/cluster/cluster" + "'", str10,
        "path/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str12, "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2289");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "db/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test2290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2290");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "dbms/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2291");
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
  public void test2292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2292");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "character/cluster/cluster" + "'", str8,
        "character/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!/cluster/cluster/cluster" + "'",
        str10, "hi!/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2293");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
  }

  @Test
  public void test2294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2294");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "bytes/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2295");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass19 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2296");
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
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2297");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("plugins/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "plugins/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "plugins/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2298");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString(
        "byte/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "byte/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str19, "byte/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test2299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2299");
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
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2300");
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
  public void test2301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2301");
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
  public void test2302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2302");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles");
    java.lang.String str12 = gdbClusterApi4.reavpaString("character/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "character/cluster/cluster/cluster/cluster" + "'", str12,
        "character/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2303");
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
  public void test2304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2304");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
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
  }

  @Test
  public void test2305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2305");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("longs/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "longs/cluster/cluster" + "'", str13,
        "longs/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2306");
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
    java.lang.Class<?> wildcardClass13 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2307");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("exception");
    java.lang.String str19 = gdbClusterApi4.reavpaString("boolean/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "exception/cluster" + "'", str17,
        "exception/cluster");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "boolean/cluster/cluster/cluster/cluster/cluster" + "'", str19,
        "boolean/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test2308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2308");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str19 = gdbClusterApi4.reavpaString("");
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str17, "long/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/cluster" + "'", str19, "/cluster");
  }

  @Test
  public void test2309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2309");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "string/cluster/cluster/cluster" + "'",
        str8, "string/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2310");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("strings/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str8, "strings/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2311");
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
  public void test2312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2312");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("node");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "node/cluster" + "'", str8,
        "node/cluster");
  }

  @Test
  public void test2313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2313");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster" + "'", str11, "/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2314");
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
        "byte/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass24 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "byte/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str23,
        "byte/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass24);
  }

  @Test
  public void test2315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2315");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "relationship-index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship-index/cluster/cluster/cluster/cluster/cluster" + "'",
        str8, "relationship-index/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2316");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2317");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.wraeResponse();
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
  }

  @Test
  public void test2318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2318");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("string/cluster/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("floats/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster" + "'", str6,
        "bytes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "string/cluster/cluster/cluster/cluster" + "'", str10,
        "string/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "floats/cluster/cluster" + "'", str12,
        "floats/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str14, "relationship/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2319");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integer/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationship/cluster" + "'", str6,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2320");
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
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2321");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2322");
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
    java.lang.Class<?> wildcardClass13 = response12.getClass();
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
  public void test2323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2323");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str10, "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2324");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("float");
    java.lang.String str9 = gdbClusterApi4.reavpaString(
        "relationship-index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "float/cluster" + "'", str7,
        "float/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship-index/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship-index/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2325");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2326");
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
  public void test2327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2327");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship-type");
    java.lang.String str8 = gdbClusterApi4.reavpaString("paths/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationships/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationship-type/cluster" + "'", str6,
        "relationship-type/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str8, "paths/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationships/cluster/cluster" + "'",
        str12, "relationships/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2328");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "string/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "string/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str11, "string/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2329");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
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
  public void test2330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2330");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("characters/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "characters/cluster/cluster/cluster" + "'", str12,
        "characters/cluster/cluster/cluster");
  }

  @Test
  public void test2331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2331");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "integers/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2332");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2333");
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
    java.util.regex.Pattern[] patternArray15 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList16 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList16, patternArray15);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider50,
        authManagerSupplier51, webServer52);
    org.neo4j.logging.LogProvider logProvider54 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier55 = null;
    org.neo4j.server.web.WebServer webServer56 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl57 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider54,
        authManagerSupplier55, webServer56);
    org.neo4j.logging.LogProvider logProvider58 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier59 = null;
    org.neo4j.server.web.WebServer webServer60 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl61 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider58,
        authManagerSupplier59, webServer60);
    org.neo4j.logging.LogProvider logProvider62 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier63 = null;
    org.neo4j.server.web.WebServer webServer64 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl65 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider62,
        authManagerSupplier63, webServer64);
    org.neo4j.logging.LogProvider logProvider66 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier67 = null;
    org.neo4j.server.web.WebServer webServer68 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl69 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider66,
        authManagerSupplier67, webServer68);
    org.neo4j.logging.LogProvider logProvider70 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier71 = null;
    org.neo4j.server.web.WebServer webServer72 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl73 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider70,
        authManagerSupplier71, webServer72);
    org.neo4j.logging.LogProvider logProvider74 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier75 = null;
    org.neo4j.server.web.WebServer webServer76 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl77 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider74,
        authManagerSupplier75, webServer76);
    try {
      authorizationModuleEnterpriseImpl77.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test2334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2334");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
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
  public void test2335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2335");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2336");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "db/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugin/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugin/cluster/cluster/cluster" + "'",
        str6, "plugin/cluster/cluster/cluster");
  }

  @Test
  public void test2337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2337");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2338");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("doubles/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("strings/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str7, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "strings/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2339");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "boolean/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2340");
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
    authorizationModuleEnterpriseImpl63.stop();
    authorizationModuleEnterpriseImpl63.stop();
    java.lang.Class<?> wildcardClass68 = authorizationModuleEnterpriseImpl63.getClass();
    org.junit.Assert.assertNotNull(pattern12);
    org.junit.Assert.assertEquals(pattern12.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(wildcardClass68);
  }

  @Test
  public void test2341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2341");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString("uri/cluster/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("node");
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "uri/cluster/cluster/cluster/cluster" + "'", str10,
        "uri/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "node/cluster" + "'", str13,
        "node/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2342");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integer/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str6, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2343");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "node-index/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2344");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str8,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2345");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2346");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "relationships/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationships/cluster/cluster/cluster/cluster/cluster" + "'",
        str11, "relationships/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2347");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2348");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("short");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "short/cluster" + "'", str9,
        "short/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2349");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.reoyResponse();
    java.lang.String str21 = gdbClusterApi4.reavpaString(
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
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "integer/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str21, "integer/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2350");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "path/cluster" + "'", str9,
        "path/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2351");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "paths/cluster/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2352");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2353");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "integer/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "integer/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str6, "integer/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2354");
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test2355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2355");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2356");
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
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test2357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2357");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
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
  public void test2358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2358");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
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
  public void test2359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2359");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test2360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2360");
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
  public void test2361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2361");
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
    authorizationModuleEnterpriseImpl68.stop();
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
  public void test2362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2362");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "plugins/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2363");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
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
  public void test2364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2364");
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
    javax.ws.rs.core.Response response15 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response16 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response17 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response18 = dbmsApi1.sttResponse();
    java.lang.Class<?> wildcardClass19 = dbmsApi1.getClass();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2365");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "index/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2366");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2367");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2368");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("graphdb");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "graphdb/cluster" + "'", str6,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster/cluster" + "'", str9,
        "uri/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str11,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2369");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("map");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "map/cluster" + "'", str15,
        "map/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2370");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2371");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugin/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2372");
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
    javax.ws.rs.core.Response response15 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response16 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response17 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response18 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response19 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response20 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response21 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response22 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response23 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response24 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response25 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response26 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response27 = dbmsApi1.sttResponse();
    java.lang.Class<?> wildcardClass28 = dbmsApi1.getClass();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
    org.junit.Assert.assertNotNull(response21);
    org.junit.Assert.assertNotNull(response22);
    org.junit.Assert.assertNotNull(response23);
    org.junit.Assert.assertNotNull(response24);
    org.junit.Assert.assertNotNull(response25);
    org.junit.Assert.assertNotNull(response26);
    org.junit.Assert.assertNotNull(response27);
    org.junit.Assert.assertNotNull(wildcardClass28);
  }

  @Test
  public void test2373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2373");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test2374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2374");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString(
        "characters/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "characters/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str9, "characters/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2375");
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
  public void test2376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2376");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "map/cluster/cluster/cluster/cluster" + "'", str11,
        "map/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2377");
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
  public void test2378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2378");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "relationship-index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str11,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationship-index/cluster/cluster/cluster/cluster" + "'", str16,
        "relationship-index/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2379");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("character/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "map/cluster/cluster" + "'", str10,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "character/cluster/cluster/cluster/cluster" + "'", str13,
        "character/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2380");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2381");
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
  public void test2382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2382");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "index/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "index/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str11,
        "index/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2383");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2384");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str11, "/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2385");
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
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2386");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "map/cluster/cluster/cluster/cluster" + "'", str10,
        "map/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "nodes/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str14, "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2387");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("strings/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "strings/cluster/cluster" + "'", str8,
        "strings/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2388");
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
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
  }

  @Test
  public void test2389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2389");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("boolean/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster" + "'", str8,
        "paths/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str10,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "boolean/cluster/cluster" + "'", str13,
        "boolean/cluster/cluster");
  }

  @Test
  public void test2390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2390");
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
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2391");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "map/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2392");
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
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2393");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test2394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2394");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "node/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "db/cluster/cluster/cluster" + "'", str6,
        "db/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2395");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str17, "long/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test2396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2396");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
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
  public void test2397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2397");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "integer/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2398");
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
  public void test2399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2399");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("plugin/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "byte/cluster/cluster" + "'", str9,
        "byte/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "plugin/cluster/cluster" + "'", str12,
        "plugin/cluster/cluster");
  }

  @Test
  public void test2400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2400");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "uri/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2401");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2402");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
  }

  @Test
  public void test2403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2403");
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
  public void test2404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2404");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("map/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("float/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "map/cluster/cluster" + "'", str12,
        "map/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "float/cluster/cluster/cluster/cluster" + "'", str14,
        "float/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2405");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
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
  public void test2406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2406");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
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
  }

  @Test
  public void test2407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2407");
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
  public void test2408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2408");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
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
  public void test2409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2409");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2410");
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
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig20 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig20);
  }

  @Test
  public void test2411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2411");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "db/cluster/cluster" + "'", str8,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "plugins/cluster/cluster" + "'", str11,
        "plugins/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2412");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/cluster" + "'", str17, "/cluster");
  }

  @Test
  public void test2413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2413");
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
    javax.servlet.FilterConfig filterConfig20 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig20);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest23 = null;
    javax.servlet.ServletResponse servletResponse24 = null;
    javax.servlet.FilterChain filterChain25 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest23, servletResponse24,
          filterChain25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2414");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
  }

  @Test
  public void test2415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2415");
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
  public void test2416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2416");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-type/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test2417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2417");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
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
        "'" + str18 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str18,
        "characters/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2418");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2419");
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
    java.lang.Class<?> wildcardClass18 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2420");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("path");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "path/cluster" + "'", str16,
        "path/cluster");
  }

  @Test
  public void test2421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2421");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2422");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig19 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig19);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig23 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig23);
  }

  @Test
  public void test2423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2423");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "path/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "path/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "path/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2424");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("strings");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster/cluster" + "'", str6,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "strings/cluster" + "'", str9,
        "strings/cluster");
  }

  @Test
  public void test2425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2425");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "paths/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2426");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "hi!/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test2427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2427");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2428");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster" + "'", str11, "/cluster");
  }

  @Test
  public void test2429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2429");
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
  public void test2430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2430");
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
    java.lang.Class<?> wildcardClass48 = patternList10.getClass();
    org.junit.Assert.assertNotNull(patternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(wildcardClass48);
  }

  @Test
  public void test2431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2431");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "index/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "index/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str8,
        "index/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2432");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2433");
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
    javax.ws.rs.core.Response response20 = gdbClusterApi4.sttResponse();
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
  public void test2434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2434");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
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
  public void test2435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2435");
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
  public void test2436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2436");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str10, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2437");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("bytes");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index/cluster" + "'", str11,
        "index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bytes/cluster" + "'", str14,
        "bytes/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2438");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "map/cluster/cluster/cluster/cluster" + "'", str10,
        "map/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "nodes/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2439");
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
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2440");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str8,
        "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2441");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("");
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str10, "strings/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/cluster" + "'", str13, "/cluster");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2442");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("shorts/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster" + "'", str11, "/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "shorts/cluster/cluster" + "'", str15,
        "shorts/cluster/cluster");
  }

  @Test
  public void test2443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2443");
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
  public void test2444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2444");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2445");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer/cluster/cluster/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "paths/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "integer/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "integer/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "paths/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str12, "paths/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2446");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("paths/cluster/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("short");
    java.lang.String str16 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster" + "'", str6,
        "bytes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "paths/cluster/cluster/cluster/cluster" + "'", str12,
        "paths/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "short/cluster" + "'", str14,
        "short/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/cluster" + "'", str16, "/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2447");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str12, "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2448");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("characters/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "characters/cluster/cluster/cluster" + "'", str12,
        "characters/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str14,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationship-type/cluster/cluster/cluster" + "'", str16,
        "relationship-type/cluster/cluster/cluster");
  }

  @Test
  public void test2449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2449");
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
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
  }

  @Test
  public void test2450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2450");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response21 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
    org.junit.Assert.assertNotNull(response21);
  }

  @Test
  public void test2451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2451");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "index/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "index/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str8,
        "index/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2452");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2453");
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
  public void test2454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2454");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2455");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2456");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "shorts/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2457");
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
    authorizationModuleEnterpriseImpl43.stop();
    authorizationModuleEnterpriseImpl43.stop();
    org.junit.Assert.assertNotNull(pattern8);
    org.junit.Assert.assertEquals(pattern8.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test2458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2458");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "shorts/cluster" + "'", str18,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test2459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2459");
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
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "db/cluster/cluster" + "'", str8,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2460");
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
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
  }

  @Test
  public void test2461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2461");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationships/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    java.lang.String str10 = gdbClusterApi4.reavpaString("double/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationships/cluster/cluster" + "'",
        str6, "relationships/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "double/cluster/cluster/cluster" + "'",
        str10, "double/cluster/cluster/cluster");
  }

  @Test
  public void test2462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2462");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("bytes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "character/cluster/cluster" + "'", str8,
        "character/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!/cluster/cluster/cluster" + "'",
        str10, "hi!/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "bytes/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "bytes/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2463");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
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
  public void test2464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2464");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test2465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2465");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "dbms/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
  }

  @Test
  public void test2466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2466");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
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
  public void test2467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2467");
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
  public void test2468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2468");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test2469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2469");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test2470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2470");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2471");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("index/cluster/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("node/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "index/cluster/cluster/cluster/cluster" + "'", str14,
        "index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "node/cluster/cluster/cluster/cluster" + "'", str16,
        "node/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test2472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2472");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
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
  }

  @Test
  public void test2473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2473");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "character/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test2474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2474");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-type");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "node/cluster" + "'", str10,
        "node/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationship-type/cluster" + "'", str12,
        "relationship-type/cluster");
  }

  @Test
  public void test2475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2475");
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
    java.lang.Class<?> wildcardClass14 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2476");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2477");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test2478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2478");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "index/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str6, "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str8, "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "index/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "index/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2479");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
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
  public void test2480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2480");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2481");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2482");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "paths/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/cluster" + "'", str6, "/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test2483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2483");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("paths/cluster/cluster/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("uri");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "paths/cluster/cluster/cluster/cluster" + "'", str11,
        "paths/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uri/cluster" + "'", str13,
        "uri/cluster");
  }

  @Test
  public void test2484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2484");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("index/cluster/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "index/cluster/cluster/cluster/cluster" + "'", str14,
        "index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test2485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2485");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("plugins");
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "map/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "plugins/cluster" + "'", str8,
        "plugins/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str10, "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2486");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "map/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test2487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2487");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test2488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2488");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str10, "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2489");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2490");
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
    javax.servlet.FilterConfig filterConfig25 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig25);
  }

  @Test
  public void test2491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2491");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/cluster" + "'", str12, "/cluster");
  }

  @Test
  public void test2492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2492");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test2493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2493");
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
  public void test2494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2494");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
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
  public void test2495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2495");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("float");
    java.lang.String str9 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("hi!/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "float/cluster" + "'", str7,
        "float/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str9, "dbms/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "hi!/cluster/cluster/cluster/cluster" + "'", str11,
        "hi!/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2496");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("string/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "node/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "string/cluster/cluster/cluster" + "'",
        str8, "string/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "node/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str10, "node/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test2497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2497");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("relationships");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "relationships/cluster" + "'", str10,
        "relationships/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test2498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2498");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str9,
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test2499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2499");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2500");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship-type/cluster/cluster/cluster" + "'", str11,
        "relationship-type/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str14,
        "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }
}

