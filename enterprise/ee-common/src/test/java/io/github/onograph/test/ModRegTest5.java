package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest5 {

  public static boolean debug = false;

  @Test
  public void test2501() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2501");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("fabric.driver.timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2502() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2502");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.upgradeDetails", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.upgradeDetails" + "'",
        str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.upgradeDetails");
  }

  @Test
  public void test2503() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2503");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format("function", objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format("FOR_DATABASE", objArray3);
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
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:FOR_DATABASE" + "'",
        str6, "MISSING VAL FOR KEY:FOR_DATABASE");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2504() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2504");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The amount of time we should wait before repeating an attempt to transfer the leadership of a given database to a member after that member rejects a previous transfer.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2505() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2505");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2506() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2506");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("vm.memory.pool.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("--to-data-tx-directory", objArray9);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str13,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:--to-data-tx-directory" + "'", str14,
        "MISSING VAL FOR KEY:--to-data-tx-directory");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2507() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2507");
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
    java.lang.String str13 = io.github.onograph.I18N.format("appended_bytes", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("DatabaseDefault", objArray7);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:appended_bytes" + "'", str13,
        "MISSING VAL FOR KEY:appended_bytes");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:DatabaseDefault" + "'", str14,
        "MISSING VAL FOR KEY:DatabaseDefault");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2508() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2508");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("writable", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("success", objArray7);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:success" + "'",
        str10, "MISSING VAL FOR KEY:success");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2509() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2509");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Time between scanning the cluster to refresh current server's view of topology",
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str16,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str17, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology"
            + "'", str18,
        "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2510() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2510");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str9 = io.github.onograph.I18N.format("dbms.pool", objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_runtime", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("method", objArray8);
    java.lang.Class<?> wildcardClass12 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:dbms.pool" + "'",
        str9, "MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime" + "'", str10,
        "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:method" + "'",
        str11, "MISSING VAL FOR KEY:method");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2511() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2511");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Count of successful database create operations. (counter)", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*transaction.last_committed_tx_id", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Count of successful database create operations. (counter)" + "'",
        str16, "MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2512() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2512");
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
    java.lang.String str19 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("connections_closed", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("dbms.backup.listen_address",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "The number of operations to be processed before the state machines flush to disk",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("throttled.millis", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str19,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str20,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:connections_closed" + "'", str21,
        "MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.listen_address" + "'", str22,
        "MISSING VAL FOR KEY:dbms.backup.listen_address");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk"
            + "'", str23,
        "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:throttled.millis" + "'", str24,
        "MISSING VAL FOR KEY:throttled.millis");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2513() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2513");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dump-logical-log.txt");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2514() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2514");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.cluster_binding_retry_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2515() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2515");
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
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("fabric.stream.buffer.size",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.buffer.size" + "'", str16,
        "MISSING VAL FOR KEY:fabric.stream.buffer.size");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2516() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2516");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("password");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2517() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2517");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("empty");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2518() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2518");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("bolt.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("false", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str13, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str14,
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str15,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2519() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2519");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.quarantineDatabase");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2520() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2520");
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
    java.lang.String str20 = io.github.onograph.I18N.format("driver.api", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:driver.api" + "'",
        str20, "MISSING VAL FOR KEY:driver.api");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2521() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2521");
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
    java.lang.String str15 = io.github.onograph.I18N.format("BatchSize", objArray10);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str15, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2522() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2522");
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
    java.lang.String str14 = io.github.onograph.I18N.format("List all native users.", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:List all native users." + "'", str14,
        "MISSING VAL FOR KEY:List all native users.");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2523() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2523");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "fabric.driver.connection.pool.idle_test");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2524() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2524");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("function", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("targetDirectory", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("*transaction.active_write", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("high_limitV3_0_0", objArray6);
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
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str9, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:targetDirectory" + "'", str10,
        "MISSING VAL FOR KEY:targetDirectory");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:*transaction.active_write" + "'", str11,
        "MISSING VAL FOR KEY:*transaction.active_write");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_0_0" + "'", str12,
        "MISSING VAL FOR KEY:high_limitV3_0_0");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2525() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2525");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware_logging.level");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2526() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2526");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*transaction.active_write");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2527() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2527");
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
        "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)",
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str17,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2528() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2528");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("ccstate", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("Delete the specified user.",
        objArray8);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str10, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used."
            + "'", str11,
        "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Delete the specified user." + "'", str12,
        "MISSING VAL FOR KEY:Delete the specified user.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2529() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2529");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2530() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2530");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2531() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2531");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "metrics.neo4j.causal_clustering.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2532() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2532");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2533() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2533");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_res_type");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2534() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2534");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Set to `true` to enable exporting metrics to CSV files");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2535() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2535");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_get_metadata");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2536() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2536");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Raft Replication maybe count. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2537() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2537");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("ssl_handler", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Retry time for log shipping to followers after a stall", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str13, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall" + "'", str14,
        "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2538() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2538");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:cypher");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2539() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2539");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.routing.ttl");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2540() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2540");
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
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:<all/users/roles>",
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<all/users/roles>" + "'",
        str13, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<all/users/roles>");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2541() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2541");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("iops", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("append_index", objArray11);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str17,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:append_index" + "'",
        str18, "MISSING VAL FOR KEY:append_index");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2542() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2542");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("databaseId");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2543() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2543");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The time to live (TTL) for cached authentication and authorization info when using external auth providers (LDAP or plugin). Setting the TTL to 0 will disable auth caching. Disabling caching while using the LDAP auth provider requires the use of an LDAP system account for resolving authorization information.",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str12, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str13,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:metrics.filter" + "'", str14,
        "MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The time to live (TTL) for cached authentication and authorization info when using external auth providers (LDAP or plugin). Setting the TTL to 0 will disable auth caching. Disabling caching while using the LDAP auth provider requires the use of an LDAP system account for resolving authorization information."
            + "'", str15,
        "MISSING VAL FOR KEY:The time to live (TTL) for cached authentication and authorization info when using external auth providers (LDAP or plugin). Setting the TTL to 0 will disable auth caching. Disabling caching while using the LDAP auth provider requires the use of an LDAP system account for resolving authorization information.");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2544() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2544");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".Query execution metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2545() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2545");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.transaction_advertised_address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2546() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2546");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*bolt.messages_received*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2547() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2547");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("ccstate", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("Delete the specified user.",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used."
            + "'", str10,
        "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Delete the specified user." + "'", str11,
        "MISSING VAL FOR KEY:Delete the specified user.");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2548() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2548");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("ccstate", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("rollbacks", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Retry time for log shipping to followers after a stall", objArray8);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str10, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str11, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str12,
        "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall" + "'", str13,
        "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2549() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2549");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(".JVM pause time metrics.", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:.JVM pause time metrics." + "'", str12,
        "MISSING VAL FOR KEY:.JVM pause time metrics.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2550() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2550");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("dbms.functions", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:dbms.functions" + "'", str2,
        "MISSING VAL FOR KEY:dbms.functions");
  }

  @Test
  public void test2551() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2551");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("Number of available processors",
        objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray5);
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str8,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str9,
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2552() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2552");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("security-privileges");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2553() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2553");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("timeoutSeconds");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2554() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2554");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2555() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2555");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("init_client_handler");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2556() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2556");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:snappy_decoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2557() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2557");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("data-link");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2558() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2558");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("server_policies", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:server_policies" + "'", str2,
        "MISSING VAL FOR KEY:server_policies");
  }

  @Test
  public void test2559() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2559");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A comma separated list of relationships to ignore.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2560() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2560");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Name of the database associated to the Fabric graph.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2561() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2561");
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
    java.lang.String str14 = io.github.onograph.I18N.format("hnd_req_all_databases_id", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:hnd_req_all_databases_id" + "'", str14,
        "MISSING VAL FOR KEY:hnd_req_all_databases_id");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2562() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2562");
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
    java.lang.String str20 = io.github.onograph.I18N.format("akka.cluster.min-nr-of-members",
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:init_client_handler" + "'", str19,
        "MISSING VAL FOR KEY:init_client_handler");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:akka.cluster.min-nr-of-members" + "'", str20,
        "MISSING VAL FOR KEY:akka.cluster.min-nr-of-members");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2563() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2563");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2564() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2564");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--from");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2565() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2565");
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
    java.lang.String str19 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("metrics.jmx.enabled", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "<relationship.property>[,<relationship.property>...]", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("active_read", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("flushes", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str19,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:metrics.jmx.enabled" + "'", str21,
        "MISSING VAL FOR KEY:metrics.jmx.enabled");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:<relationship.property>[,<relationship.property>...]" + "'", str22,
        "MISSING VAL FOR KEY:<relationship.property>[,<relationship.property>...]");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:active_read" + "'",
        str23, "MISSING VAL FOR KEY:active_read");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:flushes" + "'",
        str24, "MISSING VAL FOR KEY:flushes");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2566() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2566");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.label_selector");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2567() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2567");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("raft-server", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("transaction.*", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("metrics.filter", objArray8);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:metrics.filter" + "'", str13,
        "MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2568() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2568");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("status", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
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
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str9,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2569() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2569");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metadata_script.cypher");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2570() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2570");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.directories.cluster_state");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2571() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2571");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:In-flight cache misses. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2572() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2572");
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
    java.lang.String str12 = io.github.onograph.I18N.format("principal", objArray6);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:principal" + "'",
        str12, "MISSING VAL FOR KEY:principal");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2573() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2573");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("Number of available processors",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.search_for_attribute", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format("yyyyMMddHHmmss", objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The total number of transaction log rotations executed so far. (counter)", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:visible",
        objArray9);
    java.lang.Class<?> wildcardClass19 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str10,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str11,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str12,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str13,
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str14, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:yyyyMMddHHmmss" + "'", str16,
        "MISSING VAL FOR KEY:yyyyMMddHHmmss");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The total number of transaction log rotations executed so far. (counter)"
            + "'", str17,
        "MISSING VAL FOR KEY:The total number of transaction log rotations executed so far. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:visible" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:visible");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2574() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2574");
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
    java.lang.String str26 = io.github.onograph.I18N.format(
        "The total number of IO operations performed by page cache.", objArray15);
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
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:The total number of IO operations performed by page cache." + "'",
        str26, "MISSING VAL FOR KEY:The total number of IO operations performed by page cache.");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test2575() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2575");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2576() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2576");
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
    java.lang.String str14 = io.github.onograph.I18N.format("fabric.routing.ttl", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:fabric.routing.ttl" + "'", str14,
        "MISSING VAL FOR KEY:fabric.routing.ttl");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2577() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2577");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".Global neo4j pools metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2578() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2578");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dropped");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2579() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2579");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("*ids_in_use.node", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of rolled back read transactions. (counter)", objArray6);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str9, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2580() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2580");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Clears authentication and authorization cache.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2581() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2581");
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
    java.lang.String str16 = io.github.onograph.I18N.format("metrics.graphite.enabled", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.heartbeat-interval", objArray11);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str16,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str17,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:akka.cluster.failure-detector.heartbeat-interval" + "'", str18,
        "MISSING VAL FOR KEY:akka.cluster.failure-detector.heartbeat-interval");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2582() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2582");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("LZ_validating", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.auth_cache_use_ttl",
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_cache_use_ttl" + "'",
        str12, "MISSING VAL FOR KEY:dbms.security.auth_cache_use_ttl");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2583() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2583");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("ccstate", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.connection_timeout", objArray6);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'", str8,
        "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout" + "'", str9,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2584() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2584");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:countAllNodesMetrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2585() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2585");
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
    java.lang.String str14 = io.github.onograph.I18N.format("LZ4", objArray7);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:LZ4" + "'", str14,
        "MISSING VAL FOR KEY:LZ4");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2586() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2586");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Name of the remote database to backup. Can contain * and ? for globbing.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2587() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2587");
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
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("profiles", objArray10);
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
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str15,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:profiles" + "'",
        str16, "MISSING VAL FOR KEY:profiles");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2588() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2588");
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
    java.lang.String str20 = io.github.onograph.I18N.format("core", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("createRelationshipType", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:core" + "'", str20,
        "MISSING VAL FOR KEY:core");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:createRelationshipType" + "'", str22,
        "MISSING VAL FOR KEY:createRelationshipType");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2589() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2589");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2590() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2590");
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
    java.lang.String str12 = io.github.onograph.I18N.format("Timeout for Akka connection",
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Timeout for Akka connection" + "'", str12,
        "MISSING VAL FOR KEY:Timeout for Akka connection");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2591() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2591");
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
    java.lang.String str19 = io.github.onograph.I18N.format("server_policies", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.log_shipping_max_lag", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("lz4_encoder", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:authentication",
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:server_policies" + "'", str19,
        "MISSING VAL FOR KEY:server_policies");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag" + "'",
        str20, "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str21, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:authentication" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2592() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2592");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2593() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2593");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Privilege",
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
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str11,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2594() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2594");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.security.createUser", objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format("BatchSize", objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("snappy_validating_decoder",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:read-only",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:typically-connect-to-random-read-replica", objArray14);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str16, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str17,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str18, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str19, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str20,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:" + "'", str21,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:snappy_validating_decoder" + "'", str22,
        "MISSING VAL FOR KEY:snappy_validating_decoder");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2595() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2595");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("elapsedTimeMs", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("driver.connection.max_lifetime",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("hostnameOrIp", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str13,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:driver.connection.max_lifetime" + "'", str14,
        "MISSING VAL FOR KEY:driver.connection.max_lifetime");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:hostnameOrIp" + "'",
        str16, "MISSING VAL FOR KEY:hostnameOrIp");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2596() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2596");
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
    java.lang.String str16 = io.github.onograph.I18N.format("cc-client-topology-actor", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:cc-client-topology-actor" + "'", str16,
        "MISSING VAL FOR KEY:cc-client-topology-actor");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2597() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2597");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*transaction.active_write");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2598() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2598");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.graphite.interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2599() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2599");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:cc-rr-topology-actor");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2600() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2600");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("core-member-id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2601() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2601");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("<relationship>[,<relationship>...]");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2602() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2602");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:NewLeaderBarrier");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2603() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2603");
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
    java.lang.String str16 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("databaseMetrics", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.logs.security.rotation.size",
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str13, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str14,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str15, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str16, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:databaseMetrics" + "'", str17,
        "MISSING VAL FOR KEY:databaseMetrics");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.rotation.size" + "'",
        str18, "MISSING VAL FOR KEY:dbms.logs.security.rotation.size");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2604() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2604");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:snappy_validating_decoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2605() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2605");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "Allows a core to down all unreachable members if it needs to do that to allow a new core to join",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:Allows a core to down all unreachable members if it needs to do that to allow a new core to join"
            + "'", str2,
        "MISSING VAL FOR KEY:Allows a core to down all unreachable members if it needs to do that to allow a new core to join");
  }

  @Test
  public void test2606() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2606");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--keep-only-relationship-properties");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2607() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2607");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.max_sample_size", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_filter", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.",
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str13,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2608() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2608");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--keep-only-node-properties");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2609() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2609");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("List all native users.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2610() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2610");
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
    java.lang.String str13 = io.github.onograph.I18N.format("passwordChangeRequired", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("arg1", objArray7);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:passwordChangeRequired" + "'", str13,
        "MISSING VAL FOR KEY:passwordChangeRequired");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:arg1" + "'", str14,
        "MISSING VAL FOR KEY:arg1");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2611() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2611");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*causal_clustering.core.is_leader");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2612() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2612");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--include-metadata");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2613() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2613");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("8m");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2614() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2614");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("in-cluster-token");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2615() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2615");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2616() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2616");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("raft-server", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("transaction.*", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("metrics.filter", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("Retry-After", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "A comma separated list of relationships to ignore.", objArray10);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str13, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str14,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:metrics.filter" + "'", str15,
        "MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:Retry-After" + "'",
        str16, "MISSING VAL FOR KEY:Retry-After");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:A comma separated list of relationships to ignore." + "'", str17,
        "MISSING VAL FOR KEY:A comma separated list of relationships to ignore.");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2617() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2617");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2618() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2618");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:data-link");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2619() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2619");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:<path>");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2620() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2620");
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
    java.lang.String str17 = io.github.onograph.I18N.format("init_server_handler", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("authentication", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:init_server_handler" + "'", str17,
        "MISSING VAL FOR KEY:init_server_handler");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:authentication" + "'", str18,
        "MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2621() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2621");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2622() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2622");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.property_level.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2623() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2623");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:queryPlan");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2624() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2624");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("status", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("cypher.*", objArray7);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:cypher.*" + "'",
        str11, "MISSING VAL FOR KEY:cypher.*");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2625() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2625");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PUBLIC");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2626() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2626");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("*transaction.rollbacks*", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'", str8,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2627() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2627");
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
    java.lang.String str19 = io.github.onograph.I18N.format("false", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("INBOUND", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("metrics.prefix", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "No connection liveliness check is done by default.", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray14);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str19,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str20, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str21,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:metrics.prefix" + "'", str22,
        "MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:No connection liveliness check is done by default." + "'", str23,
        "MISSING VAL FOR KEY:No connection liveliness check is done by default.");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str24,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
  }

  @Test
  public void test2628() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2628");
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
    java.lang.String str18 = io.github.onograph.I18N.format("databaseMetrics", objArray12);
    java.lang.Object[] objArray31 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str32 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray31);
    java.lang.String str33 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray31);
    java.lang.String str34 = io.github.onograph.I18N.format("dbms.security.createUser", objArray31);
    java.lang.String str35 = io.github.onograph.I18N.format("BatchSize", objArray31);
    java.lang.String str36 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray31);
    java.lang.String str37 = io.github.onograph.I18N.format("metrics.prometheus.enabled",
        objArray31);
    java.lang.String str38 = io.github.onograph.I18N.format("modifierProtocols", objArray31);
    java.lang.String str39 = io.github.onograph.I18N.format("Is this server the leader? (gauge)",
        objArray31);
    java.lang.Class<?> wildcardClass40 = objArray31.getClass();
    java.lang.Object[] objArray47 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str48 = io.github.onograph.I18N.format("dbms.pool", objArray47);
    java.lang.Class<?> wildcardClass49 = objArray47.getClass();
    java.lang.Object[] objArray51 = new java.lang.Object[]{
        "/var/run/secrets/kubernetes.io/serviceaccount/token", "databaseMetrics", wildcardClass40,
        wildcardClass49, "yyyy-MM-dd.HH.mm.ss"};
    java.lang.String str52 = io.github.onograph.I18N.format("", objArray51);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:databaseMetrics" + "'", str18,
        "MISSING VAL FOR KEY:databaseMetrics");
    org.junit.Assert.assertNotNull(objArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str32 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str32,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str33 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str33, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str34 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str34,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str35, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str36 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str36, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals(
        "'" + str37 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.enabled" + "'", str37,
        "MISSING VAL FOR KEY:metrics.prometheus.enabled");
    org.junit.Assert.assertEquals(
        "'" + str38 + "' != '" + "MISSING VAL FOR KEY:modifierProtocols" + "'", str38,
        "MISSING VAL FOR KEY:modifierProtocols");
    org.junit.Assert.assertEquals(
        "'" + str39 + "' != '" + "MISSING VAL FOR KEY:Is this server the leader? (gauge)" + "'",
        str39, "MISSING VAL FOR KEY:Is this server the leader? (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass40);
    org.junit.Assert.assertNotNull(objArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals("'" + str48 + "' != '" + "MISSING VAL FOR KEY:dbms.pool" + "'",
        str48, "MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertNotNull(wildcardClass49);
    org.junit.Assert.assertNotNull(objArray51);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51),
        "[/var/run/secrets/kubernetes.io/serviceaccount/token, databaseMetrics, class [Ljava.lang.Object;, class [Ljava.lang.Object;, yyyy-MM-dd.HH.mm.ss]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51),
        "[/var/run/secrets/kubernetes.io/serviceaccount/token, databaseMetrics, class [Ljava.lang.Object;, class [Ljava.lang.Object;, yyyy-MM-dd.HH.mm.ss]");
    org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MISSING VAL FOR KEY:" + "'", str52,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test2629() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2629");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("*transaction.rollbacks*", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of page evictions executed by the page cache. (counter)", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The total number of page evictions executed by the page cache. (counter)"
            + "'", str8,
        "MISSING VAL FOR KEY:The total number of page evictions executed by the page cache. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2630() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2630");
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
    java.lang.String str19 = io.github.onograph.I18N.format("resource", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:resource" + "'",
        str19, "MISSING VAL FOR KEY:resource");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2631() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2631");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray6);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2632() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2632");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("writable", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("native", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER", objArray9);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str11, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:native" + "'",
        str12, "MISSING VAL FOR KEY:native");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2633() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2633");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("LabelQualifierAll");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2634() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2634");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("ccstate", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("rollbacks", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Retry time for log shipping to followers after a stall", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Sets the password of the loopback operator user. ", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str13,
        "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall" + "'", str14,
        "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Sets the password of the loopback operator user. " + "'", str15,
        "MISSING VAL FOR KEY:Sets the password of the loopback operator user. ");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2635() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2635");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The name of the base object or named context to search for user objects when LDAP authorization is enabled. A common case is that this matches the last part of `dbms.security.ldap.authentication.user_dn_template`.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2636() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2636");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Throttle limit for logging unknown cluster member address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2637() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2637");
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
    java.lang.String str17 = io.github.onograph.I18N.format("*transaction.peak_concurrent",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total time, in milliseconds, spent in check pointing so far. (counter)", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Time out for protocol negotiation handshake", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("last_leader_message", objArray12);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:*transaction.peak_concurrent" + "'", str17,
        "MISSING VAL FOR KEY:*transaction.peak_concurrent");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:Time out for protocol negotiation handshake"
            + "'", str19, "MISSING VAL FOR KEY:Time out for protocol negotiation handshake");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:last_leader_message" + "'", str20,
        "MISSING VAL FOR KEY:last_leader_message");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2638() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2638");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "A common prefix for the reported metrics field names.", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "The highest peak of concurrent transactions. (counter)", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("traverse", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The total number of different relationship types stored in the database. (gauge)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "causal_clustering.read_replica_transaction_applier_batch_size", objArray13);
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str15,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:A common prefix for the reported metrics field names." + "'", str18,
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The highest peak of concurrent transactions. (counter)" + "'", str19,
        "MISSING VAL FOR KEY:The highest peak of concurrent transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:traverse" + "'",
        str20, "MISSING VAL FOR KEY:traverse");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size" + "'",
        str22, "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2639() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2639");
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
    java.lang.String str16 = io.github.onograph.I18N.format("in-cluster-token", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:in-cluster-token" + "'", str16,
        "MISSING VAL FOR KEY:in-cluster-token");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2640() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2640");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("page_faults");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2641() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2641");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("Upgraded", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(".Database checkpointing metrics",
        objArray5);
    java.lang.Class<?> wildcardClass11 = objArray5.getClass();
    org.junit.Assert.assertNotNull(objArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str6,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str7, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str8, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str9,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:.Database checkpointing metrics" + "'", str10,
        "MISSING VAL FOR KEY:.Database checkpointing metrics");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2642() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2642");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2643() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2643");
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
    java.lang.String str19 = io.github.onograph.I18N.format("false", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("INBOUND", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "Time between scanning the cluster to refresh current server's view of topology",
        objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("metrics.neo4j.logrotation.enabled",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("hnd_get_all_database_ids", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray14);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str19,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str20, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology"
            + "'", str21,
        "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled" + "'",
        str22, "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:hnd_get_all_database_ids" + "'", str23,
        "MISSING VAL FOR KEY:hnd_get_all_database_ids");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str24,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2644() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2644");
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
    java.lang.String str17 = io.github.onograph.I18N.format("profiles", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.bolt.messages.enabled",
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str16,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:profiles" + "'",
        str17, "MISSING VAL FOR KEY:profiles");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.bolt.messages.enabled" + "'", str18,
        "MISSING VAL FOR KEY:metrics.bolt.messages.enabled");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2645() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2645");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("time", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("dbms.scheduler.profile", objArray6);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:time" + "'", str8,
        "MISSING VAL FOR KEY:time");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:dbms.scheduler.profile" + "'", str9,
        "MISSING VAL FOR KEY:dbms.scheduler.profile");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2646() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2646");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("pageFaults", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:pageFaults" + "'",
        str2, "MISSING VAL FOR KEY:pageFaults");
  }

  @Test
  public void test2647() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2647");
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
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("core", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)",
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str16,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str17,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str18,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:core" + "'", str19,
        "MISSING VAL FOR KEY:core");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2648() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2648");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("store.size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2649() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2649");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("writable", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("--additional-config", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str11,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str12,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2650() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2650");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:<all/users/roles>");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2651() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2651");
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
    java.lang.String str17 = io.github.onograph.I18N.format("metrics.graphite.interval",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.interval" + "'", str17,
        "MISSING VAL FOR KEY:metrics.graphite.interval");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2652() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2652");
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
    java.lang.String str17 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("NewLeaderBarrier", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str17, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:NewLeaderBarrier" + "'", str18,
        "MISSING VAL FOR KEY:NewLeaderBarrier");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2653() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2653");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("RelationshipQualifierAll");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2654() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2654");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("store.size.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2655() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2655");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The frequency with which a leader will try and transfer leadership to another member");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2656() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2656");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("designated_seeder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2657() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2657");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format("true", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.max_databases", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("handshake_initializer", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:restarting-cluster-client", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:raft_chunked_writer", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("create", objArray14);
    org.junit.Assert.assertNotNull(objArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str15,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str16,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str17,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str18,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str19,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str20,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:" + "'", str21,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client"
            + "'", str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft_chunked_writer"
            + "'", str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft_chunked_writer");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:create" + "'",
        str24, "MISSING VAL FOR KEY:create");
  }

  @Test
  public void test2658() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2658");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:PUBLIC",
        objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("<all/users/roles>", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PUBLIC" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PUBLIC");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:<all/users/roles>" + "'", str17,
        "MISSING VAL FOR KEY:<all/users/roles>");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2659() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2659");
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
    java.lang.String str14 = io.github.onograph.I18N.format("replication_maybe", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str14,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2660() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2660");
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
    java.lang.String str13 = io.github.onograph.I18N.format("fabric.database.name", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:fabric.database.name" + "'", str13,
        "MISSING VAL FOR KEY:fabric.database.name");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2661() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2661");
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
        "Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.",
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.jmx.enabled" + "'", str19,
        "MISSING VAL FOR KEY:metrics.jmx.enabled");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes."
            + "'", str20,
        "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2662() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2662");
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
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:OUTBOUND",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("handshake_client_decoder", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:handshake_client_decoder" + "'", str20,
        "MISSING VAL FOR KEY:handshake_client_decoder");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2663() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2663");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Dispatcher");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2664() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2664");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("LZ_validating", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("databaseId", objArray9);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:LZ_validating" + "'", str12,
        "MISSING VAL FOR KEY:LZ_validating");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use."
            + "'", str13,
        "MISSING VAL FOR KEY:Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:databaseId" + "'",
        str14, "MISSING VAL FOR KEY:databaseId");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2665() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2665");
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
    java.lang.String str17 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("replication_maybe", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str17,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str18,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2666() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2666");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("used");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2667() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2667");
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
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("iops", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str16,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str17,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str18,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str19,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2668() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2668");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("scheme");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2669() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2669");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.raft_messages_log_enable");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2670() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2670");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Number of available processors", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("action", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("Privilege", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.procedures", objArray11);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str15, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str16,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:Privilege" + "'",
        str17, "MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.procedures" + "'", str18,
        "MISSING VAL FOR KEY:dbms.procedures");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2671() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2671");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("parameters");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2672() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2672");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_snapshot");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2673() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2673");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("raft-member-mapping");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2674() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2674");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the memory usage. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2675() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2675");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_res_tx_pull");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2676() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2676");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("read", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("ssl_handler", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.min_std_deviation", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str13, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation"
            + "'", str14,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2677() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2677");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of exceptions seen during the eviction process in the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2678() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2678");
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
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("QUALIFIED", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray11);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:QUALIFIED" + "'",
        str17, "MISSING VAL FOR KEY:QUALIFIED");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
  }

  @Test
  public void test2679() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2679");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Configures the time taken attempting to publish a cluster id to the discovery service before potentially retrying.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2680() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2680");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka.jvm-shutdown-hooks");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2681() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2681");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str7 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("127.0.0.1", objArray6);
    java.lang.Class<?> wildcardClass9 = objArray6.getClass();
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str7,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:127.0.0.1" + "'",
        str8, "MISSING VAL FOR KEY:127.0.0.1");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2682() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2682");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("stop");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2683() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2683");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.driver.idle_check_interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2684() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2684");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Maximal concurrency within Fabric queries.\nLimits the number of iterations of each subquery that are executed concurrently. Higher concurrency may consume more memory and network resources simultaneously, while lower concurrency may force sequential execution, requiring more time.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2685() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2685");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2686() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2686");
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
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.protocol_implementations.raft", objArray11);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft" + "'", str18,
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2687() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2687");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("constraintName");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2688() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2688");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("NO_ID");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2689() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2689");
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
        "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.",
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2690() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2690");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.acceptable-heartbeat-pause");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2691() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2691");
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
        "The total number of rolled back read transactions. (counter)", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("active", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("last-flushed", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The maximum batch size when catching up (in unit of entries)", objArray12);
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
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str17, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:active" + "'",
        str18, "MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:last-flushed" + "'",
        str19, "MISSING VAL FOR KEY:last-flushed");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The maximum batch size when catching up (in unit of entries)" + "'",
        str20, "MISSING VAL FOR KEY:The maximum batch size when catching up (in unit of entries)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2692() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2692");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("function", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("targetDirectory", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("*transaction.active_write", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("high_limitV3_0_0", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.raft_log_rotation_size", objArray7);
    java.lang.Class<?> wildcardClass15 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str9, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str10, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:targetDirectory" + "'", str11,
        "MISSING VAL FOR KEY:targetDirectory");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:*transaction.active_write" + "'", str12,
        "MISSING VAL FOR KEY:*transaction.active_write");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_0_0" + "'", str13,
        "MISSING VAL FOR KEY:high_limitV3_0_0");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_log_rotation_size"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.raft_log_rotation_size");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2693() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2693");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:resource");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2694() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2694");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("publisher");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2695() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2695");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The accumulated time messages have spent waiting for a worker thread. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2696() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2696");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2697() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2697");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("elapsedTimeMs", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("driver.connection.max_lifetime",
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str11,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:driver.connection.max_lifetime" + "'", str12,
        "MISSING VAL FOR KEY:driver.connection.max_lifetime");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2698() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2698");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2699() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2699");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Shuts down the Neo4j server.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2700() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2700");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("SCHEMA", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("total_bytes", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("heap.max", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str13, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str14, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:total_bytes" + "'",
        str15, "MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:heap.max" + "'",
        str16, "MISSING VAL FOR KEY:heap.max");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2701() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2701");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("writable", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("--additional-config", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("addresses", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("akka.cluster.min-nr-of-members",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("browser.credential_timeout",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str12, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str13,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str14, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:akka.cluster.min-nr-of-members" + "'", str15,
        "MISSING VAL FOR KEY:akka.cluster.min-nr-of-members");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str16,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2702() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2702");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.threshold");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2703() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2703");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("total");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2704() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2704");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("causal_clustering.kubernetes.token");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2705() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2705");
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
    java.lang.String str17 = io.github.onograph.I18N.format("*transaction.peak_concurrent",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total time, in milliseconds, spent in check pointing so far. (counter)", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Time out for protocol negotiation handshake", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("*check_point.duration", objArray12);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:*transaction.peak_concurrent" + "'", str17,
        "MISSING VAL FOR KEY:*transaction.peak_concurrent");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:Time out for protocol negotiation handshake"
            + "'", str19, "MISSING VAL FOR KEY:Time out for protocol negotiation handshake");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:*check_point.duration" + "'", str20,
        "MISSING VAL FOR KEY:*check_point.duration");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2706() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2706");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("admin.ini");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2707() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2707");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("leader-only", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:storeStateReader",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str12, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names."
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeStateReader" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeStateReader");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2708() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2708");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("writable", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("success", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str10, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:success" + "'",
        str11, "MISSING VAL FOR KEY:success");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes."
            + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2709() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2709");
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
    java.lang.String str21 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str18, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str19, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes" + "'",
        str20, "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:" + "'", str21,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str22,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2710() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2710");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:db.checkpoint");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2711() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2711");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Path or paths from which to restore. Every path can contain asterisks or question marks in the last subpath. Multiple paths may be separated by a comma, but paths themselves must not contain commas.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2712() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2712");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2713() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2713");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2714() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2714");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("security-privileges", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray6);
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
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:security-privileges" + "'", str8,
        "MISSING VAL FOR KEY:security-privileges");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2715() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2715");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT");
  }

  @Test
  public void test2716() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2716");
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
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.security.ldap.connection_timeout",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout" + "'",
        str17, "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2717() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2717");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("cypher", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group",
        objArray13);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str19,
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:cypher" + "'",
        str20, "MISSING VAL FOR KEY:cypher");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled."
            + "'", str21,
        "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
  }

  @Test
  public void test2718() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2718");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.protocol_implementations.compression");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2719() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2719");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("raft-server", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("transaction.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("metrics.filter", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("Retry-After", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Directory to hold cluster state including Raft log", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("*vm.memory.pool.g1_eden_space",
        objArray11);
    java.lang.Class<?> wildcardClass20 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str12,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str13, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str14, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str15,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:metrics.filter" + "'", str16,
        "MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:Retry-After" + "'",
        str17, "MISSING VAL FOR KEY:Retry-After");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Directory to hold cluster state including Raft log" + "'", str18,
        "MISSING VAL FOR KEY:Directory to hold cluster state including Raft log");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space" + "'", str19,
        "MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test2720() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2720");
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
    java.lang.String str14 = io.github.onograph.I18N.format("catchup-server", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Name of the database associated to the Fabric graph.", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("ssl_handler", objArray8);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:catchup-server" + "'", str14,
        "MISSING VAL FOR KEY:catchup-server");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Name of the database associated to the Fabric graph."
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Name of the database associated to the Fabric graph.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str16, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2721() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2721");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("db");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2722() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2722");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_req_store_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2723() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2723");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("term");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2724() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2724");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Configures the time after which we retry binding to a cluster. Only applies to Akka discovery. A discovery type of DNS/SRV/K8S will be queried again on retry.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2725() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2725");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Enable metrics. Setting this to `false` will to turn off all metrics.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2726() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2726");
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
    java.lang.String str20 = io.github.onograph.I18N.format("restore", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:restore" + "'",
        str20, "MISSING VAL FOR KEY:restore");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2727() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2727");
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
    java.lang.String str17 = io.github.onograph.I18N.format("Number of available processors",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str17,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space");
  }

  @Test
  public void test2728() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2728");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to keep for relationships with the specified type. Any relationship types not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-relationship-properties.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2729() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2729");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("*ids_in_use.node", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("temp-copy", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.logs.security.format", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("ids_in_use.*", objArray8);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:temp-copy" + "'",
        str11, "MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.format" + "'", str12,
        "MISSING VAL FOR KEY:dbms.logs.security.format");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:ids_in_use.*" + "'",
        str13, "MISSING VAL FOR KEY:ids_in_use.*");
  }

  @Test
  public void test2730() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2730");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("List all functions in the DBMS.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2731() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2731");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2732() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2732");
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
    java.lang.String str19 = io.github.onograph.I18N.format("init_server_handler", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_req_precopy",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "The transactions' size in native memory in bytes. (histogram)", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:init_server_handler" + "'", str19,
        "MISSING VAL FOR KEY:init_server_handler");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str20,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)" + "'",
        str22, "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2733() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2733");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Configures the time taken attempting to publish a cluster id to the discovery service before potentially retrying.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2734() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2734");
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
    java.lang.String str19 = io.github.onograph.I18N.format("PropertyKey", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("causal_clustering.refuse_to_be_leader",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "typically-connect-to-random-read-replica", objArray13);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str19, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str20,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str21, "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str22, "MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2735() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2735");
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
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:initial_members",
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2736() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2736");
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
    java.lang.String str17 = io.github.onograph.I18N.format("NEO4J_CLUSTER", objArray11);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str16,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:NEO4J_CLUSTER" + "'", str17,
        "MISSING VAL FOR KEY:NEO4J_CLUSTER");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2737() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2737");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Address for Kubernetes API");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2738() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2738");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("targetDirectory", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("*transaction.active_write", objArray5);
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str8, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:targetDirectory" + "'", str9,
        "MISSING VAL FOR KEY:targetDirectory");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:*transaction.active_write" + "'", str10,
        "MISSING VAL FOR KEY:*transaction.active_write");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2739() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2739");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("LabelQualifierAll", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str2,
        "MISSING VAL FOR KEY:LabelQualifierAll");
  }

  @Test
  public void test2740() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2740");
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
    java.lang.String str20 = io.github.onograph.I18N.format("resource", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Upgraded",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str18,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str19, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:resource" + "'",
        str20, "MISSING VAL FOR KEY:resource");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgraded" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2741() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2741");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("true", objArray7);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str9,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:User" + "'", str10,
        "MISSING VAL FOR KEY:User");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2742() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2742");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("lz4_encoder", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:--additional-config", objArray4);
    org.junit.Assert.assertNotNull(objArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str5,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str6, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str7, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--additional-config" + "'",
        str8, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--additional-config");
  }

  @Test
  public void test2743() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2743");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("raft-server", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.join_catch_up_timeout", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:<all/users/roles>",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.stream.buffer.size", objArray9);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<all/users/roles>" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<all/users/roles>");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.stream.buffer.size"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.stream.buffer.size");
  }

  @Test
  public void test2744() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2744");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path",
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2745() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2745");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Transaction retries. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2746() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2746");
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
    java.lang.String str19 = io.github.onograph.I18N.format("false", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("INBOUND", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("metrics.prefix", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "No connection liveliness check is done by default.", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "List all roles assigned to the specified user.", objArray14);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str19,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str20, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str21,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:metrics.prefix" + "'", str22,
        "MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:No connection liveliness check is done by default." + "'", str23,
        "MISSING VAL FOR KEY:No connection liveliness check is done by default.");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:List all roles assigned to the specified user." + "'", str24,
        "MISSING VAL FOR KEY:List all roles assigned to the specified user.");
  }

  @Test
  public void test2747() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2747");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("discovery");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2748() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2748");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "The number of operations to be processed before the state machines flush to disk",
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:connections_closed" + "'", str20,
        "MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.listen_address" + "'", str21,
        "MISSING VAL FOR KEY:dbms.backup.listen_address");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk"
            + "'", str22,
        "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2749() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2749");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("true");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2750() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2750");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("in_flight_cache");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2751() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2751");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.threshold");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2752() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2752");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2753() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2753");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Set to `true` to enable the Prometheus endpoint");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2754() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2754");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Number of available processors", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("action", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("Privilege", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.akka_actor_system_restarter.max_acceptable_failures", objArray12);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str16, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str17,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:Privilege" + "'",
        str18, "MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str19,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str20,
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2755() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2755");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.security.ldap.use_starttls",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.use_starttls" + "'", str14,
        "MISSING VAL FOR KEY:dbms.security.ldap.use_starttls");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2756() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2756");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.quarantineDatabase");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2757() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2757");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("tofile");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2758() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2758");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Settings for Causal Clustering");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2759() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2759");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("*ids_in_use.node", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist"
            + "'", str11,
        "MISSING VAL FOR KEY:A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2760() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2760");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The number of operations to be processed before the state machines flush to disk");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2761() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2761");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "A list of group names for the server used when configuring load balancing and replication policies.",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies."
            + "'", str2,
        "MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies.");
  }

  @Test
  public void test2762() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2762");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("function", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("causal_clustering.read_replica",
        objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The maximum file size before the membership state file is rotated (in unit of entries)",
        objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format("com.sun.jndi.ldap.read.timeout",
        objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:elapsedTimeMs",
        objArray9);
    java.lang.Class<?> wildcardClass19 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str10,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str11, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str12,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str13, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str14,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str15,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)"
            + "'", str16,
        "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout" + "'", str17,
        "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2763() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2763");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("logs");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2764() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2764");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_id_publish_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2765() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2765");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("check_point");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2766() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2766");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2767() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2767");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_req_all_databases_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2768() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2768");
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
    java.lang.String str20 = io.github.onograph.I18N.format("frame_encoder", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:frame_encoder" + "'", str20,
        "MISSING VAL FOR KEY:frame_encoder");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2769() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2769");
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
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hnd_info",
        objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.cluster.seed_node_timeout", objArray7);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_info" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_info");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout" + "'",
        str14, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2770() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2770");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("logging-dispatcher.throughput");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2771() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2771");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of IO operations performed by page cache.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2772() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2772");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("akka.jvm-shutdown-hooks", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:max_elements",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str11,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks" + "'", str13,
        "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:max_elements" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2773() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2773");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("system");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2774() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2774");
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
        "The total number of threads (both idle and busy) in the jetty pool. (gauge)", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.store_copy_chunk_size", objArray9);
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
            + "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2775() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2775");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("bolt.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("false", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.graphite.interval",
        objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "The highest peak of concurrent transactions. (counter)", objArray11);
    java.lang.Class<?> wildcardClass20 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str12,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str13, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str15, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str16,
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str17,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.interval" + "'", str18,
        "MISSING VAL FOR KEY:metrics.graphite.interval");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The highest peak of concurrent transactions. (counter)" + "'", str19,
        "MISSING VAL FOR KEY:The highest peak of concurrent transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test2776() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2776");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("query-logging");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2777() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2777");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "causal_clustering.replication_retry_timeout_limit", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.replication_retry_timeout_limit" + "'", str2,
        "MISSING VAL FOR KEY:causal_clustering.replication_retry_timeout_limit");
  }

  @Test
  public void test2778() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2778");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("ids_in_use.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2779() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2779");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops"
            + "'", str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
  }

  @Test
  public void test2780() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2780");
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
    java.lang.String str13 = io.github.onograph.I18N.format("elapsedTimeMs", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str13,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2781() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2781");
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
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.security.ldap.connection_timeout",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str15,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout" + "'",
        str16, "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2782() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2782");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2783() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2783");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2784() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2784");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_res_tx_fin");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2785() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2785");
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
    java.lang.String str19 = io.github.onograph.I18N.format("<path>", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("enc_req_database_id", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:<path>" + "'",
        str19, "MISSING VAL FOR KEY:<path>");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:enc_req_database_id" + "'", str20,
        "MISSING VAL FOR KEY:enc_req_database_id");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2786() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2786");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.logs.security.rotation.delay");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2787() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2787");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2788() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2788");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("time", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Store copy chunk size", objArray6);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:time" + "'", str8,
        "MISSING VAL FOR KEY:time");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Store copy chunk size" + "'", str9,
        "MISSING VAL FOR KEY:Store copy chunk size");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2789() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2789");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("bolt.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("enc_get_metadata", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("native", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str13, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:enc_get_metadata" + "'", str14,
        "MISSING VAL FOR KEY:enc_get_metadata");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:native" + "'",
        str15, "MISSING VAL FOR KEY:native");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2790() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2790");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("function");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2791() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2791");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.deleteUser");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2792() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2792");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("handshake_server_encoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2793() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2793");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("vm.memory.pool.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2794() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2794");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of committed transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2795() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2795");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure"
            + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure");
  }

  @Test
  public void test2796() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2796");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.max-sample-size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2797() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2797");
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
        "Sets level for driver internal logging.", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:Sets level for driver internal logging."
            + "'", str13, "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str14,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2798() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2798");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:databaseId");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2799() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2799");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("APPLIES_TO");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2800() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2800");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2801() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2801");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2802() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2802");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.createUser", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("messages_started", objArray8);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:messages_started" + "'", str12,
        "MISSING VAL FOR KEY:messages_started");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2803() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2803");
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str15, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2804() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2804");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("quarantineDatabase");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2805() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2805");
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
    java.lang.String str20 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str20,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2806() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2806");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("TRACKING_RESPONSE_HANDLER", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.",
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
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER" + "'", str11,
        "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric."
            + "'", str12,
        "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2807() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2807");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("Database", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:Database" + "'",
        str2, "MISSING VAL FOR KEY:Database");
  }

  @Test
  public void test2808() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2808");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*dbms.pool.bolt.total_used");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2809() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2809");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2810() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2810");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("bolt.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("false", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.graphite.interval",
        objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "The total number of exceptions seen during the eviction process in the page cache. (counter)",
        objArray11);
    java.lang.Class<?> wildcardClass20 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str12,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str13, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str15, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str16,
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str17,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.interval" + "'", str18,
        "MISSING VAL FOR KEY:metrics.graphite.interval");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)"
            + "'", str19,
        "MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test2811() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2811");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("initial_members");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2812() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2812");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("pageHits");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2813() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2813");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of bytes appended to transaction log. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2814() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2814");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The highest peak of concurrent transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2815() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2815");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.jvm.memory.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2816() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2816");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("page_cache");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2817() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2817");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("iops", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("/{databaseName}/cluster", objArray11);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str17,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:/{databaseName}/cluster" + "'", str18,
        "MISSING VAL FOR KEY:/{databaseName}/cluster");
  }

  @Test
  public void test2818() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2818");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Sets level for driver internal logging.", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("max_elements", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("leader-only", objArray11);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str13,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Sets level for driver internal logging."
            + "'", str15, "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:max_elements" + "'",
        str16, "MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str17,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str18, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2819() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2819");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.raft_log_prune_strategy");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2820() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2820");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2821() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2821");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("store_version");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2822() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2822");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "List the active lock requests granted for the transaction executing the query with the given query id.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2823() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2823");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2824() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2824");
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
    java.lang.String str19 = io.github.onograph.I18N.format("connections_closed", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:false",
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:connections_closed" + "'", str19,
        "MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2825() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2825");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("*db.query.execution*", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:*db.query.execution*" + "'", str2,
        "MISSING VAL FOR KEY:*db.query.execution*");
  }

  @Test
  public void test2826() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2826");
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
    java.lang.String str21 = io.github.onograph.I18N.format(
        "Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Clears authentication and authorization cache.", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str21,
        "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Clears authentication and authorization cache." + "'", str22,
        "MISSING VAL FOR KEY:Clears authentication and authorization cache.");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2827() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2827");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("copy");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2828() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2828");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("raft-server", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("bytes_written", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("terminated_write", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_id_publish_timeout", objArray9);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:bytes_written" + "'", str13,
        "MISSING VAL FOR KEY:bytes_written");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:terminated_write" + "'", str14,
        "MISSING VAL FOR KEY:terminated_write");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2829() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2829");
    }
    java.lang.Object[] objArray15 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str16 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray15);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray15);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.security.createUser", objArray15);
    java.lang.String str19 = io.github.onograph.I18N.format("BatchSize", objArray15);
    java.lang.String str20 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("snappy_validating_decoder",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:read-only",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:typically-connect-to-random-read-replica", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("storeStateReader", objArray15);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str17, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str18,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str19, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str20, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str21,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:snappy_validating_decoder" + "'", str23,
        "MISSING VAL FOR KEY:snappy_validating_decoder");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica" + "'",
        str25, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:storeStateReader" + "'", str26,
        "MISSING VAL FOR KEY:storeStateReader");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test2830() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2830");
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
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("iops", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "dbms.security.authentication_providers", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str16,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str17,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str18,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str19,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.security.authentication_providers" + "'",
        str20, "MISSING VAL FOR KEY:dbms.security.authentication_providers");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2831() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2831");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("SCHEMA");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2832() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2832");
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
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_topology_refresh", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "A common prefix for the reported metrics field names.", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("--from-path-tx", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str20, "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:A common prefix for the reported metrics field names." + "'", str21,
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:--from-path-tx" + "'", str22,
        "MISSING VAL FOR KEY:--from-path-tx");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2833() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2833");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("accumulated_processing_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2834() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2834");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Estimated total capacity of buffers in the pool. (gauge)", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_base", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The total number of page pins executed by the page cache. (counter)", objArray12);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)" + "'",
        str18, "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base" + "'", str19,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The total number of page pins executed by the page cache. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:The total number of page pins executed by the page cache. (counter)");
  }

  @Test
  public void test2835() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2835");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_res_file_header");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2836() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2836");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.protocol_implementations.raft");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2837() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2837");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*transaction.peak_concurrent");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2838() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2838");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("/dbms/cluster.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2839() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2839");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:pins");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2840() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2840");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Sets the password of the loopback operator user. ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2841() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2841");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2842() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2842");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.leadership_balancing");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2843() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2843");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Time elapsed since last message from leader in milliseconds. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2844() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2844");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray9);
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
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:browser.credential_timeout" + "'", str11,
        "MISSING VAL FOR KEY:browser.credential_timeout");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:total_time" + "'",
        str14, "MISSING VAL FOR KEY:total_time");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2845() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2845");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "List all jobs that are active in the database internal job scheduler.", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:List all jobs that are active in the database internal job scheduler."
            + "'", str2,
        "MISSING VAL FOR KEY:List all jobs that are active in the database internal job scheduler.");
  }

  @Test
  public void test2846() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2846");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Maximum timeout for cluster status request execution", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("Administration command: SHOW USERS",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str18,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Administration command: SHOW USERS" + "'",
        str20, "MISSING VAL FOR KEY:Administration command: SHOW USERS");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2847() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2847");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Pooled connections that have been idle in the pool for longer than this timeout will be tested before they are used again, to ensure they are still alive.\nIf this option is set too low, an additional network call will be incurred when acquiring a connection, which causes a performance hit.\nIf this is set high, no longer live connections might be used which might lead to errors.\nHence, this parameter tunes a balance between the likelihood of experiencing connection problems and performance\nNormally, this parameter should not need tuning.\nValue 0 means connections will always be tested for validity");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2848() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2848");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft_chunked_writer");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2849() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2849");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.raft_advertised_address", objArray5);
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str8, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str9,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_advertised_address"
            + "'", str10, "MISSING VAL FOR KEY:causal_clustering.raft_advertised_address");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2850() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2850");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:unreachable");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2851() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2851");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Discovery cluster member size. (gauge)", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("akka", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("data-link", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:An LDAP system account username to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`. Note that the `dbms.security.ldap.authentication.user_dn_template` will not be applied to this username, so you may have to specify a full DN.",
        objArray8);
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
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str10, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str11,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:data-link" + "'",
        str12, "MISSING VAL FOR KEY:data-link");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:An LDAP system account username to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`. Note that the `dbms.security.ldap.authentication.user_dn_template` will not be applied to this username, so you may have to specify a full DN."
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:An LDAP system account username to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`. Note that the `dbms.security.ldap.authentication.user_dn_template` will not be applied to this username, so you may have to specify a full DN.");
  }

  @Test
  public void test2852() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2852");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "dbms.security.property_level.blacklist");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2853() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2853");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2854() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2854");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.raft_log_implementation");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2855() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2855");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("create", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:create" + "'", str2,
        "MISSING VAL FOR KEY:create");
  }

  @Test
  public void test2856() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2856");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("elapsedTimeMs", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("authorization", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path", objArray10);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str13,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:authorization" + "'", str14,
        "MISSING VAL FOR KEY:authorization");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2857() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2857");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_tx_pull");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2858() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2858");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("profiles", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.bolt.messages.enabled",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("operator_auth", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.",
        objArray13);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:profiles" + "'",
        str19, "MISSING VAL FOR KEY:profiles");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.bolt.messages.enabled" + "'", str20,
        "MISSING VAL FOR KEY:metrics.bolt.messages.enabled");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str21,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id."
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.");
  }

  @Test
  public void test2859() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2859");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2860() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2860");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("Assign a role to the user.", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:Assign a role to the user." + "'", str2,
        "MISSING VAL FOR KEY:Assign a role to the user.");
  }

  @Test
  public void test2861() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2861");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of relationships to ignore.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2862() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2862");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2863() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2863");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("status", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("operator_auth", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("Restore a backed up database.",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("passwordChangeRequired", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("hours", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The total number of Bolt connections currently being executed. (gauge)", objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format("", objArray12);
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str14, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str16,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Restore a backed up database." + "'", str17,
        "MISSING VAL FOR KEY:Restore a backed up database.");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:passwordChangeRequired" + "'", str18,
        "MISSING VAL FOR KEY:passwordChangeRequired");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:hours" + "'", str19,
        "MISSING VAL FOR KEY:hours");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections currently being executed. (gauge)"
            + "'", str20,
        "MISSING VAL FOR KEY:The total number of Bolt connections currently being executed. (gauge)");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:" + "'", str21,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test2864() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2864");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("Number of available processors",
        objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str8,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str9,
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str10, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2865() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2865");
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
    java.lang.String str20 = io.github.onograph.I18N.format("init_server_handler", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("graphIds", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "Name of the database associated to the Fabric graph.", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:init_server_handler" + "'", str20,
        "MISSING VAL FOR KEY:init_server_handler");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:graphIds" + "'",
        str22, "MISSING VAL FOR KEY:graphIds");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:Name of the database associated to the Fabric graph." + "'", str23,
        "MISSING VAL FOR KEY:Name of the database associated to the Fabric graph.");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:" + "'", str24,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2866() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2866");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Administration command: DROP USER",
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Administration command: DROP USER" + "'", str9,
        "MISSING VAL FOR KEY:Administration command: DROP USER");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2867() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2867");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("true", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:continuous",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray10);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str12,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str15, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2868() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2868");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.max_sample_size", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("security.log", objArray9);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str12,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:security.log" + "'",
        str14, "MISSING VAL FOR KEY:security.log");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2869() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2869");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("DATABASE");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2870() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2870");
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
    java.lang.String str17 = io.github.onograph.I18N.format("hours", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology",
        objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:hours" + "'", str17,
        "MISSING VAL FOR KEY:hours");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology");
  }

  @Test
  public void test2871() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2871");
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
    java.lang.String str15 = io.github.onograph.I18N.format("total_time", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"",
        objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:total_time" + "'",
        str15, "MISSING VAL FOR KEY:total_time");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\""
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"");
  }

  @Test
  public void test2872() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2872");
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
    java.lang.String str20 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("metrics.prefix", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "No connection liveliness check is done by default.", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str20,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:metrics.prefix" + "'", str21,
        "MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:No connection liveliness check is done by default." + "'", str22,
        "MISSING VAL FOR KEY:No connection liveliness check is done by default.");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2873() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2873");
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
        "The total number of threads (both idle and busy) in the jetty pool. (gauge)", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*check_point.duration", objArray9);
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
            + "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*check_point.duration"
            + "'", str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*check_point.duration");
  }

  @Test
  public void test2874() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2874");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2875() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2875");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("messages_received", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.namespace", objArray11);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str17,
        "MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace" + "'",
        str18, "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2876() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2876");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--database");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2877() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2877");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("dbms.logs.security.path", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.path" + "'", str2,
        "MISSING VAL FOR KEY:dbms.logs.security.path");
  }

  @Test
  public void test2878() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2878");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("source");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2879() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2879");
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
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str12,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str13,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2880() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2880");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.upgrade*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2881() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2881");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("ssl_handler", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.min_std_deviation", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.createUser", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("terminated_write", objArray11);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str15, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation"
            + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.createUser"
            + "'", str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:terminated_write" + "'", str18,
        "MISSING VAL FOR KEY:terminated_write");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2882() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2882");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "File location of namespace for Kubernetes API");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2883() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2883");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2884() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2884");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("volumetric", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("dbms.security.property_level.enabled",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The highest transaction id that has been pulled in the last pull updates by this instance. (counter)",
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:volumetric" + "'",
        str8, "MISSING VAL FOR KEY:volumetric");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:dbms.security.property_level.enabled" + "'",
        str9, "MISSING VAL FOR KEY:dbms.security.property_level.enabled");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2885() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2885");
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
    java.lang.String str20 = io.github.onograph.I18N.format("localhost", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.group_membership_attributes", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "The reporting interval for the CSV files. That is, how often new rows with numbers are appended to the CSV files.",
        objArray14);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str20, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes" + "'",
        str21, "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str23,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:The reporting interval for the CSV files. That is, how often new rows with numbers are appended to the CSV files."
            + "'", str24,
        "MISSING VAL FOR KEY:The reporting interval for the CSV files. That is, how often new rows with numbers are appended to the CSV files.");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2886() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2886");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:backup");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2887() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2887");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str15, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str16,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2888() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2888");
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
        "MISSING VAL FOR KEY:driver.connection.pool.max_size", objArray9);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.connection.pool.max_size");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2889() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2889");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Discovery cluster member size. (gauge)", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("akka", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str10, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str11,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2890() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2890");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("data-import");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2891() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2891");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("status", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("raft-server", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("transaction.*", objArray7);
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
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str11,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2892() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2892");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "/var/run/secrets/kubernetes.io/serviceaccount/token");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2893() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2893");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format("--delete-nodes-with-labels", objArray3);
    java.lang.Class<?> wildcardClass7 = objArray3.getClass();
    org.junit.Assert.assertNotNull(objArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    org.junit.Assert.assertEquals("'" + str4 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str4,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str5,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "MISSING VAL FOR KEY:--delete-nodes-with-labels" + "'", str6,
        "MISSING VAL FOR KEY:--delete-nodes-with-labels");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2894() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2894");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("time", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Host and port to bind the cluster member discovery management communication.", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:time" + "'", str10,
        "MISSING VAL FOR KEY:time");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication."
            + "'", str11,
        "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)"
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2895() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2895");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("RAFT log implementation");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2896() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2896");
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
    java.lang.String str18 = io.github.onograph.I18N.format("connections_closed", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:connections_closed" + "'", str18,
        "MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2897() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2897");
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
    java.lang.String str20 = io.github.onograph.I18N.format("", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:" + "'", str20,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2898() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2898");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*pool.transaction.*.used_heap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2899() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2899");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2900() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2900");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of Bolt sessions started since this instance started. This includes both succeeded and failed sessions (deprecated, use connections_opened instead). (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2901() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2901");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Count of successful database start operations. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2902() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2902");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:catchup-server");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2903() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2903");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("volumetric", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("dbms.security.property_level.enabled",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Maximum timeout for cluster status request execution", objArray5);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:volumetric" + "'",
        str8, "MISSING VAL FOR KEY:volumetric");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:dbms.security.property_level.enabled" + "'",
        str9, "MISSING VAL FOR KEY:dbms.security.property_level.enabled");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str10,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2904() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2904");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The upper limit for the exponentially incremented retry timeout.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2905() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2905");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:cypher.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2906() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2906");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("init");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2907() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2907");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("high_limitV4_0_0");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2908() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2908");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("NewLeaderBarrier", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("hi!", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Set to `true` to enable exporting metrics to Graphite.", objArray13);
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str19, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:NewLeaderBarrier" + "'", str20,
        "MISSING VAL FOR KEY:NewLeaderBarrier");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:hi!" + "'", str21,
        "MISSING VAL FOR KEY:hi!");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Set to `true` to enable exporting metrics to Graphite." + "'", str22,
        "MISSING VAL FOR KEY:Set to `true` to enable exporting metrics to Graphite.");
  }

  @Test
  public void test2909() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2909");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.state_machine_apply_max_batch_size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2910() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2910");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("snappy_decoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2911() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2911");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:high_limitV3_2_0");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2912() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2912");
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
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("QUALIFIED", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("driver.api", objArray11);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:QUALIFIED" + "'",
        str17, "MISSING VAL FOR KEY:QUALIFIED");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:driver.api" + "'",
        str18, "MISSING VAL FOR KEY:driver.api");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2913() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2913");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("raft_message_encoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2914() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2914");
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
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total_bytes",
        objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes");
  }

  @Test
  public void test2915() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2915");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Number of available processors", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("action", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("Privilege", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "causal_clustering.akka_actor_system_restarter.max_acceptable_failures", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str15, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str17, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str18,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:Privilege" + "'",
        str19, "MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str20,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str21,
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2916() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2916");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("server.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2917() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2917");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2918() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2918");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2919() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2919");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("blockSize");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2920() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2920");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("null");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2921() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2921");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("FunctionQualifier");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2922() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2922");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("fabric.stream.buffer.size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2923() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2923");
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
    java.lang.String str13 = io.github.onograph.I18N.format("principal", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:editor",
        objArray7);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:principal" + "'",
        str13, "MISSING VAL FOR KEY:principal");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:editor" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:editor");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2924() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2924");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2925() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2925");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("ssl_handler");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2926() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2926");
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
    java.lang.String str17 = io.github.onograph.I18N.format("neo4j.count.*", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:neo4j.count.*" + "'", str17,
        "MISSING VAL FOR KEY:neo4j.count.*");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2927() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2927");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2928() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2928");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:cn", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cn" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cn");
  }

  @Test
  public void test2929() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2929");
    }
    java.lang.Object[] objArray15 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str16 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray15);
    java.lang.String str17 = io.github.onograph.I18N.format("writable", objArray15);
    java.lang.String str18 = io.github.onograph.I18N.format("--additional-config", objArray15);
    java.lang.String str19 = io.github.onograph.I18N.format("addresses", objArray15);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format("", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("memory.pool", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("dbms.security.addRoleToUser",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("commit_index", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format("List all procedures in the DBMS.",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("LOOPBACK", objArray15);
    java.lang.Class<?> wildcardClass27 = objArray15.getClass();
    org.junit.Assert.assertNotNull(objArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str16,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str17, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str18,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str19, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:" + "'", str21,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str22, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:dbms.security.addRoleToUser" + "'", str23,
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:commit_index" + "'",
        str24, "MISSING VAL FOR KEY:commit_index");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:List all procedures in the DBMS." + "'",
        str25, "MISSING VAL FOR KEY:List all procedures in the DBMS.");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:LOOPBACK" + "'",
        str26, "MISSING VAL FOR KEY:LOOPBACK");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test2930() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2930");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to ignore for nodes with the specified label. Can not be combined with --skip-properties or --keep-only-node-properties.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2931() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2931");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Number of available processors",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
        objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.search_for_attribute", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("yyyyMMddHHmmss", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str10,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str11,
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str12, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:yyyyMMddHHmmss" + "'", str14,
        "MISSING VAL FOR KEY:yyyyMMddHHmmss");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2932() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2932");
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
    java.lang.String str16 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.quarantineDatabase", objArray11);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str16, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str17,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.quarantineDatabase"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.quarantineDatabase");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2933() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2933");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format("enc_res_info", objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "causal_clustering.protocol_implementations.catchup", objArray3);
    java.lang.Class<?> wildcardClass7 = objArray3.getClass();
    org.junit.Assert.assertNotNull(objArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    org.junit.Assert.assertEquals("'" + str4 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str4,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MISSING VAL FOR KEY:enc_res_info" + "'",
        str5, "MISSING VAL FOR KEY:enc_res_info");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.catchup" + "'", str6,
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.catchup");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2934() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2934");
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
    java.lang.String str20 = io.github.onograph.I18N.format("init_server_handler", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("graphIds", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "Name of the database associated to the Fabric graph.", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "The total number of rolled back transactions. (counter)", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:init_server_handler" + "'", str20,
        "MISSING VAL FOR KEY:init_server_handler");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:graphIds" + "'",
        str22, "MISSING VAL FOR KEY:graphIds");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:Name of the database associated to the Fabric graph." + "'", str23,
        "MISSING VAL FOR KEY:Name of the database associated to the Fabric graph.");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)" + "'",
        str24, "MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test2935() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2935");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2936() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2936");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("FOR_DATABASE", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("metrics.csv.interval", objArray5);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:FOR_DATABASE" + "'",
        str8, "MISSING VAL FOR KEY:FOR_DATABASE");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory"
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:metrics.csv.interval" + "'", str10,
        "MISSING VAL FOR KEY:metrics.csv.interval");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2937() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2937");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2938() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2938");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("appended_bytes");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2939() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2939");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("driver.ssl_enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2940() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2940");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2941() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2941");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("zlib_decoder", objArray7);
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Raft replication attempt count. (counter)"
            + "'", str9, "MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group"
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:zlib_decoder" + "'",
        str11, "MISSING VAL FOR KEY:zlib_decoder");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2942() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2942");
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
    java.lang.String str20 = io.github.onograph.I18N.format("arg1", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:arg1" + "'", str20,
        "MISSING VAL FOR KEY:arg1");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2943() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2943");
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
        "A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:unreachable",
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled."
            + "'", str19,
        "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:unreachable" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:unreachable");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2944() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2944");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str17,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2945() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2945");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format("Upgraded", objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format("lz4_encoder", objArray3);
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
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str6, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2946() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2946");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("true", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.max_databases", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("handshake_initializer", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:restarting-cluster-client", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:raft_chunked_writer", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str15,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str17,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str18,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str19,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:" + "'", str20,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft_chunked_writer"
            + "'", str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft_chunked_writer");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2947() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2947");
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
        "An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----",
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
            + "MISSING VAL FOR KEY:An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----"
            + "'", str18,
        "MISSING VAL FOR KEY:An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2948() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2948");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("leader-only", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.", objArray9);
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
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str11, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str12, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names."
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2949() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2949");
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
    java.lang.String str18 = io.github.onograph.I18N.format("profiles", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.bolt.messages.enabled",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("LZ4", objArray12);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:profiles" + "'",
        str18, "MISSING VAL FOR KEY:profiles");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.bolt.messages.enabled" + "'", str19,
        "MISSING VAL FOR KEY:metrics.bolt.messages.enabled");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:LZ4" + "'", str20,
        "MISSING VAL FOR KEY:LZ4");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2950() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2950");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "dbms.security.log_successful_authentication");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2951() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2951");
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
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.graphite.enabled", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("init_client_handler", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("elapsedTimeMs", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("profiles", objArray13);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str18,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str19,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:init_client_handler" + "'", str20,
        "MISSING VAL FOR KEY:init_client_handler");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str21,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:profiles" + "'",
        str22, "MISSING VAL FOR KEY:profiles");
  }

  @Test
  public void test2952() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2952");
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
    java.lang.String str13 = io.github.onograph.I18N.format("enc_res_tx_pull", objArray8);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:enc_res_tx_pull" + "'", str13,
        "MISSING VAL FOR KEY:enc_res_tx_pull");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2953() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2953");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("replication_fail");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2954() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2954");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("status", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Maximum number of history files for the csv files.", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("elapsedTimeMs", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The total number of Bolt connections sitting idle. (gauge)", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_binding_retry_timeout", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("Store copy chunk size", objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:follow",
        objArray12);
    java.lang.Class<?> wildcardClass22 = objArray12.getClass();
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str14, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str15,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str16,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str17,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)" + "'",
        str18, "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.cluster_binding_retry_timeout" + "'", str19,
        "MISSING VAL FOR KEY:causal_clustering.cluster_binding_retry_timeout");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Store copy chunk size" + "'", str20,
        "MISSING VAL FOR KEY:Store copy chunk size");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:follow" + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:follow");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test2955() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2955");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.replication_retry_timeout_base");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2956() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2956");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.neo4j.counts.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2957() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2957");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:memory.pool",
        objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:cypher",
        objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.removeRoleFromUser",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("last-flushed", objArray6);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str8, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:memory.pool" + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher" + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.removeRoleFromUser" + "'",
        str11, "MISSING VAL FOR KEY:dbms.security.removeRoleFromUser");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:last-flushed" + "'",
        str12, "MISSING VAL FOR KEY:last-flushed");
  }

  @Test
  public void test2958() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2958");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:default",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:default" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:default");
  }

  @Test
  public void test2959() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2959");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("java.naming.security.credentials",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.credentials" + "'", str2,
        "MISSING VAL FOR KEY:java.naming.security.credentials");
  }

  @Test
  public void test2960() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2960");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("readReplicaToggle");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2961() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2961");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("vm.memory.buffer.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2962() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2962");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("NewLeaderBarrier", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("hi!", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str19, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:NewLeaderBarrier" + "'", str20,
        "MISSING VAL FOR KEY:NewLeaderBarrier");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:hi!" + "'", str21,
        "MISSING VAL FOR KEY:hi!");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2963() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2963");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:default");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2964() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2964");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Destination (file or folder) of the cluster state archive.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2965() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2965");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.handshake-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2966() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2966");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "Require authorization for access to the Causal Clustering status endpoints.", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:Require authorization for access to the Causal Clustering status endpoints."
            + "'", str2,
        "MISSING VAL FOR KEY:Require authorization for access to the Causal Clustering status endpoints.");
  }

  @Test
  public void test2967() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2967");
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
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_res_tx_pull",
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_tx_pull" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_tx_pull");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2968() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2968");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2969() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2969");
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
    java.lang.String str16 = io.github.onograph.I18N.format("terminated_read", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:terminated_read" + "'", str16,
        "MISSING VAL FOR KEY:terminated_read");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2970() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2970");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("writable", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("--additional-config", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("addresses", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("memory.pool", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("Start the benchmark.", objArray12);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str16, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str17,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str19, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Start the benchmark." + "'", str20,
        "MISSING VAL FOR KEY:Start the benchmark.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2971() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2971");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("dbms.directories.cluster_state",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("defragment", objArray7);
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:dbms.directories.cluster_state" + "'", str9,
        "MISSING VAL FOR KEY:dbms.directories.cluster_state");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:defragment" + "'",
        str11, "MISSING VAL FOR KEY:defragment");
  }

  @Test
  public void test2972() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2972");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("operator_auth", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The ID of the last closed transaction. (counter)", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`.",
        objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("hnd_res_tx", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str14,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)" + "'", str15,
        "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`."
            + "'", str16,
        "MISSING VAL FOR KEY:The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:hnd_res_tx" + "'",
        str17, "MISSING VAL FOR KEY:hnd_res_tx");
  }

  @Test
  public void test2973() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2973");
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
    java.lang.String str16 = io.github.onograph.I18N.format("total", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("enc_catchup_error", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("data-import", objArray11);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:total" + "'", str16,
        "MISSING VAL FOR KEY:total");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:enc_catchup_error" + "'", str17,
        "MISSING VAL FOR KEY:enc_catchup_error");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:data-import" + "'",
        str18, "MISSING VAL FOR KEY:data-import");
  }

  @Test
  public void test2974() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2974");
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
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.security.ldap.connection_timeout",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("quarantined", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout" + "'",
        str18, "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:quarantined" + "'",
        str20, "MISSING VAL FOR KEY:quarantined");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2975() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2975");
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
        "The reporting interval for Graphite. That is, how often to send updated metrics to Graphite.",
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str15,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The reporting interval for Graphite. That is, how often to send updated metrics to Graphite."
            + "'", str16,
        "MISSING VAL FOR KEY:The reporting interval for Graphite. That is, how often to send updated metrics to Graphite.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2976() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2976");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("operator_auth", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "The ID of the last closed transaction. (counter)", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("halt", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)" + "'", str14,
        "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:halt" + "'", str15,
        "MISSING VAL FOR KEY:halt");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test2977() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2977");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("4.2.0");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2978() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2978");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:RAFT log pruning frequency");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2979() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2979");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Largest batch processed by RAFT in bytes");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2980() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2980");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("true", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("vm.memory.pool.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("BatchSize", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("roles", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*transaction.active_write", objArray11);
    java.lang.Class<?> wildcardClass19 = objArray11.getClass();
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str14,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str15,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:roles" + "'", str17,
        "MISSING VAL FOR KEY:roles");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*transaction.active_write"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*transaction.active_write");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test2981() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2981");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:List all functions in the DBMS.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2982() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2982");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:idCacheClusterCleanup", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:idCacheClusterCleanup"
            + "'", str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:idCacheClusterCleanup");
  }

  @Test
  public void test2983() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2983");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("true", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The total size of the database and transaction logs, in bytes. (gauge)", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.max_databases", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("handshake_initializer", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:restarting-cluster-client", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("high_limitV3_0_6", objArray13);
    java.lang.Class<?> wildcardClass23 = objArray13.getClass();
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str14,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str15,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str17,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str18,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str19,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:" + "'", str20,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_0_6" + "'", str22,
        "MISSING VAL FOR KEY:high_limitV3_0_6");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2984() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2984");
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
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.graphite.enabled", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("init_client_handler", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("elapsedTimeMs", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter", objArray13);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str18,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str19,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:init_client_handler" + "'", str20,
        "MISSING VAL FOR KEY:init_client_handler");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str21,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test2985() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2985");
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
    java.lang.String str14 = io.github.onograph.I18N.format("Store copy chunk size", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Store copy chunk size" + "'", str14,
        "MISSING VAL FOR KEY:Store copy chunk size");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test2986() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2986");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2987() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2987");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("java.naming.security.principal");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2988() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2988");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Count of successful database drop operations. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2989() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2989");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "CREATE CONSTRAINT ... IS NODE KEY command", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("--backup-dir", objArray8);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str11,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command"
            + "'", str12, "MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:--backup-dir" + "'",
        str13, "MISSING VAL FOR KEY:--backup-dir");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2990() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2990");
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
    java.lang.String str18 = io.github.onograph.I18N.format("NEO4J_CLUSTER", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:NEO4J_CLUSTER" + "'", str18,
        "MISSING VAL FOR KEY:NEO4J_CLUSTER");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft");
  }

  @Test
  public void test2991() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2991");
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
        "Report the current status of the system database sub-graph schema, providing details for each sub-graph component.",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("4.0.3", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Report the current status of the system database sub-graph schema, providing details for each sub-graph component."
            + "'", str19,
        "MISSING VAL FOR KEY:Report the current status of the system database sub-graph schema, providing details for each sub-graph component.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:4.0.3" + "'", str20,
        "MISSING VAL FOR KEY:4.0.3");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test2992() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2992");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("true", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("dump-logical-log.txt", objArray10);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dump-logical-log.txt" + "'", str16,
        "MISSING VAL FOR KEY:dump-logical-log.txt");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2993() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2993");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Delete the specified user.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2994() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2994");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray5);
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str9, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str10,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2995() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2995");
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
    java.lang.String str15 = io.github.onograph.I18N.format("fabric.routing.ttl", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Available unused memory in the pool, in bytes. (gauge)", objArray10);
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:fabric.routing.ttl" + "'", str15,
        "MISSING VAL FOR KEY:fabric.routing.ttl");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)" + "'", str16,
        "MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test2996() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2996");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2997() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2997");
    }
    java.lang.Object[] objArray16 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str17 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray16);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray16);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.security.createUser", objArray16);
    java.lang.String str20 = io.github.onograph.I18N.format("BatchSize", objArray16);
    java.lang.String str21 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray16);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray16);
    java.lang.String str23 = io.github.onograph.I18N.format("", objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format("snappy_validating_decoder",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:read-only",
        objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:typically-connect-to-random-read-replica", objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:.database.",
        objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format(
        "The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure",
        objArray16);
    java.lang.Class<?> wildcardClass29 = objArray16.getClass();
    org.junit.Assert.assertNotNull(objArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str17,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str18, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str19,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str20, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str21, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str22,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:" + "'", str23,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:snappy_validating_decoder" + "'", str24,
        "MISSING VAL FOR KEY:snappy_validating_decoder");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str25,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica" + "'",
        str26, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.database." + "'", str27,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.database.");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure"
            + "'", str28,
        "MISSING VAL FOR KEY:The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure");
    org.junit.Assert.assertNotNull(wildcardClass29);
  }

  @Test
  public void test2998() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2998");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.bolt.messages.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test2999() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2999");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:security-privileges");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3000() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test3000");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("writable", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("--additional-config", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("RelationshipType", objArray10);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str12, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str13,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str14,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str15,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }
}

