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
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___COMMAND__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Removes and archives all cluster state, so that the instance can rebind to a cluster."
            + "'", str0,
        "Removes and archives all cluster state, so that the instance can rebind to a cluster.");
  }

  @Test
  public void test1002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1002");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COMMAND_GET_SERVER_ID_IMPL___COMMAND__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Display ServerId of instance. The ServerId can be used to identify this server in cypher commands."
            + "'", str0,
        "Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.");
  }

  @Test
  public void test1003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1003");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_STCAFA_DURATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Maximum backoff timeout for store copy requests" + "'", str0,
        "Maximum backoff timeout for store copy requests");
  }

  @Test
  public void test1004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1004");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_RESOLUTION_RETRY_INTERVAL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.discovery_resolution_retry_interval" + "'", str0,
        "causal_clustering.discovery_resolution_retry_interval");
  }

  @Test
  public void test1005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1005");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bolt.*" + "'", str0, "bolt.*");
  }

  @Test
  public void test1006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1006");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLIENT_PRIVATE_KEY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "client-private-key" + "'", str0,
        "client-private-key");
  }

  @Test
  public void test1007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1007");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VM__MEMORY__BUFFER___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.memory.buffer.*" + "'", str0,
        "vm.memory.buffer.*");
  }

  @Test
  public void test1008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1008");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_GARBAGE_COLLECTION_IMPL___DOCUMENTED_GC_LTM_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Accumulated garbage collection time in milliseconds. (counter)"
            + "'", str0, "Accumulated garbage collection time in milliseconds. (counter)");
  }

  @Test
  public void test1009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1009");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_USTRO_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used."
            + "'", str0,
        "Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
  }

  @Test
  public void test1010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1010");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_POOL_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".JVM memory pools metrics." + "'", str0,
        ".JVM memory pools metrics.");
  }

  @Test
  public void test1011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1011");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COMMAND_READER_FACTORY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "COMMAND_READER_FACTORY" + "'", str0,
        "COMMAND_READER_FACTORY");
  }

  @Test
  public void test1012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1012");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__USER_SEARCH_FILTER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authorization.user_search_filter" + "'", str0,
        "dbms.security.ldap.authorization.user_search_filter");
  }

  @Test
  public void test1013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1013");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__BOLT__MESSAGES__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.bolt.messages.enabled" + "'",
        str0, "metrics.bolt.messages.enabled");
  }

  @Test
  public void test1014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1014");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PRS_TOKEN_NAME_PROPERTY_D_T_O__PARAM_LABEL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "<relationship.property>[,<relationship.property>...]" + "'", str0,
        "<relationship.property>[,<relationship.property>...]");
  }

  @Test
  public void test1015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1015");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DESIGNATED_SEEDER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "designated_seeder" + "'", str0,
        "designated_seeder");
  }

  @Test
  public void test1016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1016");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__IDLE_CHECK_INTERVAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.driver.idle_check_interval" + "'",
        str0, "fabric.driver.idle_check_interval");
  }

  @Test
  public void test1017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1017");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.IS_LEADER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "is_leader" + "'", str0, "is_leader");
  }

  @Test
  public void test1018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1018");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LERN_LEADERSHIP_BALANCING_APPROACH_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Which strategy to use when transferring database leaderships around a cluster. This can be one of `equal_balancing` or `no_balancing`. `equal_balancing` automatically ensures that each Core server holds the leader role for an equal number of databases.`no_balancing` prevents any automatic balancing of the leader role.Note that if a `leadership_priority_group` is specified for a given database, the value of this setting will be ignored for that database."
            + "'", str0,
        "Which strategy to use when transferring database leaderships around a cluster. This can be one of `equal_balancing` or `no_balancing`. `equal_balancing` automatically ensures that each Core server holds the leader role for an equal number of databases.`no_balancing` prevents any automatic balancing of the leader role.Note that if a `leadership_priority_group` is specified for a given database, the value of this setting will be ignored for that database.");
  }

  @Test
  public void test1019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1019");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.OVERVIEW;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview" + "'", str0, "overview");
  }

  @Test
  public void test1020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1020");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_ONLY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "read-only" + "'", str0, "read-only");
  }

  @Test
  public void test1021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1021");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOUBIRES_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled."
            + "'", str0,
        "A list of attribute names on a user object that contains groups to be used for mapping to roles when LDAP authorization is enabled.");
  }

  @Test
  public void test1022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1022");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__MAX_LIFETIME;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "fabric.driver.connection.max_lifetime" + "'", str0,
        "fabric.driver.connection.max_lifetime");
  }

  @Test
  public void test1023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1023");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BYTES_READ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bytes_read" + "'", str0, "bytes_read");
  }

  @Test
  public void test1024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1024");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA_TRANSACTION_APPLIER_MAX_QUEUE_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.read_replica_transaction_applier_max_queue_size"
            + "'", str0, "causal_clustering.read_replica_transaction_applier_max_queue_size");
  }

  @Test
  public void test1025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1025");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TRAVERSE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "traverse" + "'", str0, "traverse");
  }

  @Test
  public void test1026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1026");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_HIT_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of page hits happened in the page cache. (counter)" + "'", str0,
        "The total number of page hits happened in the page cache. (counter)");
  }

  @Test
  public void test1027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1027");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__MIN_STD_DEVIATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.cluster.failure-detector.min-std-deviation" + "'", str0,
        "akka.cluster.failure-detector.min-std-deviation");
  }

  @Test
  public void test1028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1028");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.POLICY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "policy" + "'", str0, "policy");
  }

  @Test
  public void test1029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1029");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CC_RR_TOPOLOGY_ACTOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-rr-topology-actor" + "'", str0,
        "cc-rr-topology-actor");
  }

  @Test
  public void test1030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1030");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P___DBMS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/dbms" + "'", str0, "/dbms");
  }

  @Test
  public void test1031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1031");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_RES_DATABASE_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_res_database_id" + "'", str0,
        "enc_res_database_id");
  }

  @Test
  public void test1032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1032");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDEM_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The timeout for an LDAP read request (i.e. search). If the LDAP server does not respond within the given time the request will be aborted. A value of 0 means wait for a response indefinitely."
            + "'", str0,
        "The timeout for an LDAP read request (i.e. search). If the LDAP server does not respond within the given time the request will be aborted. A value of 0 means wait for a response indefinitely.");
  }

  @Test
  public void test1033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1033");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CHECK_POINT___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "check_point.*" + "'", str0,
        "check_point.*");
  }

  @Test
  public void test1034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1034");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__STREAM__BUFFER__SIZE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.stream.buffer.size" + "'", str0,
        "fabric.stream.buffer.size");
  }

  @Test
  public void test1035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1035");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_LERSIT_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The time limit within which a leadership transfer request should be completed, otherwise the leader will resume accepting writes."
            + "'", str0,
        "The time limit within which a leadership transfer request should be completed, otherwise the leader will resume accepting writes.");
  }

  @Test
  public void test1036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1036");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_USERS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.listUsers" + "'", str0,
        "dbms.security.listUsers");
  }

  @Test
  public void test1037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1037");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CC_CORE_RESTART_NEEDED_LISTENER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-core-restart-needed-listener" + "'",
        str0, "cc-core-restart-needed-listener");
  }

  @Test
  public void test1038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1038");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__DOWN_UNREACHABLE_ON_NEW_JOINER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.down_unreachable_on_new_joiner"
            + "'", str0, "causal_clustering.middleware.akka.down_unreachable_on_new_joiner");
  }

  @Test
  public void test1039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1039");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_MERSAE_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable metrics. Setting this to `false` will to turn off all metrics." + "'", str0,
        "Enable metrics. Setting this to `false` will to turn off all metrics.");
  }

  @Test
  public void test1040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1040");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PER_DB_LEADER_NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "per-db-leader-name" + "'", str0,
        "per-db-leader-name");
  }

  @Test
  public void test1041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1041");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.OUTBOUND2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "OUTBOUND" + "'", str0, "OUTBOUND");
  }

  @Test
  public void test1042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1042");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTIEI_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured."
            + "'", str0,
        "Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.");
  }

  @Test
  public void test1043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1043");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COMMITTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "committed" + "'", str0, "committed");
  }

  @Test
  public void test1044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1044");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_RES_METADATA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_res_metadata" + "'", str0,
        "enc_res_metadata");
  }

  @Test
  public void test1045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1045");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.QUERY_EXECUTION_MONITOR_METRICS_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Query execution metrics" + "'", str0,
        ".Query execution metrics");
  }

  @Test
  public void test1046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1046");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.INVISIBLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invisible" + "'", str0, "invisible");
  }

  @Test
  public void test1047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1047");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__BIND__BIND_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.remote.artery.bind.bind-timeout" + "'", str0,
        "akka.remote.artery.bind.bind-timeout");
  }

  @Test
  public void test1048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1048");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKIM_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Timeout for Akka socket binding" + "'",
        str0, "Timeout for Akka socket binding");
  }

  @Test
  public void test1049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1049");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.EVENT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "event" + "'", str0, "event");
  }

  @Test
  public void test1050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1050");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__MIN_STD_DEVIATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "causal_clustering.middleware.akka.failure_detector.min_std_deviation" + "'", str0,
        "causal_clustering.middleware.akka.failure_detector.min_std_deviation");
  }

  @Test
  public void test1051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1051");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft" + "'", str0, "raft");
  }

  @Test
  public void test1052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1052");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_IPT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Create a new user." + "'", str0,
        "Create a new user.");
  }

  @Test
  public void test1053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1053");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_LISTEN_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.discovery_listen_address" + "'", str0,
        "causal_clustering.discovery_listen_address");
  }

  @Test
  public void test1054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1054");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_REELR_BOOLEAN;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Deprecated, use dbms.databases.default_to_read_only" + "'", str0,
        "Deprecated, use dbms.databases.default_to_read_only");
  }

  @Test
  public void test1055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1055");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRENIOE_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Maximum amount of time spent attempting to acquire a connection from the connection pool.\nThis timeout only kicks in when all existing connections are being used and no new connections can be created because maximum connection pool size has been reached.\nError is raised when connection can't be acquired within configured time.\nNegative values are allowed and result in unlimited acquisition timeout. Value of 0 is allowed and results in no timeout and immediate failure when connection is unavailable"
            + "'", str0,
        "Maximum amount of time spent attempting to acquire a connection from the connection pool.\nThis timeout only kicks in when all existing connections are being used and no new connections can be created because maximum connection pool size has been reached.\nError is raised when connection can't be acquired within configured time.\nNegative values are allowed and result in unlimited acquisition timeout. Value of 0 is allowed and results in no timeout and immediate failure when connection is unavailable");
  }

  @Test
  public void test1056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1056");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNT_PRCSG_LTM_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The accumulated time worker threads have spent processing messages. (counter)" + "'",
        str0, "The accumulated time worker threads have spent processing messages. (counter)");
  }

  @Test
  public void test1057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1057");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_MAMFB_LONG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "The maximum number of databases." + "'",
        str0, "The maximum number of databases.");
  }

  @Test
  public void test1058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1058");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LABEL2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "label" + "'", str0, "label");
  }

  @Test
  public void test1059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1059");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ROLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "role" + "'", str0, "role");
  }

  @Test
  public void test1060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1060");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LEASE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lease" + "'", str0, "lease");
  }

  @Test
  public void test1061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1061");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_SNP_TOKEN_NAME_PROPERTY_D_T_O__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A comma separated list of property keys to ignore for nodes with the specified label. Can not be combined with --skip-properties or --keep-only-node-properties."
            + "'", str0,
        "A comma separated list of property keys to ignore for nodes with the specified label. Can not be combined with --skip-properties or --keep-only-node-properties.");
  }

  @Test
  public void test1062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1062");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Database transaction metrics" + "'",
        str0, ".Database transaction metrics");
  }

  @Test
  public void test1063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1063");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED_CON_ND_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of nodes stored in the database. (gauge)" + "'",
        str0, "The total number of nodes stored in the database. (gauge)");
  }

  @Test
  public void test1064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1064");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__SECRET;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
  }

  @Test
  public void test1065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1065");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_REQ_DATABASE_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_req_database_id" + "'", str0,
        "enc_req_database_id");
  }

  @Test
  public void test1066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1066");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SCOPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SCOPE" + "'", str0, "SCOPE");
  }

  @Test
  public void test1067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1067");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P_APPLICATION__JSON;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/json" + "'", str0,
        "application/json");
  }

  @Test
  public void test1068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1068");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_METADATA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_metadata" + "'", str0,
        "hnd_req_metadata");
  }

  @Test
  public void test1069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1069");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRT_PATH__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>" + "'", str0, "<path>");
  }

  @Test
  public void test1070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1070");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VM__GC___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.gc.*" + "'", str0, "vm.gc.*");
  }

  @Test
  public void test1071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1071");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_FILE_HEADER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_file_header" + "'", str0,
        "enc_file_header");
  }

  @Test
  public void test1072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1072");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MEMBERS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "members" + "'", str0, "members");
  }

  @Test
  public void test1073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1073");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MINIMUM_CORE_CLUSTER_SIZE_AT_FORMATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.minimum_core_cluster_size_at_formation" + "'",
        str0, "causal_clustering.minimum_core_cluster_size_at_formation");
  }

  @Test
  public void test1074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1074");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._FAIL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-fail" + "'", str0, "-fail");
  }

  @Test
  public void test1075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1075");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.REPLAN_WAIT_TIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "replan_wait_time" + "'", str0,
        "replan_wait_time");
  }

  @Test
  public void test1076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1076");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_APE_IDX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Append index of the RAFT log. (gauge)" + "'", str0,
        "Append index of the RAFT log. (gauge)");
  }

  @Test
  public void test1077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1077");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.REPLAN_EVENTS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "replan_events" + "'", str0,
        "replan_events");
  }

  @Test
  public void test1078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1078");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAMEI_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str0,
        "Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
  }

  @Test
  public void test1079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1079");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DROP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop" + "'", str0, "drop");
  }

  @Test
  public void test1080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1080");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_CAUSAL_CLUSTERING__CORE__REPLICATION_ATTEMPT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "*causal_clustering.core.replication_attempt" + "'", str0,
        "*causal_clustering.core.replication_attempt");
  }

  @Test
  public void test1081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1081");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "causal_clustering.discovery_type" + "'",
        str0, "causal_clustering.discovery_type");
  }

  @Test
  public void test1082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1082");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TOTAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "total" + "'", str0, "total");
  }

  @Test
  public void test1083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1083");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__DIRECTORIES__CLUSTER_STATE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.directories.cluster_state" + "'",
        str0, "dbms.directories.cluster_state");
  }

  @Test
  public void test1084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1084");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PUBLIC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PUBLIC" + "'", str0, "PUBLIC");
  }

  @Test
  public void test1085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1085");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MEMORY_POOLS_ADAPTER_NEO_STACK_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Global neo4j pools metrics" + "'", str0,
        ".Global neo4j pools metrics");
  }

  @Test
  public void test1086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1086");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MIUETZUE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The minimum size of the dynamically adjusted voting set (which only core members may be a part of). Adjustments to the voting set happen automatically as the availability of core members changes, due to explicit operations such as starting or stopping a member, or unintended issues such as network partitions. Note that this dynamic scaling of the voting set is generally desirable as under some circumstances it can increase the number of instance failures which may be tolerated. A majority of the voting set must be available before voting in or out members."
            + "'", str0,
        "The minimum size of the dynamically adjusted voting set (which only core members may be a part of). Adjustments to the voting set happen automatically as the availability of core members changes, due to explicit operations such as starting or stopping a member, or unintended issues such as network partitions. Note that this dynamic scaling of the voting set is generally desirable as under some circumstances it can increase the number of instance failures which may be tolerated. A majority of the voting set must be available before voting in or out members.");
  }

  @Test
  public void test1087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1087");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_TRANSACTION__COMMITTED_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*transaction.committed*" + "'", str0,
        "*transaction.committed*");
  }

  @Test
  public void test1088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1088");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bolt" + "'", str0, "bolt");
  }

  @Test
  public void test1089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1089");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION___DATABASE_CONTEXT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "List all functions in the DBMS." + "'",
        str0, "List all functions in the DBMS.");
  }

  @Test
  public void test1090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1090");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LOG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log" + "'", str0, "log");
  }

  @Test
  public void test1091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1091");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CLUSTER__MIN_NR_OF_MEMBERS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.cluster.min_nr_of_members" + "'",
        str0, "causal_clustering.middleware.akka.cluster.min_nr_of_members");
  }

  @Test
  public void test1092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1092");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_SERVER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "backup-server" + "'", str0,
        "backup-server");
  }

  @Test
  public void test1093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1093");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_ENTERPRISE_INTERAL_IMPL___DESCRIPTION__SETTING_LDUIONOL_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Set to true if connection pooling should be used for authorization searches using the system account."
            + "'", str0,
        "Set to true if connection pooling should be used for authorization searches using the system account.");
  }

  @Test
  public void test1094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1094");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PRIVILEGE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Privilege" + "'", str0, "Privilege");
  }

  @Test
  public void test1095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1095");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_SHODA_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "If there is a Database Management System Panic (an irrecoverable error) should the neo4j process shut down or continue running. Following a DbMS panic it is likely that a significant amount of functionality will be lost. Recovering full functionality will require a Neo4j restart"
            + "'", str0,
        "If there is a Database Management System Panic (an irrecoverable error) should the neo4j process shut down or continue running. Following a DbMS panic it is likely that a significant amount of functionality will be lost. Recovering full functionality will require a Neo4j restart");
  }

  @Test
  public void test1096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1096");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNT_QUU_LTM_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The accumulated time messages have spent waiting for a worker thread. (counter)" + "'",
        str0, "The accumulated time messages have spent waiting for a worker thread. (counter)");
  }

  @Test
  public void test1097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1097");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STORE__SIZE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store.size" + "'", str0, "store.size");
  }

  @Test
  public void test1098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1098");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CC_CORE_RESTART_NEEDED_LISTENER_TIMER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "cc-core-restart-needed-listener-timer" + "'", str0,
        "cc-core-restart-needed-listener-timer");
  }

  @Test
  public void test1099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1099");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PASSWORD_CHANGE_REQUIRED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "passwordChangeRequired" + "'", str0,
        "passwordChangeRequired");
  }

  @Test
  public void test1100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1100");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MATCH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "match" + "'", str0, "match");
  }

  @Test
  public void test1101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1101");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DATABASE__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.database.name" + "'", str0,
        "fabric.database.name");
  }

  @Test
  public void test1102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1102");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_RS_STRING__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "A comma separated list of relationships to ignore." + "'", str0,
        "A comma separated list of relationships to ignore.");
  }

  @Test
  public void test1103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1103");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LOGGING_DISPATCHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logging-dispatcher" + "'", str0,
        "logging-dispatcher");
  }

  @Test
  public void test1104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1104");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP___DESCRIPTION__SETTING_INMLUA_TX_FLOW_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. "
            + "'", str0,
        "Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. ");
  }

  @Test
  public void test1105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1105");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "List" + "'", str0, "List");
  }

  @Test
  public void test1106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1106");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWND_STRING__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<label>[,<label>...]" + "'", str0,
        "<label>[,<label>...]");
  }

  @Test
  public void test1107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1107");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COMMIT_INDEX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "commit_index" + "'", str0,
        "commit_index");
  }

  @Test
  public void test1108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1108");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MESSAGE_GATE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "message_gate" + "'", str0,
        "message_gate");
  }

  @Test
  public void test1109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1109");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_STSIGTE_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Minimum time interval after last rotation of the security log before it may be rotated again."
            + "'", str0,
        "Minimum time interval after last rotation of the security log before it may be rotated again.");
  }

  @Test
  public void test1110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1110");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CHECKPOINT_COUNTER_ADAPTER___DOCUMENTED_CK_PTX_EVXS_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of check point events executed so far. (counter)"
            + "'", str0, "The total number of check point events executed so far. (counter)");
  }

  @Test
  public void test1111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1111");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__IS_FRE__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "If an existing database should be replaced." + "'", str0,
        "If an existing database should be replaced.");
  }

  @Test
  public void test1112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1112");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STARTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "started" + "'", str0, "started");
  }

  @Test
  public void test1113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1113");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DISPATCHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Dispatcher" + "'", str0, "Dispatcher");
  }

  @Test
  public void test1114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1114");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CREDENTIALS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
  }

  @Test
  public void test1115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1115");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT__LOG__;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft.log." + "'", str0, "raft.log.");
  }

  @Test
  public void test1116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1116");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__POOL__IDLE_TEST;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "fabric.driver.connection.pool.idle_test" + "'", str0,
        "fabric.driver.connection.pool.idle_test");
  }

  @Test
  public void test1117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1117");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__R__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.listUsersForRole" + "'",
        str0, "dbms.security.listUsersForRole");
  }

  @Test
  public void test1118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1118");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P___SERVER__CLUSTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/server/causalclustering" + "'", str0,
        "/server/causalclustering");
  }

  @Test
  public void test1119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1119");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEEIGL_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about Neo4j check pointing; when it occurs and how much time it takes to complete. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about Neo4j check pointing; when it occurs and how much time it takes to complete. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test1120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1120");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_DRTO;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "duration" + "'", str0, "duration");
  }

  @Test
  public void test1121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1121");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_RONSN_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The time to live (TTL) of a routing table for fabric routing group." + "'", str0,
        "The time to live (TTL) of a routing table for fabric routing group.");
  }

  @Test
  public void test1122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1122");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__GRAPHITE__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.graphite.enabled" + "'", str0,
        "metrics.graphite.enabled");
  }

  @Test
  public void test1123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1123");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
  }

  @Test
  public void test1124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1124");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__FROM_PATHS__ARITY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "1" + "'", str0, "1");
  }

  @Test
  public void test1125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1125");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TIMEOUT_SECONDS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "timeoutSeconds" + "'", str0,
        "timeoutSeconds");
  }

  @Test
  public void test1126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1126");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LOG___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log.*" + "'", str0, "log.*");
  }

  @Test
  public void test1127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1127");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.APPLICATION_PROTOCOL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "applicationProtocol" + "'", str0,
        "applicationProtocol");
  }

  @Test
  public void test1128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1128");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__HANDSHAKE_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.handshake_timeout" + "'", str0,
        "causal_clustering.handshake_timeout");
  }

  @Test
  public void test1129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1129");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PAGE_HITS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pageHits" + "'", str0, "pageHits");
  }

  @Test
  public void test1130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1130");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Administration command: ALTER CURRENT USER SET PASSWORD" + "'",
        str0, "Administration command: ALTER CURRENT USER SET PASSWORD");
  }

  @Test
  public void test1131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1131");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNXS_RUNG_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of Bolt connections currently being executed. (gauge)" + "'", str0,
        "The total number of Bolt connections currently being executed. (gauge)");
  }

  @Test
  public void test1132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1132");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWND_STRING__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--delete-nodes-with-labels" + "'", str0,
        "--delete-nodes-with-labels");
  }

  @Test
  public void test1133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1133");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STMNLBS_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The maximum number of operations to be batched during applications of operations in the state machines"
            + "'", str0,
        "The maximum number of operations to be batched during applications of operations in the state machines");
  }

  @Test
  public void test1134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1134");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_TRANSACTION_LOG_ADAPTER___DOCUMENTED_LG_ROTX_TTOT_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The duration, in milliseconds, of the last log rotation event. (gauge)" + "'", str0,
        "The duration, in milliseconds, of the last log rotation event. (gauge)");
  }

  @Test
  public void test1135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1135");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PEAK_CONCURRENT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "peak_concurrent" + "'", str0,
        "peak_concurrent");
  }

  @Test
  public void test1136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1136");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.QUERY_LOGGING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "query-logging" + "'", str0,
        "query-logging");
  }

  @Test
  public void test1137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1137");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_RES_TX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_res_tx" + "'", str0, "hnd_res_tx");
  }

  @Test
  public void test1138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1138");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__POOL__MAX_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "fabric.driver.connection.pool.max_size" + "'", str0,
        "fabric.driver.connection.pool.max_size");
  }

  @Test
  public void test1139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1139");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__DYNAMIC__SETTING__WHITELIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.dynamic.setting.whitelist" + "'",
        str0, "dbms.dynamic.setting.whitelist");
  }

  @Test
  public void test1140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1140");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.REPLICATED_TOKEN_HOLDER_CREATOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "replicatedTokenHolderCreator" + "'",
        str0, "replicatedTokenHolderCreator");
  }

  @Test
  public void test1141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1141");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_BOLT__MESSAGES_RECEIVED_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*bolt.messages_received*" + "'", str0,
        "*bolt.messages_received*");
  }

  @Test
  public void test1142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1142");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__PROTOCOL_IMPLEMENTATIONS__COMPRESSION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.protocol_implementations.compression" + "'",
        str0, "causal_clustering.protocol_implementations.compression");
  }

  @Test
  public void test1143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1143");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO4J__CONF;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "neo4j.conf" + "'", str0, "neo4j.conf");
  }

  @Test
  public void test1144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1144");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.UNAVAILABLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unavailable" + "'", str0, "unavailable");
  }

  @Test
  public void test1145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1145");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PRS_TOKEN_NAME_PROPERTY_D_T_O__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A comma separated list of property keys to ignore for relationships with the specified type. Can not be combined with --skip-properties or --keep-only-relationship-properties."
            + "'", str0,
        "A comma separated list of property keys to ignore for relationships with the specified type. Can not be combined with --skip-properties or --keep-only-relationship-properties.");
  }

  @Test
  public void test1146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1146");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__MAX_DATABASES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.max_databases" + "'", str0,
        "dbms.max_databases");
  }

  @Test
  public void test1147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1147");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.REPLICATED_DATA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "replicated_data" + "'", str0,
        "replicated_data");
  }

  @Test
  public void test1148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1148");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.INIT_SERVER_HANDLER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "init_server_handler" + "'", str0,
        "init_server_handler");
  }

  @Test
  public void test1149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1149");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.INBOUND2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "INBOUND" + "'", str0, "INBOUND");
  }

  @Test
  public void test1150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1150");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ABSTRACT_MULTI_GDB_SERVICE___PATH___EXCEPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "writable" + "'", str0, "writable");
  }

  @Test
  public void test1151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1151");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VM__PAUSE_TIME___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.pause_time.*" + "'", str0,
        "vm.pause_time.*");
  }

  @Test
  public void test1152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1152");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_THREAD_M_X_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".JVM threads metrics." + "'", str0,
        ".JVM threads metrics.");
  }

  @Test
  public void test1153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1153");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.URI;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "uri" + "'", str0, "uri");
  }

  @Test
  public void test1154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1154");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOUOP_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----"
            + "'", str0,
        "An authorization mapping from LDAP group names to Neo4j role names. The map should be formatted as a semicolon separated list of key-value pairs, where the key is the LDAP group name and the value is a comma separated list of corresponding role names. For example: group1=role1;group2=role2;group3=role3,role4,role5\nYou could also use whitespaces and quotes around group names to make this mapping more readable, for example: \n----\n+dbms.security.ldap.authorization.group_to_role_mapping+=\\\n         \"cn=Neo4j Read Only,cn=users,dc=example,dc=com\"      = reader;    \\\n         \"cn=Neo4j Read-Write,cn=users,dc=example,dc=com\"     = publisher; \\\n         \"cn=Neo4j Schema Manager,cn=users,dc=example,dc=com\" = architect; \\\n         \"cn=Neo4j Administrator,cn=users,dc=example,dc=com\"  = admin\n----");
  }

  @Test
  public void test1155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1155");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__A__NAME2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.setConfigValue" + "'", str0,
        "dbms.setConfigValue");
  }

  @Test
  public void test1156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1156");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___COMMAND__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare-restore" + "'", str0,
        "prepare-restore");
  }

  @Test
  public void test1157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1157");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCH_UP_CLIENT_INACTIVITY_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.catch_up_client_inactivity_timeout" + "'", str0,
        "causal_clustering.catch_up_client_inactivity_timeout");
  }

  @Test
  public void test1158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1158");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURES___PROCEDURE__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.createNodeKey" + "'", str0,
        "db.createNodeKey");
  }

  @Test
  public void test1159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1159");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLEDIT_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`."
            + "'", str0,
        "The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`.");
  }

  @Test
  public void test1160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1160");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCHUP___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "causal_clustering.catchup.*" + "'", str0,
        "causal_clustering.catchup.*");
  }

  @Test
  public void test1161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1161");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__DATABASE_NAME_PATTERN__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Name of the remote database to backup. Can contain * and ? for globbing." + "'", str0,
        "Name of the remote database to backup. Can contain * and ? for globbing.");
  }

  @Test
  public void test1162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1162");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEMOND_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test1163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1163");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__M__NAME2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.listLocks" + "'", str0,
        "db.listLocks");
  }

  @Test
  public void test1164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1164");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RANE_INTEGER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Maximum number of entries in the RAFT in-queue" + "'", str0,
        "Maximum number of entries in the RAFT in-queue");
  }

  @Test
  public void test1165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1165");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__ACQUISITION_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "driver.connection.pool.acquisition_timeout" + "'", str0,
        "driver.connection.pool.acquisition_timeout");
  }

  @Test
  public void test1166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1166");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TARGET_DIRECTORY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "targetDirectory" + "'", str0,
        "targetDirectory");
  }

  @Test
  public void test1167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1167");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY5;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Suspend the specified user." + "'", str0,
        "Suspend the specified user.");
  }

  @Test
  public void test1168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1168");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__ACTOR__ALLOW_JAVA_SERIALIZATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.actor.allow-java-serialization" + "'", str0,
        "akka.actor.allow-java-serialization");
  }

  @Test
  public void test1169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1169");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COUNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "count" + "'", str0, "count");
  }

  @Test
  public void test1170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1170");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_DAAUND_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test1171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1171");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "username" + "'", str0, "username");
  }

  @Test
  public void test1172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1172");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__CREATE_ROLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.createRole" + "'", str0,
        "dbms.security.createRole");
  }

  @Test
  public void test1173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1173");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_DYITHI_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist"
            + "'", str0,
        "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked. Deprecated, use dbms.dynamic.setting.allowlist");
  }

  @Test
  public void test1174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1174");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SUCCESSFUL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "successful" + "'", str0, "successful");
  }

  @Test
  public void test1175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1175");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_REPLICA_NODE_ADAPTER___DOCUMENTED_PUL_UPAS_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of pull requests made by this instance. (counter)"
            + "'", str0, "The total number of pull requests made by this instance. (counter)");
  }

  @Test
  public void test1176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1176");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__SSL_ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.ssl_enabled" + "'", str0,
        "driver.ssl_enabled");
  }

  @Test
  public void test1177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1177");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "causal_clustering.core.*" + "'", str0,
        "causal_clustering.core.*");
  }

  @Test
  public void test1178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1178");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENTRIES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "entries" + "'", str0, "entries");
  }

  @Test
  public void test1179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1179");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STORE_COPY_BACKOFF_MAX_WAIT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.store_copy_backoff_max_wait" + "'", str0,
        "causal_clustering.store_copy_backoff_max_wait");
  }

  @Test
  public void test1180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1180");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO4J__COUNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "neo4j.count" + "'", str0, "neo4j.count");
  }

  @Test
  public void test1181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1181");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_AURIOR_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A list of security authorization providers containing the users and roles. This can be any of the built-in `native` or `ldap` providers, or it can be an externally provided plugin, with a custom name prefixed by `plugin-`, i.e. `plugin-<AUTH_PROVIDER_NAME>`. They will be queried in the given order when login is attempted."
            + "'", str0,
        "A list of security authorization providers containing the users and roles. This can be any of the built-in `native` or `ldap` providers, or it can be an externally provided plugin, with a custom name prefixed by `plugin-`, i.e. `plugin-<AUTH_PROVIDER_NAME>`. They will be queried in the given order when login is attempted.");
  }

  @Test
  public void test1182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1182");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TPX_SUCS_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Raft Replication success count. (counter)" + "'", str0,
        "Raft Replication success count. (counter)");
  }

  @Test
  public void test1183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1183");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HANDSHAKE_SERVER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "handshake_server" + "'", str0,
        "handshake_server");
  }

  @Test
  public void test1184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1184");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNXS_OPN_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str0,
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
  }

  @Test
  public void test1185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1185");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SYSTEM;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "system" + "'", str0, "system");
  }

  @Test
  public void test1186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1186");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY6;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Activate a suspended user." + "'", str0,
        "Activate a suspended user.");
  }

  @Test
  public void test1187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1187");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DEBUG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DEBUG" + "'", str0, "DEBUG");
  }

  @Test
  public void test1188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1188");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.__CACHEPROF;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".cacheprof" + "'", str0, ".cacheprof");
  }

  @Test
  public void test1189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1189");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__NORMALIZED_DATABASE_NAME__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--database" + "'", str0, "--database");
  }

  @Test
  public void test1190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1190");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAODOE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RAFT log reader pool size" + "'", str0,
        "RAFT log reader pool size");
  }

  @Test
  public void test1191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1191");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TEMP_SAVE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "temp-save" + "'", str0, "temp-save");
  }

  @Test
  public void test1192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1192");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_SEVGU_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A list of group names for the server used when configuring load balancing and replication policies."
            + "'", str0,
        "A list of group names for the server used when configuring load balancing and replication policies.");
  }

  @Test
  public void test1193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1193");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JETTY_ADAPTER___DOCUMENTED_THX_JET_ALL_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of threads (both idle and busy) in the jetty pool. (gauge)" + "'", str0,
        "The total number of threads (both idle and busy) in the jetty pool. (gauge)");
  }

  @Test
  public void test1194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1194");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RADIDS_SOCKET_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Advertised hostname/IP address and port for the RAFT server."
            + "'", str0, "Advertised hostname/IP address and port for the RAFT server.");
  }

  @Test
  public void test1195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1195");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__TRANSACTION_ADVERTISED_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.transaction_advertised_address" + "'", str0,
        "causal_clustering.transaction_advertised_address");
  }

  @Test
  public void test1196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1196");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TOTAL_SIZE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "total_size" + "'", str0, "total_size");
  }

  @Test
  public void test1197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1197");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COUNT_ALL_NODES_METRICS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "countAllNodesMetrics" + "'", str0,
        "countAllNodesMetrics");
  }

  @Test
  public void test1198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1198");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___COMMAND__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unbind" + "'", str0, "unbind");
  }

  @Test
  public void test1199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1199");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.IN_RES_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "in_res_type" + "'", str0, "in_res_type");
  }

  @Test
  public void test1200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1200");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_TRANSACTION__ACTIVE_WRITE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*transaction.active_write" + "'", str0,
        "*transaction.active_write");
  }

  @Test
  public void test1201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1201");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_VM__FILE__DESCRIPTORS__COUNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*vm.file.descriptors.count" + "'", str0,
        "*vm.file.descriptors.count");
  }

  @Test
  public void test1202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1202");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_PIN_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of page pins executed by the page cache. (counter)" + "'", str0,
        "The total number of page pins executed by the page cache. (counter)");
  }

  @Test
  public void test1203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1203");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___COMMAND__HEADER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Perform an online backup from a running Neo4j enterprise server."
            + "'", str0, "Perform an online backup from a running Neo4j enterprise server.");
  }

  @Test
  public void test1204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1204");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_ID_PUBLISHED_BY_MEMBER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft-id-published-by-member" + "'", str0,
        "raft-id-published-by-member");
  }

  @Test
  public void test1205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1205");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATED_LEASE_STATE_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.replicated_lease_state_size" + "'", str0,
        "causal_clustering.replicated_lease_state_size");
  }

  @Test
  public void test1206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1206");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__EVENT_LOOP_COUNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.driver.event_loop_count" + "'",
        str0, "fabric.driver.event_loop_count");
  }

  @Test
  public void test1207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1207");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_DRRTECCT_DURATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "No connection liveliness check is done by default." + "'", str0,
        "No connection liveliness check is done by default.");
  }

  @Test
  public void test1208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1208");
    }
    io.github.onograph.TokenConstants tokenConstants0 = new io.github.onograph.TokenConstants();
    java.lang.Class<?> wildcardClass1 = tokenConstants0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test1209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1209");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ROLLBACKS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rollbacks" + "'", str0, "rollbacks");
  }

  @Test
  public void test1210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1210");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ACTIVE_READ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active_read" + "'", str0, "active_read");
  }

  @Test
  public void test1211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1211");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LS_STRING__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "A comma separated list of labels to ignore." + "'", str0,
        "A comma separated list of labels to ignore.");
  }

  @Test
  public void test1212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1212");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CATCHUP_SERVER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "catchup-server" + "'", str0,
        "catchup-server");
  }

  @Test
  public void test1213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1213");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__NORMALIZED_DATABASE_NAME__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Name of database to copy to." + "'",
        str0, "Name of database to copy to.");
  }

  @Test
  public void test1214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1214");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.IN_FLIGHT_CACHE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "in_flight_cache" + "'", str0,
        "in_flight_cache");
  }

  @Test
  public void test1215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1215");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_LERSEBF_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The amount of time we should wait before repeating an attempt to transfer the leadership of a given database to a member after that member rejects a previous transfer."
            + "'", str0,
        "The amount of time we should wait before repeating an attempt to transfer the leadership of a given database to a member after that member rejects a previous transfer.");
  }

  @Test
  public void test1216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1216");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNC_PATH;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "File location of CA certificate for Kubernetes API" + "'", str0,
        "File location of CA certificate for Kubernetes API");
  }

  @Test
  public void test1217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1217");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__FRMT__DEFAULT_VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "same" + "'", str0, "same");
  }

  @Test
  public void test1218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1218");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__IN_FLIGHT_CACHE__TYPE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.in_flight_cache.type" + "'", str0,
        "causal_clustering.in_flight_cache.type");
  }

  @Test
  public void test1219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1219");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__CSV__ROTATION__COMPRESSION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.csv.rotation.compression" + "'",
        str0, "metrics.csv.rotation.compression");
  }

  @Test
  public void test1220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1220");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PAGE_CACHE_PROFILER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PageCacheProfiler" + "'", str0,
        "PageCacheProfiler");
  }

  @Test
  public void test1221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1221");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_RES_TX_FIN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_res_tx_fin" + "'", str0,
        "hnd_res_tx_fin");
  }

  @Test
  public void test1222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1222");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_BEG_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)"
            + "'", str0,
        "The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)");
  }

  @Test
  public void test1223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1223");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_INGCXI_INTEGER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The maximum number of entries in the in-flight cache." + "'", str0,
        "The maximum number of entries in the in-flight cache.");
  }

  @Test
  public void test1224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1224");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATA_LINK;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data-link" + "'", str0, "data-link");
  }

  @Test
  public void test1225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1225");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RECNYOS_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The initial timeout until replication is retried. The timeout will increase exponentially."
            + "'", str0,
        "The initial timeout until replication is retried. The timeout will increase exponentially.");
  }

  @Test
  public void test1226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1226");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_TRMX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of terminated transactions. (counter)" + "'",
        str0, "The total number of terminated transactions. (counter)");
  }

  @Test
  public void test1227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1227");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LS_STRING__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--skip-labels" + "'", str0,
        "--skip-labels");
  }

  @Test
  public void test1228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1228");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__MI_AUTH_META_OPTIONS__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<all/users/roles>" + "'", str0,
        "<all/users/roles>");
  }

  @Test
  public void test1229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1229");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__FAILED_JOB_RUN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load."
            + "'", str0,
        "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
  }

  @Test
  public void test1230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1230");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_STATS_ADAPTER___DOCUMENTED_CON_ND_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of nodes in the database. (gauge)" + "'", str0,
        "The total number of nodes in the database. (gauge)");
  }

  @Test
  public void test1231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1231");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GROUPS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groups" + "'", str0, "groups");
  }

  @Test
  public void test1232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1232");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LOG_SHIPPING_RETRY_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.log_shipping_retry_timeout" + "'", str0,
        "causal_clustering.log_shipping_retry_timeout");
  }

  @Test
  public void test1233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1233");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__QUARANTINE_DATABASE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.quarantineDatabase" + "'", str0,
        "dbms.quarantineDatabase");
  }

  @Test
  public void test1234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1234");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LOCALHOST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
  }

  @Test
  public void test1235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1235");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED_COPD_DAX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Size of replicated data structures. (gauge)" + "'", str0,
        "Size of replicated data structures. (gauge)");
  }

  @Test
  public void test1236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1236");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__ADVANCED__CONNECTION_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.remote.artery.advanced.connection-timeout" + "'", str0,
        "akka.remote.artery.advanced.connection-timeout");
  }

  @Test
  public void test1237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1237");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JAVA__NAMING__SECURITY__PRINCIPAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "java.naming.security.principal" + "'",
        str0, "java.naming.security.principal");
  }

  @Test
  public void test1238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1238");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CC_DIRECTORY_ACTOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-directory-actor" + "'", str0,
        "cc-directory-actor");
  }

  @Test
  public void test1239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1239");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_BOOTSTRAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raftBootstrap" + "'", str0,
        "raftBootstrap");
  }

  @Test
  public void test1240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1240");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.KUBERNETES__DEFAULT__SVC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "kubernetes.default.svc" + "'", str0,
        "kubernetes.default.svc");
  }

  @Test
  public void test1241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1241");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__IS_RP__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<true/false>" + "'", str0,
        "<true/false>");
  }

  @Test
  public void test1242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1242");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LABEL_QUALIFIER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LabelQualifier" + "'", str0,
        "LabelQualifier");
  }

  @Test
  public void test1243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1243");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.POOL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pool" + "'", str0, "pool");
  }

  @Test
  public void test1244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1244");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURES___DEPRECATED__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test1245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1245");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVFEE_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test1246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1246");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LZ4;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LZ4" + "'", str0, "LZ4");
  }

  @Test
  public void test1247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1247");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__PANIC__SHUTDOWN_ON_PANIC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.panic.shutdown_on_panic" + "'",
        str0, "dbms.panic.shutdown_on_panic");
  }

  @Test
  public void test1248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1248");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HOURS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hours" + "'", str0, "hours");
  }

  @Test
  public void test1249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1249");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SEGMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SEGMENTED" + "'", str0, "SEGMENTED");
  }

  @Test
  public void test1250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1250");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_TRANSACTION__PEAK_CONCURRENT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*transaction.peak_concurrent" + "'",
        str0, "*transaction.peak_concurrent");
  }

  @Test
  public void test1251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1251");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TX_SIZE_NATIVE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tx_size_native" + "'", str0,
        "tx_size_native");
  }

  @Test
  public void test1252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1252");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__ACCEPTABLE_HEARTBEAT_PAUSE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause" + "'",
        str0, "causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause");
  }

  @Test
  public void test1253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1253");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STATE_MACHINE_APPLY_MAX_BATCH_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.state_machine_apply_max_batch_size" + "'", str0,
        "causal_clustering.state_machine_apply_max_batch_size");
  }

  @Test
  public void test1254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1254");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___COMMAND__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "backup" + "'", str0, "backup");
  }

  @Test
  public void test1255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1255");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_DBMS__POOL__BOLT__TOTAL_USED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*dbms.pool.bolt.total_used" + "'", str0,
        "*dbms.pool.bolt.total_used");
  }

  @Test
  public void test1256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1256");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JOB_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "job-" + "'", str0, "job-");
  }

  @Test
  public void test1257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1257");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LTS_PATH__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>" + "'", str0, "<path>");
  }

  @Test
  public void test1258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1258");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TCP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tcp" + "'", str0, "tcp");
  }

  @Test
  public void test1259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1259");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_IDS_IN_USE__NODE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*ids_in_use.node" + "'", str0,
        "*ids_in_use.node");
  }

  @Test
  public void test1260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1260");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.EXECUTE_BOOSTED_FROM_CONFIG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "execute_boosted_from_config" + "'", str0,
        "execute_boosted_from_config");
  }

  @Test
  public void test1261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1261");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HANDSHAKE_CLIENT_ENCODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "handshake_client_encoder" + "'", str0,
        "handshake_client_encoder");
  }

  @Test
  public void test1262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1262");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STORE_COPY_CHUNK_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.store_copy_chunk_size" + "'", str0,
        "causal_clustering.store_copy_chunk_size");
  }

  @Test
  public void test1263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1263");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_USX_RAI_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The ratio of number of used pages to total number of available pages. (gauge)" + "'",
        str0, "The ratio of number of used pages to total number of available pages. (gauge)");
  }

  @Test
  public void test1264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1264");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__MONITORED_BY_NR_OF_MEMBERS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.cluster.failure-detector.monitored-by-nr-of-members" + "'",
        str0, "akka.cluster.failure-detector.monitored-by-nr-of-members");
  }

  @Test
  public void test1265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1265");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RELATIONSHIP2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Relationship" + "'", str0,
        "Relationship");
  }

  @Test
  public void test1266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1266");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LAST_FLUSHED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "last-flushed" + "'", str0,
        "last-flushed");
  }

  @Test
  public void test1267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1267");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__MAX_SIZE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.connection.pool.max_size" + "'",
        str0, "driver.connection.pool.max_size");
  }

  @Test
  public void test1268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1268");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FRAME_DECODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "frame_decoder" + "'", str0,
        "frame_decoder");
  }

  @Test
  public void test1269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1269");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MEMORY__BUFFER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "memory.buffer" + "'", str0,
        "memory.buffer");
  }

  @Test
  public void test1270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1270");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_DIVDIDS_SOCKET_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Advertised cluster member discovery management communication."
            + "'", str0, "Advertised cluster member discovery management communication.");
  }

  @Test
  public void test1271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1271");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__BP_PATH__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--backup-dir" + "'", str0,
        "--backup-dir");
  }

  @Test
  public void test1272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1272");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME5;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.suspendUser" + "'", str0,
        "dbms.security.suspendUser");
  }

  @Test
  public void test1273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1273");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ABSTRACT_MEMORY_POOLS_ADAPTER___DOCUMENTED_RELFR;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Available unused memory in the pool, in bytes. (gauge)" + "'",
        str0, "Available unused memory in the pool, in bytes. (gauge)");
  }

  @Test
  public void test1274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1274");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEGHB_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test1275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1275");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__ROLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "roleName" + "'", str0, "roleName");
  }

  @Test
  public void test1276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1276");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_FIN_CMTX_TXS_UID_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The ID of the last committed transaction. (counter)" + "'", str0,
        "The ID of the last committed transaction. (counter)");
  }

  @Test
  public void test1277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1277");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_PRTEE_BOOLEAN;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Set to `true` to enable the Prometheus endpoint" + "'", str0,
        "Set to `true` to enable the Prometheus endpoint");
  }

  @Test
  public void test1278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1278");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED_HEA_USE_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Amount of memory (in bytes) currently used. (gauge)" + "'", str0,
        "Amount of memory (in bytes) currently used. (gauge)");
  }

  @Test
  public void test1279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1279");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP___DESCRIPTION__SETTING_ONEUTD_SOCKET_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Network interface and port for the backup server to listen on."
            + "'", str0, "Network interface and port for the backup server to listen on.");
  }

  @Test
  public void test1280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1280");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USERNAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "username" + "'", str0, "username");
  }

  @Test
  public void test1281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1281");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_DIVETENA_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The polling interval when attempting to resolve initial_discovery_members from DNS and SRV records."
            + "'", str0,
        "The polling interval when attempting to resolve initial_discovery_members from DNS and SRV records.");
  }

  @Test
  public void test1282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1282");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.YYYY__M_M_DD___H_H__MM__SS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd.HH.mm.ss" + "'", str0,
        "yyyy-MM-dd.HH.mm.ss");
  }

  @Test
  public void test1283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1283");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.QUARANTINE_DATABASE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "quarantineDatabase" + "'", str0,
        "quarantineDatabase");
  }

  @Test
  public void test1284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1284");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LTS_PATH__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Path to the transaction files, if they are not in the same folder as '--from-path'."
            + "'", str0,
        "Path to the transaction files, if they are not in the same folder as '--from-path'.");
  }

  @Test
  public void test1285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1285");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE_UUID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "databaseUuid" + "'", str0,
        "databaseUuid");
  }

  @Test
  public void test1286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1286");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__FAILED_JOB_RUN__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.checkpoint" + "'", str0,
        "db.checkpoint");
  }

  @Test
  public void test1287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1287");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_MEMBER_MAPPING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft-member-mapping" + "'", str0,
        "raft-member-mapping");
  }

  @Test
  public void test1288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1288");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ACTIVE_WRITE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active_write" + "'", str0,
        "active_write");
  }

  @Test
  public void test1289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1289");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__SEED_NODE_TIMEOUT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.cluster.seed-node-timeout" + "'",
        str0, "akka.cluster.seed-node-timeout");
  }

  @Test
  public void test1290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1290");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECXEPA_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Akka cluster phi accrual failure detector. After the heartbeat request has been sent the first failure detection will start after this period, even though no heartbeat message has been received."
            + "'", str0,
        "Akka cluster phi accrual failure detector. After the heartbeat request has been sent the first failure detection will start after this period, even though no heartbeat message has been received.");
  }

  @Test
  public void test1291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1291");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FORK_JOIN_EXECUTOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fork-join-executor" + "'", str0,
        "fork-join-executor");
  }

  @Test
  public void test1292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1292");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_NG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "group" + "'", str0, "group");
  }

  @Test
  public void test1293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1293");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ERROR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error" + "'", str0, "error");
  }

  @Test
  public void test1294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1294");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_STORE_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_store_id" + "'", str0,
        "hnd_req_store_id");
  }

  @Test
  public void test1295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1295");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__AUTH_CACHE_TTL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.auth_cache_ttl" + "'",
        str0, "dbms.security.auth_cache_ttl");
  }

  @Test
  public void test1296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1296");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SET_STATUS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "setStatus" + "'", str0, "setStatus");
  }

  @Test
  public void test1297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1297");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LEADER_ONLY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "leader-only" + "'", str0, "leader-only");
  }

  @Test
  public void test1298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1298");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__TIMEOUT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.driver.timeout" + "'", str0,
        "fabric.driver.timeout");
  }

  @Test
  public void test1299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1299");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__E__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.listRolesForUser" + "'",
        str0, "dbms.security.listRolesForUser");
  }

  @Test
  public void test1300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1300");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.QUARANTINE_MARKER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "quarantine-marker" + "'", str0,
        "quarantine-marker");
  }

  @Test
  public void test1301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1301");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.APPLIES_TO;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "APPLIES_TO" + "'", str0, "APPLIES_TO");
  }

  @Test
  public void test1302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1302");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_SPCLX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Timer for RAFT message processing. (counter, histogram)" + "'",
        str0, "Timer for RAFT message processing. (counter, histogram)");
  }

  @Test
  public void test1303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1303");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_USERS_FOR_ROLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.listUsersForRole" + "'",
        str0, "dbms.security.listUsersForRole");
  }

  @Test
  public void test1304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1304");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY3;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unassign a role from the user." + "'",
        str0, "Unassign a role from the user.");
  }

  @Test
  public void test1305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1305");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Start the benchmark." + "'", str0,
        "Start the benchmark.");
  }

  @Test
  public void test1306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1306");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.THREAD__COUNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "thread.count" + "'", str0,
        "thread.count");
  }

  @Test
  public void test1307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1307");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_STIG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "setting" + "'", str0, "setting");
  }

  @Test
  public void test1308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1308");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_RS_STRING__PARAM_LABEL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "<relationship>[,<relationship>...]" + "'", str0,
        "<relationship>[,<relationship>...]");
  }

  @Test
  public void test1309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1309");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAIBMROI_INTEGER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Number of cores required for initial Akka cluster formation" + "'",
        str0, "Number of cores required for initial Akka cluster formation");
  }

  @Test
  public void test1310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1310");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_MECEEB_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events."
            + "'", str0,
        "Enable metrics namespaces that separates the global and database specific metrics. If enabled all database specific metrics will have field names starting with <metrics_prefix>.database.<database_name> and all global metrics will start with <metrics_prefix>.dbms. For example neo4j.page_cache.hits will become neo4j.dbms.page_cache.hits and neo4j.system.log.rotation_events will become neo4j.database.system.log.rotation_events.");
  }

  @Test
  public void test1311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1311");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_ADVERTISED_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_advertised_address" + "'", str0,
        "causal_clustering.raft_advertised_address");
  }

  @Test
  public void test1312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1312");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__LOGGING__LEVEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.driver.logging.level" + "'", str0,
        "fabric.driver.logging.level");
  }

  @Test
  public void test1313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1313");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_GLLIASS_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The maximum file size before the global session tracker state file is rotated (in unit of entries)"
            + "'", str0,
        "The maximum file size before the global session tracker state file is rotated (in unit of entries)");
  }

  @Test
  public void test1314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1314");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CLUSTER__SEED_NODE_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.cluster.seed_node_timeout" + "'",
        str0, "causal_clustering.middleware.akka.cluster.seed_node_timeout");
  }

  @Test
  public void test1315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1315");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__ACTIVATE_USER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.activateUser" + "'", str0,
        "dbms.security.activateUser");
  }

  @Test
  public void test1316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1316");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ANNOTATION_DATA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "annotationData" + "'", str0,
        "annotationData");
  }

  @Test
  public void test1317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1317");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CAUCE_INTEGER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The maximum batch size when catching up (in unit of entries)"
            + "'", str0, "The maximum batch size when catching up (in unit of entries)");
  }

  @Test
  public void test1318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1318");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC_GROUP_SETTING___DESCRIPTION__SETTING_URI_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "URI of the Neo4j DBMS hosting the database associated to the Fabric graph. Example: neo4j://somewhere:7687 \nA comma separated list of URIs is acceptable. This is useful when the Fabric graph is hosted on a clusterand more that one bootstrap address needs to be provided in order to avoid a single point of failure.The provided addresses will be considered as an initial source of a routing table.Example: neo4j://core-1:1111,neo4j://core-2:2222"
            + "'", str0,
        "URI of the Neo4j DBMS hosting the database associated to the Fabric graph. Example: neo4j://somewhere:7687 \nA comma separated list of URIs is acceptable. This is useful when the Fabric graph is hosted on a clusterand more that one bootstrap address needs to be provided in order to avoid a single point of failure.The provided addresses will be considered as an initial source of a routing table.Example: neo4j://core-1:1111,neo4j://core-2:2222");
  }

  @Test
  public void test1319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1319");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_MP__DEFAULT_VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "8m" + "'", str0, "8m");
  }

  @Test
  public void test1320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1320");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LOGGING_DISPATCHER__THREAD_POOL_EXECUTOR__FIXED_POOL_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "logging-dispatcher.thread-pool-executor.fixed-pool-size" + "'",
        str0, "logging-dispatcher.thread-pool-executor.fixed-pool-size");
  }

  @Test
  public void test1321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1321");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED_HEA_LIMT_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Maximum amount of heap memory (in bytes) that can be used. (gauge)"
            + "'", str0, "Maximum amount of heap memory (in bytes) that can be used. (gauge)");
  }

  @Test
  public void test1322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1322");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_DELDIOG_NODE_GROUP_IDENTIFIER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing."
            + "'", str0,
        "The name of a server_group whose members should be prioritized as leaders. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible. If a database is specified using causal_clustering.leadership_priority_group.<database> the specified priority group will apply to that database only. If no database is specified that group will be the default and apply to all databases which have no priority group explicitly set. Using this setting will disable leadership balancing.");
  }

  @Test
  public void test1323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1323");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COUNT_ALL_RELATIONSHIP_METRICS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "countAllRelationshipMetrics" + "'", str0,
        "countAllRelationshipMetrics");
  }

  @Test
  public void test1324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1324");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_REPLICA_NODE_ADAPTER___DOCUMENTED_PUL_UPA_HIHT_TXS_UID_REEE_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The highest transaction id that has been pulled in the last pull updates by this instance. (counter)"
            + "'", str0,
        "The highest transaction id that has been pulled in the last pull updates by this instance. (counter)");
  }

  @Test
  public void test1325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1325");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_RDX_TXS_ACI_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The number of currently active read transactions. (gauge)" + "'",
        str0, "The number of currently active read transactions. (gauge)");
  }

  @Test
  public void test1326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1326");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SIZE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
  }

  @Test
  public void test1327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1327");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_RES_TX_PULL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_res_tx_pull" + "'", str0,
        "enc_res_tx_pull");
  }

  @Test
  public void test1328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1328");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_FIN_CLS_TXS_UID_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The ID of the last closed transaction. (counter)" + "'", str0,
        "The ID of the last closed transaction. (counter)");
  }

  @Test
  public void test1329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1329");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VOLUMETRIC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "volumetric" + "'", str0, "volumetric");
  }

  @Test
  public void test1330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1330");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STSUTO_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Sampling window for throughput estimate reported in the status endpoint." + "'", str0,
        "Sampling window for throughput estimate reported in the status endpoint.");
  }

  @Test
  public void test1331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1331");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__DEFAULT_VALUE2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
  }

  @Test
  public void test1332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1332");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_ALLOW_READS_ON_LEADER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.cluster_allow_reads_on_leader" + "'", str0,
        "causal_clustering.cluster_allow_reads_on_leader");
  }

  @Test
  public void test1333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1333");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_CLUSTER_API___PATH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/{databaseName}/cluster" + "'", str0,
        "/{databaseName}/cluster");
  }

  @Test
  public void test1334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1334");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MEMBER_DATA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "member-data" + "'", str0, "member-data");
  }

  @Test
  public void test1335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1335");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.QUERY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "query" + "'", str0, "query");
  }

  @Test
  public void test1336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1336");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__UPGRADE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.upgrade" + "'", str0,
        "dbms.upgrade");
  }

  @Test
  public void test1337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1337");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_RDX_TXS_CMTX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of committed read transactions. (counter)" + "'",
        str0, "The total number of committed read transactions. (counter)");
  }

  @Test
  public void test1338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1338");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PRS_TOKEN_NAME_PROPERTY_D_T_O__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--skip-relationship-properties" + "'",
        str0, "--skip-relationship-properties");
  }

  @Test
  public void test1339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1339");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___COMMAND__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "copy" + "'", str0, "copy");
  }

  @Test
  public void test1340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1340");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVHPAE_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the heap memory usage. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the heap memory usage. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test1341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1341");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STORE__SIZE___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store.size.*" + "'", str0,
        "store.size.*");
  }

  @Test
  public void test1342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1342");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RADIM_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Configures the time taken attempting to publish a cluster id to the discovery service before potentially retrying."
            + "'", str0,
        "Configures the time taken attempting to publish a cluster id to the discovery service before potentially retrying.");
  }

  @Test
  public void test1343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1343");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_CATCHUP_ERROR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_catchup_error" + "'", str0,
        "enc_catchup_error");
  }

  @Test
  public void test1344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1344");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDOTIT_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value."
            + "'", str0,
        "The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.");
  }

  @Test
  public void test1345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1345");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__PROMETHEUS__ENDPOINT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.prometheus.endpoint" + "'", str0,
        "metrics.prometheus.endpoint");
  }

  @Test
  public void test1346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1346");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPT__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "(Advanced) The size of the page cache to use for writing. If not specified then an optimal size will be automatically selected"
            + "'", str0,
        "(Advanced) The size of the page cache to use for writing. If not specified then an optimal size will be automatically selected");
  }

  @Test
  public void test1347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1347");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "used" + "'", str0, "used");
  }

  @Test
  public void test1348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1348");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SCHEMA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "schema" + "'", str0, "schema");
  }

  @Test
  public void test1349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1349");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_RP__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--parallel-recovery" + "'", str0,
        "--parallel-recovery");
  }

  @Test
  public void test1350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1350");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BATCH_LOG_TIMER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BATCH_LOG_TIMER" + "'", str0,
        "BATCH_LOG_TIMER");
  }

  @Test
  public void test1351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1351");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LOAIU_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "The load balancing plugin to use." + "'",
        str0, "The load balancing plugin to use.");
  }

  @Test
  public void test1352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1352");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.INITIAL_MEMBERS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_members" + "'", str0,
        "initial_members");
  }

  @Test
  public void test1353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1353");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_TOPOLOGY_REFRESH;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.cluster_topology_refresh" + "'", str0,
        "causal_clustering.cluster_topology_refresh");
  }

  @Test
  public void test1354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1354");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ERROR_HANDLER_HEAD;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error_handler_head" + "'", str0,
        "error_handler_head");
  }

  @Test
  public void test1355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1355");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COM__SUN__JNDI__LDAP__CONNECT__TIMEOUT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "com.sun.jndi.ldap.connect.timeout" + "'",
        str0, "com.sun.jndi.ldap.connect.timeout");
  }

  @Test
  public void test1356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1356");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_ROLC_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of rolled back transactions. (counter)" + "'",
        str0, "The total number of rolled back transactions. (counter)");
  }

  @Test
  public void test1357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1357");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_QUALIFIER_ALL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UserQualifierAll" + "'", str0,
        "UserQualifierAll");
  }

  @Test
  public void test1358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1358");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CLUSTER__SEED_NODE_TIMEOUT_ON_FIRST_START;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "causal_clustering.middleware.akka.cluster.seed_node_timeout_on_first_start" + "'", str0,
        "causal_clustering.middleware.akka.cluster.seed_node_timeout_on_first_start");
  }

  @Test
  public void test1359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1359");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__CANONICAL__HOSTNAME;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.remote.artery.canonical.hostname" + "'", str0,
        "akka.remote.artery.canonical.hostname");
  }

  @Test
  public void test1360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1360");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___COMMAND__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Prepare backup for restore by applying the latest transactions which were pulled at the time of backup, but not applied to the store."
            + "'", str0,
        "Prepare backup for restore by applying the latest transactions which were pulled at the time of backup, but not applied to the store.");
  }

  @Test
  public void test1361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1361");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION__BROWSER_RETAIN_EDITOR_HISTORY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Configure the Neo4j Browser to store or not store user editor history." + "'", str0,
        "Configure the Neo4j Browser to store or not store user editor history.");
  }

  @Test
  public void test1362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1362");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__COMMAND_APPLIER_PARALLELISM;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.command_applier_parallelism" + "'", str0,
        "causal_clustering.command_applier_parallelism");
  }

  @Test
  public void test1363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1363");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TX_RETRIES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tx_retries" + "'", str0, "tx_retries");
  }

  @Test
  public void test1364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1364");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RESOURCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "resource" + "'", str0, "resource");
  }

  @Test
  public void test1365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1365");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MEMBERSHIP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "membership" + "'", str0, "membership");
  }

  @Test
  public void test1366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1366");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.X__509;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "X.509" + "'", str0, "X.509");
  }

  @Test
  public void test1367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1367");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWNOK_STRING__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A comma separated list of labels. All nodes that have ANY of the specified labels will be kept.Can not be combined with --delete-nodes-with-labels."
            + "'", str0,
        "A comma separated list of labels. All nodes that have ANY of the specified labels will be kept.Can not be combined with --delete-nodes-with-labels.");
  }

  @Test
  public void test1368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1368");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__LOCK_IDENTITY_HASH_CODE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "List the job groups that are active in the database internal job scheduler." + "'", str0,
        "List the job groups that are active in the database internal job scheduler.");
  }

  @Test
  public void test1369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1369");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_SEIGELEA_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Set to log successful authentication events to the security log. If this is set to `false` only failed authentication events will be logged, which could be useful if you find that the successful events spam the logs too much, and you do not require full auditing capability."
            + "'", str0,
        "Set to log successful authentication events to the security log. If this is set to `false` only failed authentication events will be logged, which could be useful if you find that the successful events spam the logs too much, and you do not require full auditing capability.");
  }

  @Test
  public void test1370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1370");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CYPHER_PLAN_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Cypher metrics" + "'", str0,
        ".Cypher metrics");
  }

  @Test
  public void test1371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1371");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HALT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "halt" + "'", str0, "halt");
  }

  @Test
  public void test1372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1372");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FLUSHES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flushes" + "'", str0, "flushes");
  }

  @Test
  public void test1373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1373");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEATOA_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the Neo4j transaction logs. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the Neo4j transaction logs. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test1374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1374");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.kubernetes.address" + "'", str0,
        "causal_clustering.kubernetes.address");
  }

  @Test
  public void test1375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1375");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_ENEO_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable pre-voting extension to the Raft protocol (this is breaking and must match between the core cluster members)"
            + "'", str0,
        "Enable pre-voting extension to the Raft protocol (this is breaking and must match between the core cluster members)");
  }

  @Test
  public void test1376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1376");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CSV_REPORTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "csv-reporter" + "'", str0,
        "csv-reporter");
  }

  @Test
  public void test1377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1377");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TX_SIZE_HEAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tx_size_heap" + "'", str0,
        "tx_size_heap");
  }

  @Test
  public void test1378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1378");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_VM__GC__TIME___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*vm.gc.time.*" + "'", str0,
        "*vm.gc.time.*");
  }

  @Test
  public void test1379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1379");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNT_PATH;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "File location of token for Kubernetes API" + "'", str0,
        "File location of token for Kubernetes API");
  }

  @Test
  public void test1380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1380");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AVAILABLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "available" + "'", str0, "available");
  }

  @Test
  public void test1381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1381");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.UNREACHABLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unreachable" + "'", str0, "unreachable");
  }

  @Test
  public void test1382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1382");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LALDE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The maximum file size before the storage file is rotated (in unit of entries)" + "'",
        str0, "The maximum file size before the storage file is rotated (in unit of entries)");
  }

  @Test
  public void test1383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1383");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LERUTOD_DURATION_RANGE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The time window within which the loss of the leader is detected and the first re-election attempt is held.The window should be significantly larger than typical communication delays to make conflicts unlikely."
            + "'", str0,
        "The time window within which the loss of the leader is detected and the first re-election attempt is held.The window should be significantly larger than typical communication delays to make conflicts unlikely.");
  }

  @Test
  public void test1384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1384");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAAM_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Timeout for Akka handshake" + "'", str0,
        "Timeout for Akka handshake");
  }

  @Test
  public void test1385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1385");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PINS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pins" + "'", str0, "pins");
  }

  @Test
  public void test1386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1386");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_STORE_FILE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_store_file" + "'", str0,
        "hnd_req_store_file");
  }

  @Test
  public void test1387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1387");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RAEEP_PATH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Path to RAFT messages log." + "'", str0,
        "Path to RAFT messages log.");
  }

  @Test
  public void test1388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1388");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DROPPED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dropped" + "'", str0, "dropped");
  }

  @Test
  public void test1389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1389");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MINIMUM_CORE_CLUSTER_SIZE_AT_RUNTIME;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.minimum_core_cluster_size_at_runtime" + "'",
        str0, "causal_clustering.minimum_core_cluster_size_at_runtime");
  }

  @Test
  public void test1390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1390");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_S_D_P_IMPL___DOCUMENTED_PSX_LTM;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Accumulated detected VM pause time. (gauge)" + "'", str0,
        "Accumulated detected VM pause time. (gauge)");
  }

  @Test
  public void test1391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1391");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__SERVER_GROUPS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "causal_clustering.server_groups" + "'",
        str0, "causal_clustering.server_groups");
  }

  @Test
  public void test1392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1392");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RESTORE_METADATA__CYPHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "restore_metadata.cypher" + "'", str0,
        "restore_metadata.cypher");
  }

  @Test
  public void test1393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1393");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CPU;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cpu" + "'", str0, "cpu");
  }

  @Test
  public void test1394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1394");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CREATE_PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "createProperty" + "'", str0,
        "createProperty");
  }

  @Test
  public void test1395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1395");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PLUGIN_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "plugin-" + "'", str0, "plugin-");
  }

  @Test
  public void test1396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1396");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MESSAGE_PROCESSING_DELAY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "message_processing_delay" + "'", str0,
        "message_processing_delay");
  }

  @Test
  public void test1397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1397");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BASIC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "basic" + "'", str0, "basic");
  }

  @Test
  public void test1398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1398");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ROTATION_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rotation_duration" + "'", str0,
        "rotation_duration");
  }

  @Test
  public void test1399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1399");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RAEEEE_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable or disable the dump of all network messages pertaining to the RAFT protocol"
            + "'", str0,
        "Enable or disable the dump of all network messages pertaining to the RAFT protocol");
  }

  @Test
  public void test1400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1400");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_VM__MEMORY__POOL__G1_EDEN_SPACE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*vm.memory.pool.g1_eden_space" + "'",
        str0, "*vm.memory.pool.g1_eden_space");
  }

  @Test
  public void test1401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1401");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ACCESS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "access" + "'", str0, "access");
  }

  @Test
  public void test1402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1402");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.INTERNAL_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRCIV_DURATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Time interval between driver idleness check." + "'", str0,
        "Time interval between driver idleness check.");
  }

  @Test
  public void test1403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1403");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LOG_INBOUND_REQ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log_inbound_req" + "'", str0,
        "log_inbound_req");
  }

  @Test
  public void test1404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1404");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEOZB_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test1405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1405");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAOLTN_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RAFT log implementation" + "'", str0,
        "RAFT log implementation");
  }

  @Test
  public void test1406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1406");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MIN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "min" + "'", str0, "min");
  }

  @Test
  public void test1407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1407");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Database data metrics" + "'", str0,
        ".Database data metrics");
  }

  @Test
  public void test1408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1408");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_DRRIV_LEVEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Value of dbms.logs.debug.level" + "'",
        str0, "Value of dbms.logs.debug.level");
  }

  @Test
  public void test1409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1409");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CC_CLIENT_TOPOLOGY_ACTOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-client-topology-actor" + "'", str0,
        "cc-client-topology-actor");
  }

  @Test
  public void test1410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1410");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLEORS_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Time between scanning the cluster to refresh current server's view of topology" + "'",
        str0, "Time between scanning the cluster to refresh current server's view of topology");
  }

  @Test
  public void test1411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1411");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__THRESHOLD;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.cluster.failure-detector.threshold" + "'", str0,
        "akka.cluster.failure-detector.threshold");
  }

  @Test
  public void test1412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1412");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DB__OPERATION__COUNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.operation.count" + "'", str0,
        "db.operation.count");
  }

  @Test
  public void test1413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1413");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_IN_QUEUE_MAX_BATCH;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_in_queue_max_batch" + "'", str0,
        "causal_clustering.raft_in_queue_max_batch");
  }

  @Test
  public void test1414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1414");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__MI_AUTH_META_OPTIONS__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users"
            + "'", str0,
        "Include metadata in file. Can't be used for backing system database.\nroles - commands to create the roles and privileges (for both database and graph) that affect the use of the database\nusers - commands to create the users that can use the database and their role assignments \nall - include roles and users");
  }

  @Test
  public void test1415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1415");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_BINDING_RETRY_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.cluster_binding_retry_timeout" + "'", str0,
        "causal_clustering.cluster_binding_retry_timeout");
  }

  @Test
  public void test1416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1416");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__BP_PATH__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Directory to place backup in." + "'",
        str0, "Directory to place backup in.");
  }

  @Test
  public void test1417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1417");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MAX_ELEMENTS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_elements" + "'", str0,
        "max_elements");
  }

  @Test
  public void test1418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1418");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_RDX_TXS_TRMX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of terminated read transactions. (counter)" + "'",
        str0, "The total number of terminated read transactions. (counter)");
  }

  @Test
  public void test1419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1419");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVMND_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the memory usage. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the memory usage. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test1420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1420");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.UNBOUNDED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unbounded" + "'", str0, "Unbounded");
  }

  @Test
  public void test1421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1421");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__FILTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.filter" + "'", str0,
        "metrics.filter");
  }

  @Test
  public void test1422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1422");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms." + "'", str0, "dbms.");
  }

  @Test
  public void test1423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1423");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_CONTENT_DECODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft_content_decoder" + "'", str0,
        "raft_content_decoder");
  }

  @Test
  public void test1424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1424");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BROWSER__RETAIN_EDITOR_HISTORY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "browser.retain_editor_history" + "'",
        str0, "browser.retain_editor_history");
  }

  @Test
  public void test1425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1425");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.APPEND_INDEX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "append_index" + "'", str0,
        "append_index");
  }

  @Test
  public void test1426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1426");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__VERSION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str0,
        "Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
  }

  @Test
  public void test1427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1427");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CYPHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cypher" + "'", str0, "cypher");
  }

  @Test
  public void test1428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1428");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GRAPH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GRAPH" + "'", str0, "GRAPH");
  }

  @Test
  public void test1429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1429");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HANDSHAKE_CLIENT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "handshake_client" + "'", str0,
        "handshake_client");
  }

  @Test
  public void test1430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1430");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__CHANGE_USER_PASSWORD;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.changeUserPassword" + "'",
        str0, "dbms.security.changeUserPassword");
  }

  @Test
  public void test1431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1431");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SET_UPGRADE_USER_PASSWORD_COMMAND___COMMAND__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "set-operator-password" + "'", str0,
        "set-operator-password");
  }

  @Test
  public void test1432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1432");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "databaseId" + "'", str0, "databaseId");
  }

  @Test
  public void test1433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1433");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__ROUTING__TTL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.routing.ttl" + "'", str0,
        "fabric.routing.ttl");
  }

  @Test
  public void test1434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1434");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_MESSAGE_ENCODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft_message_encoder" + "'", str0,
        "raft_message_encoder");
  }

  @Test
  public void test1435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1435");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_REPLICA_NODE_ADAPTER___DOCUMENTED_PUL_UPA_HIHT_TXS_UID_REUT_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The highest transaction id requested in a pull update by this instance. (counter)" + "'",
        str0, "The highest transaction id requested in a pull update by this instance. (counter)");
  }

  @Test
  public void test1436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1436");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FILE__DESCRIPTORS__MAXIMUM;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file.descriptors.maximum" + "'", str0,
        "file.descriptors.maximum");
  }

  @Test
  public void test1437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1437");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__DATABASE_NAME_PATTERN__DEFAULT_VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "neo4j" + "'", str0, "neo4j");
  }

  @Test
  public void test1438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1438");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONNECT_TO_RANDOM_CORE_SERVER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect-to-random-core-server" + "'",
        str0, "connect-to-random-core-server");
  }

  @Test
  public void test1439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1439");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CONLAE_INTEGER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Limits amount of global threads for applying commands." + "'",
        str0, "Limits amount of global threads for applying commands.");
  }

  @Test
  public void test1440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1440");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAIRLE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Parallelism level of dispatcher used for communication from Akka based cluster topology discovery "
            + "'", str0,
        "Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ");
  }

  @Test
  public void test1441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1441");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FUNCTION_QUALIFIER_ALL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FunctionQualifierAll" + "'", str0,
        "FunctionQualifierAll");
  }

  @Test
  public void test1442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1442");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURE_QUALIFIER_ALL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ProcedureQualifierAll" + "'", str0,
        "ProcedureQualifierAll");
  }

  @Test
  public void test1443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1443");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STARTUP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "startup" + "'", str0, "startup");
  }

  @Test
  public void test1444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1444");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_FILE_CHUNK;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_file_chunk" + "'", str0,
        "enc_file_chunk");
  }

  @Test
  public void test1445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1445");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TXS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "txs" + "'", str0, "txs");
  }

  @Test
  public void test1446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1446");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED_CLX_MEBS_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Discovery cluster member size. (gauge)" + "'", str0,
        "Discovery cluster member size. (gauge)");
  }

  @Test
  public void test1447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1447");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STCAE_INTEGER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Limits amount of global threads for store copy." + "'", str0,
        "Limits amount of global threads for store copy.");
  }

  @Test
  public void test1448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1448");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__AP_PATH__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>" + "'", str0, "<path>");
  }

  @Test
  public void test1449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1449");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_CYPHER__REPLAN_EVENTS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*cypher.replan_events" + "'", str0,
        "*cypher.replan_events");
  }

  @Test
  public void test1450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1450");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_PAGE_CACHE__PAGE_FAULTS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*page_cache.page_faults" + "'", str0,
        "*page_cache.page_faults");
  }

  @Test
  public void test1451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1451");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TERMINATED_WRITE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "terminated_write" + "'", str0,
        "terminated_write");
  }

  @Test
  public void test1452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1452");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ACCUMULATED_PROCESSING_TIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "accumulated_processing_time" + "'", str0,
        "accumulated_processing_time");
  }

  @Test
  public void test1453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1453");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__CANONICAL__PORT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.remote.artery.canonical.port" + "'",
        str0, "akka.remote.artery.canonical.port");
  }

  @Test
  public void test1454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1454");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RECNYOM_DURATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The upper limit for the exponentially incremented retry timeout."
            + "'", str0, "The upper limit for the exponentially incremented retry timeout.");
  }

  @Test
  public void test1455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1455");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COM__SUN__JNDI__DNS___DNS_CONTEXT_FACTORY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "com.sun.jndi.dns.DnsContextFactory" + "'", str0,
        "com.sun.jndi.dns.DnsContextFactory");
  }

  @Test
  public void test1456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1456");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "requirePasswordChange" + "'", str0,
        "requirePasswordChange");
  }

  @Test
  public void test1457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1457");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__CONNECTION__MAX_LIFETIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.connection.max_lifetime" + "'",
        str0, "driver.connection.max_lifetime");
  }

  @Test
  public void test1458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1458");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_SERVER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft-server" + "'", str0, "raft-server");
  }

  @Test
  public void test1459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1459");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADERSHIP_PRIORITY_GROUP;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.leadership_priority_group" + "'", str0,
        "causal_clustering.leadership_priority_group");
  }

  @Test
  public void test1460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1460");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_S_D_P_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".JVM pause time metrics." + "'", str0,
        ".JVM pause time metrics.");
  }

  @Test
  public void test1461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1461");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__JMX__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.jmx.enabled" + "'", str0,
        "metrics.jmx.enabled");
  }

  @Test
  public void test1462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1462");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft-id" + "'", str0, "raft-id");
  }

  @Test
  public void test1463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1463");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__MIN_NR_OF_MEMBERS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.cluster.min-nr-of-members" + "'",
        str0, "akka.cluster.min-nr-of-members");
  }

  @Test
  public void test1464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1464");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Report the current status of the system database sub-graph schema, providing details for each sub-graph component.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test1465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1465");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__USER_DN_TEMPLATE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authentication.user_dn_template" + "'", str0,
        "dbms.security.ldap.authentication.user_dn_template");
  }

  @Test
  public void test1466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1466");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAOAS_LONG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RAFT log rotation size" + "'", str0,
        "RAFT log rotation size");
  }

  @Test
  public void test1467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1467");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__AP_PATH__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Destination (file or folder) of the cluster state archive." + "'",
        str0, "Destination (file or folder) of the cluster state archive.");
  }

  @Test
  public void test1468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1468");
    }
    java.util.Map<java.lang.String, java.lang.String> strMap0 = io.github.onograph.I18N.messageMap;
    java.lang.Class<?> wildcardClass1 = strMap0.getClass();
    org.junit.Assert.assertNotNull(strMap0);
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test1469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1469");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__NEO4J__CAUSAL_CLUSTERING__ENABLED;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "metrics.neo4j.causal_clustering.enabled" + "'", str0,
        "metrics.neo4j.causal_clustering.enabled");
  }

  @Test
  public void test1470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1470");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_MEG_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of page merges executed by the page cache. (counter)" + "'", str0,
        "The total number of page merges executed by the page cache. (counter)");
  }

  @Test
  public void test1471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1471");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.UNSUPPORTED__CAUSAL_CLUSTERING__EXPERIMENTAL_RAFT_PROTOCOL_ENABLED;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "unsupported.causal_clustering.experimental_raft_protocol_enabled"
            + "'", str0, "unsupported.causal_clustering.experimental_raft_protocol_enabled");
  }

  @Test
  public void test1472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1472");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_FAL_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of messages that failed processing since this instance started. (counter)"
            + "'", str0,
        "The total number of messages that failed processing since this instance started. (counter)");
  }

  @Test
  public void test1473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1473");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SEGMENT2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Segment" + "'", str0, "Segment");
  }

  @Test
  public void test1474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1474");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVFEE_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the buffer pools. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the buffer pools. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test1475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1475");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___DESCRIPTION__GDB_NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Stop a running benchmark." + "'", str0,
        "Stop a running benchmark.");
  }

  @Test
  public void test1476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1476");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P_DB__CLUSTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db/cluster" + "'", str0, "db/cluster");
  }

  @Test
  public void test1477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1477");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.COMMAND_GET_SERVER_ID_IMPL___COMMAND__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "get-server-id" + "'", str0,
        "get-server-id");
  }

  @Test
  public void test1478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1478");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___O_PRINT_STREAM__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.scheduler.jobs" + "'", str0,
        "dbms.scheduler.jobs");
  }

  @Test
  public void test1479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1479");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Assign a role to the user." + "'", str0,
        "Assign a role to the user.");
  }

  @Test
  public void test1480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1480");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_BOLT__CONNECTIONS_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*bolt.connections*" + "'", str0,
        "*bolt.connections*");
  }

  @Test
  public void test1481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1481");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.addRoleToUser" + "'", str0,
        "dbms.security.addRoleToUser");
  }

  @Test
  public void test1482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1482");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_SIZ_NAI_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The transactions' size in native memory in bytes. (histogram)"
            + "'", str0, "The transactions' size in native memory in bytes. (histogram)");
  }

  @Test
  public void test1483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1483");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_REQ_STORE_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_req_store_id" + "'", str0,
        "enc_req_store_id");
  }

  @Test
  public void test1484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1484");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENTERPRISE_SECURITY_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__NAME2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.clearAuthCache" + "'",
        str0, "dbms.security.clearAuthCache");
  }

  @Test
  public void test1485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1485");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_PRUNE_STRATEGY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_log_prune_strategy" + "'", str0,
        "causal_clustering.raft_log_prune_strategy");
  }

  @Test
  public void test1486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1486");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_FLSS_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of page flushes executed by the page cache. (counter)" + "'", str0,
        "The total number of page flushes executed by the page cache. (counter)");
  }

  @Test
  public void test1487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1487");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROFILES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "profiles" + "'", str0, "profiles");
  }

  @Test
  public void test1488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1488");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.enabled" + "'", str0,
        "metrics.enabled");
  }

  @Test
  public void test1489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1489");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TEMP_BOOTSTRAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "temp-bootstrap" + "'", str0,
        "temp-bootstrap");
  }

  @Test
  public void test1490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1490");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONNECT_RANDOMLY_TO_SERVER_GROUP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect-randomly-to-server-group" + "'",
        str0, "connect-randomly-to-server-group");
  }

  @Test
  public void test1491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1491");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Change the current user's password." + "'", str0,
        "Change the current user's password.");
  }

  @Test
  public void test1492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1492");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LAST_COMMITTED_TX_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "last_committed_tx_id" + "'", str0,
        "last_committed_tx_id");
  }

  @Test
  public void test1493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1493");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CAULTN_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\""
            + "'", str0,
        "Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"");
  }

  @Test
  public void test1494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1494");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__MONITORED_BY_NR_OF_MEMBERS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "causal_clustering.middleware.akka.failure_detector.monitored_by_nr_of_members" + "'",
        str0, "causal_clustering.middleware.akka.failure_detector.monitored_by_nr_of_members");
  }

  @Test
  public void test1495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1495");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VERSION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "version" + "'", str0, "version");
  }

  @Test
  public void test1496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1496");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SNAPPY_VALIDATING_DECODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy_validating_decoder" + "'", str0,
        "snappy_validating_decoder");
  }

  @Test
  public void test1497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1497");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_MEMBER_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft-member-id" + "'", str0,
        "raft-member-id");
  }

  @Test
  public void test1498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1498");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__SYSTEM_PASSWORD;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authorization.system_password" + "'", str0,
        "dbms.security.ldap.authorization.system_password");
  }

  @Test
  public void test1499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1499");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___NAME___LG_SBL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "blockSize" + "'", str0, "blockSize");
  }

  @Test
  public void test1500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1500");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_REPLICA_STORE_ID_READER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "readReplicaStoreIdReader" + "'", str0,
        "readReplicaStoreIdReader");
  }
}

