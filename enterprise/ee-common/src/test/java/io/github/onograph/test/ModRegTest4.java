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
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Advertised hostname/IP address and port for the transaction shipping server.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2002");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("annotationData");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2003");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2004");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("rotation_total_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2005");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("ccstate", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("rollbacks", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.",
        objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'", str9,
        "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str10, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str11,
        "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2006");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.jmx.enabled", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "<relationship.property>[,<relationship.property>...]", objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str17,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.jmx.enabled" + "'", str19,
        "MISSING VAL FOR KEY:metrics.jmx.enabled");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:<relationship.property>[,<relationship.property>...]" + "'", str20,
        "MISSING VAL FOR KEY:<relationship.property>[,<relationship.property>...]");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2007");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("messages_failed");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2008");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--keep-only-nodes-with-labels");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2009");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_req_get_info");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2010");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.security.createUser", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("BatchSize", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Enable reporting metrics about number of occurred replanning events. Deprecated - use metrics.filter instead.",
        objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str12, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str14, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about number of occurred replanning events. Deprecated - use metrics.filter instead."
            + "'", str16,
        "MISSING VAL FOR KEY:Enable reporting metrics about number of occurred replanning events. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2011");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of page evictions executed by the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2012");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Amount of memory (in bytes) currently used. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2013");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The time to live (TTL) for cached authentication and authorization info when using external auth providers (LDAP or plugin). Setting the TTL to 0 will disable auth caching. Disabling caching while using the LDAP auth provider requires the use of an LDAP system account for resolving authorization information.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2014");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("prefer-follower");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2015");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "Estimated number of active threads in the current thread group. (gauge)", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)"
            + "'", str2,
        "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)");
  }

  @Test
  public void test2016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2016");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("query");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2017");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.createUser", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("BatchSize", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("total_time", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str11, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str13, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:total_time" + "'",
        str14, "MISSING VAL FOR KEY:total_time");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2018");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("days", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("LabelQualifierAll", objArray5);
    java.lang.Class<?> wildcardClass11 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str6,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str8, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:days" + "'", str9,
        "MISSING VAL FOR KEY:days");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str10,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2019");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("status", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:status" + "'", str8,
        "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str9,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2020");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("0");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2021");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "An LDAP system account password to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2022");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.csv.rotation.size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2023");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to ignore. Can not be combined with --skip-node-properties, --keep-only-node-properties, --skip-relationship-properties or --keep-only-relationship-properties.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2024");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("high_limitV3_2_0");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2025");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray5);
    java.lang.Class<?> wildcardClass11 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str6,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str8, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str10,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2026");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_res_catchup_error");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2027");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("replication_maybe", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_resolution_timeout", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.cluster.min_nr_of_members", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("In-flight cache total bytes. (gauge)",
        objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str16,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str17,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str18,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str19,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.discovery_resolution_timeout" + "'", str20,
        "MISSING VAL FOR KEY:causal_clustering.discovery_resolution_timeout");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.min_nr_of_members" + "'",
        str21, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.min_nr_of_members");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:In-flight cache total bytes. (gauge)" + "'",
        str22, "MISSING VAL FOR KEY:In-flight cache total bytes. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2028");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Size of replicated data structures. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2029");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("authorization");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2030");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "*causal_clustering.core.replication_attempt");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2031");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("invisible", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("dec_dispatch", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str15, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2032");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.discovery_resolution_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2033");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str10,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str11,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2034");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Retry-After");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2035");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("writable", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("User", objArray7);
    java.lang.Class<?> wildcardClass11 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str9, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:User" + "'", str10,
        "MISSING VAL FOR KEY:User");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2036");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.jvm.buffers.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2037");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2038");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.use_native_transport");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2039");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.neo4j.pagecache.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2040");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_res_database_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2041");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("count");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2042");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.upgradeDetails");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2043");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("invisible", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2044");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("read", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("total", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str12,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str13,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:total" + "'", str14,
        "MISSING VAL FOR KEY:total");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2045");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_res_info");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2046");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("get-server-id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2047");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("java.naming.factory.initial");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2048");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("server_policies", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.log_shipping_max_lag", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str16,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:server_policies" + "'", str17,
        "MISSING VAL FOR KEY:server_policies");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag" + "'",
        str18, "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2049");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Number of available processors");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2050");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of bytes read by the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2051");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:arg1", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1");
  }

  @Test
  public void test2052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2052");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("*ids_in_use.node", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("temp-copy", objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str8,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:temp-copy" + "'",
        str9, "MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2053");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("read", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory",
        objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str12,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str13,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory"
            + "'", str14,
        "MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2054");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Number of available processors", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("action", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("Privilege", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str12, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str14, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str15,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:Privilege" + "'",
        str16, "MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2055");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.max_databases", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str11,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str14,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2056");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2057");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("PageCacheProfileLoader");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2058");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("writable", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("--additional-config", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("addresses", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("visible", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str15, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str16,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str17, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str20,
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:visible" + "'",
        str22, "MISSING VAL FOR KEY:visible");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2059");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("--skip-labels", objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str10,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:--skip-labels" + "'", str11,
        "MISSING VAL FOR KEY:--skip-labels");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2060");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("RelationshipQualifier", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:RelationshipQualifier" + "'", str2,
        "MISSING VAL FOR KEY:RelationshipQualifier");
  }

  @Test
  public void test2061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2061");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*ids_in_use.property");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2062");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("invisible", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("Number of available processors",
        objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str15,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str16,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2063");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2064");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("/server/causalclustering");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2065");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("raft_content_decoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2066");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("message_validator");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2067");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("logs/", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("transaction", objArray6);
    java.lang.Class<?> wildcardClass13 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str8, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str9, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str10,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str11,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:transaction" + "'",
        str12, "MISSING VAL FOR KEY:transaction");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2068");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Discovery cluster member size. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("akka", objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str8, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str9,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2069");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("rollbacks_write");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2070");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str8 = io.github.onograph.I18N.format("dbms.pool", objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_runtime", objArray7);
    java.lang.Class<?> wildcardClass10 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:dbms.pool" + "'",
        str8, "MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime" + "'", str9,
        "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2071");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2072");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "Name of the database after restore. Usage of this option is only allowed if --from parameter point to exact one directory",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:Name of the database after restore. Usage of this option is only allowed if --from parameter point to exact one directory"
            + "'", str2,
        "MISSING VAL FOR KEY:Name of the database after restore. Usage of this option is only allowed if --from parameter point to exact one directory");
  }

  @Test
  public void test2073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2073");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("databaseStatus");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2074");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("read", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("ssl_handler", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str10, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str11,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str12, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2075");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2076");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("protocols");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2077");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("false", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("INBOUND", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Time between scanning the cluster to refresh current server's view of topology",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.neo4j.logrotation.enabled",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str17,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str18, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology"
            + "'", str19,
        "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled" + "'",
        str20, "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2078");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("frame_encoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2079");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(".Database transaction metrics",
        objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:" + "'", str8,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:.Database transaction metrics" + "'", str9,
        "MISSING VAL FOR KEY:.Database transaction metrics");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2080");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Number of available processors", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("action", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str11, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str13, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str14,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2081");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("groups", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:groups" + "'", str2,
        "MISSING VAL FOR KEY:groups");
  }

  @Test
  public void test2082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2082");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("invisible", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("dec_dispatch", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("localhost", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.group_membership_attributes", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:elapsedTimeMs",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("leader-only", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str16,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str17, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str18, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str19, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes" + "'",
        str20, "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str22, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2083");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)", objArray5);
    java.lang.Class<?> wildcardClass8 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str6,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:Raft replication attempt count. (counter)"
            + "'", str7, "MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2084");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.service_port_name");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2085");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("high_limitV3_0_0");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2086");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--additional-config");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2087");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("ssl_handler", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str10,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str12, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2088");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".Cypher metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2089");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("read", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("invisible", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.",
        objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str12,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str13, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2090");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("editor");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2091");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2092");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Applied index of the RAFT log. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2093");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("status", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("snappy_encoder", objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:status" + "'", str8,
        "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str9,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2094");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Discovery cluster member size. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("rotation_events", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.",
        objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str9, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:rotation_events" + "'", str10,
        "MISSING VAL FOR KEY:rotation_events");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands."
            + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2095");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("4.0.3");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2096");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("createLabel");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2097");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("connections_idle");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2098");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("passwordChangeRequired");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2099");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.initial_discovery_members");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2100");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2101");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("Number of available processors",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
        objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.search_for_attribute", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("yyyyMMddHHmmss", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total number of transaction log rotations executed so far. (counter)", objArray8);
    java.lang.Class<?> wildcardClass17 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str9,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str11,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str12,
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str13, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute" + "'", str14,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:yyyyMMddHHmmss" + "'", str15,
        "MISSING VAL FOR KEY:yyyyMMddHHmmss");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total number of transaction log rotations executed so far. (counter)"
            + "'", str16,
        "MISSING VAL FOR KEY:The total number of transaction log rotations executed so far. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2102");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("writable", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("--additional-config", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("publisher", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("discovery-to-neo4j-dispatcher",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("off", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str12, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str13,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:publisher" + "'",
        str14, "MISSING VAL FOR KEY:publisher");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:discovery-to-neo4j-dispatcher" + "'", str15,
        "MISSING VAL FOR KEY:discovery-to-neo4j-dispatcher");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:off" + "'", str16,
        "MISSING VAL FOR KEY:off");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2103");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "A common prefix for the reported metrics field names.", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The highest peak of concurrent transactions. (counter)", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str12,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:A common prefix for the reported metrics field names." + "'", str15,
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The highest peak of concurrent transactions. (counter)" + "'", str16,
        "MISSING VAL FOR KEY:The highest peak of concurrent transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2104");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("logs/", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("metrics", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("StoreCopy", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str9, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str10, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str11,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str12,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:metrics" + "'",
        str13, "MISSING VAL FOR KEY:metrics");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:StoreCopy" + "'",
        str14, "MISSING VAL FOR KEY:StoreCopy");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2105");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2106");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("LZ_validating", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.",
        objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str10, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:LZ_validating" + "'", str11,
        "MISSING VAL FOR KEY:LZ_validating");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use."
            + "'", str12,
        "MISSING VAL FOR KEY:Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2107");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.raft_messages_log_path", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:active",
        objArray9);
    java.lang.Class<?> wildcardClass16 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str11, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str12,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2108");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Discovery cluster member size. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("akka", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("log.*", objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str9, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str10,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:log.*" + "'", str11,
        "MISSING VAL FOR KEY:log.*");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2109");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2110");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("invisible", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.read_replica_transaction_applier_batch_size", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead."
            + "'", str15,
        "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size" + "'",
        str16, "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2111");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of relationships stored in the database. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2112");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("max_elements");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2113");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("RelationshipType");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2114");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("status", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:status" + "'", str9,
        "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str10,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2115");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("The number of remote graphs");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2116");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("dbms.directories.cluster_state",
        objArray5);
    java.lang.Class<?> wildcardClass8 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str6,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:dbms.directories.cluster_state" + "'", str7,
        "MISSING VAL FOR KEY:dbms.directories.cluster_state");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2117");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.log_shipping_retry_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2118");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("writable", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("--additional-config", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("RelationshipType", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("store.size", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str13, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str14,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str15,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str16,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms." + "'", str17,
        "MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:store.size" + "'",
        str18, "MISSING VAL FOR KEY:store.size");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2119");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("writable", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("--additional-config", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("addresses", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("in_req_type", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str15, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str16,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str17, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str20,
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:in_req_type" + "'",
        str22, "MISSING VAL FOR KEY:in_req_type");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2120");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("replication_maybe", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("iops", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "dbms.security.authentication_providers", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("causal_clustering.read_replica.*",
        objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str16,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str17,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str18,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str19,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str20,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms.security.authentication_providers" + "'",
        str21, "MISSING VAL FOR KEY:dbms.security.authentication_providers");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica.*" + "'",
        str22, "MISSING VAL FOR KEY:causal_clustering.read_replica.*");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2121");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dec_dispatch", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("localhost", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str17, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2122");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("logs/", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("transaction", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("messages_failed", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str9, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str10, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str11,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str12,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:transaction" + "'",
        str13, "MISSING VAL FOR KEY:transaction");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:messages_failed" + "'", str14,
        "MISSING VAL FOR KEY:messages_failed");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2123");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of labels to ignore.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2124");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Raft replication attempt count. (counter)"
            + "'", str8, "MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str9, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2125");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dec_dispatch", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Maximum timeout for cluster status request execution", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str17,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2126");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:vm.memory.pool.*",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:vm.memory.pool.*" + "'",
        str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:vm.memory.pool.*");
  }

  @Test
  public void test2127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2127");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("operator_auth", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("Restore a backed up database.",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Count of successful database create operations. (counter)", objArray9);
    java.lang.Class<?> wildcardClass16 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str11, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str13,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Restore a backed up database." + "'", str14,
        "MISSING VAL FOR KEY:Restore a backed up database.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Count of successful database create operations. (counter)" + "'",
        str15, "MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2128");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.max_sample_size", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("causal_clustering.core.*", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str10, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str11,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.core.*" + "'", str12,
        "MISSING VAL FOR KEY:causal_clustering.core.*");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2129");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("browser.retain_editor_history");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2130");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("authentication");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2131");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Number of available processors", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("action", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str12, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str14, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str15,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2132");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.raft_in_queue_max_bytes");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2133");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
  }

  @Test
  public void test2134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2134");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2135");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.jvm.heap.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2136");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "unsupported.causal_clustering.inbound_connection_initialization_logging_enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2137");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Set to true if connection pooling should be used for authorization searches using the system account.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2138");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Role");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2139");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("true", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.max_databases", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("handshake_initializer", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str12,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str14,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str15,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str16,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2140");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("wait");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2141");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2142");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("GRANTED");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2143");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("pool");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2144");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of page unpins executed by the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2145");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("databaseUuid");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2146");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2147");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Maximum number of history files for the csv files.", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("elapsedTimeMs", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The total number of Bolt connections sitting idle. (gauge)", objArray9);
    java.lang.Class<?> wildcardClass16 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str11, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str12,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str13,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str14,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)" + "'",
        str15, "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2148");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("frame_decoder", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.max_databases", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:frame_decoder" + "'", str17,
        "MISSING VAL FOR KEY:frame_decoder");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2149");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size",
        objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str11,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2150");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.cluster.seed_node_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2151");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("logs/", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("metrics", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("designated_seeder", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str9, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str10, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str11,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str12,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:metrics" + "'",
        str13, "MISSING VAL FOR KEY:metrics");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:designated_seeder" + "'", str14,
        "MISSING VAL FOR KEY:designated_seeder");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2152");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Determines which driver API will be used. ASYNC must be used when the remote instance is 3.5");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2153");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("List all functions in the DBMS.",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:List all functions in the DBMS." + "'", str2,
        "MISSING VAL FOR KEY:List all functions in the DBMS.");
  }

  @Test
  public void test2154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2154");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_req_store_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2155");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:rotation_events");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2156");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("String");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2157");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("replication_maybe", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("editor", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str14,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str15,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:editor" + "'",
        str16, "MISSING VAL FOR KEY:editor");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2158");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma-separated list of other members of the cluster to join.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2159");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.pool.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2160");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("causal_clustering.raft_listen_address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2161");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Segment");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2162");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Retry time for log shipping to followers after a stall");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2163");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of seconds waited between query replans. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2164");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_res_metadata");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2165");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("LabelSelector for Kubernetes API");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2166");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("failureReason");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2167");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of millis page cache flush IO limiter was throttled during ongoing IO operations.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2168");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The maximum file size before the replicated lease state file is rotated (in unit of entries)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2169");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2170");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:days");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2171");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.showCurrentUser");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2172");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.createUser", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("BatchSize", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("*transaction.peak_concurrent",
        objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str11, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str13, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*transaction.peak_concurrent" + "'", str14,
        "MISSING VAL FOR KEY:*transaction.peak_concurrent");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2173");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*ids_in_use.node");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2174");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("metrics.csv.rotation.compression",
        objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str14,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory"
            + "'", str15,
        "MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'",
        str16, "MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2175");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Maximum amount of lag accepted for a new follower to join the Raft group");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2176");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("admin.ini", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("member-data", objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str6, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:admin.ini" + "'",
        str7, "MISSING VAL FOR KEY:admin.ini");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:member-data" + "'",
        str8, "MISSING VAL FOR KEY:member-data");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2177");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("logs/", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.allow_any_core_to_bootstrap", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("resource", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str9, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str10, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str11,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str12,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap" + "'",
        str13, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:resource" + "'",
        str14, "MISSING VAL FOR KEY:resource");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2178");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2179");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("true", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("vm.memory.pool.*", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("BatchSize", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("roles", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str12,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str13,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str14,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str15, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:roles" + "'", str16,
        "MISSING VAL FOR KEY:roles");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2180");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("replication_maybe", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str14,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str15,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str16, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2181");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("false", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Estimated total capacity of buffers in the pool. (gauge)", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("memory.pool", objArray11);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str16,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)" + "'",
        str17, "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str18, "MISSING VAL FOR KEY:memory.pool");
  }

  @Test
  public void test2182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2182");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2183");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "/var/run/secrets/kubernetes.io/serviceaccount/namespace");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2184");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("user");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2185");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.jmx.enabled", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.max_databases", objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str17,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.jmx.enabled" + "'", str19,
        "MISSING VAL FOR KEY:metrics.jmx.enabled");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str20,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2186");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Initial retry interval for akka restarter (which uses exponential backoff if it fails)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2187");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("", objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str6,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str7, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:" + "'", str8,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2188");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("status", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("raft-server", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:status" + "'", str9,
        "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str10, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str11, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2189");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.driver.connection.max_lifetime");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2190");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Path to the transaction files, if they are not in the same folder as '--from-path'.",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:ccstate",
        objArray7);
    java.lang.Class<?> wildcardClass11 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Path to the transaction files, if they are not in the same folder as '--from-path'."
            + "'", str9,
        "MISSING VAL FOR KEY:Path to the transaction files, if they are not in the same folder as '--from-path'.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ccstate" + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2191");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*store.size*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2192");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("volumetric");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2193");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The maximum number of open file descriptors. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2194");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total number of rolled back read transactions. (counter)", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("active", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("roles", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str16, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:active" + "'",
        str17, "MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:roles" + "'", str18,
        "MISSING VAL FOR KEY:roles");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2195");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("raft_message_composer");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2196");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2197");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2198");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("volumetric", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("dbms.security.property_level.enabled",
        objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The highest transaction id that has been pulled in the last pull updates by this instance. (counter)",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("--fallback-to-full", objArray6);
    java.lang.Class<?> wildcardClass13 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:volumetric" + "'",
        str9, "MISSING VAL FOR KEY:volumetric");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:dbms.security.property_level.enabled" + "'",
        str10, "MISSING VAL FOR KEY:dbms.security.property_level.enabled");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)"
            + "'", str11,
        "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:--fallback-to-full" + "'", str12,
        "MISSING VAL FOR KEY:--fallback-to-full");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2199");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Administration command: CREATE ROLE");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2200");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.directories.cluster_state");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2201");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.graphite.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2202");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("LOOPBACK_OPERATOR");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2203");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.createUser", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("messages_received", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.namespace", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str14, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str18,
        "MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace" + "'",
        str19, "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str20,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2204");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("queryPlan");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2205");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enterprise-auth-disabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2206");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("writable", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("--additional-config", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("RelationshipType", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str11, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str12,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str13,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str14,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2207");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Create a new role.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2208");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("invisible", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("false", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("INBOUND", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str15,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str16, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2209");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Name of database to copy from.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2210");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("metrics", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:metrics" + "'", str2,
        "MISSING VAL FOR KEY:metrics");
  }

  @Test
  public void test2211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2211");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--target");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2212");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("restartable");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2213");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Enable reporting metrics about Bolt Protocol message processing. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2214");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("handshake_server");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2215");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_binding_retry_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2216");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.JVM pause time metrics.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2217");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("invisible", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("vm.thread.*", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("driver.connection.pool.max_size",
        objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str16,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str17, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str18,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str19,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:vm.thread.*" + "'",
        str20, "MISSING VAL FOR KEY:vm.thread.*");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str21,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str22,
        "MISSING VAL FOR KEY:driver.connection.pool.max_size");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2218");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.security.createUser", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("BatchSize", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("*transaction.peak_concurrent",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The total time, in milliseconds, spent in check pointing so far. (counter)", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Time out for protocol negotiation handshake", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str13, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str14,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str15, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:*transaction.peak_concurrent" + "'", str16,
        "MISSING VAL FOR KEY:*transaction.peak_concurrent");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)"
            + "'", str17,
        "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:Time out for protocol negotiation handshake"
            + "'", str18, "MISSING VAL FOR KEY:Time out for protocol negotiation handshake");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2219");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2220");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:store_random_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2221");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("visible");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2222");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("unsupported.dbms.shutdown");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2223");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2224");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.prometheus.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2225");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("members");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2226");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("pause");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2227");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2228");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "List all jobs that are active in the database internal job scheduler.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2229");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.search_for_attribute");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2230");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_res_snapshot");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2231");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("cluster-state");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2232");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2233");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("restarting-cluster-client", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:restarting-cluster-client" + "'", str2,
        "MISSING VAL FOR KEY:restarting-cluster-client");
  }

  @Test
  public void test2234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2234");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Enable or disable the cluster state archiving.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2235");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("LabelQualifierAll", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.upgradeDetails", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str14,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str15,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.upgradeDetails" + "'", str16,
        "MISSING VAL FOR KEY:dbms.upgradeDetails");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2236");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("invisible", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("connections_closed", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("dbms.backup.listen_address",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("RAFT log rotation size", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str16,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str17, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str18,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str19,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:connections_closed" + "'", str20,
        "MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.listen_address" + "'", str21,
        "MISSING VAL FOR KEY:dbms.backup.listen_address");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:RAFT log rotation size" + "'", str22,
        "MISSING VAL FOR KEY:RAFT log rotation size");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2237");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Akka cluster phi accrual failure detector. How often keep-alive heartbeat messages should be sent to each connection.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2238");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metadata_script.cypher");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2239");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:failureReason");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2240");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("logs/", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("transaction", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("default", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str9, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str10, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str11,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str12,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:transaction" + "'",
        str13, "MISSING VAL FOR KEY:transaction");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:default" + "'",
        str14, "MISSING VAL FOR KEY:default");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2241");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2242");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.createUser", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("BatchSize", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("publisher", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str11, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str13, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:publisher" + "'",
        str14, "MISSING VAL FOR KEY:publisher");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2243");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Amount of memory (in bytes) guaranteed to be available for use by the JVM. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2244");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of started transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2245");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("resource");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2246");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("elapsedTimeMs", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("authorization", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str10, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str11,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:authorization" + "'", str12,
        "MISSING VAL FOR KEY:authorization");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2247");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("read");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2248");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("eviction_exceptions");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2249");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("true", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Directory to place backup in.",
        objArray7);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str9,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Directory to place backup in." + "'", str10,
        "MISSING VAL FOR KEY:Directory to place backup in.");
  }

  @Test
  public void test2250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2250");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.",
        objArray6);
    java.lang.Class<?> wildcardClass13 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str9, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str11,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str12,
        "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2251");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("<path>");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2252");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("read", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("bolt.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "List the active lock requests granted for the transaction executing the query with the given query id.",
        objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str12,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str13, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id."
            + "'", str14,
        "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2253");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2254");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:In-flight cache total bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2255");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The number of currently active transactions. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2256");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Privilege",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("publisher", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str11,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str12,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:publisher" + "'",
        str14, "MISSING VAL FOR KEY:publisher");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2257");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:labels");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2258");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hostnameOrIp");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2259");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Maximum number of history files for the csv files.", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str11,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str12,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2260");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("planning");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2261");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "If an existing database should be replaced.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2262");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2263");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:type");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2264");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_catchup_error");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2265");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group", objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Raft replication attempt count. (counter)"
            + "'", str8, "MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group"
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2266");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.logs.security.path");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2267");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("admin.ini", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "List the job groups that are active in the database internal job scheduler.", objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str6, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:admin.ini" + "'",
        str7, "MISSING VAL FOR KEY:admin.ini");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler."
            + "'", str8,
        "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2268");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Administration command: DROP USER");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2269");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2270");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("invisible", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("false", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("INBOUND", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Time between scanning the cluster to refresh current server's view of topology",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("metrics.neo4j.logrotation.enabled",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("check_point.*", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str16,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str17, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str18,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str19, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology"
            + "'", str20,
        "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled" + "'",
        str21, "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:check_point.*" + "'", str22,
        "MISSING VAL FOR KEY:check_point.*");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2271");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("DatabaseAll");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2272");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("replication_maybe", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.quarantineDatabase", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str15,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str16,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str17,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.quarantineDatabase" + "'", str18,
        "MISSING VAL FOR KEY:dbms.quarantineDatabase");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2273");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("reader", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:reader" + "'", str2,
        "MISSING VAL FOR KEY:reader");
  }

  @Test
  public void test2274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2274");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "*causal_clustering.core.replication_fail");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2275");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "The upper limit for the exponentially incremented retry timeout.", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:The upper limit for the exponentially incremented retry timeout."
            + "'", str2,
        "MISSING VAL FOR KEY:The upper limit for the exponentially incremented retry timeout.");
  }

  @Test
  public void test2276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2276");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.raft_messages_log_path", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str11,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2277");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Discovery cluster member size. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("akka", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("data-link", objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str9, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str10,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:data-link" + "'",
        str11, "MISSING VAL FOR KEY:data-link");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2278");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2279");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.max_sample_size", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str10, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str11,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2280");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("type", objArray5);
    java.lang.Class<?> wildcardClass11 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str6,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str8, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str9,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:type" + "'", str10,
        "MISSING VAL FOR KEY:type");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2281");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "akka.cluster.run-coordinated-shutdown-when-down");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2282");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("transactionId");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2283");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".Database transaction log metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2284");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.prometheus.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2285");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("SCHEMA", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str10, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str11, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str12, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2286");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("srv");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2287");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "File location of token for Kubernetes API");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2288");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("TRACKING_RESPONSE_HANDLER", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("Transaction retries. (counter)",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(".Database data metrics", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str11, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER" + "'", str12,
        "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Transaction retries. (counter)" + "'", str13,
        "MISSING VAL FOR KEY:Transaction retries. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:.Database data metrics" + "'", str14,
        "MISSING VAL FOR KEY:.Database data metrics");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2289");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("raft_chunked_writer");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2290");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path" + "'",
        str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
  }

  @Test
  public void test2291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2291");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("snappy_encoder", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("The level of middleware logging",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.",
        objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str11,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:The level of middleware logging" + "'", str12,
        "MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead."
            + "'", str13,
        "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2292");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_allow_reads_on_leader");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2293");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("vm.thread.*", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str17,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str18,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:vm.thread.*" + "'",
        str19, "MISSING VAL FOR KEY:vm.thread.*");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str20,
        "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2294");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.load_balancing.plugin");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2295");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("db.createNodeKey");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2296");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str11,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2297");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("java.naming.security.credentials");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2298");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("raft-server", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.join_catch_up_timeout", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ",
        objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str11, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. "
            + "'", str13,
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2299");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dec_dispatch", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("failureReason", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:failureReason" + "'", str18,
        "MISSING VAL FOR KEY:failureReason");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2300");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_resolution_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2301");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to ignore for relationships with the specified type. Can not be combined with --skip-properties or --keep-only-relationship-properties.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2302");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2303");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "This command will create a copy of a database.%nIf your labels, properties or relationships contain dots or commas you can use ` to escape them, e.g. `My,label`.property ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2304");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("8m", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str10, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str11,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str12,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:8m" + "'", str13,
        "MISSING VAL FOR KEY:8m");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2305");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2306");
    }
    java.lang.Object[] objArray15 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str16 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray15);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray15);
    java.lang.String str18 = io.github.onograph.I18N.format("read", objArray15);
    java.lang.String str19 = io.github.onograph.I18N.format("invisible", objArray15);
    java.lang.String str20 = io.github.onograph.I18N.format("dec_dispatch", objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format("PropertyKey", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("causal_clustering.refuse_to_be_leader",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("DEFAULT", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "Maximum amount of lag accepted for a new follower to join the Raft group", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("prometheus", objArray15);
    java.lang.Class<?> wildcardClass27 = objArray15.getClass();
    org.junit.Assert.assertNotNull(objArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str16,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str17, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str18,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str19, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str20, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str21, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str22,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str23, "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:DEFAULT" + "'",
        str24, "MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group"
            + "'", str25,
        "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:prometheus" + "'",
        str26, "MISSING VAL FOR KEY:prometheus");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test2307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2307");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("native");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2308");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("overview");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2309");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2310");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("java.naming.provider.url");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2311");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("*ids_in_use.node", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("*vm.file.descriptors.count",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str10,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database." + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:*vm.file.descriptors.count" + "'", str12,
        "MISSING VAL FOR KEY:*vm.file.descriptors.count");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2312");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("appended_bytes", objArray6);
    java.lang.Class<?> wildcardClass13 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str9, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str11,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:appended_bytes" + "'", str12,
        "MISSING VAL FOR KEY:appended_bytes");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2313");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.createUser", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.jvm.memory.enabled",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str14, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str17, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str18,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.jvm.memory.enabled" + "'", str20,
        "MISSING VAL FOR KEY:metrics.jvm.memory.enabled");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2314");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.load_balancing.shuffle");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2315");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Maximum timeout for akka shutdown");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2316");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("frame_decoder", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("temp-copy", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:frame_decoder" + "'", str17,
        "MISSING VAL FOR KEY:frame_decoder");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:temp-copy" + "'",
        str18, "MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2317");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("db.operation.count.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2318");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("result");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2319");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("allocatedBytes");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2320");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2321");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The duration for which the replicator will await a new leader.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2322");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dec_dispatch");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2323");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.user_dn_template", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str11,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2324");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("DatabaseDefault");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2325");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.auth_cache_use_ttl");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2326");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("neo4j");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2327");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.createUser", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("snappy_validating_decoder",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str14, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str17, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str18,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:snappy_validating_decoder" + "'", str20,
        "MISSING VAL FOR KEY:snappy_validating_decoder");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2328");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of page flushes executed by the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2329");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("writable", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("native", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str10, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:native" + "'",
        str11, "MISSING VAL FOR KEY:native");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2330");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2331");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2332");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("dec_dispatch", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("localhost", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str17, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str18, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2333");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of terminated transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2334");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2335");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.transaction_listen_address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2336");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("ccstate", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("rollbacks", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("error_handler_tail", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.dynamic.setting.allowlist",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("count", objArray9);
    java.lang.Class<?> wildcardClass16 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str11, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str12, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:error_handler_tail" + "'", str13,
        "MISSING VAL FOR KEY:error_handler_tail");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist" + "'", str14,
        "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:count" + "'", str15,
        "MISSING VAL FOR KEY:count");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2337");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str6, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str7, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str8,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2338");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2339");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The name of a server_group whose members should be prioritized as leaders for the given database. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2340");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("invisible", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The total number of rolled back read transactions. (counter)", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("active", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str15, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:active" + "'",
        str16, "MISSING VAL FOR KEY:active");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2341");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("*ids_in_use.node", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str8,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database." + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2342");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("read", objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format("invisible", objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format("dec_dispatch", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("PropertyKey", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("causal_clustering.refuse_to_be_leader",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("DEFAULT", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "Maximum amount of lag accepted for a new follower to join the Raft group", objArray14);
    java.lang.Class<?> wildcardClass25 = objArray14.getClass();
    org.junit.Assert.assertNotNull(objArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str15,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str16, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str17,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str18, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str19, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str20, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str21,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str22, "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:DEFAULT" + "'",
        str23, "MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group"
            + "'", str24,
        "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2343");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.neo4j.logrotation.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2344");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("raft-server", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("transaction.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("metrics.filter", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("Retry-After", objArray9);
    java.lang.Class<?> wildcardClass16 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str11, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str12, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str13,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:metrics.filter" + "'", str14,
        "MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:Retry-After" + "'",
        str15, "MISSING VAL FOR KEY:Retry-After");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2345");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("cypher", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str17,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str18,
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:cypher" + "'",
        str19, "MISSING VAL FOR KEY:cypher");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled."
            + "'", str20,
        "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2346");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("time", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Store copy chunk size", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:connections_closed", objArray7);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:time" + "'", str9,
        "MISSING VAL FOR KEY:time");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Store copy chunk size" + "'", str10,
        "MISSING VAL FOR KEY:Store copy chunk size");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:connections_closed" + "'",
        str11, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:connections_closed");
  }

  @Test
  public void test2347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2347");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:yyyy-MM-dd.HH.mm.ss");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2348");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("status", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("bolt.*", objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:status" + "'", str9,
        "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str11, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2349");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dec_dispatch", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("localhost", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:OUTBOUND",
        objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str17, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2350");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("messages_started");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2351");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("SUCCESS");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2352");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("read", objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format("invisible", objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format("dec_dispatch", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("PropertyKey", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("causal_clustering.refuse_to_be_leader",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "typically-connect-to-random-read-replica", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("high_limitV3_2_0", objArray14);
    java.lang.Class<?> wildcardClass25 = objArray14.getClass();
    org.junit.Assert.assertNotNull(objArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str15,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str16, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str17,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str18, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str19, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str20, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str21,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str22, "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str23, "MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_2_0" + "'", str24,
        "MISSING VAL FOR KEY:high_limitV3_2_0");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2353");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("bolt.*", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "List the active lock requests granted for the transaction executing the query with the given query id.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:flushes",
        objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str14, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id."
            + "'", str15,
        "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2354");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("outputStream");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2355");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The accumulated time worker threads have spent processing messages. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2356");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str6, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str7,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str8, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2357");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.akka_actor_system_restarter.max_acceptable_failures", objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str10,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str11,
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2358");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("replication_maybe", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("editor", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str15,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str16,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:editor" + "'",
        str17, "MISSING VAL FOR KEY:editor");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2359");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Name of database to copy to.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2360");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("invisible", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("metrics.graphite.enabled", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str15,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str16,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2361");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("metrics.graphite.enabled", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.heartbeat-interval", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("fabric.driver.idle_check_interval",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str17,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str18,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:akka.cluster.failure-detector.heartbeat-interval" + "'", str19,
        "MISSING VAL FOR KEY:akka.cluster.failure-detector.heartbeat-interval");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.idle_check_interval" + "'",
        str20, "MISSING VAL FOR KEY:fabric.driver.idle_check_interval");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2362");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Threshold for rotation of the security log.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2363");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("file.descriptors.count");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2364");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("writable", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("--additional-config", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("addresses", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
        objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str13, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str14,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str15, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str16,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str18,
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2365");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2366");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray7);
    java.lang.Class<?> wildcardClass11 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str9, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2367");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray7);
    java.lang.Class<?> wildcardClass11 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str9, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str10, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2368");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("labels", objArray5);
    java.lang.Class<?> wildcardClass8 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str6,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:labels" + "'", str7,
        "MISSING VAL FOR KEY:labels");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2369");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("dec_dispatch", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("init_server_handler", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("graphIds", objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str17, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:init_server_handler" + "'", str18,
        "MISSING VAL FOR KEY:init_server_handler");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:graphIds" + "'",
        str20, "MISSING VAL FOR KEY:graphIds");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2370");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The rate at which leader elections happen. Note that due to election conflicts it might take several attempts to find a leader. The window should be significantly larger than typical communication delays to make conflicts unlikely.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2371");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("available");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2372");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("fabric.stream.concurrency", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.concurrency" + "'", str2,
        "MISSING VAL FOR KEY:fabric.stream.concurrency");
  }

  @Test
  public void test2373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2373");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.security.createUser", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("BatchSize", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("fabric.stream.buffer.low_watermark",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("OUTBOUND", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str15, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str17, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str18, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str19,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:" + "'", str20,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark" + "'",
        str21, "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:OUTBOUND" + "'",
        str22, "MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2374");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("vm.thread.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2375");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("causal_clustering.multi_dc_license",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days", objArray5);
    java.lang.Class<?> wildcardClass11 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str6,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str7, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str8,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.multi_dc_license" + "'",
        str9, "MISSING VAL FOR KEY:causal_clustering.multi_dc_license");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:days"
            + "'", str10, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:days");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2376");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.createUser", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.prometheus.enabled",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("modifierProtocols", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("Is this server the leader? (gauge)",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str14, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str17, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.enabled" + "'", str18,
        "MISSING VAL FOR KEY:metrics.prometheus.enabled");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:modifierProtocols" + "'", str19,
        "MISSING VAL FOR KEY:modifierProtocols");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Is this server the leader? (gauge)" + "'",
        str20, "MISSING VAL FOR KEY:Is this server the leader? (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2377");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.csv.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2378");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("NewLeaderBarrier");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2379");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("--skip-properties", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:--skip-properties" + "'", str2,
        "MISSING VAL FOR KEY:--skip-properties");
  }

  @Test
  public void test2380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2380");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("FOR_DATABASE", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.default-parallelism", objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str6, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:FOR_DATABASE" + "'",
        str7, "MISSING VAL FOR KEY:FOR_DATABASE");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.default-parallelism" + "'", str8,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.default-parallelism");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2381");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("group");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2382");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("true", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.max_databases", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("handshake_initializer", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.",
        objArray11);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str13,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str14,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str15,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str16,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str17,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled."
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
  }

  @Test
  public void test2383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2383");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.logging.level");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2384");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("log_inbound_req");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2385");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("false", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("INBOUND", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str16,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str17, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str18,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2386");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total number of rolled back read transactions. (counter)", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("active", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("last-flushed", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str16, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:active" + "'",
        str17, "MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:last-flushed" + "'",
        str18, "MISSING VAL FOR KEY:last-flushed");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2387");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Sets level for driver internal logging.", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("max_elements", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("leader-only", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str14,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:Sets level for driver internal logging."
            + "'", str16, "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:max_elements" + "'",
        str17, "MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str18,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str19, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2388");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("*ids_in_use.node", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("*vm.file.descriptors.count",
        objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str9,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database." + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:*vm.file.descriptors.count" + "'", str11,
        "MISSING VAL FOR KEY:*vm.file.descriptors.count");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2389");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("default-dispatcher");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2390");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("false", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("INBOUND", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:DEFAULT",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str17,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str18, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str19,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2391");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:RAFT log rotation size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2392");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("messages_received", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str10, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str12,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str13,
        "MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2393");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("SCHEMA", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("total_bytes", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str12, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str13, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:total_bytes" + "'",
        str14, "MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2394");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("online");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2395");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("dec_dispatch", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("PropertyKey", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("causal_clustering.refuse_to_be_leader",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str17, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str18, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str19,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str20, "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2396");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("raft-server", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("transaction.*", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(".Query execution metrics", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str11, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str12,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:.Query execution metrics" + "'", str13,
        "MISSING VAL FOR KEY:.Query execution metrics");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2397");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.leadership_priority_group");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2398");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("bolt.*", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("enc_get_metadata", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str12, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:enc_get_metadata" + "'", str13,
        "MISSING VAL FOR KEY:enc_get_metadata");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2399");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str16,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str17,
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2400");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("function", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("causal_clustering.read_replica",
        objArray6);
    java.lang.Class<?> wildcardClass13 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str8, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str9,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str10, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str11,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str12,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2401");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_res_database_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2402");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("defragment");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2403");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("operator_auth", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.leader_transfer_interval", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str12,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2404");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("replication_maybe", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("enc_req_precopy", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("planning", objArray12);
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str16,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str17,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str18, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:enc_req_precopy" + "'", str19,
        "MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:planning" + "'",
        str20, "MISSING VAL FOR KEY:planning");
  }

  @Test
  public void test2405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2405");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Unassign a role from the user.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2406");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.stream.buffer.size", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.stream.buffer.size"
            + "'", str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.stream.buffer.size");
  }

  @Test
  public void test2407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2407");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("browser.credential_timeout", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout", objArray7);
    java.lang.Class<?> wildcardClass11 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str9,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout"
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2408");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Name of the database after restore. Usage of this option is only allowed if --from parameter point to exact one directory");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2409");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Upgraded", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("*pool.transaction.*.used_heap",
        objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("*causal_clustering.core.is_leader",
        objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str10, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str11,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str12,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:*pool.transaction.*.used_heap" + "'", str13,
        "MISSING VAL FOR KEY:*pool.transaction.*.used_heap");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*causal_clustering.core.is_leader" + "'",
        str14, "MISSING VAL FOR KEY:*causal_clustering.core.is_leader");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2410");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("discovery-to-neo4j-dispatcher");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2411");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("operator_auth", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("Restore a backed up database.",
        objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str12,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Restore a backed up database." + "'", str13,
        "MISSING VAL FOR KEY:Restore a backed up database.");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2412");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:continuous",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str11,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str14, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2413");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:NEO4J_CLUSTER");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2414");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("Discovery cluster member size. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("akka", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only", objArray7);
    java.lang.Class<?> wildcardClass12 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str9, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str10,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2415");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:days", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str11,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2416");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Maximum number of history files for the csv files.", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("elapsedTimeMs", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total number of Bolt connections sitting idle. (gauge)", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_binding_retry_timeout", objArray10);
    java.lang.Class<?> wildcardClass18 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str11,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str12, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str13,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str14,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str15,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)" + "'",
        str16, "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.cluster_binding_retry_timeout" + "'", str17,
        "MISSING VAL FOR KEY:causal_clustering.cluster_binding_retry_timeout");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2417");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:RAFT log implementation");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2418");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("metrics.neo4j.counts.enabled",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("authentication", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str10,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.counts.enabled" + "'", str11,
        "MISSING VAL FOR KEY:metrics.neo4j.counts.enabled");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:authentication" + "'", str12,
        "MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2419");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2420");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format("Upgraded", objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray3);
    java.lang.Class<?> wildcardClass7 = objArray3.getClass();
    org.junit.Assert.assertNotNull(objArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    org.junit.Assert.assertEquals("'" + str4 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str4,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str5, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str6, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2421");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Number of available processors", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("action", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str10, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str12, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2422");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("error_handler_head");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2423");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2424");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "logging-dispatcher.thread-pool-executor.fixed-pool-size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2425");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_topology_refresh", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms.",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str17,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str19, "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms." + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2426");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("HAS_DB_ROLE");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2427");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("operator_auth", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The ID of the last closed transaction. (counter)", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str12,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)" + "'", str13,
        "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2428");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Count of successful database create operations. (counter)", objArray6);
    java.lang.Class<?> wildcardClass10 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str7,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Raft replication attempt count. (counter)"
            + "'", str8, "MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of successful database create operations. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2429");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("page_cache.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2430");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The attribute to use when looking up users.\nUsing this setting requires `dbms.security.ldap.authentication.search_for_attribute` to be true and thus `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2431");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2432");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.security.createUser", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("BatchSize", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str12, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str14, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str15, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str16,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2433");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.createUser", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("Number of available processors",
        objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str10, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str11,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str12,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2434");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("fabric.stream.buffer.size",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.buffer.size" + "'", str17,
        "MISSING VAL FOR KEY:fabric.stream.buffer.size");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2435");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dec_dispatch", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Maximum timeout for cluster status request execution", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.logging.level", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str17,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2436");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("in_req_type");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2437");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of threads (both idle and busy) in the jetty pool. (gauge)", objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str10,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)"
            + "'", str12,
        "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2438");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.raft_vote_state_size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2439");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.join_catch_up_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2440");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("logs/", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:NEO4J_CLUSTER",
        objArray6);
    java.lang.Class<?> wildcardClass13 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str8, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str9, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str10,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str11,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:NEO4J_CLUSTER" + "'",
        str12, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:NEO4J_CLUSTER");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2441");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("kind");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2442");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("drop");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2443");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("plugin-");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2444");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("elapsedTimeMs", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("driver.connection.max_lifetime",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str12,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:driver.connection.max_lifetime" + "'", str13,
        "MISSING VAL FOR KEY:driver.connection.max_lifetime");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2445");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("databases");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2446");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("application/json");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2447");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("metrics.graphite.enabled", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("init_client_handler", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("elapsedTimeMs", objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str17,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str18,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:init_client_handler" + "'", str19,
        "MISSING VAL FOR KEY:init_client_handler");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str20,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2448");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2449");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("writable", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("--additional-config", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("addresses", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("memory.pool", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str13, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str14,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str15, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str16,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str18, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2450");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2451");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.neo4j.counts.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2452");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("read", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("invisible", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("lz4_encoder", objArray9);
    java.lang.Class<?> wildcardClass15 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str12,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str13, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str14, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2453");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("FROM");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2454");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:neo4j.count.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2455");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("unreachable");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2456");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.security.createUser", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("BatchSize", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.prometheus.enabled",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("modifierProtocols", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("Is this server the leader? (gauge)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("akka.logging-filter", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str15, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str17, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str18, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.enabled" + "'", str19,
        "MISSING VAL FOR KEY:metrics.prometheus.enabled");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:modifierProtocols" + "'", str20,
        "MISSING VAL FOR KEY:modifierProtocols");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:Is this server the leader? (gauge)" + "'",
        str21, "MISSING VAL FOR KEY:Is this server the leader? (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:akka.logging-filter" + "'", str22,
        "MISSING VAL FOR KEY:akka.logging-filter");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2457");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.service_port_name", objArray7);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str10,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.kubernetes.service_port_name" + "'", str11,
        "MISSING VAL FOR KEY:causal_clustering.kubernetes.service_port_name");
  }

  @Test
  public void test2458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2458");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("Upgraded", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format("messages_received", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("db.listLocks", objArray8);
    java.lang.Class<?> wildcardClass17 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str9,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str11, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str13,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str14,
        "MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:db.listLocks" + "'",
        str16, "MISSING VAL FOR KEY:db.listLocks");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2459");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("peak_concurrent");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2460");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("bolt.*", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("false", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of successful database create operations. (counter)",
        objArray10);
    java.lang.Class<?> wildcardClass18 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str11,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str12, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str14, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str15,
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str16,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of successful database create operations. (counter)"
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2461");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("invisible", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("dec_dispatch", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("localhost", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:OUTBOUND",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("handshake_client_decoder", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("planning", objArray13);
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str16,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str17, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str18, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str19, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:handshake_client_decoder" + "'", str21,
        "MISSING VAL FOR KEY:handshake_client_decoder");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:planning" + "'",
        str22, "MISSING VAL FOR KEY:planning");
  }

  @Test
  public void test2462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2462");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("merges");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2463");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("GRAPH");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2464");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("metrics.neo4j.counts.enabled",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("metrics.bolt.messages.enabled",
        objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str10,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.counts.enabled" + "'", str11,
        "MISSING VAL FOR KEY:metrics.neo4j.counts.enabled");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:metrics.bolt.messages.enabled" + "'", str12,
        "MISSING VAL FOR KEY:metrics.bolt.messages.enabled");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2465");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2466");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("traverse");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2467");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout"
            + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout");
  }

  @Test
  public void test2468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2468");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.leader_transfer_member_backoff");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2469");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("akka.logger-startup-timeout",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:akka.logger-startup-timeout" + "'", str2,
        "MISSING VAL FOR KEY:akka.logger-startup-timeout");
  }

  @Test
  public void test2470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2470");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("writable", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("--additional-config", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("RelationshipType", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("store.size", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str14, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str15,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str17,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms." + "'", str18,
        "MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:store.size" + "'",
        str19, "MISSING VAL FOR KEY:store.size");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2471");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2472");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("config");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2473");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_base");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2474");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2475");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("cluster");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2476");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2477");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.neo4j.server.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2478");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2479");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "*causal_clustering.core.replication_fail", objArray7);
    java.lang.Class<?> wildcardClass11 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str9, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail"
            + "'", str10, "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2480");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2481");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("total", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("enc_catchup_error", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str14,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:total" + "'", str15,
        "MISSING VAL FOR KEY:total");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:enc_catchup_error" + "'", str16,
        "MISSING VAL FOR KEY:enc_catchup_error");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2482");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:continuous",
        objArray8);
    java.lang.Class<?> wildcardClass13 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str10,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str11,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2483");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka.remote.artery.bind.port");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2484");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("raft_chunked_writer", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The hostname or IP address of the Graphite server", objArray4);
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str6, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:raft_chunked_writer" + "'", str7,
        "MISSING VAL FOR KEY:raft_chunked_writer");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The hostname or IP address of the Graphite server" + "'", str8,
        "MISSING VAL FOR KEY:The hostname or IP address of the Graphite server");
  }

  @Test
  public void test2485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2485");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("true", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.max_databases", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("handshake_initializer", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing.",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str14,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str16,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str17,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str18,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing."
            + "'", str20,
        "MISSING VAL FOR KEY:The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2486");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("orientation", objArray11);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str16,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str17,
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:orientation" + "'",
        str18, "MISSING VAL FOR KEY:orientation");
  }

  @Test
  public void test2487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2487");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("*transaction.rollbacks*", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "typically-connect-to-random-read-replica", objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str6, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:*transaction.rollbacks*" + "'", str7,
        "MISSING VAL FOR KEY:*transaction.rollbacks*");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str8, "MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2488");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("UserQualifierAll");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2489");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_topology_refresh", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "A common prefix for the reported metrics field names.", objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str17,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str19, "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:A common prefix for the reported metrics field names." + "'", str20,
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2490");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("invisible", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("dec_dispatch", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("init_server_handler", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_req_precopy",
        objArray12);
    java.lang.Class<?> wildcardClass21 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str13,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str16, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str17, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:init_server_handler" + "'", str18,
        "MISSING VAL FOR KEY:init_server_handler");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str19,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2491");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format("function", objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray3);
    java.lang.Class<?> wildcardClass7 = objArray3.getClass();
    org.junit.Assert.assertNotNull(objArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    org.junit.Assert.assertEquals("'" + str4 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str4,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str5, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str6,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2492");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "File location of CA certificate for Kubernetes API");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2493");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("Number of available processors",
        objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.allow_any_core_to_bootstrap", objArray4);
    java.lang.Class<?> wildcardClass9 = objArray4.getClass();
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str6,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str7,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap" + "'",
        str8, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2494");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Updates a given setting value. Passing an empty value will result in removing the configured value and falling back to the default value. Changes will not persist and will be lost if the server is restarted.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2495");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("LOOPBACK");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2496");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("invisible", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total number of committed write transactions. (counter)", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str12,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str14,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str15, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str16,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str17,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total number of committed write transactions. (counter)" + "'",
        str18, "MISSING VAL FOR KEY:The total number of committed write transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2497");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Sets level for driver internal logging.", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("max_elements", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray10);
    java.lang.Class<?> wildcardClass17 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str11,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str12,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Sets level for driver internal logging."
            + "'", str14, "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:max_elements" + "'",
        str15, "MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str16,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2498");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("*ids_in_use.node", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("*vm.file.descriptors.count",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.security.listRoles", objArray8);
    java.lang.Class<?> wildcardClass14 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str10,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database." + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:*vm.file.descriptors.count" + "'", str12,
        "MISSING VAL FOR KEY:*vm.file.descriptors.count");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.listRoles" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.listRoles");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2499");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2500");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.use_system_account");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }
}

