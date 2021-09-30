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
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("*ids_in_use.node", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("temp-copy", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.logs.security.format", objArray7);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:temp-copy" + "'",
        str10, "MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.format" + "'", str11,
        "MISSING VAL FOR KEY:dbms.logs.security.format");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3002");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:threads.jetty.idle");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3003");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica",
        objArray7);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
  }

  @Test
  public void test3004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3004");
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
    java.lang.String str22 = io.github.onograph.I18N.format("fabric.stream.buffer.low_watermark",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("OUTBOUND", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray14);
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
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark" + "'",
        str22, "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:OUTBOUND" + "'",
        str23, "MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str24, "MISSING VAL FOR KEY:java.naming.security.authentication");
  }

  @Test
  public void test3005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3005");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("FOR_DATABASE");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3006");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Database");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3007");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of labels. All nodes that have ANY of the specified labels will be deleted.Can not be combined with --keep-only-nodes-with-labels.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3008");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*vm.file.descriptors.count");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3009");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Sum total used heap and native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3010");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("procedure");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3011");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.Database checkpointing metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3012");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(".Database checkpointing metrics",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("tx_size_heap", objArray6);
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:.Database checkpointing metrics" + "'", str11,
        "MISSING VAL FOR KEY:.Database checkpointing metrics");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:tx_size_heap" + "'",
        str12, "MISSING VAL FOR KEY:tx_size_heap");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3013");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Timeout for Akka handshake");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3014");
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
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("enc_res_database_id", objArray13);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:enc_res_database_id" + "'", str22,
        "MISSING VAL FOR KEY:enc_res_database_id");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3015");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("*ids_in_use.node", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader", objArray8);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist"
            + "'", str12,
        "MISSING VAL FOR KEY:A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3016");
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
        "Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("in_req_type", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("-state", objArray14);
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
            + "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes."
            + "'", str22,
        "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:in_req_type" + "'",
        str23, "MISSING VAL FOR KEY:in_req_type");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:-state" + "'",
        str24, "MISSING VAL FOR KEY:-state");
  }

  @Test
  public void test3017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3017");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("leader-only", objArray7);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str10, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3018");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("REQUIRED");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3019");
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
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.security.addRoleToUser",
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.security.addRoleToUser" + "'", str20,
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3020");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:cypher",
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
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher");
  }

  @Test
  public void test3021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3021");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("ssl_handler", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.min_std_deviation", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("RelationshipQualifier", objArray10);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str14, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation"
            + "'", str15,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:RelationshipQualifier" + "'", str16,
        "MISSING VAL FOR KEY:RelationshipQualifier");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3022");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray4);
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
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str7, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str8,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3023");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_res_tx_pull");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3024");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("snappy_encoder", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("The level of middleware logging",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks", objArray9);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str12,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:The level of middleware logging" + "'", str13,
        "MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.jvm-shutdown-hooks"
            + "'", str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.jvm-shutdown-hooks");
  }

  @Test
  public void test3025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3025");
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
    java.lang.String str17 = io.github.onograph.I18N.format("raftBootstrap", objArray10);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:raftBootstrap" + "'", str17,
        "MISSING VAL FOR KEY:raftBootstrap");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3026");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3027");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.createRole");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3028");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("invisible");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3029");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("lgSc");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3030");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Create a new role.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3031");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.Database data metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3032");
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
    java.lang.String str26 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:.database.",
        objArray15);
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
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.database." + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.database.");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test3033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3033");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("replan_events");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3034");
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str11,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:The level of middleware logging" + "'", str12,
        "MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3035");
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
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.backup.listen_address",
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.listen_address" + "'", str20,
        "MISSING VAL FOR KEY:dbms.backup.listen_address");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3036");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Maximum number of history files for the csv files.", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("elapsedTimeMs", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The total number of Bolt connections sitting idle. (gauge)", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_binding_retry_timeout", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("Store copy chunk size", objArray11);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str14,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str15,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str16,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)" + "'",
        str17, "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.cluster_binding_retry_timeout" + "'", str18,
        "MISSING VAL FOR KEY:causal_clustering.cluster_binding_retry_timeout");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:Store copy chunk size" + "'", str19,
        "MISSING VAL FOR KEY:Store copy chunk size");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3037");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3038");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("storeCopy");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3039");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Enable reporting metrics about Causal Clustering mode. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3040");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3041");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of messages that completed processing since this instance started. This includes successful, failed and ignored Bolt messages. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3042");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3043");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Maximum timeout for cluster status request execution", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("FunctionQualifier", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("applicationProtocolVersion",
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str19,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:" + "'", str20,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:FunctionQualifier" + "'", str21,
        "MISSING VAL FOR KEY:FunctionQualifier");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:applicationProtocolVersion" + "'", str22,
        "MISSING VAL FOR KEY:applicationProtocolVersion");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3044");
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
    java.lang.String str10 = io.github.onograph.I18N.format("database.id", objArray5);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:database.id" + "'",
        str10, "MISSING VAL FOR KEY:database.id");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3045");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("time", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Host and port to bind the cluster member discovery management communication.", objArray7);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:time" + "'", str9,
        "MISSING VAL FOR KEY:time");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication."
            + "'", str10,
        "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3046");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_fail");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3047");
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
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.jmx.enabled", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("restore", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Boolean",
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.jmx.enabled" + "'", str20,
        "MISSING VAL FOR KEY:metrics.jmx.enabled");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:restore" + "'",
        str21, "MISSING VAL FOR KEY:restore");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Boolean" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Boolean");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3048");
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
    java.lang.String str21 = io.github.onograph.I18N.format("localhost", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.group_membership_attributes", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format("java.naming.security.principal",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.",
        objArray15);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str21, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes" + "'",
        str22, "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:" + "'", str23,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str24,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.principal" + "'", str25,
        "MISSING VAL FOR KEY:java.naming.security.principal");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead."
            + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test3049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3049");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Maximum timeout for akka shutdown");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3050");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3051");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.down_unreachable_on_new_joiner");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3052");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".Database neo4j pools metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3053");
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
    java.lang.String str21 = io.github.onograph.I18N.format("frame_encoder", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:frame_encoder" + "'", str21,
        "MISSING VAL FOR KEY:frame_encoder");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3054");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("offline");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3055");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous", objArray8);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3056");
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
    java.lang.String str24 = io.github.onograph.I18N.format("java.naming.security.principal",
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
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.principal" + "'", str24,
        "MISSING VAL FOR KEY:java.naming.security.principal");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3057");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3058");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(".Database transaction metrics",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("metrics.jvm.memory.enabled",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("enc_res_tx_fin", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:.Database transaction metrics" + "'", str11,
        "MISSING VAL FOR KEY:.Database transaction metrics");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:metrics.jvm.memory.enabled" + "'", str12,
        "MISSING VAL FOR KEY:metrics.jvm.memory.enabled");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:enc_res_tx_fin" + "'", str13,
        "MISSING VAL FOR KEY:enc_res_tx_fin");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3059");
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
    java.lang.String str17 = io.github.onograph.I18N.format("PropertyKey", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str17, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3060");
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
    java.lang.String str10 = io.github.onograph.I18N.format("metrics.neo4j.logs.enabled",
        objArray5);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logs.enabled" + "'", str10,
        "MISSING VAL FOR KEY:metrics.neo4j.logs.enabled");
  }

  @Test
  public void test3061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3061");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("Upgraded", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hnd_info",
        objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.cluster.seed_node_timeout", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("enc_snapshot", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str12,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str13,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_info" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_info");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout" + "'",
        str15, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:enc_snapshot" + "'",
        str16, "MISSING VAL FOR KEY:enc_snapshot");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3062");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:passwordChangeRequired");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3063");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3064");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("https");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3065");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of pull requests made by this instance. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3066");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("security.log");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3067");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hnd_res_snapshot");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3068");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3069");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("elapsedTimeMs", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Pooled connections older than this threshold will be closed and removed from the pool.\nSetting this option to a low value will cause a high connection churn and might result in a performance hit.\nIt is recommended to set maximum lifetime to a slightly smaller value than the one configured in network\nequipment (load balancer, proxy, firewall, etc. can also limit maximum connection lifetime).\nZero and negative values result in lifetime not being checked.",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Pooled connections older than this threshold will be closed and removed from the pool.\nSetting this option to a low value will cause a high connection churn and might result in a performance hit.\nIt is recommended to set maximum lifetime to a slightly smaller value than the one configured in network\nequipment (load balancer, proxy, firewall, etc. can also limit maximum connection lifetime).\nZero and negative values result in lifetime not being checked."
            + "'", str12,
        "MISSING VAL FOR KEY:Pooled connections older than this threshold will be closed and removed from the pool.\nSetting this option to a low value will cause a high connection churn and might result in a performance hit.\nIt is recommended to set maximum lifetime to a slightly smaller value than the one configured in network\nequipment (load balancer, proxy, firewall, etc. can also limit maximum connection lifetime).\nZero and negative values result in lifetime not being checked.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3070");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("unavailable", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:unavailable" + "'",
        str2, "MISSING VAL FOR KEY:unavailable");
  }

  @Test
  public void test3071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3071");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("neo4j.count");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3072");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("causal_clustering.discovery_type");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3073");
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
    java.lang.String str17 = io.github.onograph.I18N.format("PropertyKey", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Transaction retries. (counter)", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str17, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Transaction retries. (counter)" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Transaction retries. (counter)");
  }

  @Test
  public void test3074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3074");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3075");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3076");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.logger-startup-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3077");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:admin.ini");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3078");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("second");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3079");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("days", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("LabelQualifierAll", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("logs/", objArray6);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:days" + "'", str10,
        "MISSING VAL FOR KEY:days");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str11,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str12,
        "MISSING VAL FOR KEY:logs/");
  }

  @Test
  public void test3080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3080");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3081");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("name");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3082");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Number of available processors",
        objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("The maximum number of databases.",
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
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str9,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str10,
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str11, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:The maximum number of databases." + "'",
        str12, "MISSING VAL FOR KEY:The maximum number of databases.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3083");
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
    java.lang.String str18 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("replication_maybe", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("Security log level threshold.",
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str18,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str19,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Security log level threshold." + "'", str20,
        "MISSING VAL FOR KEY:Security log level threshold.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3084");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("ccstate", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("rollbacks", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("error_handler_tail", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:error_handler_tail" + "'", str11,
        "MISSING VAL FOR KEY:error_handler_tail");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3085");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Comma separated list of groups to be used by the connect-randomly-to-server-group selection strategy. The connect-randomly-to-server-group strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `connect-randomly-to-server-group`. ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3086");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.default_parallelism");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3087");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:ReadReplicaReplicatedDatabaseState");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3088");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--skip-relationships");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3089");
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
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:cc-database-status-actor", objArray6);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cc-database-status-actor"
            + "'", str12, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cc-database-status-actor");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3090");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("days", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:days" + "'", str8,
        "MISSING VAL FOR KEY:days");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3091");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.log_shipping_max_lag");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3092");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The current number of open file descriptors. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3093");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("vm.gc.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3094");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3095");
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
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.",
        objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("startup", objArray7);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str13,
        "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:startup" + "'",
        str14, "MISSING VAL FOR KEY:startup");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3096");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:threads.jetty.all");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3097");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Count of failed database operations. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3098");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:reader");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3099");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:.database.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3100");
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
    java.lang.String str16 = io.github.onograph.I18N.format("In-flight cache misses. (counter)",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str15,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:In-flight cache misses. (counter)" + "'",
        str16, "MISSING VAL FOR KEY:In-flight cache misses. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3101");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3102");
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
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.replication_retry_timeout_limit", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str17,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.replication_retry_timeout_limit"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.replication_retry_timeout_limit");
  }

  @Test
  public void test3103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3103");
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
    java.lang.String str16 = io.github.onograph.I18N.format("read-only", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:read-only" + "'",
        str16, "MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3104");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("Upgraded", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format("8m", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("metrics.neo4j.tx.enabled", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("FOR", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str12,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str13,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:8m" + "'", str14,
        "MISSING VAL FOR KEY:8m");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.tx.enabled" + "'", str15,
        "MISSING VAL FOR KEY:metrics.neo4j.tx.enabled");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:FOR" + "'", str16,
        "MISSING VAL FOR KEY:FOR");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3105");
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
    java.lang.String str17 = io.github.onograph.I18N.format("PropertyKey", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("*db.query.execution*", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str17, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:*db.query.execution*" + "'", str18,
        "MISSING VAL FOR KEY:*db.query.execution*");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3106");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("https", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:https" + "'", str2,
        "MISSING VAL FOR KEY:https");
  }

  @Test
  public void test3107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3107");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms.functions");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3108");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("misses");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3109");
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
        "Sets level for driver internal logging.", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("max_elements", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("leader-only", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("active_write", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Sets level for driver internal logging."
            + "'", str17, "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:max_elements" + "'",
        str18, "MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str19,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str20, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:active_write" + "'",
        str22, "MISSING VAL FOR KEY:active_write");
  }

  @Test
  public void test3110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3110");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:An LDAP system account username to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`. Note that the `dbms.security.ldap.authentication.user_dn_template` will not be applied to this username, so you may have to specify a full DN.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3111");
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
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("txs", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("dbName", objArray11);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:txs" + "'", str16,
        "MISSING VAL FOR KEY:txs");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors"
            + "'", str17,
        "MISSING VAL FOR KEY:Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbName" + "'",
        str18, "MISSING VAL FOR KEY:dbName");
  }

  @Test
  public void test3112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3112");
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
    java.lang.String str19 = io.github.onograph.I18N.format("bolt.*", objArray11);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str19, "MISSING VAL FOR KEY:bolt.*");
  }

  @Test
  public void test3113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3113");
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
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Allows a core to down all unreachable members if it needs to do that to allow a new core to join",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Allows a core to down all unreachable members if it needs to do that to allow a new core to join"
            + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Allows a core to down all unreachable members if it needs to do that to allow a new core to join");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3114");
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
    java.lang.String str17 = io.github.onograph.I18N.format("metrics.prometheus.enabled",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("modifierProtocols", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.enabled" + "'", str17,
        "MISSING VAL FOR KEY:metrics.prometheus.enabled");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:modifierProtocols" + "'", str18,
        "MISSING VAL FOR KEY:modifierProtocols");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3115");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("heap.committed");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3116");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.default-parallelism");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3117");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "List all users currently assigned the specified role.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3118");
    }
    java.lang.Object[] objArray17 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str18 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray17);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray17);
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.security.createUser", objArray17);
    java.lang.String str21 = io.github.onograph.I18N.format("BatchSize", objArray17);
    java.lang.String str22 = io.github.onograph.I18N.format("Change the current user's password.",
        objArray17);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray17);
    java.lang.String str24 = io.github.onograph.I18N.format("", objArray17);
    java.lang.String str25 = io.github.onograph.I18N.format("snappy_validating_decoder",
        objArray17);
    java.lang.String str26 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:read-only",
        objArray17);
    java.lang.String str27 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:typically-connect-to-random-read-replica", objArray17);
    java.lang.String str28 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:.database.",
        objArray17);
    java.lang.String str29 = io.github.onograph.I18N.format(
        "The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure",
        objArray17);
    java.lang.String str30 = io.github.onograph.I18N.format(
        "causal_clustering.join_catch_up_timeout", objArray17);
    java.lang.Class<?> wildcardClass31 = objArray17.getClass();
    org.junit.Assert.assertNotNull(objArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str18,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str19, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str20,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str21, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:Change the current user's password." + "'",
        str22, "MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str23,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:" + "'", str24,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:snappy_validating_decoder" + "'", str25,
        "MISSING VAL FOR KEY:snappy_validating_decoder");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str27 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica" + "'",
        str27, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertEquals(
        "'" + str28 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.database." + "'", str28,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.database.");
    org.junit.Assert.assertEquals("'" + str29 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure"
            + "'", str29,
        "MISSING VAL FOR KEY:The LDAP referral behavior when creating a connection. This is one of `follow`, `ignore` or `throw`.\n* `follow` automatically follows any referrals\n* `ignore` ignores any referrals\n* `throw` throws an exception, which will lead to authentication failure");
    org.junit.Assert.assertEquals(
        "'" + str30 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout"
            + "'", str30, "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout");
    org.junit.Assert.assertNotNull(wildcardClass31);
  }

  @Test
  public void test3119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3119");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("handshake_initializer");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3120");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("volumetric", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("is_leader", objArray4);
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
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:volumetric" + "'",
        str7, "MISSING VAL FOR KEY:volumetric");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:is_leader" + "'",
        str8, "MISSING VAL FOR KEY:is_leader");
  }

  @Test
  public void test3121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3121");
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
    java.lang.String str20 = io.github.onograph.I18N.format("*bolt.messages_received*", objArray12);
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_received*" + "'", str20,
        "MISSING VAL FOR KEY:*bolt.messages_received*");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3122");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("*ids_in_use.node", objArray5);
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
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str7,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test3123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3123");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3124");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.multi_dc_license");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3125");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka.remote.artery.bind.bind-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3126");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The duration for which the replicator will await a new leader.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3127");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:zlib_decoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3128");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*pool.transaction.*.used_heap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3129");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("started");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3130");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3131");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.leader_transfer_interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3132");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("com.sun.jndi.ldap.read.timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3133");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.csv.interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3134");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Privilege",
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
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3135");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "This can be achieved with `DENY READ {property} ON GRAPH * ELEMENTS * TO role`. Using this setting will prevent the server from starting.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3136");
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
        "dbms.security.causal_clustering_status_auth_enabled", objArray5);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.causal_clustering_status_auth_enabled" + "'", str10,
        "MISSING VAL FOR KEY:dbms.security.causal_clustering_status_auth_enabled");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3137");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "logging-dispatcher.thread-pool-executor.fixed-pool-size", objArray7);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:logging-dispatcher.thread-pool-executor.fixed-pool-size" + "'",
        str14, "MISSING VAL FOR KEY:logging-dispatcher.thread-pool-executor.fixed-pool-size");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3138");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Minimum time interval after last rotation of the security log before it may be rotated again.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3139");
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
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:RelationshipQualifier", objArray6);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RelationshipQualifier"
            + "'", str12, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RelationshipQualifier");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3140");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3141");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("createProperty");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3142");
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
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:driver.connection.pool.max_size", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.connection.pool.max_size");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3143");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3144");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str8 = io.github.onograph.I18N.format("dbms.pool", objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray7);
    java.lang.Class<?> wildcardClass10 = objArray7.getClass();
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:dbms.pool" + "'",
        str8, "MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout"
            + "'", str9, "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3145");
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
        "Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.read_replica_transaction_applier_batch_size", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("is_suspended", objArray12);
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
            + "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead."
            + "'", str17,
        "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size" + "'",
        str18, "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:is_suspended" + "'",
        str20, "MISSING VAL FOR KEY:is_suspended");
  }

  @Test
  public void test3146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3146");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("-fail");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3147");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("committed_read");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3148");
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
    java.lang.String str15 = io.github.onograph.I18N.format("leader-only", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Enable metrics. Setting this to `false` will to turn off all metrics.", objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str15, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Enable metrics. Setting this to `false` will to turn off all metrics."
            + "'", str16,
        "MISSING VAL FOR KEY:Enable metrics. Setting this to `false` will to turn off all metrics.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3149");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of relationships in the database. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3150");
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
        "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("storeCopy", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:addresses",
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:storeCopy" + "'",
        str19, "MISSING VAL FOR KEY:storeCopy");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:addresses" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3151");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.instruments");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3152");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Estimated total capacity of buffers in the pool. (gauge)", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_base", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:yyyy-MM-dd.HH.mm.ss", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "causal_clustering.replication_leader_await_timeout", objArray13);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)" + "'",
        str19, "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base" + "'", str20,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:yyyy-MM-dd.HH.mm.ss"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:yyyy-MM-dd.HH.mm.ss");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.replication_leader_await_timeout" + "'", str22,
        "MISSING VAL FOR KEY:causal_clustering.replication_leader_await_timeout");
  }

  @Test
  public void test3153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3153");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format("writable", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("--additional-config", objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format("addresses", objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("memory.pool", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("dbms.security.addRoleToUser",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("commit_index", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("List all procedures in the DBMS.",
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str16, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str17,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str18, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str19,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:" + "'", str20,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str21, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.security.addRoleToUser" + "'", str22,
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:commit_index" + "'",
        str23, "MISSING VAL FOR KEY:commit_index");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:List all procedures in the DBMS." + "'",
        str24, "MISSING VAL FOR KEY:List all procedures in the DBMS.");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3154");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3155");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3156");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Unbounded");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3157");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Enable discovery service and a catchup server to be started on an Enterprise Standalone Instance 'dbms.mode=SINGLE', and with that allow for Read Replicas to connect and pull transaction from it. In clustered 'dbms.mode'-s (CORE, READ_REPLICA) this setting is not recognized.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3158");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("raft_component_decoder", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:raft_component_decoder" + "'", str2,
        "MISSING VAL FOR KEY:raft_component_decoder");
  }

  @Test
  public void test3159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3159");
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
    java.lang.String str17 = io.github.onograph.I18N.format("cc-client-topology-actor", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The maximum file size before the vote state file is rotated (in unit of entries)",
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str14,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str15,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:cc-client-topology-actor" + "'", str17,
        "MISSING VAL FOR KEY:cc-client-topology-actor");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The maximum file size before the vote state file is rotated (in unit of entries)"
            + "'", str18,
        "MISSING VAL FOR KEY:The maximum file size before the vote state file is rotated (in unit of entries)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3160");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.read_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3161");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("writable", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("User", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(".JVM file descriptor metrics.",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str11, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:User" + "'", str12,
        "MISSING VAL FOR KEY:User");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:.JVM file descriptor metrics." + "'", str13,
        "MISSING VAL FOR KEY:.JVM file descriptor metrics.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3162");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("writable", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("success", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("verbose", objArray8);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:verbose" + "'",
        str12, "MISSING VAL FOR KEY:verbose");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3163");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3164");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("storage_engine");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3165");
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
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("database.", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str17,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:database." + "'",
        str18, "MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3166");
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
    java.lang.String str22 = io.github.onograph.I18N.format("fabric.stream.buffer.low_watermark",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Threshold for rotation of the security log.", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("Create a new role.", objArray14);
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
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark" + "'",
        str22, "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Threshold for rotation of the security log."
            + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Threshold for rotation of the security log.");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:Create a new role." + "'", str24,
        "MISSING VAL FOR KEY:Create a new role.");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3167");
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
    java.lang.String str20 = io.github.onograph.I18N.format("eviction_exceptions", objArray12);
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:eviction_exceptions" + "'", str20,
        "MISSING VAL FOR KEY:eviction_exceptions");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3168");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3169");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("causal_clustering.raft_in_queue_size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3170");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("Upgraded", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("logs/", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.allow_any_core_to_bootstrap", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format("resource", objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray9);
    java.lang.Class<?> wildcardClass19 = objArray9.getClass();
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str10,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str11, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str12, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str13,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str14,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap" + "'",
        str15, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:resource" + "'",
        str16, "MISSING VAL FOR KEY:resource");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout"
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3171");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Sets level for driver internal logging.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3172");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_info");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3173");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--from-database");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3174");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("raft-server", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("bytes_written", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("terminated_write", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_id_publish_timeout", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("GRAPH", objArray10);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:bytes_written" + "'", str14,
        "MISSING VAL FOR KEY:bytes_written");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:terminated_write" + "'", str15,
        "MISSING VAL FOR KEY:terminated_write");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout"
            + "'", str16, "MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:GRAPH" + "'", str17,
        "MISSING VAL FOR KEY:GRAPH");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3175");
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
    java.lang.String str15 = io.github.onograph.I18N.format(".database.", objArray9);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:.database." + "'",
        str15, "MISSING VAL FOR KEY:.database.");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3176");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.JVM file descriptor metrics.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3177");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "In-flight cache element count. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3178");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("operator_auth");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3179");
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
        "The initial timeout until replication is retried. The timeout will increase exponentially.",
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
            + "MISSING VAL FOR KEY:The initial timeout until replication is retried. The timeout will increase exponentially."
            + "'", str22,
        "MISSING VAL FOR KEY:The initial timeout until replication is retried. The timeout will increase exponentially.");
  }

  @Test
  public void test3180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3180");
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
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:<host:port>",
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str16,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str17,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<host:port>" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<host:port>");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3181");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka.logger-startup-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3182");
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
    java.lang.String str19 = io.github.onograph.I18N.format("authentication", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("*dbms.pool.bolt.free", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:authentication" + "'", str19,
        "MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:*dbms.pool.bolt.free" + "'", str20,
        "MISSING VAL FOR KEY:*dbms.pool.bolt.free");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3183");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("snappy_encoder", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("The level of middleware logging",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.",
        objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)",
        objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str13,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:The level of middleware logging" + "'", str14,
        "MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties."
            + "'", str16,
        "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)"
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)");
  }

  @Test
  public void test3184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3184");
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
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total_time",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("Shuts down the Neo4j server.",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str15, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation"
            + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_time" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_time");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:Shuts down the Neo4j server." + "'", str18,
        "MISSING VAL FOR KEY:Shuts down the Neo4j server.");
  }

  @Test
  public void test3185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3185");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3186");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("function", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:RelationshipQualifier", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter", objArray7);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str10,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str11, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str12,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RelationshipQualifier"
            + "'", str13, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RelationshipQualifier");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3187");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("true", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Privilege",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("publisher", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("cluster-state", objArray10);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:publisher" + "'",
        str15, "MISSING VAL FOR KEY:publisher");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:cluster-state" + "'", str16,
        "MISSING VAL FOR KEY:cluster-state");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3188");
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
    java.lang.String str12 = io.github.onograph.I18N.format("messages_received", objArray6);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str12,
        "MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3189");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("true", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.functions", objArray11);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str17, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.functions" + "'", str18,
        "MISSING VAL FOR KEY:dbms.functions");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3190");
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
        "Enable multi-data center features. Requires appropriate licensing.", objArray8);
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
            + "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str13,
        "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3191");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:node");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3192");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties."
            + "'", str2,
        "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.");
  }

  @Test
  public void test3193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3193");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("time", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Host and port to bind the cluster member discovery management communication.", objArray6);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication."
            + "'", str9,
        "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication.");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3194");
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
    java.lang.String str18 = io.github.onograph.I18N.format("snappy_decoder", objArray11);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:snappy_decoder" + "'", str18,
        "MISSING VAL FOR KEY:snappy_decoder");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3195");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("/{databaseName}/cluster");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3196");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("driver.connection.pool.max_size",
        objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)"
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str14,
        "MISSING VAL FOR KEY:driver.connection.pool.max_size");
  }

  @Test
  public void test3197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3197");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("server_policies");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3198");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Administration command: DROP USER",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("threads.jetty.idle", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Administration command: DROP USER" + "'",
        str10, "MISSING VAL FOR KEY:Administration command: DROP USER");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:threads.jetty.idle" + "'", str11,
        "MISSING VAL FOR KEY:threads.jetty.idle");
  }

  @Test
  public void test3199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3199");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(".Database transaction metrics",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("unreachable", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Maximum amount of time spent attempting to acquire a connection from the connection pool.\nThis timeout only kicks in when all existing connections are being used and no new connections can be created because maximum connection pool size has been reached.\nError is raised when connection can't be acquired within configured time.\nNegative values are allowed and result in unlimited acquisition timeout. Value of 0 is allowed and results in no timeout and immediate failure when connection is unavailable",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:.Database transaction metrics" + "'", str11,
        "MISSING VAL FOR KEY:.Database transaction metrics");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:unreachable" + "'",
        str12, "MISSING VAL FOR KEY:unreachable");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Maximum amount of time spent attempting to acquire a connection from the connection pool.\nThis timeout only kicks in when all existing connections are being used and no new connections can be created because maximum connection pool size has been reached.\nError is raised when connection can't be acquired within configured time.\nNegative values are allowed and result in unlimited acquisition timeout. Value of 0 is allowed and results in no timeout and immediate failure when connection is unavailable"
            + "'", str13,
        "MISSING VAL FOR KEY:Maximum amount of time spent attempting to acquire a connection from the connection pool.\nThis timeout only kicks in when all existing connections are being used and no new connections can be created because maximum connection pool size has been reached.\nError is raised when connection can't be acquired within configured time.\nNegative values are allowed and result in unlimited acquisition timeout. Value of 0 is allowed and results in no timeout and immediate failure when connection is unavailable");
  }

  @Test
  public void test3200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3200");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3201");
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
        "MISSING VAL FOR KEY:causal_clustering.core.*", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*"
            + "'", str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3202");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of Bolt connections sitting idle. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3203");
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
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3204");
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
        "causal_clustering.middleware.akka.allow_any_core_to_bootstrap", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Threshold for rotation of the security log.", objArray5);
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
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap" + "'",
        str9, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Threshold for rotation of the security log."
            + "'", str10, "MISSING VAL FOR KEY:Threshold for rotation of the security log.");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3205");
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
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str11,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command"
            + "'", str12, "MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id."
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3206");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Perform an online backup from a running Neo4j enterprise server.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3207");
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
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:days", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("--skip-relationships", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:--skip-relationships" + "'", str16,
        "MISSING VAL FOR KEY:--skip-relationships");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3208");
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
        "The total number of threads (both idle and busy) in the jetty pool. (gauge)", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.store_copy_chunk_size", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "logging-dispatcher.thread-pool-executor.fixed-pool-size", objArray10);
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
            + "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)"
            + "'", str14,
        "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:logging-dispatcher.thread-pool-executor.fixed-pool-size" + "'",
        str16, "MISSING VAL FOR KEY:logging-dispatcher.thread-pool-executor.fixed-pool-size");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3209");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("FOR_DATABASE", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("publisher", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:publisher" + "'",
        str8, "MISSING VAL FOR KEY:publisher");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3210");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("active_write", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:active_write" + "'",
        str8, "MISSING VAL FOR KEY:active_write");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3211");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Limits amount of global threads for store copy.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3212");
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
    java.lang.String str13 = io.github.onograph.I18N.format("FOR", objArray8);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:FOR" + "'", str13,
        "MISSING VAL FOR KEY:FOR");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3213");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("status", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("List all locks at this database.",
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:List all locks at this database." + "'", str9,
        "MISSING VAL FOR KEY:List all locks at this database.");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3214");
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
        "Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.transaction_advertised_address", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("--additional-config", objArray11);
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
            + "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead."
            + "'", str16,
        "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.transaction_advertised_address" + "'", str17,
        "MISSING VAL FOR KEY:causal_clustering.transaction_advertised_address");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str18,
        "MISSING VAL FOR KEY:--additional-config");
  }

  @Test
  public void test3215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3215");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("read", objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format("replication_maybe", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("core", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("createRelationshipType", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:pageFaults",
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str18,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str19,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str20,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:core" + "'", str21,
        "MISSING VAL FOR KEY:core");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)"
            + "'", str22,
        "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:createRelationshipType" + "'", str23,
        "MISSING VAL FOR KEY:createRelationshipType");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:pageFaults" + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:pageFaults");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3216");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.akka_actor_system_restarter.max_acceptable_failures", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3217");
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
    java.lang.String str15 = io.github.onograph.I18N.format("replication_maybe", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:security.log",
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:action" + "'",
        str14, "MISSING VAL FOR KEY:action");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str15,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:security.log" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:security.log");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3218");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Directory to hold cluster state including Raft log");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3219");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3220");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Path to the transaction files, if they are not in the same folder as '--from-path'.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3221");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("ccstate", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:127.0.0.1",
        objArray6);
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
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:127.0.0.1" + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:127.0.0.1");
  }

  @Test
  public void test3222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3222");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of idle threads in the jetty pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3223");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.security.createUser", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("messages_started", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.read_replica_transaction_applier_max_queue_size", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:messages_started" + "'", str14,
        "MISSING VAL FOR KEY:messages_started");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level."
            + "'", str15,
        "MISSING VAL FOR KEY:Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_max_queue_size"
            + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_max_queue_size");
  }

  @Test
  public void test3224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3224");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("terminated_write");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3225");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("error");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3226");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3227");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "Minimum time interval after last rotation of the security log before it may be rotated again.",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:Minimum time interval after last rotation of the security log before it may be rotated again."
            + "'", str2,
        "MISSING VAL FOR KEY:Minimum time interval after last rotation of the security log before it may be rotated again.");
  }

  @Test
  public void test3228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3228");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("SCHEMA", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("total_bytes", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("heap.max", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The upper limit for the exponentially incremented retry timeout.", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str14, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str15, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:total_bytes" + "'",
        str16, "MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:heap.max" + "'",
        str17, "MISSING VAL FOR KEY:heap.max");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The upper limit for the exponentially incremented retry timeout."
            + "'", str18,
        "MISSING VAL FOR KEY:The upper limit for the exponentially incremented retry timeout.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3229");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.raft_messages_log_path", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:active",
        objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str13,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str17,
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
  }

  @Test
  public void test3230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3230");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("targetDirectory", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level.",
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str8, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:targetDirectory" + "'", str9,
        "MISSING VAL FOR KEY:targetDirectory");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level."
            + "'", str10,
        "MISSING VAL FOR KEY:Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level.");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3231");
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
    java.lang.String str20 = io.github.onograph.I18N.format("<path>", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("enc_req_database_id", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.remote.artery.bind.port", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:<path>" + "'",
        str20, "MISSING VAL FOR KEY:<path>");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:enc_req_database_id" + "'", str21,
        "MISSING VAL FOR KEY:enc_req_database_id");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3232");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3233");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3234");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.system_username");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3235");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("Upgraded", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("8m", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group", objArray10);
    java.lang.String str18 = io.github.onograph.I18N.format("defragment", objArray10);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.",
        objArray10);
    java.lang.String str20 = io.github.onograph.I18N.format("segment", objArray10);
    java.lang.Class<?> wildcardClass21 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str11,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str12,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str13, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str14,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str15,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:8m" + "'", str16,
        "MISSING VAL FOR KEY:8m");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group"
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:defragment" + "'",
        str18, "MISSING VAL FOR KEY:defragment");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load."
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:segment" + "'",
        str20, "MISSING VAL FOR KEY:segment");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3236");
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
        "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.",
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str14,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load."
            + "'", str15,
        "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3237");
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
        "Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.read_replica_transaction_applier_batch_size", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:*ids_in_use.node",
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead."
            + "'", str16,
        "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size" + "'",
        str17, "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node");
  }

  @Test
  public void test3238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3238");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.authentication_providers", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.authentication_providers" + "'",
        str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.authentication_providers");
  }

  @Test
  public void test3239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3239");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of different property names used in the database. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3240");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("terminated");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3241");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("--from-path-tx", objArray4);
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
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:--from-path-tx" + "'", str8,
        "MISSING VAL FOR KEY:--from-path-tx");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3242");
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
    java.lang.String str15 = io.github.onograph.I18N.format("hnd_info", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("millisecond", objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:hnd_info" + "'",
        str15, "MISSING VAL FOR KEY:hnd_info");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:millisecond" + "'",
        str16, "MISSING VAL FOR KEY:millisecond");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3243");
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
    java.lang.String str16 = io.github.onograph.I18N.format("NEO4J_CLUSTER", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:NEO4J_CLUSTER" + "'", str16,
        "MISSING VAL FOR KEY:NEO4J_CLUSTER");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3244");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("db.operation.count");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3245");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.clustering.enable", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----"
            + "'", str19,
        "MISSING VAL FOR KEY:An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.clustering.enable"
            + "'", str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3246");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("akka.jvm-shutdown-hooks", objArray8);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks" + "'", str12,
        "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3247");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("labels", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:labels" + "'", str8,
        "MISSING VAL FOR KEY:labels");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3248");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3249");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("leader-only", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("latency", objArray10);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str13, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:latency" + "'",
        str16, "MISSING VAL FOR KEY:latency");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3250");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str9 = io.github.onograph.I18N.format("dbms.pool", objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_runtime", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Retry-After",
        objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Retry-After" + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Retry-After");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3251");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("TO");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3252");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("LZ_validating", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("raft-log", objArray10);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:LZ_validating" + "'", str13,
        "MISSING VAL FOR KEY:LZ_validating");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:raft-log" + "'",
        str16, "MISSING VAL FOR KEY:raft-log");
  }

  @Test
  public void test3253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3253");
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
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:<host:port>",
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<host:port>" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<host:port>");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3254");
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
    java.lang.String str16 = io.github.onograph.I18N.format("status", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str16, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3255");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:HAS_DB_ROLE");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3256");
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
    java.lang.String str15 = io.github.onograph.I18N.format("--to-data-tx-directory", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("metadata_script.cypher", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:--to-data-tx-directory" + "'", str15,
        "MISSING VAL FOR KEY:--to-data-tx-directory");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:metadata_script.cypher" + "'", str16,
        "MISSING VAL FOR KEY:metadata_script.cypher");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3257");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "unsupported.dbms.security.ldap.authorization.connection_pooling");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3258");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft"
            + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft");
  }

  @Test
  public void test3259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3259");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Resource");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3260");
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
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:PUBLIC",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("raftBootstrap", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PUBLIC" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PUBLIC");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:raftBootstrap" + "'", str18,
        "MISSING VAL FOR KEY:raftBootstrap");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3261");
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
    java.lang.String str20 = io.github.onograph.I18N.format("groups", objArray12);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str18, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:enc_req_precopy" + "'", str19,
        "MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:groups" + "'",
        str20, "MISSING VAL FOR KEY:groups");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3262");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("PageCacheProfiler");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3263");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Estimated total capacity of buffers in the pool. (gauge)", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_base", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:yyyy-MM-dd.HH.mm.ss", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Timeout for Akka socket binding", objArray13);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)" + "'",
        str19, "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base" + "'", str20,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:yyyy-MM-dd.HH.mm.ss"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:yyyy-MM-dd.HH.mm.ss");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Timeout for Akka socket binding" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Timeout for Akka socket binding");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3264");
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str13,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str14, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str15, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dump-logical-log.txt" + "'", str16,
        "MISSING VAL FOR KEY:dump-logical-log.txt");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3265");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("read", objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format("replication_maybe", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("off", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("causal_clustering.read_replica",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("success", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead.",
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str18,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str19,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str20,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:off" + "'", str21,
        "MISSING VAL FOR KEY:off");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str22,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:success" + "'",
        str23, "MISSING VAL FOR KEY:success");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead."
            + "'", str24,
        "MISSING VAL FOR KEY:Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3266");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("member-data");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3267");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("thread.total");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3268");
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
        "Directory to hold cluster state including Raft log", objArray10);
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
            + "MISSING VAL FOR KEY:Directory to hold cluster state including Raft log" + "'", str17,
        "MISSING VAL FOR KEY:Directory to hold cluster state including Raft log");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3269");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3270");
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
        "The total number of threads (both idle and busy) in the jetty pool. (gauge)", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.store_copy_chunk_size", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.in_flight_cache.max_entries", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The transactions' size in native memory in bytes. (histogram)", objArray11);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)"
            + "'", str15,
        "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size"
            + "'", str16, "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries"
            + "'", str17, "MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)" + "'",
        str18, "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3271");
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
    java.lang.String str20 = io.github.onograph.I18N.format("<path>", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("enc_req_database_id", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.connection-timeout", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:<path>" + "'",
        str20, "MISSING VAL FOR KEY:<path>");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:enc_req_database_id" + "'", str21,
        "MISSING VAL FOR KEY:enc_req_database_id");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection-timeout" + "'", str22,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection-timeout");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3272");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*page_cache.page_faults");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3273");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The maximum number of databases.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3274");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("read", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("ssl_handler", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.min_std_deviation", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("backup-server", objArray10);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str14, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation"
            + "'", str15,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.min_std_deviation");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:backup-server" + "'", str16,
        "MISSING VAL FOR KEY:backup-server");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3275");
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
    java.lang.String str23 = io.github.onograph.I18N.format("check_point.*", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("BATCH_LOG_TIMER", objArray14);
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
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:check_point.*" + "'", str23,
        "MISSING VAL FOR KEY:check_point.*");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:BATCH_LOG_TIMER" + "'", str24,
        "MISSING VAL FOR KEY:BATCH_LOG_TIMER");
  }

  @Test
  public void test3276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3276");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Akka cluster phi accrual failure detector. Number of member nodes that each member will send heartbeat messages to, i.e. each node will be monitored by this number of other nodes.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3277");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".JVM Heap metrics.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3278");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hnd_info");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3279");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:procedure");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3280");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("pause_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3281");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("bolt.*", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("enc_get_metadata", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("native", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("driver.logging.level", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:enc_get_metadata" + "'", str15,
        "MISSING VAL FOR KEY:enc_get_metadata");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:native" + "'",
        str16, "MISSING VAL FOR KEY:native");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:driver.logging.level" + "'", str17,
        "MISSING VAL FOR KEY:driver.logging.level");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3282");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Limits amount of global threads for store copy.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3283");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:.GC metrics.",
        objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. "
            + "'", str14,
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.GC metrics." + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.GC metrics.");
  }

  @Test
  public void test3284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3284");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3285");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Number of cores required for initial Akka cluster formation");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3286");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(".Database transaction metrics",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("metrics.jvm.memory.enabled",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Enable reporting metrics about number of occurred replanning events. Deprecated - use metrics.filter instead.",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Akka cluster phi accrual failure detector. Number of member nodes that each member will send heartbeat messages to, i.e. each node will be monitored by this number of other nodes.",
        objArray9);
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:.Database transaction metrics" + "'", str12,
        "MISSING VAL FOR KEY:.Database transaction metrics");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:metrics.jvm.memory.enabled" + "'", str13,
        "MISSING VAL FOR KEY:metrics.jvm.memory.enabled");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about number of occurred replanning events. Deprecated - use metrics.filter instead."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable reporting metrics about number of occurred replanning events. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Number of member nodes that each member will send heartbeat messages to, i.e. each node will be monitored by this number of other nodes."
            + "'", str15,
        "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Number of member nodes that each member will send heartbeat messages to, i.e. each node will be monitored by this number of other nodes.");
  }

  @Test
  public void test3287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3287");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The initial timeout until replication is retried. The timeout will increase exponentially.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3288");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.deleteRole", objArray9);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout"
            + "'", str13, "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. "
            + "'", str14,
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.deleteRole" + "'", str15,
        "MISSING VAL FOR KEY:dbms.security.deleteRole");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3289");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("last_leader_message", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:last_leader_message" + "'", str2,
        "MISSING VAL FOR KEY:last_leader_message");
  }

  @Test
  public void test3290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3290");
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
    java.lang.String str18 = io.github.onograph.I18N.format("off", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:off" + "'", str18,
        "MISSING VAL FOR KEY:off");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3291");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("volumetric", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.property_level.enabled",
        objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The highest transaction id that has been pulled in the last pull updates by this instance. (counter)",
        objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("--fallback-to-full", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:volumetric" + "'",
        str10, "MISSING VAL FOR KEY:volumetric");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.security.property_level.enabled" + "'",
        str11, "MISSING VAL FOR KEY:dbms.security.property_level.enabled");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)"
            + "'", str12,
        "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:--fallback-to-full" + "'", str13,
        "MISSING VAL FOR KEY:--fallback-to-full");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3292");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.bolt.messages.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3293");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("admin.ini", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "List the job groups that are active in the database internal job scheduler.", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.",
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:admin.ini" + "'",
        str8, "MISSING VAL FOR KEY:admin.ini");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler."
            + "'", str9,
        "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written."
            + "'", str10,
        "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3294");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:csv-reporter");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3295");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("metrics.neo4j.counts.enabled",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("metrics.bolt.messages.enabled",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.driver.connection.max_lifetime", objArray9);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.counts.enabled" + "'", str12,
        "MISSING VAL FOR KEY:metrics.neo4j.counts.enabled");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:metrics.bolt.messages.enabled" + "'", str13,
        "MISSING VAL FOR KEY:metrics.bolt.messages.enabled");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.connection.max_lifetime" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.connection.max_lifetime");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3296");
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
    java.lang.String str19 = io.github.onograph.I18N.format("NewLeaderBarrier", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("hi!", objArray12);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str18, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:NewLeaderBarrier" + "'", str19,
        "MISSING VAL FOR KEY:NewLeaderBarrier");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:hi!" + "'", str20,
        "MISSING VAL FOR KEY:hi!");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3297");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("<all/users/roles>");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3298");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.stream.buffer.size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3299");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("Upgraded", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hnd_info",
        objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.cluster.seed_node_timeout", objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format("enc_snapshot", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format("cn", objArray9);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str12, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str13,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str14,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_info" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_info");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout" + "'",
        str16, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:enc_snapshot" + "'",
        str17, "MISSING VAL FOR KEY:enc_snapshot");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:cn" + "'", str18,
        "MISSING VAL FOR KEY:cn");
  }

  @Test
  public void test3300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3300");
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
    java.lang.String str15 = io.github.onograph.I18N.format("passwordChangeRequired", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:passwordChangeRequired" + "'", str15,
        "MISSING VAL FOR KEY:passwordChangeRequired");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3301");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_runtime");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3302");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("ccstate", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.connection_timeout", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("db.listLocks", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:raftBootstrap",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str10, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout" + "'", str11,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:db.listLocks" + "'",
        str12, "MISSING VAL FOR KEY:db.listLocks");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raftBootstrap" + "'",
        str13, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raftBootstrap");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3303");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("last_closed_tx_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3304");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3305");
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
    java.lang.String str21 = io.github.onograph.I18N.format("LZ4", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:LZ4" + "'", str21,
        "MISSING VAL FOR KEY:LZ4");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id");
  }

  @Test
  public void test3306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3306");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "No connection liveliness check is done by default.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3307");
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
    java.lang.String str16 = io.github.onograph.I18N.format("--to-data-tx-directory", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("metadata_script.cypher", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:roles",
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str14,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str15,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:--to-data-tx-directory" + "'", str16,
        "MISSING VAL FOR KEY:--to-data-tx-directory");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:metadata_script.cypher" + "'", str17,
        "MISSING VAL FOR KEY:metadata_script.cypher");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:roles" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:roles");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3308");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The upper limit for the exponentially incremented retry timeout.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3309");
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
    java.lang.String str15 = io.github.onograph.I18N.format("metrics.neo4j.logs.enabled",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str13,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)" + "'", str14,
        "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logs.enabled" + "'", str15,
        "MISSING VAL FOR KEY:metrics.neo4j.logs.enabled");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3310");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("Upgraded", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("logs/", objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format("metrics", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("StoreCopy", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The time limit within which a leadership transfer request should be completed, otherwise the leader will resume accepting writes.",
        objArray8);
    java.lang.Class<?> wildcardClass17 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str9,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str10, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str11, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str12,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str13,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:metrics" + "'",
        str14, "MISSING VAL FOR KEY:metrics");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:StoreCopy" + "'",
        str15, "MISSING VAL FOR KEY:StoreCopy");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The time limit within which a leadership transfer request should be completed, otherwise the leader will resume accepting writes."
            + "'", str16,
        "MISSING VAL FOR KEY:The time limit within which a leadership transfer request should be completed, otherwise the leader will resume accepting writes.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3311");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:driver.connection.max_lifetime");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3312");
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
    java.lang.String str19 = io.github.onograph.I18N.format("authentication", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:enc_req_database_id", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:authentication" + "'", str19,
        "MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id"
            + "'", str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3313");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("ccstate", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("database", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)",
        objArray9);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used."
            + "'", str12,
        "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:database" + "'",
        str13, "MISSING VAL FOR KEY:database");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
  }

  @Test
  public void test3314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3314");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.instruments");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3315");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3316");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str19,
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names."
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str22,
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3317");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.leadership_priority_group", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.leadership_priority_group"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.leadership_priority_group");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3318");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.leadership_priority_group", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("source", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.leadership_priority_group"
            + "'", str15, "MISSING VAL FOR KEY:causal_clustering.leadership_priority_group");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:source" + "'",
        str16, "MISSING VAL FOR KEY:source");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3319");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("--delete-nodes-with-labels", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.shutdown_timeout", objArray4);
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
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:--delete-nodes-with-labels" + "'", str7,
        "MISSING VAL FOR KEY:--delete-nodes-with-labels");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.shutdown_timeout" + "'", str8,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.shutdown_timeout");
  }

  @Test
  public void test3320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3320");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("metrics.neo4j.counts.enabled",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("replication_fail", objArray8);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:replication_fail" + "'", str12,
        "MISSING VAL FOR KEY:replication_fail");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3321");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3322");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Snappy");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3323");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("arg1");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3324");
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
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("--skip-properties", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:--skip-properties" + "'", str18,
        "MISSING VAL FOR KEY:--skip-properties");
  }

  @Test
  public void test3325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3325");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("snappy_encoder", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("The level of middleware logging",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:metrics.filter",
        objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str13,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:The level of middleware logging" + "'", str14,
        "MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.filter" + "'",
        str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.filter");
  }

  @Test
  public void test3326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3326");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.heartbeat-interval", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("fabric.driver.idle_check_interval",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("store_creation_time", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:akka.cluster.failure-detector.heartbeat-interval" + "'", str20,
        "MISSING VAL FOR KEY:akka.cluster.failure-detector.heartbeat-interval");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.idle_check_interval" + "'",
        str21, "MISSING VAL FOR KEY:fabric.driver.idle_check_interval");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:store_creation_time" + "'", str22,
        "MISSING VAL FOR KEY:store_creation_time");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3327");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka.remote.artery.canonical.port");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3328");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--to-data-directory");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3329");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:verbose");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3330");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:designated_seeder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3331");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("writable", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("--additional-config", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("RelationshipType", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("store.size", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:continuous",
        objArray13);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str17,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str18,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms." + "'", str19,
        "MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:store.size" + "'",
        str20, "MISSING VAL FOR KEY:store.size");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous");
  }

  @Test
  public void test3332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3332");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RelationshipQualifier");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3333");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.seed_node_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3334");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str2,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
  }

  @Test
  public void test3335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3335");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.max_sample_size", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_filter", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:ssl_handler",
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str14,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ssl_handler" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3336");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Assign a role to the user.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3337");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("active_write", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Sets level for driver internal logging.", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.backup.address", objArray6);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:active_write" + "'",
        str10, "MISSING VAL FOR KEY:active_write");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Sets level for driver internal logging."
            + "'", str11, "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.address" + "'", str12,
        "MISSING VAL FOR KEY:dbms.backup.address");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3338");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:applicationProtocolVersion");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3339");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3340");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3341");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:DatabaseDefault");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3342");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("writable", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("--additional-config", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("RelationshipType", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("store.size", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:initial_members",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("dbms.security.ldap.host", objArray13);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str17,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str18,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms." + "'", str19,
        "MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:store.size" + "'",
        str20, "MISSING VAL FOR KEY:store.size");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.host" + "'", str22,
        "MISSING VAL FOR KEY:dbms.security.ldap.host");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3343");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("db.checkpoint", objArray10);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str15, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:db.checkpoint" + "'", str16,
        "MISSING VAL FOR KEY:db.checkpoint");
  }

  @Test
  public void test3344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3344");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("elapsedTimeMs", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("authorization", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("backup", objArray9);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:authorization" + "'", str13,
        "MISSING VAL FOR KEY:authorization");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:backup" + "'",
        str14, "MISSING VAL FOR KEY:backup");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3345");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:millisecond");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3346");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("raft-server", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("transaction.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(".Query execution metrics", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("cn", objArray9);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:.Query execution metrics" + "'", str14,
        "MISSING VAL FOR KEY:.Query execution metrics");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:cn" + "'", str15,
        "MISSING VAL FOR KEY:cn");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3347");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3348");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3349");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("driver.logging.leaked_sessions");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3350");
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
    java.lang.String str17 = io.github.onograph.I18N.format("queryPlan", objArray10);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:queryPlan" + "'",
        str17, "MISSING VAL FOR KEY:queryPlan");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3351");
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
    java.lang.String str18 = io.github.onograph.I18N.format("queryPlan", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("successful", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:queryPlan" + "'",
        str18, "MISSING VAL FOR KEY:queryPlan");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:successful" + "'",
        str19, "MISSING VAL FOR KEY:successful");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3352");
    }
    java.lang.Object[] objArray17 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str18 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray17);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray17);
    java.lang.String str20 = io.github.onograph.I18N.format("read", objArray17);
    java.lang.String str21 = io.github.onograph.I18N.format("invisible", objArray17);
    java.lang.String str22 = io.github.onograph.I18N.format("false", objArray17);
    java.lang.String str23 = io.github.onograph.I18N.format("INBOUND", objArray17);
    java.lang.String str24 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray17);
    java.lang.String str25 = io.github.onograph.I18N.format("metrics.prefix", objArray17);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "No connection liveliness check is done by default.", objArray17);
    java.lang.String str27 = io.github.onograph.I18N.format("dirty", objArray17);
    java.lang.String str28 = io.github.onograph.I18N.format("dbms.security.ldap.host", objArray17);
    java.lang.String str29 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hnd_res_snapshot",
        objArray17);
    java.lang.String str30 = io.github.onograph.I18N.format("handshake_client_encoder", objArray17);
    org.junit.Assert.assertNotNull(objArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str18,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str19, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str20,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str21, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str22,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str23, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str24,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:metrics.prefix" + "'", str25,
        "MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:No connection liveliness check is done by default." + "'", str26,
        "MISSING VAL FOR KEY:No connection liveliness check is done by default.");
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MISSING VAL FOR KEY:dirty" + "'", str27,
        "MISSING VAL FOR KEY:dirty");
    org.junit.Assert.assertEquals(
        "'" + str28 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.host" + "'", str28,
        "MISSING VAL FOR KEY:dbms.security.ldap.host");
    org.junit.Assert.assertEquals(
        "'" + str29 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_res_snapshot" + "'",
        str29, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hnd_res_snapshot");
    org.junit.Assert.assertEquals(
        "'" + str30 + "' != '" + "MISSING VAL FOR KEY:handshake_client_encoder" + "'", str30,
        "MISSING VAL FOR KEY:handshake_client_encoder");
  }

  @Test
  public void test3353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3353");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:GRANTED");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3354");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("/cluster");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3355");
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
    java.lang.String str18 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("off", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The total number of rolled back transactions. (counter)", objArray12);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str18,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:off" + "'", str19,
        "MISSING VAL FOR KEY:off");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)" + "'",
        str20, "MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3356");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".JVM threads metrics.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3357");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3358");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("*ids_in_use.node", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("*vm.file.descriptors.count",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.security.changeUserPassword",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Timer for RAFT message processing. (counter, histogram)", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str11,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database." + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:*vm.file.descriptors.count" + "'", str13,
        "MISSING VAL FOR KEY:*vm.file.descriptors.count");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.changeUserPassword" + "'",
        str14, "MISSING VAL FOR KEY:dbms.security.changeUserPassword");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)" + "'",
        str15, "MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3359");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hnd_res_tx");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3360");
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
    java.lang.String str18 = io.github.onograph.I18N.format("evictions", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:evictions" + "'",
        str18, "MISSING VAL FOR KEY:evictions");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3361");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("max_bytes");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3362");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("localhost:6362");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3363");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("causal_clustering.read_replica");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3364");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Maximum number of history files for the csv files.", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("elapsedTimeMs", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("handshake_server_encoder", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:cypher",
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever"
            + "'", str14,
        "MISSING VAL FOR KEY:Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str15,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str16,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load."
            + "'", str17,
        "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:handshake_server_encoder" + "'", str18,
        "MISSING VAL FOR KEY:handshake_server_encoder");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3365");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The maximum number of bytes in the in-flight cache.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3366");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("read", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("bolt.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "List the active lock requests granted for the transaction executing the query with the given query id.",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:flushes",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:ccstate",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str15, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id."
            + "'", str16,
        "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ccstate" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ccstate");
  }

  @Test
  public void test3367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3367");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:replication_attempt");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3368");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("labels", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("hnd_req_store_listing", objArray6);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:labels" + "'", str8,
        "MISSING VAL FOR KEY:labels");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:hnd_req_store_listing" + "'", str9,
        "MISSING VAL FOR KEY:hnd_req_store_listing");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3369");
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
        "The total number of page faults happened in the page cache. (counter)", objArray9);
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
            + "MISSING VAL FOR KEY:The total number of page faults happened in the page cache. (counter)"
            + "'", str14,
        "MISSING VAL FOR KEY:The total number of page faults happened in the page cache. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3370");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*dbms.pool.bolt.used_heap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3371");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Threshold for rotation of the security log.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3372");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka.actor.allow-java-serialization");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3373");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3374");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("raft_handler");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3375");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The timeout for an LDAP read request (i.e. search). If the LDAP server does not respond within the given time the request will be aborted. A value of 0 means wait for a response indefinitely.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3376");
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
        "causal_clustering.leader_transfer_interval", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("Timeout for Akka socket binding",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str13,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Timeout for Akka socket binding" + "'", str15,
        "MISSING VAL FOR KEY:Timeout for Akka socket binding");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3377");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3378");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("ccstate", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("rollbacks", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("error_handler_tail", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.dynamic.setting.allowlist",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("count", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:iops", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("akka.jvm-shutdown-hooks", objArray11);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str12,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str13, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str14, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:error_handler_tail" + "'", str15,
        "MISSING VAL FOR KEY:error_handler_tail");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist" + "'", str16,
        "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:count" + "'", str17,
        "MISSING VAL FOR KEY:count");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks" + "'", str19,
        "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks");
  }

  @Test
  public void test3379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3379");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("Upgraded", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("lz4_encoder", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("database.", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("pull_update_highest_tx_id_received",
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str8, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:database." + "'",
        str9, "MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:pull_update_highest_tx_id_received" + "'",
        str10, "MISSING VAL FOR KEY:pull_update_highest_tx_id_received");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3380");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("stateMachineCommitHelper");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3381");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Akka cluster phi accrual failure detector. After the heartbeat request has been sent the first failure detection will start after this period, even though no heartbeat message has been received.",
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. After the heartbeat request has been sent the first failure detection will start after this period, even though no heartbeat message has been received."
            + "'", str22,
        "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. After the heartbeat request has been sent the first failure detection will start after this period, even though no heartbeat message has been received.");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3382");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.raft_in_queue_max_batch");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3383");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3384");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of nodes stored in the database. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3385");
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
        "MISSING VAL FOR KEY:*pool.transaction.*.used_native", objArray10);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*pool.transaction.*.used_native" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*pool.transaction.*.used_native");
  }

  @Test
  public void test3386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3386");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("store_creation_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3387");
    }
    java.lang.Object[] objArray16 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str17 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray16);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray16);
    java.lang.String str19 = io.github.onograph.I18N.format("read", objArray16);
    java.lang.String str20 = io.github.onograph.I18N.format("invisible", objArray16);
    java.lang.String str21 = io.github.onograph.I18N.format("false", objArray16);
    java.lang.String str22 = io.github.onograph.I18N.format("INBOUND", objArray16);
    java.lang.String str23 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format("metrics.prefix", objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "No connection liveliness check is done by default.", objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format("dirty", objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format("dbms.security.ldap.host", objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format(
        "An LDAP system account password to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`.",
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str18, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str19,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str20, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str21,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str22, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str23,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:metrics.prefix" + "'", str24,
        "MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:No connection liveliness check is done by default." + "'", str25,
        "MISSING VAL FOR KEY:No connection liveliness check is done by default.");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:dirty" + "'", str26,
        "MISSING VAL FOR KEY:dirty");
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.host" + "'", str27,
        "MISSING VAL FOR KEY:dbms.security.ldap.host");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
            + "MISSING VAL FOR KEY:An LDAP system account password to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`."
            + "'", str28,
        "MISSING VAL FOR KEY:An LDAP system account password to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`.");
    org.junit.Assert.assertNotNull(wildcardClass29);
  }

  @Test
  public void test3388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3388");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.ldap.use_starttls");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3389");
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
    java.lang.String str18 = io.github.onograph.I18N.format("<path>", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:<path>" + "'",
        str18, "MISSING VAL FOR KEY:<path>");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3390");
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
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Count of successful database drop operations. (counter)", objArray6);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Count of successful database drop operations. (counter)" + "'",
        str12, "MISSING VAL FOR KEY:Count of successful database drop operations. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3391");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("writable", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("--additional-config", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("addresses", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str13, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test3392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3392");
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
        "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.",
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used."
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3393");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:restore",
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:" + "'", str10,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restore" + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restore");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3394");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3395");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Retry-After", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Retry-After" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Retry-After");
  }

  @Test
  public void test3396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3396");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("User", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:User" + "'", str11,
        "MISSING VAL FOR KEY:User");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3397");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3398");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("targetDirectory", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:If there is a Database Management System Panic (an irrecoverable error) should the neo4j process shut down or continue running. Following a DbMS panic it is likely that a significant amount of functionality will be lost. Recovering full functionality will require a Neo4j restart",
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str8, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:targetDirectory" + "'", str9,
        "MISSING VAL FOR KEY:targetDirectory");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:If there is a Database Management System Panic (an irrecoverable error) should the neo4j process shut down or continue running. Following a DbMS panic it is likely that a significant amount of functionality will be lost. Recovering full functionality will require a Neo4j restart"
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:If there is a Database Management System Panic (an irrecoverable error) should the neo4j process shut down or continue running. Following a DbMS panic it is likely that a significant amount of functionality will be lost. Recovering full functionality will require a Neo4j restart");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3399");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Estimated amount of memory used by the pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3400");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.",
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str15,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:total" + "'", str16,
        "MISSING VAL FOR KEY:total");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:enc_catchup_error" + "'", str17,
        "MISSING VAL FOR KEY:enc_catchup_error");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric."
            + "'", str18,
        "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3401");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("Number of available processors",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.search_for_attribute", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("yyyyMMddHHmmss", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("raft-messages.log", objArray11);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.logging.level", objArray11);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:RAFT log rotation size", objArray11);
    java.lang.String str22 = io.github.onograph.I18N.format("ServiceList", objArray11);
    java.lang.Class<?> wildcardClass23 = objArray11.getClass();
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str12,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Number of available processors" + "'", str14,
        "MISSING VAL FOR KEY:Number of available processors");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str15,
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str16, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute" + "'", str17,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.search_for_attribute");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:yyyyMMddHHmmss" + "'", str18,
        "MISSING VAL FOR KEY:yyyyMMddHHmmss");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:raft-messages.log" + "'", str19,
        "MISSING VAL FOR KEY:raft-messages.log");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RAFT log rotation size"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RAFT log rotation size");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:ServiceList" + "'",
        str22, "MISSING VAL FOR KEY:ServiceList");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3402");
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
        "A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:unreachable",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:execute_boosted_from_config", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled."
            + "'", str20,
        "MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:unreachable" + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:unreachable");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3403");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3404");
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
    java.lang.String str21 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("append_index", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:" + "'", str21,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:append_index" + "'",
        str22, "MISSING VAL FOR KEY:append_index");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3405");
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
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:off", objArray8);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:data-link" + "'",
        str12, "MISSING VAL FOR KEY:data-link");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:off" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:off");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3406");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.log_successful_authentication");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3407");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("member-db-state");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3408");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:log.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3409");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("function", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("causal_clustering.read_replica",
        objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "The maximum file size before the membership state file is rotated (in unit of entries)",
        objArray7);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str10,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str11, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str12,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str13,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)"
            + "'", str14,
        "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3410");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:--to-data-tx-directory");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3411");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--pagecache");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3412");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Discovery cluster member size. (gauge)", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("akka", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("data-link", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:off", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("reason", objArray9);
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str11, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str12,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:data-link" + "'",
        str13, "MISSING VAL FOR KEY:data-link");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:off" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:off");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:reason" + "'",
        str15, "MISSING VAL FOR KEY:reason");
  }

  @Test
  public void test3413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3413");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("Upgraded", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format("8m", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "dbms.security.property_level.blacklist", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str12,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str13,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:8m" + "'", str14,
        "MISSING VAL FOR KEY:8m");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.property_level.blacklist" + "'",
        str16, "MISSING VAL FOR KEY:dbms.security.property_level.blacklist");
  }

  @Test
  public void test3414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3414");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.showCurrentUser");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3415");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "CREATE CONSTRAINT ... IS NODE KEY command", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("--backup-dir", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval", objArray9);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str12,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command"
            + "'", str13, "MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:--backup-dir" + "'",
        str14, "MISSING VAL FOR KEY:--backup-dir");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3416");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The catch up protocol times out if the given duration elapses with no network activity. Every message received by the client from the server extends the time out duration.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3417");
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
    java.lang.String str19 = io.github.onograph.I18N.format("read-only", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.label_selector", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "Sum total used heap and native memory in bytes. (gauge)", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only", objArray13);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:read-only" + "'",
        str19, "MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.kubernetes.label_selector"
            + "'", str20, "MISSING VAL FOR KEY:causal_clustering.kubernetes.label_selector");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Sum total used heap and native memory in bytes. (gauge)" + "'",
        str21, "MISSING VAL FOR KEY:Sum total used heap and native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3418");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("bolt.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("Activate a suspended user.",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace", objArray9);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Activate a suspended user." + "'", str14,
        "MISSING VAL FOR KEY:Activate a suspended user.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3419");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.ldap.referral");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3420");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:init_server_handler" + "'", str17,
        "MISSING VAL FOR KEY:init_server_handler");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str18,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3421");
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
    java.lang.String str17 = io.github.onograph.I18N.format("replication_maybe", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:security.log",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("raft-member-mapping", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str17,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:security.log" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:security.log");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:raft-member-mapping" + "'", str20,
        "MISSING VAL FOR KEY:raft-member-mapping");
  }

  @Test
  public void test3422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3422");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format("Upgraded", objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:memory.pool",
        objArray3);
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
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:memory.pool" + "'", str6,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test3423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3423");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("snappy_encoder", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("akka.jvm-shutdown-hooks", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures",
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str10, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str11,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks" + "'", str12,
        "MISSING VAL FOR KEY:akka.jvm-shutdown-hooks");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
  }

  @Test
  public void test3424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3424");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.raft_in_queue_max_batch_bytes", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.raft_in_queue_max_batch_bytes" + "'", str20,
        "MISSING VAL FOR KEY:causal_clustering.raft_in_queue_max_batch_bytes");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3425");
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
    java.lang.String str18 = io.github.onograph.I18N.format("neo4j.count.*", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("*pool.transaction.*.used_native",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:neo4j.count.*" + "'", str18,
        "MISSING VAL FOR KEY:neo4j.count.*");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:*pool.transaction.*.used_native" + "'", str19,
        "MISSING VAL FOR KEY:*pool.transaction.*.used_native");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
  }

  @Test
  public void test3426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3426");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("terminated", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:terminated" + "'",
        str2, "MISSING VAL FOR KEY:terminated");
  }

  @Test
  public void test3427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3427");
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
    java.lang.String str17 = io.github.onograph.I18N.format("cc-client-topology-actor", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.akka_actor_system_restarter.max_acceptable_failures", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:cc-client-topology-actor" + "'", str17,
        "MISSING VAL FOR KEY:cc-client-topology-actor");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str18,
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3428");
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
    java.lang.String str16 = io.github.onograph.I18N.format("fabric.routing.ttl", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("continuous", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("logging-dispatcher.type", objArray11);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:fabric.routing.ttl" + "'", str16,
        "MISSING VAL FOR KEY:fabric.routing.ttl");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:continuous" + "'",
        str17, "MISSING VAL FOR KEY:continuous");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:logging-dispatcher.type" + "'", str18,
        "MISSING VAL FOR KEY:logging-dispatcher.type");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3429");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("follow", objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery "
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:follow" + "'",
        str16, "MISSING VAL FOR KEY:follow");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3430");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("raft-server", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("transaction.*", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(".Query execution metrics", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("cn", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("simple", objArray10);
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:.Query execution metrics" + "'", str15,
        "MISSING VAL FOR KEY:.Query execution metrics");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:cn" + "'", str16,
        "MISSING VAL FOR KEY:cn");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:simple" + "'",
        str17, "MISSING VAL FOR KEY:simple");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3431");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("writable", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("--additional-config", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("addresses", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("server", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str13, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:server" + "'",
        str14, "MISSING VAL FOR KEY:server");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3432");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.max_sample_size", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_filter", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:iops", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Set to `true` to enable exporting metrics to CSV files", objArray11);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str14,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Set to `true` to enable exporting metrics to CSV files" + "'", str18,
        "MISSING VAL FOR KEY:Set to `true` to enable exporting metrics to CSV files");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3433");
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
    java.lang.String str12 = io.github.onograph.I18N.format("total", objArray6);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:total" + "'", str12,
        "MISSING VAL FOR KEY:total");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3434");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.state_machine_flush_window_size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3435");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3436");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("Upgraded", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("8m", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format("metrics.neo4j.tx.enabled", objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format("FOR", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.quarantineDatabase", objArray9);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str12, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str13,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str14,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:8m" + "'", str15,
        "MISSING VAL FOR KEY:8m");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.tx.enabled" + "'", str16,
        "MISSING VAL FOR KEY:metrics.neo4j.tx.enabled");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:FOR" + "'", str17,
        "MISSING VAL FOR KEY:FOR");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.quarantineDatabase" + "'", str18,
        "MISSING VAL FOR KEY:dbms.quarantineDatabase");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3437");
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
    java.lang.String str17 = io.github.onograph.I18N.format("--skip-labels", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("LabelQualifier", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:--skip-labels" + "'", str17,
        "MISSING VAL FOR KEY:--skip-labels");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:LabelQualifier" + "'", str18,
        "MISSING VAL FOR KEY:LabelQualifier");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3438");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("replication_maybe");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3439");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A comma separated list of labels. All nodes that have ANY of the specified labels will be kept.Can not be combined with --delete-nodes-with-labels.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3440");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("bolt.*", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("databaseName", objArray8);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:databaseName" + "'",
        str13, "MISSING VAL FOR KEY:databaseName");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3441");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("<property>[,<property>...]");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3442");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Time that seed nodes will spend trying to find an existing cluster before forming a new cluster, when Neo4j is started for the first time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3443");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("time", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("Store copy chunk size", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing.",
        objArray7);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing."
            + "'", str11,
        "MISSING VAL FOR KEY:The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing.");
  }

  @Test
  public void test3444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3444");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("targetDirectory", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("driver.connection.max_lifetime",
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str8, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:targetDirectory" + "'", str9,
        "MISSING VAL FOR KEY:targetDirectory");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:driver.connection.max_lifetime" + "'", str10,
        "MISSING VAL FOR KEY:driver.connection.max_lifetime");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3445");
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
    java.lang.String str21 = io.github.onograph.I18N.format("*bolt.messages_received*", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("-state", objArray13);
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
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_received*" + "'", str21,
        "MISSING VAL FOR KEY:*bolt.messages_received*");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:-state" + "'",
        str22, "MISSING VAL FOR KEY:-state");
  }

  @Test
  public void test3446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3446");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.shutdown_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3447");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("db.listLocks");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3448");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:elapsedTimeMs",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("leader-only", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_allow_reads_on_followers", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str23, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.cluster_allow_reads_on_followers" + "'", str24,
        "MISSING VAL FOR KEY:causal_clustering.cluster_allow_reads_on_followers");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3449");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*page_cache.hit*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3450");
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
    java.lang.String str17 = io.github.onograph.I18N.format(".GC metrics.", objArray10);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:.GC metrics." + "'",
        str17, "MISSING VAL FOR KEY:.GC metrics.");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3451");
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
        "MISSING VAL FOR KEY:causal_clustering.core.*", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size",
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3452");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("PageCacheWarmer");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3453");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_filter", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter" + "'", str14,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3454");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("storeCopy", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:akka", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace", objArray13);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:storeCopy" + "'",
        str20, "MISSING VAL FOR KEY:storeCopy");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka" + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace");
  }

  @Test
  public void test3455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3455");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hostnameOrIp");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3456");
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
    java.lang.String str18 = io.github.onograph.I18N.format("*pool.transaction.*.used_native",
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:*pool.transaction.*.used_native" + "'", str18,
        "MISSING VAL FOR KEY:*pool.transaction.*.used_native");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3457");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("User", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:LDAP user DN template. An LDAP object is referenced by its distinguished name (DN), and a user DN is an LDAP fully-qualified unique user identifier. This setting is used to generate an LDAP DN that conforms with the LDAP directory's schema from the user principal that is submitted with the authentication token when logging in. The special token {0} is a placeholder where the user principal will be substituted into the DN string.",
        objArray8);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:User" + "'", str11,
        "MISSING VAL FOR KEY:User");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LDAP user DN template. An LDAP object is referenced by its distinguished name (DN), and a user DN is an LDAP fully-qualified unique user identifier. This setting is used to generate an LDAP DN that conforms with the LDAP directory's schema from the user principal that is submitted with the authentication token when logging in. The special token {0} is a placeholder where the user principal will be substituted into the DN string."
            + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LDAP user DN template. An LDAP object is referenced by its distinguished name (DN), and a user DN is an LDAP fully-qualified unique user identifier. This setting is used to generate an LDAP DN that conforms with the LDAP directory's schema from the user principal that is submitted with the authentication token when logging in. The special token {0} is a placeholder where the user principal will be substituted into the DN string.");
  }

  @Test
  public void test3458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3458");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("ssl_handler", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Retry time for log shipping to followers after a stall", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Deprecated, use dbms.databases.default_to_read_only", objArray10);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str14, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall" + "'", str15,
        "MISSING VAL FOR KEY:Retry time for log shipping to followers after a stall");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only" + "'", str16,
        "MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3459");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("FOR_DATABASE", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("query-logging", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:query-logging" + "'",
        str8, "MISSING VAL FOR KEY:query-logging");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3460");
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
    java.lang.String str19 = io.github.onograph.I18N.format("evictions", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("1", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:evictions" + "'",
        str19, "MISSING VAL FOR KEY:evictions");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:1" + "'", str20,
        "MISSING VAL FOR KEY:1");
  }

  @Test
  public void test3461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3461");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("ccstate", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("rollbacks", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("error_handler_tail", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.dynamic.setting.allowlist",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("count", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:iops", objArray10);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str12, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str13, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:error_handler_tail" + "'", str14,
        "MISSING VAL FOR KEY:error_handler_tail");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist" + "'", str15,
        "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:count" + "'", str16,
        "MISSING VAL FOR KEY:count");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3462");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("storeCopy", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:addresses",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("fabric.driver.timeout", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace", objArray14);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:storeCopy" + "'",
        str21, "MISSING VAL FOR KEY:storeCopy");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:addresses" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.timeout" + "'", str23,
        "MISSING VAL FOR KEY:fabric.driver.timeout");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace");
  }

  @Test
  public void test3463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3463");
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
    java.lang.String str18 = io.github.onograph.I18N.format("storeCopy", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:storeCopy" + "'",
        str18, "MISSING VAL FOR KEY:storeCopy");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3464");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Discovery cluster member size. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Enable metrics. Setting this to `false` will to turn off all metrics.", objArray6);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:Enable metrics. Setting this to `false` will to turn off all metrics."
            + "'", str9,
        "MISSING VAL FOR KEY:Enable metrics. Setting this to `false` will to turn off all metrics.");
  }

  @Test
  public void test3465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3465");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3466");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("8m", objArray6);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str10,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str11,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:8m" + "'", str12,
        "MISSING VAL FOR KEY:8m");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3467");
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
    java.lang.String str13 = io.github.onograph.I18N.format("driver.connection.pool.max_size",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("check_point", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str13,
        "MISSING VAL FOR KEY:driver.connection.pool.max_size");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:check_point" + "'",
        str14, "MISSING VAL FOR KEY:check_point");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3468");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Copy a database and optionally apply filters.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3469");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--move");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3470");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("*ids_in_use.node", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("temp-copy", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Require authorization for access to the Causal Clustering status endpoints.",
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
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str10,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:temp-copy" + "'",
        str11, "MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Require authorization for access to the Causal Clustering status endpoints."
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Require authorization for access to the Causal Clustering status endpoints.");
  }

  @Test
  public void test3471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3471");
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
    java.lang.String str18 = io.github.onograph.I18N.format("Boolean", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:Boolean" + "'",
        str18, "MISSING VAL FOR KEY:Boolean");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3472");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("status", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("raft-server", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("transaction.*", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(".Query execution metrics", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("cn", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("simple", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("message_processing_timer", objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "Delay between RAFT message receive and process. (gauge)", objArray12);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str15, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str16,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:.Query execution metrics" + "'", str17,
        "MISSING VAL FOR KEY:.Query execution metrics");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:cn" + "'", str18,
        "MISSING VAL FOR KEY:cn");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:simple" + "'",
        str19, "MISSING VAL FOR KEY:simple");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:message_processing_timer" + "'", str20,
        "MISSING VAL FOR KEY:message_processing_timer");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Delay between RAFT message receive and process. (gauge)" + "'",
        str21, "MISSING VAL FOR KEY:Delay between RAFT message receive and process. (gauge)");
  }

  @Test
  public void test3473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3473");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("Upgraded", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("logs/", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.allow_any_core_to_bootstrap", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format("fabric.driver.connection.max_lifetime",
        objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format("high_limitV3_4_0", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:PROTOCOL_STACK",
        objArray9);
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str10,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str11, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str12, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str13,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:logs/" + "'", str14,
        "MISSING VAL FOR KEY:logs/");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap" + "'",
        str15, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.connection.max_lifetime" + "'",
        str16, "MISSING VAL FOR KEY:fabric.driver.connection.max_lifetime");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_4_0" + "'", str17,
        "MISSING VAL FOR KEY:high_limitV3_4_0");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PROTOCOL_STACK" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PROTOCOL_STACK");
  }

  @Test
  public void test3474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3474");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.discovery_resolution_retry_interval", objArray13);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_resolution_retry_interval"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_resolution_retry_interval");
  }

  @Test
  public void test3475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3475");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("connections_idle", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops"
            + "'", str10, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:connections_idle" + "'", str11,
        "MISSING VAL FOR KEY:connections_idle");
  }

  @Test
  public void test3476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3476");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("commit_index");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3477");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Available unused memory in the pool, in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3478");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.quarantineDatabase", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.neo4j.tx.enabled", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.quarantineDatabase"
            + "'", str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.quarantineDatabase");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.neo4j.tx.enabled"
            + "'", str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.neo4j.tx.enabled");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3479");
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
    java.lang.String str18 = io.github.onograph.I18N.format("capacity", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:capacity" + "'",
        str18, "MISSING VAL FOR KEY:capacity");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3480");
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
    java.lang.String str17 = io.github.onograph.I18N.format("raft-messages.log", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.logging.level", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:raft-messages.log" + "'", str17,
        "MISSING VAL FOR KEY:raft-messages.log");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3481");
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
        "Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"",
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
            + "MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\""
            + "'", str18,
        "MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3482");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--delete-nodes-with-labels");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3483");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3484");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("database.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3485");
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
    java.lang.String str21 = io.github.onograph.I18N.format("localhost", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("enc_res_database_id", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ",
        objArray15);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str21, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str23,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:enc_res_database_id" + "'", str24,
        "MISSING VAL FOR KEY:enc_res_database_id");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load."
            + "'", str25,
        "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. "
            + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test3486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3486");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Configure the discovery type used for cluster name resolution", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("RelationshipQualifier", objArray4);
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
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:RelationshipQualifier" + "'", str8,
        "MISSING VAL FOR KEY:RelationshipQualifier");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3487");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str14 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format("status", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("bolt.*", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Count of successful database create operations. (counter)", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*transaction.last_committed_tx_id", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.createUser", objArray13);
    java.lang.String str23 = io.github.onograph.I18N.format("akka.remote.artery.enabled",
        objArray13);
    org.junit.Assert.assertNotNull(objArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str14,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str15, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str17, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str18,
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Count of successful database create operations. (counter)" + "'",
        str19, "MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.createUser"
            + "'", str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:akka.remote.artery.enabled" + "'", str23,
        "MISSING VAL FOR KEY:akka.remote.artery.enabled");
  }

  @Test
  public void test3488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3488");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("snappy_encoder", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("The level of middleware logging",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.",
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str12,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:The level of middleware logging" + "'", str13,
        "MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties."
            + "'", str15,
        "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3489");
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
    java.lang.String str17 = io.github.onograph.I18N.format("cc-client-topology-actor", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("fabric.driver.event_loop_count",
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str14,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str15,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str16, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:cc-client-topology-actor" + "'", str17,
        "MISSING VAL FOR KEY:cc-client-topology-actor");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.event_loop_count" + "'", str18,
        "MISSING VAL FOR KEY:fabric.driver.event_loop_count");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3490");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.min_std_deviation");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3491");
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
    java.lang.String str15 = io.github.onograph.I18N.format("query-logging", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:query-logging" + "'", str15,
        "MISSING VAL FOR KEY:query-logging");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3492");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("FOR_DATABASE", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:" + "'", str8,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3493");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3494");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:String");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3495");
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
        "Configure the discovery type used for cluster name resolution", objArray9);
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
            + "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution" + "'",
        str14, "MISSING VAL FOR KEY:Configure the discovery type used for cluster name resolution");
  }

  @Test
  public void test3496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3496");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3497");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("ccstate", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("rollbacks", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("error_handler_tail", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.dynamic.setting.allowlist",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("count", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:iops", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("GRANTED", objArray11);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str13, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str14, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:error_handler_tail" + "'", str15,
        "MISSING VAL FOR KEY:error_handler_tail");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist" + "'", str16,
        "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:count" + "'", str17,
        "MISSING VAL FOR KEY:count");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:GRANTED" + "'",
        str19, "MISSING VAL FOR KEY:GRANTED");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3498");
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
    java.lang.String str14 = io.github.onograph.I18N.format("store_creation_time", objArray9);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:store_creation_time" + "'", str14,
        "MISSING VAL FOR KEY:store_creation_time");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3499");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use."
            + "'", str2,
        "MISSING VAL FOR KEY:Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.");
  }

  @Test
  public void test3500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3500");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Maximum backoff timeout for store copy requests");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }
}

