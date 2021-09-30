package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest12 {

  public static boolean debug = false;

  @Test
  public void test6001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6001");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Configures the time taken attempting to publish a cluster id to the discovery service before potentially retrying.",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.security.auth_provider",
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
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str17, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:active" + "'",
        str18, "MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Configures the time taken attempting to publish a cluster id to the discovery service before potentially retrying."
            + "'", str19,
        "MISSING VAL FOR KEY:Configures the time taken attempting to publish a cluster id to the discovery service before potentially retrying.");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str20,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6002");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("replication_success");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6003");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("akka.remote.artery.transport");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6004");
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
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.",
        objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("driver.api", objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:driver.api" + "'",
        str17, "MISSING VAL FOR KEY:driver.api");
  }

  @Test
  public void test6005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6005");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.pool", objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_runtime", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("method", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("handshake_initializer", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:flushes",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Is this server the leader? (gauge)", objArray11);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.pool" + "'",
        str12, "MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime" + "'", str13,
        "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:method" + "'",
        str14, "MISSING VAL FOR KEY:method");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str15,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Is this server the leader? (gauge)" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Is this server the leader? (gauge)");
  }

  @Test
  public void test6006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6006");
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
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbName",
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbName" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbName");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6007");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:logging-dispatcher.thread-pool-executor.fixed-pool-size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6008");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:<all/users/roles>");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6009");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("labels", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:*ids_in_use.node",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.procedures", objArray7);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:labels" + "'", str9,
        "MISSING VAL FOR KEY:labels");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node" + "'",
        str10, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:dbms.procedures" + "'", str11,
        "MISSING VAL FOR KEY:dbms.procedures");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test6010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6010");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.jvm.threads.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6011");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_file_chunk");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6012");
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
    java.lang.String str21 = io.github.onograph.I18N.format("iops", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "dbms.security.authentication_providers", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray14);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str21,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.security.authentication_providers" + "'",
        str22, "MISSING VAL FOR KEY:dbms.security.authentication_providers");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser"
            + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str24,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
  }

  @Test
  public void test6013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6013");
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
        "causal_clustering.middleware.akka.allow_any_core_to_bootstrap", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("ids_in_use", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("fabric.driver.logging.level",
        objArray6);
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
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap" + "'",
        str10, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:ids_in_use" + "'",
        str11, "MISSING VAL FOR KEY:ids_in_use");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.logging.level" + "'", str12,
        "MISSING VAL FOR KEY:fabric.driver.logging.level");
  }

  @Test
  public void test6014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6014");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("SCHEMA", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format("total_bytes", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("thread.count", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "fabric.driver.connection.pool.max_size", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("label", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str16, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str17, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:total_bytes" + "'",
        str18, "MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:thread.count" + "'",
        str19, "MISSING VAL FOR KEY:thread.count");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.connection.pool.max_size" + "'",
        str21, "MISSING VAL FOR KEY:fabric.driver.connection.pool.max_size");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:label" + "'", str22,
        "MISSING VAL FOR KEY:label");
  }

  @Test
  public void test6015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6015");
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
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:days", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("--skip-relationships", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.remote.artery.bind.port", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.upgradeDetails", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:HAS_DB_ROLE", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:--skip-relationships" + "'", str19,
        "MISSING VAL FOR KEY:--skip-relationships");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.upgradeDetails"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.upgradeDetails");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:HAS_DB_ROLE" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:HAS_DB_ROLE");
  }

  @Test
  public void test6016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6016");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.JVM memory buffers metrics.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6017");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.leader_failure_detection_window");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6018");
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
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("csv-reporter", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:<path>",
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str22,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:csv-reporter" + "'",
        str23, "MISSING VAL FOR KEY:csv-reporter");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<path>" + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<path>");
  }

  @Test
  public void test6019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6019");
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
    java.lang.String str21 = io.github.onograph.I18N.format("localhost:6362", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.user_dn_template", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:localhost:6362" + "'", str21,
        "MISSING VAL FOR KEY:localhost:6362");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template" + "'", str22,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template");
  }

  @Test
  public void test6020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6020");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("*ids_in_use.node", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("temp-copy", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.logs.security.format", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("invisible", objArray8);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:temp-copy" + "'",
        str11, "MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.format" + "'", str12,
        "MISSING VAL FOR KEY:dbms.logs.security.format");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str13, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test6021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6021");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("function", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Administration command: REVOKE ROLE FROM USER", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("targetDirectory", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("*transaction.active_write", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("high_limitV3_0_0", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "The minimum size of the dynamically adjusted voting set (which only core members may be a part of). Adjustments to the voting set happen automatically as the availability of core members changes, due to explicit operations such as starting or stopping a member, or unintended issues such as network partitions. Note that this dynamic scaling of the voting set is generally desirable as under some circumstances it can increase the number of instance failures which may be tolerated. A majority of the voting set must be available before voting in or out members.",
        objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format("in_res_type", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*dbms.pool.bolt.free", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER"
            + "'", str12, "MISSING VAL FOR KEY:Administration command: REVOKE ROLE FROM USER");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:targetDirectory" + "'", str13,
        "MISSING VAL FOR KEY:targetDirectory");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*transaction.active_write" + "'", str14,
        "MISSING VAL FOR KEY:*transaction.active_write");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:high_limitV3_0_0" + "'", str15,
        "MISSING VAL FOR KEY:high_limitV3_0_0");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The minimum size of the dynamically adjusted voting set (which only core members may be a part of). Adjustments to the voting set happen automatically as the availability of core members changes, due to explicit operations such as starting or stopping a member, or unintended issues such as network partitions. Note that this dynamic scaling of the voting set is generally desirable as under some circumstances it can increase the number of instance failures which may be tolerated. A majority of the voting set must be available before voting in or out members."
            + "'", str16,
        "MISSING VAL FOR KEY:The minimum size of the dynamically adjusted voting set (which only core members may be a part of). Adjustments to the voting set happen automatically as the availability of core members changes, due to explicit operations such as starting or stopping a member, or unintended issues such as network partitions. Note that this dynamic scaling of the voting set is generally desirable as under some circumstances it can increase the number of instance failures which may be tolerated. A majority of the voting set must be available before voting in or out members.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:in_res_type" + "'",
        str17, "MISSING VAL FOR KEY:in_res_type");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*dbms.pool.bolt.free"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*dbms.pool.bolt.free");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test6022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6022");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("read", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("bolt.*", objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "List the active lock requests granted for the transaction executing the query with the given query id.",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("offline", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("transactionId", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)",
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str17, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id."
            + "'", str18,
        "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy" + "'",
        str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:offline" + "'",
        str20, "MISSING VAL FOR KEY:offline");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:transactionId" + "'", str21,
        "MISSING VAL FOR KEY:transactionId");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
  }

  @Test
  public void test6023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6023");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("labelSelector");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6024");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:--from-path-tx");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6025");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.createUser", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("messages_started", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"",
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:messages_started" + "'", str13,
        "MISSING VAL FOR KEY:messages_started");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\""
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test6026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6026");
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
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.prefix", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.",
        objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of page merges executed by the page cache. (counter)",
        objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.prefix" + "'", str19,
        "MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties."
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of page merges executed by the page cache. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of page merges executed by the page cache. (counter)");
  }

  @Test
  public void test6027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6027");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("raft_chunked_writer", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(".JVM file descriptor metrics.",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("File", objArray5);
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
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:raft_chunked_writer" + "'", str8,
        "MISSING VAL FOR KEY:raft_chunked_writer");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:.JVM file descriptor metrics." + "'", str9,
        "MISSING VAL FOR KEY:.JVM file descriptor metrics.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:File" + "'", str10,
        "MISSING VAL FOR KEY:File");
  }

  @Test
  public void test6028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6028");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:OUTBOUND",
        objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hostnameOrIp",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("dbms.directories.cluster_state",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "Enable reporting metrics about Neo4j memory pools. Deprecated - use metrics.filter instead.",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost:6362",
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
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hostnameOrIp" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hostnameOrIp");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:dbms.directories.cluster_state" + "'", str24,
        "MISSING VAL FOR KEY:dbms.directories.cluster_state");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about Neo4j memory pools. Deprecated - use metrics.filter instead."
            + "'", str25,
        "MISSING VAL FOR KEY:Enable reporting metrics about Neo4j memory pools. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost:6362" + "'",
        str26, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost:6362");
  }

  @Test
  public void test6029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6029");
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
    java.lang.String str18 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:continuous",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:continuous");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured."
            + "'", str20,
        "MISSING VAL FOR KEY:Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6030");
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
    java.lang.String str15 = io.github.onograph.I18N.format("*transaction.peak_concurrent",
        objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str12, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str14, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:*transaction.peak_concurrent" + "'", str15,
        "MISSING VAL FOR KEY:*transaction.peak_concurrent");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:cluster-state" + "'", str16,
        "MISSING VAL FOR KEY:cluster-state");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6031");
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
    java.lang.String str14 = io.github.onograph.I18N.format("transaction", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("metrics.csv.rotation.size", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Advertised cluster member discovery management communication.", objArray8);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:transaction" + "'",
        str14, "MISSING VAL FOR KEY:transaction");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:metrics.csv.rotation.size" + "'", str15,
        "MISSING VAL FOR KEY:metrics.csv.rotation.size");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Advertised cluster member discovery management communication." + "'",
        str16, "MISSING VAL FOR KEY:Advertised cluster member discovery management communication.");
  }

  @Test
  public void test6032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6032");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("message_gate");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6033");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("status", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("raft-server", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("transaction.*", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("metrics.filter", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("Retry-After", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "A comma separated list of relationships to ignore.", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(".Database page cache metrics",
        objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:readReplicaStoreIdReader", objArray12);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str15, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str16,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:metrics.filter" + "'", str17,
        "MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:Retry-After" + "'",
        str18, "MISSING VAL FOR KEY:Retry-After");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:A comma separated list of relationships to ignore." + "'", str19,
        "MISSING VAL FOR KEY:A comma separated list of relationships to ignore.");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:.Database page cache metrics" + "'", str20,
        "MISSING VAL FOR KEY:.Database page cache metrics");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:readReplicaStoreIdReader"
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:readReplicaStoreIdReader");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test6034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6034");
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
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.user_dn_template", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_snapshot", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost:6362",
        objArray11);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_snapshot"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_snapshot");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost:6362" + "'",
        str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost:6362");
  }

  @Test
  public void test6035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6035");
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
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:member-data",
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:member-data" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:member-data");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test6036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6036");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Minimum number of Core machines initially required to form a cluster. The cluster will form when at least this many Core members have discovered each other.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6037");
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
        "Count of successful database drop operations. (counter)", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("constraintName", objArray7);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Count of successful database drop operations. (counter)" + "'",
        str13, "MISSING VAL FOR KEY:Count of successful database drop operations. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:constraintName" + "'", str14,
        "MISSING VAL FOR KEY:constraintName");
  }

  @Test
  public void test6038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6038");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:TO", objArray8);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:TO" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:TO");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6039");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("raft-server", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.join_catch_up_timeout", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.security.deleteRole", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("Transaction retries. (counter)",
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str13, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. "
            + "'", str15,
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.security.deleteRole" + "'", str16,
        "MISSING VAL FOR KEY:dbms.security.deleteRole");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Transaction retries. (counter)" + "'", str17,
        "MISSING VAL FOR KEY:Transaction retries. (counter)");
  }

  @Test
  public void test6040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6040");
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
    java.lang.String str15 = io.github.onograph.I18N.format("total_size", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica",
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:messages_started" + "'", str14,
        "MISSING VAL FOR KEY:messages_started");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:total_size" + "'",
        str15, "MISSING VAL FOR KEY:total_size");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6041");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:pageFaults", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:pageFaults" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:pageFaults");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6042");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Applied index of the RAFT log. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6043");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:shutdown",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str12,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str13,
        "MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)"
            + "'", str14,
        "MISSING VAL FOR KEY:The total size of the database and transaction logs, in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:shutdown" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:shutdown");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6044");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "causal_clustering.leader_transfer_timeout", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.leader_transfer_timeout"
            + "'", str2, "MISSING VAL FOR KEY:causal_clustering.leader_transfer_timeout");
  }

  @Test
  public void test6045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6045");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.",
        objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("cypher", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("frame_encoder", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("RAFT Term of this server. (gauge)",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format("cc-core-topology-actor", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.",
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping."
            + "'", str21,
        "MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:cypher" + "'",
        str22, "MISSING VAL FOR KEY:cypher");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:frame_encoder" + "'", str23,
        "MISSING VAL FOR KEY:frame_encoder");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:RAFT Term of this server. (gauge)" + "'",
        str24, "MISSING VAL FOR KEY:RAFT Term of this server. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:cc-core-topology-actor" + "'", str25,
        "MISSING VAL FOR KEY:cc-core-topology-actor");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value."
            + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test6046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6046");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:policy", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:policy"
            + "'", str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:policy");
  }

  @Test
  public void test6047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6047");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("metrics.neo4j.checkpointing.enabled",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.checkpointing.enabled" + "'",
        str2, "MISSING VAL FOR KEY:metrics.neo4j.checkpointing.enabled");
  }

  @Test
  public void test6048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6048");
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
    java.lang.String str15 = io.github.onograph.I18N.format("causal_clustering.core.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("threads.jetty.all", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:hit_ratio", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.core.*" + "'", str15,
        "MISSING VAL FOR KEY:causal_clustering.core.*");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:threads.jetty.all" + "'", str16,
        "MISSING VAL FOR KEY:threads.jetty.all");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:hit_ratio"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:hit_ratio");
  }

  @Test
  public void test6049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6049");
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
    java.lang.String str11 = io.github.onograph.I18N.format("driver.logging.leaked_sessions",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of terminated write transactions. (counter)", objArray6);
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
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:driver.logging.leaked_sessions" + "'", str11,
        "MISSING VAL FOR KEY:driver.logging.leaked_sessions");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The total number of terminated write transactions. (counter)" + "'",
        str12, "MISSING VAL FOR KEY:The total number of terminated write transactions. (counter)");
  }

  @Test
  public void test6050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6050");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ",
        objArray4);
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
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery "
            + "'", str7,
        "MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:" + "'", str8,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test6051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6051");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("labels");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6052");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("function", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("FOR_DATABASE", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.default-parallelism", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("*store.size*", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:rollbacks",
        objArray6);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str7,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str8, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:FOR_DATABASE" + "'",
        str9, "MISSING VAL FOR KEY:FOR_DATABASE");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.default-parallelism" + "'", str10,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.default-parallelism");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:*store.size*" + "'",
        str11, "MISSING VAL FOR KEY:*store.size*");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:rollbacks" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:rollbacks");
  }

  @Test
  public void test6053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6053");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:wait");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6054");
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
        "MISSING VAL FOR KEY:driver.connection.pool.max_size", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_provider",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.connection.pool.max_size");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_provider"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6055");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("ccstate", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("Delete the specified user.",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:--skip-relationships", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("RAFT log reader pool size",
        objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
        objArray11);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used."
            + "'", str14,
        "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Delete the specified user." + "'", str15,
        "MISSING VAL FOR KEY:Delete the specified user.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--skip-relationships"
            + "'", str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--skip-relationships");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:RAFT log reader pool size" + "'", str18,
        "MISSING VAL FOR KEY:RAFT log reader pool size");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
  }

  @Test
  public void test6056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6056");
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
    java.lang.String str21 = io.github.onograph.I18N.format("<path>", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("User", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "causal_clustering.unknown_address_logging_throttle", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space", objArray14);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:<path>" + "'",
        str21, "MISSING VAL FOR KEY:<path>");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:User" + "'", str22,
        "MISSING VAL FOR KEY:User");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.unknown_address_logging_throttle" + "'", str23,
        "MISSING VAL FOR KEY:causal_clustering.unknown_address_logging_throttle");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space" + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test6057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6057");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("function", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("FOR_DATABASE", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("query-logging", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("RelationshipQualifierAll", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.min-std-deviation", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("memberOf", objArray7);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str9, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:FOR_DATABASE" + "'",
        str10, "MISSING VAL FOR KEY:FOR_DATABASE");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:query-logging" + "'", str11,
        "MISSING VAL FOR KEY:query-logging");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:RelationshipQualifierAll" + "'", str12,
        "MISSING VAL FOR KEY:RelationshipQualifierAll");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:akka.cluster.failure-detector.min-std-deviation" + "'", str13,
        "MISSING VAL FOR KEY:akka.cluster.failure-detector.min-std-deviation");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:memberOf" + "'",
        str14, "MISSING VAL FOR KEY:memberOf");
  }

  @Test
  public void test6058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6058");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("leader-only", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.auth_provider", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Estimated amount of memory used by the pool. (gauge)", objArray11);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str14, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names."
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Estimated amount of memory used by the pool. (gauge)" + "'", str18,
        "MISSING VAL FOR KEY:Estimated amount of memory used by the pool. (gauge)");
  }

  @Test
  public void test6059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6059");
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
    java.lang.String str24 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:threads.jetty.all",
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
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:threads.jetty.all" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:threads.jetty.all");
  }

  @Test
  public void test6060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6060");
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
    java.lang.String str18 = io.github.onograph.I18N.format("cc-database-status-actor", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("addresses", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:FOR", objArray12);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:cc-database-status-actor" + "'", str18,
        "MISSING VAL FOR KEY:cc-database-status-actor");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str19, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:FOR" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:FOR");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6061");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Enable discovery service and a catchup server to be started on an Enterprise Standalone Instance 'dbms.mode=SINGLE', and with that allow for Read Replicas to connect and pull transaction from it. In clustered 'dbms.mode'-s (CORE, READ_REPLICA) this setting is not recognized.",
        objArray11);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Enable discovery service and a catchup server to be started on an Enterprise Standalone Instance 'dbms.mode=SINGLE', and with that allow for Read Replicas to connect and pull transaction from it. In clustered 'dbms.mode'-s (CORE, READ_REPLICA) this setting is not recognized."
            + "'", str19,
        "MISSING VAL FOR KEY:Enable discovery service and a catchup server to be started on an Enterprise Standalone Instance 'dbms.mode=SINGLE', and with that allow for Read Replicas to connect and pull transaction from it. In clustered 'dbms.mode'-s (CORE, READ_REPLICA) this setting is not recognized.");
  }

  @Test
  public void test6062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6062");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("bolt.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("enc_get_metadata", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "*causal_clustering.core.replication_attempt", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:DEFAULT",
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:enc_get_metadata" + "'", str16,
        "MISSING VAL FOR KEY:enc_get_metadata");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:*causal_clustering.core.replication_attempt"
            + "'", str17, "MISSING VAL FOR KEY:*causal_clustering.core.replication_attempt");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str18,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test6063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6063");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("name", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id" + "'",
        str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:name" + "'", str20,
        "MISSING VAL FOR KEY:name");
  }

  @Test
  public void test6064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6064");
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
    java.lang.String str23 = io.github.onograph.I18N.format("initial", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("dbms.logs.security.level", objArray14);
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
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:initial" + "'",
        str23, "MISSING VAL FOR KEY:initial");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.level" + "'", str24,
        "MISSING VAL FOR KEY:dbms.logs.security.level");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test6065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6065");
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
        "Administration command: SHOW ROLES WITH USERS", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("hnd_req_store_id", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("SEGMENTED", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("*transaction.active_write",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str18,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:Administration command: SHOW ROLES WITH USERS"
            + "'", str19, "MISSING VAL FOR KEY:Administration command: SHOW ROLES WITH USERS");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:hnd_req_store_id" + "'", str20,
        "MISSING VAL FOR KEY:hnd_req_store_id");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:SEGMENTED" + "'",
        str21, "MISSING VAL FOR KEY:SEGMENTED");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:*transaction.active_write" + "'", str22,
        "MISSING VAL FOR KEY:*transaction.active_write");
  }

  @Test
  public void test6066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6066");
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
    java.lang.String str17 = io.github.onograph.I18N.format("total", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("enc_catchup_error", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("page_faults", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str15,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str16,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:total" + "'", str17,
        "MISSING VAL FOR KEY:total");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:enc_catchup_error" + "'", str18,
        "MISSING VAL FOR KEY:enc_catchup_error");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:page_faults" + "'",
        str19, "MISSING VAL FOR KEY:page_faults");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes");
  }

  @Test
  public void test6067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6067");
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
    java.lang.String str13 = io.github.onograph.I18N.format("causal_clustering.core.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("raft", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.core.*" + "'", str13,
        "MISSING VAL FOR KEY:causal_clustering.core.*");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:raft" + "'", str14,
        "MISSING VAL FOR KEY:raft");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test6068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6068");
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
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.graphite.enabled", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("init_client_handler", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("HAS_ROLE", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:terminated_write",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:<label.property>[,<label.property>...]", objArray14);
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.enabled" + "'", str19,
        "MISSING VAL FOR KEY:metrics.graphite.enabled");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str20,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:init_client_handler" + "'", str21,
        "MISSING VAL FOR KEY:init_client_handler");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:HAS_ROLE" + "'",
        str22, "MISSING VAL FOR KEY:HAS_ROLE");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:terminated_write" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:terminated_write");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label.property>[,<label.property>...]" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label.property>[,<label.property>...]");
  }

  @Test
  public void test6069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6069");
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
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms/cluster",
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<all/users/roles>" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<all/users/roles>");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms/cluster" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms/cluster");
  }

  @Test
  public void test6070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6070");
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
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:elapsedTimeMs",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("leader-only", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("*store.size*", objArray15);
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
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes" + "'",
        str22, "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str24, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1"
            + "'", str25, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:*store.size*" + "'",
        str26, "MISSING VAL FOR KEY:*store.size*");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test6071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6071");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("dbms.directories.cluster_state",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout",
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
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:dbms.directories.cluster_state" + "'", str8,
        "MISSING VAL FOR KEY:dbms.directories.cluster_state");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout"
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
  }

  @Test
  public void test6072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6072");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--force");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6073");
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
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:core", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled."
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:core" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:core");
  }

  @Test
  public void test6074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6074");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("status", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.raft_messages_log_path", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_res_tx_pull",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Pooled connections that have been idle in the pool for longer than this timeout will be tested before they are used again, to ensure they are still alive.\nIf this option is set too low, an additional network call will be incurred when acquiring a connection, which causes a performance hit.\nIf this is set high, no longer live connections might be used which might lead to errors.\nHence, this parameter tunes a balance between the likelihood of experiencing connection problems and performance\nNormally, this parameter should not need tuning.\nValue 0 means connections will always be tested for validity",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.JVM file descriptor metrics.", objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:raft.log.",
        objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str15,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path"
            + "'", str17, "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_tx_pull" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_tx_pull");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Pooled connections that have been idle in the pool for longer than this timeout will be tested before they are used again, to ensure they are still alive.\nIf this option is set too low, an additional network call will be incurred when acquiring a connection, which causes a performance hit.\nIf this is set high, no longer live connections might be used which might lead to errors.\nHence, this parameter tunes a balance between the likelihood of experiencing connection problems and performance\nNormally, this parameter should not need tuning.\nValue 0 means connections will always be tested for validity"
            + "'", str19,
        "MISSING VAL FOR KEY:Pooled connections that have been idle in the pool for longer than this timeout will be tested before they are used again, to ensure they are still alive.\nIf this option is set too low, an additional network call will be incurred when acquiring a connection, which causes a performance hit.\nIf this is set high, no longer live connections might be used which might lead to errors.\nHence, this parameter tunes a balance between the likelihood of experiencing connection problems and performance\nNormally, this parameter should not need tuning.\nValue 0 means connections will always be tested for validity");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.JVM file descriptor metrics." + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.JVM file descriptor metrics.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft.log." + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft.log.");
  }

  @Test
  public void test6075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6075");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("function", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dirty", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout", objArray4);
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
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dirty" + "'", str7,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dirty");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout"
            + "'", str8,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
  }

  @Test
  public void test6076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6076");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.driver.logging.leaked_sessions");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6077");
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
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.createUser", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "If an existing database should be replaced.", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str18, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.createUser"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:If an existing database should be replaced."
            + "'", str21, "MISSING VAL FOR KEY:If an existing database should be replaced.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only");
  }

  @Test
  public void test6078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6078");
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
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy.",
        objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:zlib_decoder", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "causal_clustering.state_machine_apply_max_batch_size", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("dbms.security.ldap.read_timeout",
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str17, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.security.createUser" + "'", str18,
        "MISSING VAL FOR KEY:dbms.security.createUser");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str19, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str21,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy."
            + "'", str22,
        "MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy.");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:zlib_decoder" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:zlib_decoder");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.state_machine_apply_max_batch_size" + "'", str24,
        "MISSING VAL FOR KEY:causal_clustering.state_machine_apply_max_batch_size");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written."
            + "'", str25,
        "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.read_timeout" + "'", str26,
        "MISSING VAL FOR KEY:dbms.security.ldap.read_timeout");
  }

  @Test
  public void test6079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6079");
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
    java.lang.String str23 = io.github.onograph.I18N.format(
        "Time between scanning the cluster to refresh current server's view of topology",
        objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format("metrics.neo4j.logrotation.enabled",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format("hnd_get_all_database_ids", objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost",
        objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:In-flight cache element count. (gauge)", objArray16);
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
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology"
            + "'", str23,
        "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled" + "'",
        str24, "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:hnd_get_all_database_ids" + "'", str25,
        "MISSING VAL FOR KEY:hnd_get_all_database_ids");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str26,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost" + "'", str27,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:In-flight cache element count. (gauge)" + "'",
        str28, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:In-flight cache element count. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass29);
  }

  @Test
  public void test6080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6080");
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
        "MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.user_dn_template", objArray7);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries"
            + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template" + "'", str14,
        "MISSING VAL FOR KEY:dbms.security.ldap.authentication.user_dn_template");
  }

  @Test
  public void test6081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6081");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "*causal_clustering.core.replication_fail", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("akka.remote.artery.enabled",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("*check_point.total_time", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.",
        objArray9);
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str10,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail"
            + "'", str11, "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:akka.remote.artery.enabled" + "'", str12,
        "MISSING VAL FOR KEY:akka.remote.artery.enabled");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:*check_point.total_time" + "'", str13,
        "MISSING VAL FOR KEY:*check_point.total_time");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.");
  }

  @Test
  public void test6082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6082");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1"
            + "'", str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:arg1");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test6083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6083");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("true", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Privilege",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("publisher", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("Maximum timeout for akka shutdown",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.security.changeUserPassword",
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:publisher" + "'",
        str16, "MISSING VAL FOR KEY:publisher");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Maximum timeout for akka shutdown" + "'",
        str17, "MISSING VAL FOR KEY:Maximum timeout for akka shutdown");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.security.changeUserPassword" + "'",
        str18, "MISSING VAL FOR KEY:dbms.security.changeUserPassword");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test6084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6084");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "List failed job runs. There is a limit for amount of historical data.", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("enc_req_type", objArray11);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory"
            + "'", str16,
        "MISSING VAL FOR KEY:Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:List failed job runs. There is a limit for amount of historical data."
            + "'", str17,
        "MISSING VAL FOR KEY:List failed job runs. There is a limit for amount of historical data.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:enc_req_type" + "'",
        str18, "MISSING VAL FOR KEY:enc_req_type");
  }

  @Test
  public void test6085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6085");
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
        "MISSING VAL FOR KEY:Raft replication attempt count. (counter)", objArray9);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft replication attempt count. (counter)" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
  }

  @Test
  public void test6086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6086");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.cluster.run-coordinated-shutdown-when-down");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6087");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Configure if the `dbms.routing.getRoutingTable()` procedure should include followers as read endpoints or return only read replicas. Note: if there are no read replicas in the cluster, followers are returned as read end points regardless the value of this setting. Defaults to true so that followers are available for read-only queries in a typical heterogeneous setup.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:TO", objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include followers as read endpoints or return only read replicas. Note: if there are no read replicas in the cluster, followers are returned as read end points regardless the value of this setting. Defaults to true so that followers are available for read-only queries in a typical heterogeneous setup."
            + "'", str15,
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include followers as read endpoints or return only read replicas. Note: if there are no read replicas in the cluster, followers are returned as read end points regardless the value of this setting. Defaults to true so that followers are available for read-only queries in a typical heterogeneous setup.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:TO"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:TO");
  }

  @Test
  public void test6088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6088");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:External config file for Akka");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6089");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.property_level.blacklist", objArray13);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.property_level.blacklist" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.property_level.blacklist");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test6090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6090");
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
    java.lang.String str18 = io.github.onograph.I18N.format("DEFAULT", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:DEFAULT" + "'",
        str18, "MISSING VAL FOR KEY:DEFAULT");
  }

  @Test
  public void test6091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6091");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("bolt.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("--skip-node-properties", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Sets the password of the loopback operator user. ", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Enable reporting metrics about approximately how many entities are in the database; nodes, relationships, properties, etc. Deprecated - use metrics.filter instead.",
        objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:--skip-node-properties" + "'", str16,
        "MISSING VAL FOR KEY:--skip-node-properties");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Sets the password of the loopback operator user. " + "'", str18,
        "MISSING VAL FOR KEY:Sets the password of the loopback operator user. ");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about approximately how many entities are in the database; nodes, relationships, properties, etc. Deprecated - use metrics.filter instead."
            + "'", str19,
        "MISSING VAL FOR KEY:Enable reporting metrics about approximately how many entities are in the database; nodes, relationships, properties, etc. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test6092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6092");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "causal_clustering.akka_actor_system_restarter.max_acceptable_failures", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("akka.remote.artery.bind.port",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("true", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("Kubernetes cluster domain",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Estimated number of buffers in the pool. (gauge)", objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:thread.count",
        objArray12);
    org.junit.Assert.assertNotNull(objArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12),
        "[hnd_req_get_info, capacity, unavailable]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)"
            + "'", str13,
        "MISSING VAL FOR KEY:The total number of messages that failed processing since this instance started. (counter)");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str15,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:akka.remote.artery.bind.port" + "'", str17,
        "MISSING VAL FOR KEY:akka.remote.artery.bind.port");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str18,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:Kubernetes cluster domain" + "'", str19,
        "MISSING VAL FOR KEY:Kubernetes cluster domain");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Estimated number of buffers in the pool. (gauge)" + "'", str20,
        "MISSING VAL FOR KEY:Estimated number of buffers in the pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:thread.count"
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:thread.count");
  }

  @Test
  public void test6093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6093");
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
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:elapsedTimeMs",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("leader-only", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_allow_reads_on_followers", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("leader-only", objArray15);
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
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes" + "'",
        str22, "MISSING VAL FOR KEY:dbms.security.ldap.authorization.group_membership_attributes");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str24, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.cluster_allow_reads_on_followers" + "'", str25,
        "MISSING VAL FOR KEY:causal_clustering.cluster_allow_reads_on_followers");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str26, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test6094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6094");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.election_failure_detection_window", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.election_failure_detection_window" + "'", str20,
        "MISSING VAL FOR KEY:causal_clustering.election_failure_detection_window");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6095");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("read", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("bolt.*", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "List the active lock requests granted for the transaction executing the query with the given query id.",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("offline", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("transactionId", objArray12);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str16, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id."
            + "'", str17,
        "MISSING VAL FOR KEY:List the active lock requests granted for the transaction executing the query with the given query id.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:offline" + "'",
        str19, "MISSING VAL FOR KEY:offline");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:transactionId" + "'", str20,
        "MISSING VAL FOR KEY:transactionId");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6096");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hnd_req_metadata");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6097");
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
    java.lang.String str27 = io.github.onograph.I18N.format("storeStateReader", objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ldap", objArray16);
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
        "'" + str27 + "' != '" + "MISSING VAL FOR KEY:storeStateReader" + "'", str27,
        "MISSING VAL FOR KEY:storeStateReader");
    org.junit.Assert.assertEquals(
        "'" + str28 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:ldap"
            + "'", str28, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:ldap");
    org.junit.Assert.assertNotNull(wildcardClass29);
  }

  @Test
  public void test6098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6098");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "*causal_clustering.core.replication_fail", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:rotation_events", objArray7);
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail"
            + "'", str9, "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:rotation_events" + "'",
        str10, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:rotation_events");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test6099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6099");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("shutdown", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("dbms.backup.address", objArray7);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str8,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:shutdown" + "'",
        str9, "MISSING VAL FOR KEY:shutdown");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.address" + "'", str10,
        "MISSING VAL FOR KEY:dbms.backup.address");
  }

  @Test
  public void test6100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6100");
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
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.prometheus.enabled",
        objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("modifierProtocols", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("Is this server the leader? (gauge)",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Privilege",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "Set to `true` to enable the JMX metrics endpoint", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.enabled" + "'", str20,
        "MISSING VAL FOR KEY:metrics.prometheus.enabled");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:modifierProtocols" + "'", str21,
        "MISSING VAL FOR KEY:modifierProtocols");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:Is this server the leader? (gauge)" + "'",
        str22, "MISSING VAL FOR KEY:Is this server the leader? (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Privilege");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:Set to `true` to enable the JMX metrics endpoint" + "'", str24,
        "MISSING VAL FOR KEY:Set to `true` to enable the JMX metrics endpoint");
  }

  @Test
  public void test6101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6101");
    }
    java.lang.Object[] objArray15 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str16 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray15);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray15);
    java.lang.String str18 = io.github.onograph.I18N.format("read", objArray15);
    java.lang.String str19 = io.github.onograph.I18N.format("execute_boosted_from_config",
        objArray15);
    java.lang.String str20 = io.github.onograph.I18N.format("replication_maybe", objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "driver.connection.pool.acquisition_timeout", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("NewLeaderBarrier", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("hi!", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. ",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("", objArray15);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str19,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str20,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout"
            + "'", str21, "MISSING VAL FOR KEY:driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:NewLeaderBarrier" + "'", str22,
        "MISSING VAL FOR KEY:NewLeaderBarrier");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:hi!" + "'", str23,
        "MISSING VAL FOR KEY:hi!");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked."
            + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Perform the recovery of the backup store by applying the latest pulled transactions. If disabled, the backup will be faster but a recovery of the backup store will be required at a later time before restoring the data (using the neo4j-admin prepare-restore command). Note: if --prepare-restore is set to false, then --check-consistency is implicitly set to false because the consistency of a none-recovered store can't be checked.");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. "
            + "'", str25,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. ");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:" + "'", str26,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test6102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6102");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("function", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("FOR_DATABASE", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("query-logging", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format("RelationshipQualifierAll", objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "akka.cluster.failure-detector.min-std-deviation", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray7);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:FOR_DATABASE" + "'",
        str10, "MISSING VAL FOR KEY:FOR_DATABASE");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:query-logging" + "'", str11,
        "MISSING VAL FOR KEY:query-logging");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:RelationshipQualifierAll" + "'", str12,
        "MISSING VAL FOR KEY:RelationshipQualifierAll");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:akka.cluster.failure-detector.min-std-deviation" + "'", str13,
        "MISSING VAL FOR KEY:akka.cluster.failure-detector.min-std-deviation");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test6103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6103");
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
    java.lang.String str14 = io.github.onograph.I18N.format("*transaction.active_read", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*transaction.active_read" + "'", str14,
        "MISSING VAL FOR KEY:*transaction.active_read");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test6104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6104");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("backup-location");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6105");
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
    java.lang.String str18 = io.github.onograph.I18N.format("authentication", objArray9);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:authentication" + "'", str18,
        "MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test6106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6106");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:ldap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6107");
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
    java.lang.String str14 = io.github.onograph.I18N.format("raft-log", objArray7);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:raft-log" + "'",
        str14, "MISSING VAL FOR KEY:raft-log");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test6108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6108");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("status", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("bolt.*", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("--skip-node-properties", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:handshake_server",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str13, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:--skip-node-properties" + "'", str14,
        "MISSING VAL FOR KEY:--skip-node-properties");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:handshake_server" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:handshake_server");
  }

  @Test
  public void test6109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6109");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "causal_clustering.replication_retry_timeout_limit", objArray13);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.replication_retry_timeout_limit" + "'", str22,
        "MISSING VAL FOR KEY:causal_clustering.replication_retry_timeout_limit");
  }

  @Test
  public void test6110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6110");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms/cluster");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6111");
    }
    java.lang.Object[] objArray16 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str17 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray16);
    java.lang.String str18 = io.github.onograph.I18N.format("writable", objArray16);
    java.lang.String str19 = io.github.onograph.I18N.format("--additional-config", objArray16);
    java.lang.String str20 = io.github.onograph.I18N.format("addresses", objArray16);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        objArray16);
    java.lang.String str22 = io.github.onograph.I18N.format("", objArray16);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
        objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.down_unreachable_on_new_joiner", objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format("fabric.driver.event_loop_count",
        objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format(
        "Set to `true` to enable the JMX metrics endpoint", objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:_NEO4J_RAFT_LOG_",
        objArray16);
    org.junit.Assert.assertNotNull(objArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str17,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str18, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:--additional-config" + "'", str19,
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str20, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str23,
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.down_unreachable_on_new_joiner"
            + "'", str25,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.down_unreachable_on_new_joiner");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.event_loop_count" + "'", str26,
        "MISSING VAL FOR KEY:fabric.driver.event_loop_count");
    org.junit.Assert.assertEquals("'" + str27 + "' != '"
            + "MISSING VAL FOR KEY:Set to `true` to enable the JMX metrics endpoint" + "'", str27,
        "MISSING VAL FOR KEY:Set to `true` to enable the JMX metrics endpoint");
    org.junit.Assert.assertEquals(
        "'" + str28 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:_NEO4J_RAFT_LOG_" + "'",
        str28, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:_NEO4J_RAFT_LOG_");
  }

  @Test
  public void test6112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6112");
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
        "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load."
            + "'", str12,
        "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test6113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6113");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.pool", objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_runtime", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("method", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("handshake_initializer", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:flushes",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray11);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.pool" + "'",
        str12, "MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime" + "'", str13,
        "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:method" + "'",
        str14, "MISSING VAL FOR KEY:method");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:handshake_initializer" + "'", str15,
        "MISSING VAL FOR KEY:handshake_initializer");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:flushes");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test6114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6114");
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
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms.procedures",
        objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("roleName", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RAFT log pruning frequency", objArray8);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.procedures" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.procedures");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:roleName" + "'",
        str15, "MISSING VAL FOR KEY:roleName");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:RAFT log pruning frequency"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:RAFT log pruning frequency");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6115");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.deleteUser");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6116");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:--backup-dir");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6117");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures",
        objArray4);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures"
            + "'", str8,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
  }

  @Test
  public void test6118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6118");
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
        "Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.read_replica_transaction_applier_batch_size", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.threshold", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window.",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("false", objArray13);
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
            + "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead."
            + "'", str18,
        "MISSING VAL FOR KEY:Enable reporting metrics about the VM pause time. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size" + "'",
        str19, "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_batch_size");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.threshold" + "'",
        str20, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.threshold");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window."
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str22,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test6119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6119");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6120");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:backup");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6121");
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
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:raft-member-id",
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft-member-id" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft-member-id");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test6122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6122");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("FAILED/");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6123");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of check point events executed so far. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6124");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("writable", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("success", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Raft Replication success count. (counter)", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("username", objArray10);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:success" + "'",
        str13, "MISSING VAL FOR KEY:success");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Raft Replication success count. (counter)"
            + "'", str15, "MISSING VAL FOR KEY:Raft Replication success count. (counter)");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:username" + "'",
        str16, "MISSING VAL FOR KEY:username");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6125");
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
    java.lang.String str25 = io.github.onograph.I18N.format("*dbms.pool.bolt.total_used",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("", objArray15);
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
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:*dbms.pool.bolt.total_used" + "'", str25,
        "MISSING VAL FOR KEY:*dbms.pool.bolt.total_used");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:" + "'", str26,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test6126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6126");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "Raft replication attempt count. (counter)", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("com.sun.jndi.ldap.read.timeout",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("logging-dispatcher.executor",
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
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Raft replication attempt count. (counter)"
            + "'", str10, "MISSING VAL FOR KEY:Raft replication attempt count. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout" + "'", str11,
        "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:logging-dispatcher.executor" + "'", str13,
        "MISSING VAL FOR KEY:logging-dispatcher.executor");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test6127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6127");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_res_pre_copy");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6128");
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
    java.lang.String str21 = io.github.onograph.I18N.format(
        "Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
        objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("in_req_type", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fork-join-executor", objArray14);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str21,
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:in_req_type" + "'",
        str23, "MISSING VAL FOR KEY:in_req_type");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fork-join-executor" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fork-join-executor");
  }

  @Test
  public void test6129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6129");
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
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:false",
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str17,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test6130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6130");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("*ids_in_use.node", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of rolled back read transactions. (counter)", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:follow",
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
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str9,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)" + "'",
        str10, "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:follow" + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:follow");
  }

  @Test
  public void test6131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6131");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:threads.jetty.all",
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:storeCopy" + "'",
        str20, "MISSING VAL FOR KEY:storeCopy");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka" + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:threads.jetty.all" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:threads.jetty.all");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test6132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6132");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:false",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "causal_clustering.log_shipping_max_lag", objArray14);
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
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:" + "'", str23,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag" + "'",
        str24, "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag");
  }

  @Test
  public void test6133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6133");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:akka", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:threads.jetty.all",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "The size of the database, in bytes. (gauge)", objArray14);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:storeCopy" + "'",
        str21, "MISSING VAL FOR KEY:storeCopy");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:threads.jetty.all" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:threads.jetty.all");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:The size of the database, in bytes. (gauge)"
            + "'", str24, "MISSING VAL FOR KEY:The size of the database, in bytes. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test6134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6134");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.",
        objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("page_cache", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "The ID of the last committed transaction. (counter)", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser", objArray12);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:page_cache" + "'",
        str17, "MISSING VAL FOR KEY:page_cache");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:The ID of the last committed transaction. (counter)" + "'", str19,
        "MISSING VAL FOR KEY:The ID of the last committed transaction. (counter)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test6135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6135");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("status", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("bolt.*", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("false", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("metrics.graphite.interval",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The name of the base object or named context to search for user objects when LDAP authorization is enabled. A common case is that this matches the last part of `dbms.security.ldap.authentication.user_dn_template`.",
        objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format("Commit index of the RAFT log. (gauge)",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:bolt.*" + "'",
        str16, "MISSING VAL FOR KEY:bolt.*");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str17,
        "MISSING VAL FOR KEY:Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str18,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.interval" + "'", str19,
        "MISSING VAL FOR KEY:metrics.graphite.interval");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The name of the base object or named context to search for user objects when LDAP authorization is enabled. A common case is that this matches the last part of `dbms.security.ldap.authentication.user_dn_template`."
            + "'", str20,
        "MISSING VAL FOR KEY:The name of the base object or named context to search for user objects when LDAP authorization is enabled. A common case is that this matches the last part of `dbms.security.ldap.authentication.user_dn_template`.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:Commit index of the RAFT log. (gauge)" + "'",
        str21, "MISSING VAL FOR KEY:Commit index of the RAFT log. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test6136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6136");
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
        "The duration for which the replicator will await a new leader.", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("Timeout for Akka socket binding",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str12,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The duration for which the replicator will await a new leader."
            + "'", str13,
        "MISSING VAL FOR KEY:The duration for which the replicator will await a new leader.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Timeout for Akka socket binding" + "'", str15,
        "MISSING VAL FOR KEY:Timeout for Akka socket binding");
  }

  @Test
  public void test6137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6137");
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
    java.lang.String str20 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "causal_clustering.cluster_topology_refresh", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("PUBLIC", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "Accumulated detected VM pause time. (gauge)", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "causal_clustering.user_defined_upstream_strategy", objArray15);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str20,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh"
            + "'", str22, "MISSING VAL FOR KEY:causal_clustering.cluster_topology_refresh");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:PUBLIC" + "'",
        str23, "MISSING VAL FOR KEY:PUBLIC");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors"
            + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:Accumulated detected VM pause time. (gauge)"
            + "'", str25, "MISSING VAL FOR KEY:Accumulated detected VM pause time. (gauge)");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.user_defined_upstream_strategy" + "'", str26,
        "MISSING VAL FOR KEY:causal_clustering.user_defined_upstream_strategy");
  }

  @Test
  public void test6138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6138");
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
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:replication_maybe",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("iops", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:false",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("fabric.stream.concurrency",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("messages_failed", objArray13);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:iops" + "'", str19,
        "MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.concurrency" + "'", str21,
        "MISSING VAL FOR KEY:fabric.stream.concurrency");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:messages_failed" + "'", str22,
        "MISSING VAL FOR KEY:messages_failed");
  }

  @Test
  public void test6139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6139");
    }
    java.lang.Object[] objArray15 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str16 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray15);
    java.lang.String str17 = io.github.onograph.I18N.format("writable", objArray15);
    java.lang.String str18 = io.github.onograph.I18N.format("--additional-config", objArray15);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray15);
    java.lang.String str20 = io.github.onograph.I18N.format("RelationshipType", objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format("dbms.", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("store.size", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:initial_members",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "The transactions' size in native memory in bytes. (histogram)", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.JVM memory buffers metrics.", objArray15);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str19,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str20,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms." + "'", str21,
        "MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:store.size" + "'",
        str22, "MISSING VAL FOR KEY:store.size");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause"
            + "'", str24,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)" + "'",
        str25, "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.JVM memory buffers metrics." + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.JVM memory buffers metrics.");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test6140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6140");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.pause_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6141");
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
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:GRANTED",
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:GRANTED" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:GRANTED");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test6142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6142");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("*ids_in_use.node", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:database.",
        objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("*vm.file.descriptors.count",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.changeUserPassword",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Timer for RAFT message processing. (counter, histogram)", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("--skip-relationship-properties",
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str12,
        "MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database." + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*vm.file.descriptors.count" + "'", str14,
        "MISSING VAL FOR KEY:*vm.file.descriptors.count");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.changeUserPassword" + "'",
        str15, "MISSING VAL FOR KEY:dbms.security.changeUserPassword");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)" + "'",
        str16, "MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:--skip-relationship-properties" + "'", str17,
        "MISSING VAL FOR KEY:--skip-relationship-properties");
  }

  @Test
  public void test6143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6143");
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
    java.lang.String str18 = io.github.onograph.I18N.format("node", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:NewLeaderBarrier",
        objArray12);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:node" + "'", str18,
        "MISSING VAL FOR KEY:node");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:NewLeaderBarrier" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:NewLeaderBarrier");
  }

  @Test
  public void test6144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6144");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("RelationshipQualifier");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6145");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6146");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("ccstate", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.connection_timeout", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("db.listLocks", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:raftBootstrap",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(".Database neo4j pools metrics",
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str12, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout" + "'", str13,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:db.listLocks" + "'",
        str14, "MISSING VAL FOR KEY:db.listLocks");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raftBootstrap" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raftBootstrap");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:.Database neo4j pools metrics" + "'", str17,
        "MISSING VAL FOR KEY:.Database neo4j pools metrics");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test6147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6147");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*db.query.execution*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6148");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)",
        objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format("frame_decoder", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.max_databases", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("readReplicaStoreIdReader", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("*vm.pause_time", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of Bolt connections currently being executed. (gauge)",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:thread-pool-executor", objArray15);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:frame_decoder" + "'", str21,
        "MISSING VAL FOR KEY:frame_decoder");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:readReplicaStoreIdReader" + "'", str23,
        "MISSING VAL FOR KEY:readReplicaStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:*vm.pause_time" + "'", str24,
        "MISSING VAL FOR KEY:*vm.pause_time");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of Bolt connections currently being executed. (gauge)"
            + "'", str25,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of Bolt connections currently being executed. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:thread-pool-executor"
            + "'", str26, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:thread-pool-executor");
  }

  @Test
  public void test6149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6149");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("runtime", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:runtime" + "'", str2,
        "MISSING VAL FOR KEY:runtime");
  }

  @Test
  public void test6150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6150");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format(
        "Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ",
        objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of different relationship types stored in the database. (gauge)",
        objArray5);
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
            + "MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery "
            + "'", str8,
        "MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:" + "'", str9,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)"
            + "'", str10,
        "MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)");
  }

  @Test
  public void test6151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6151");
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
    java.lang.String str19 = io.github.onograph.I18N.format("false", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.graphite.interval",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "The total number of exceptions seen during the eviction process in the page cache. (counter)",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.load_balancing.plugin", objArray13);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:X.509",
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str19,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.graphite.interval" + "'", str20,
        "MISSING VAL FOR KEY:metrics.graphite.interval");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.load_balancing.plugin" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.load_balancing.plugin");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:X.509" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:X.509");
  }

  @Test
  public void test6152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6152");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("writable", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("--additional-config", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("addresses", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:suspended",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.jmx.enabled", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("--delete-nodes-with-labels",
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:suspended" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:suspended");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.jmx.enabled"
            + "'", str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.jmx.enabled");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:--delete-nodes-with-labels" + "'", str18,
        "MISSING VAL FOR KEY:--delete-nodes-with-labels");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test6153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6153");
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
    java.lang.String str18 = io.github.onograph.I18N.format("LabelQualifierAll", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("vm.memory.buffer.*", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Maximum timeout for cluster status request execution", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:enc_res_database_id", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Clears authentication and authorization cache.",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:execute_boosted_from_config" + "'", str17,
        "MISSING VAL FOR KEY:execute_boosted_from_config");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str18,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:vm.memory.buffer.*" + "'", str19,
        "MISSING VAL FOR KEY:vm.memory.buffer.*");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str20,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_database_id"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_database_id");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Clears authentication and authorization cache."
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Clears authentication and authorization cache.");
  }

  @Test
  public void test6154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6154");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("volumetric", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.property_level.enabled",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The highest transaction id that has been pulled in the last pull updates by this instance. (counter)",
        objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format("--fallback-to-full", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("fabric.driver.logging.leaked_sessions",
        objArray8);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:volumetric" + "'",
        str11, "MISSING VAL FOR KEY:volumetric");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.property_level.enabled" + "'",
        str12, "MISSING VAL FOR KEY:dbms.security.property_level.enabled");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)"
            + "'", str13,
        "MISSING VAL FOR KEY:The highest transaction id that has been pulled in the last pull updates by this instance. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:--fallback-to-full" + "'", str14,
        "MISSING VAL FOR KEY:--fallback-to-full");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:active" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.logging.leaked_sessions" + "'",
        str16, "MISSING VAL FOR KEY:fabric.driver.logging.leaked_sessions");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test6155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6155");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies.",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:.metrics",
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies."
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies.");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only"
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Deprecated, use dbms.databases.default_to_read_only");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.metrics" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.metrics");
  }

  @Test
  public void test6156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6156");
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
    java.lang.String str24 = io.github.onograph.I18N.format(
        "The total time, in milliseconds, spent in check pointing so far. (counter)", objArray14);
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
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)"
            + "'", str24,
        "MISSING VAL FOR KEY:The total time, in milliseconds, spent in check pointing so far. (counter)");
  }

  @Test
  public void test6157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6157");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("enc_res_tx_pull", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:connections_closed", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("*ids_in_use.node", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str14,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:enc_res_tx_pull" + "'", str16,
        "MISSING VAL FOR KEY:enc_res_tx_pull");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace"
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:connections_closed" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.node" + "'", str19,
        "MISSING VAL FOR KEY:*ids_in_use.node");
  }

  @Test
  public void test6158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6158");
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
        "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("", objArray13);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str21,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test6159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6159");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("function", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("admin.ini", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "List the job groups that are active in the database internal job scheduler.", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("raft_message_composer", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the heap memory usage. Deprecated - use metrics.filter instead.",
        objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:pause", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format("backup-location", objArray9);
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str10,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str11, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:admin.ini" + "'",
        str12, "MISSING VAL FOR KEY:admin.ini");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler."
            + "'", str13,
        "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written."
            + "'", str14,
        "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:raft_message_composer" + "'", str15,
        "MISSING VAL FOR KEY:raft_message_composer");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the heap memory usage. Deprecated - use metrics.filter instead."
            + "'", str16,
        "MISSING VAL FOR KEY:Enable reporting metrics about the heap memory usage. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:pause" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:pause");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:backup-location" + "'", str18,
        "MISSING VAL FOR KEY:backup-location");
  }

  @Test
  public void test6160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6160");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A comma separated list of labels to ignore.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6161");
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
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)",
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str20,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test6162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6162");
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
    java.lang.String str18 = io.github.onograph.I18N.format("LabelQualifierAll", objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.upgradeDetails", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:SCHEMA", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str18,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms.upgradeDetails" + "'", str19,
        "MISSING VAL FOR KEY:dbms.upgradeDetails");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:SCHEMA" + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test6163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6163");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:rotation_events");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test6164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6164");
    }
    java.lang.Object[] objArray14 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str15 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray14);
    java.lang.String str16 = io.github.onograph.I18N.format("true", objArray14);
    java.lang.String str17 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray14);
    java.lang.String str18 = io.github.onograph.I18N.format("vm.memory.pool.*", objArray14);
    java.lang.String str19 = io.github.onograph.I18N.format("BatchSize", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("backup-server", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("--to-format", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("hnd_res_tx_fin", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("", objArray14);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str17,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str18,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str19, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:backup-server" + "'", str20,
        "MISSING VAL FOR KEY:backup-server");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:--to-format" + "'",
        str21, "MISSING VAL FOR KEY:--to-format");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names."
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:hnd_res_tx_fin" + "'", str23,
        "MISSING VAL FOR KEY:hnd_res_tx_fin");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:" + "'", str24,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test6165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6165");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The number of currently active read transactions. (gauge)",
        objArray7);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The number of currently active read transactions. (gauge)"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The number of currently active read transactions. (gauge)");
  }

  @Test
  public void test6166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6166");
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
    java.lang.String str23 = io.github.onograph.I18N.format(
        "Time between scanning the cluster to refresh current server's view of topology",
        objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format("metrics.neo4j.logrotation.enabled",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format("hnd_get_all_database_ids", objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:driver.ssl_enabled", objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format("--delete-nodes-with-labels",
        objArray16);
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
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology"
            + "'", str23,
        "MISSING VAL FOR KEY:Time between scanning the cluster to refresh current server's view of topology");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled" + "'",
        str24, "MISSING VAL FOR KEY:metrics.neo4j.logrotation.enabled");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:hnd_get_all_database_ids" + "'", str25,
        "MISSING VAL FOR KEY:hnd_get_all_database_ids");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str26,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.ssl_enabled" + "'",
        str27, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:driver.ssl_enabled");
    org.junit.Assert.assertEquals(
        "'" + str28 + "' != '" + "MISSING VAL FOR KEY:--delete-nodes-with-labels" + "'", str28,
        "MISSING VAL FOR KEY:--delete-nodes-with-labels");
  }

  @Test
  public void test6167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6167");
    }
    java.lang.Object[] objArray15 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str16 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray15);
    java.lang.String str17 = io.github.onograph.I18N.format("writable", objArray15);
    java.lang.String str18 = io.github.onograph.I18N.format("--additional-config", objArray15);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.connect_randomly_to_server_group", objArray15);
    java.lang.String str20 = io.github.onograph.I18N.format("RelationshipType", objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format("dbms.", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("store.size", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:initial_members",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster convergence. (gauge)",
        objArray15);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group" + "'", str19,
        "MISSING VAL FOR KEY:causal_clustering.connect_randomly_to_server_group");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:RelationshipType" + "'", str20,
        "MISSING VAL FOR KEY:RelationshipType");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms." + "'", str21,
        "MISSING VAL FOR KEY:dbms.");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:store.size" + "'",
        str22, "MISSING VAL FOR KEY:store.size");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause"
            + "'", str24,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms"
            + "'", str25, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster convergence. (gauge)"
            + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Discovery cluster convergence. (gauge)");
  }

  @Test
  public void test6168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest12.test6168");
    }
    java.lang.Object[] objArray19 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str20 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray19);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray19);
    java.lang.String str22 = io.github.onograph.I18N.format("read", objArray19);
    java.lang.String str23 = io.github.onograph.I18N.format("invisible", objArray19);
    java.lang.String str24 = io.github.onograph.I18N.format("dec_dispatch", objArray19);
    java.lang.String str25 = io.github.onograph.I18N.format("PropertyKey", objArray19);
    java.lang.String str26 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray19);
    java.lang.String str27 = io.github.onograph.I18N.format("causal_clustering.refuse_to_be_leader",
        objArray19);
    java.lang.String str28 = io.github.onograph.I18N.format("DEFAULT", objArray19);
    java.lang.String str29 = io.github.onograph.I18N.format(
        "Maximum amount of lag accepted for a new follower to join the Raft group", objArray19);
    java.lang.String str30 = io.github.onograph.I18N.format("prometheus", objArray19);
    java.lang.String str31 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT", objArray19);
    java.lang.String str32 = io.github.onograph.I18N.format("job-", objArray19);
    java.lang.String str33 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.cluster_domain", objArray19);
    java.lang.String str34 = io.github.onograph.I18N.format("enc_file_chunk", objArray19);
    java.lang.Class<?> wildcardClass35 = objArray19.getClass();
    org.junit.Assert.assertNotNull(objArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str20,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str21, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str22,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str23, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str24, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str25, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str26,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str27, "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MISSING VAL FOR KEY:DEFAULT" + "'",
        str28, "MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertEquals("'" + str29 + "' != '"
            + "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group"
            + "'", str29,
        "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group");
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MISSING VAL FOR KEY:prometheus" + "'",
        str30, "MISSING VAL FOR KEY:prometheus");
    org.junit.Assert.assertEquals("'" + str31 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT" + "'", str31,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MISSING VAL FOR KEY:job-" + "'", str32,
        "MISSING VAL FOR KEY:job-");
    org.junit.Assert.assertEquals(
        "'" + str33 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.kubernetes.cluster_domain"
            + "'", str33, "MISSING VAL FOR KEY:causal_clustering.kubernetes.cluster_domain");
    org.junit.Assert.assertEquals(
        "'" + str34 + "' != '" + "MISSING VAL FOR KEY:enc_file_chunk" + "'", str34,
        "MISSING VAL FOR KEY:enc_file_chunk");
    org.junit.Assert.assertNotNull(wildcardClass35);
  }
}

