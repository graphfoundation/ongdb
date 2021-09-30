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
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CALTGL_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about Causal Clustering mode. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about Causal Clustering mode. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test0502() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0502");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_IN_QUEUE_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_in_queue_size" + "'", str0,
        "causal_clustering.raft_in_queue_size");
  }

  @Test
  public void test0503() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0503");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_CALTGL_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test0504() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0504");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PAGE_CACHE_WARMER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PageCacheWarmer" + "'", str0,
        "PageCacheWarmer");
  }

  @Test
  public void test0505() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0505");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_CNT_BTXS_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "In-flight cache total bytes. (gauge)" + "'", str0,
        "In-flight cache total bytes. (gauge)");
  }

  @Test
  public void test0506() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0506");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_REPLICA_REPLICATED_DATABASE_STATE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "ReadReplicaReplicatedDatabaseState" + "'", str0,
        "ReadReplicaReplicatedDatabaseState");
  }

  @Test
  public void test0507() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0507");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__IS_EASCI__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Enable or disable the cluster state archiving." + "'", str0,
        "Enable or disable the cluster state archiving.");
  }

  @Test
  public void test0508() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0508");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__A;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "List all procedures in the DBMS." + "'",
        str0, "List all procedures in the DBMS.");
  }

  @Test
  public void test0509() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0509");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWNOK_STRING__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--keep-only-nodes-with-labels" + "'",
        str0, "--keep-only-nodes-with-labels");
  }

  @Test
  public void test0510() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0510");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "databases" + "'", str0, "databases");
  }

  @Test
  public void test0511() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0511");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STORE_VERSION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_version" + "'", str0,
        "store_version");
  }

  @Test
  public void test0512() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0512");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PAGE_CACHE_PROFILE_LOADER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PageCacheProfileLoader" + "'", str0,
        "PageCacheProfileLoader");
  }

  @Test
  public void test0513() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0513");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__REMOVE_ROLE_FROM_USER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.removeRoleFromUser" + "'",
        str0, "dbms.security.removeRoleFromUser");
  }

  @Test
  public void test0514() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0514");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DEFAULT_DISPATCHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default-dispatcher" + "'", str0,
        "default-dispatcher");
  }

  @Test
  public void test0515() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0515");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VM__FILE__DESCRIPTORS___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.file.descriptors.*" + "'", str0,
        "vm.file.descriptors.*");
  }

  @Test
  public void test0516() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0516");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__API;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.driver.api" + "'", str0,
        "fabric.driver.api");
  }

  @Test
  public void test0517() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0517");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MERGES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "merges" + "'", str0, "merges");
  }

  @Test
  public void test0518() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0518");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SET_UPGRADE_USER_PASSWORD_COMMAND___COMMAND__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Sets the password of the loopback operator user. " + "'", str0,
        "Sets the password of the loopback operator user. ");
  }

  @Test
  public void test0519() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0519");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ADMIN__INI;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin.ini" + "'", str0, "admin.ini");
  }

  @Test
  public void test0520() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0520");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FRAME_ENCODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "frame_encoder" + "'", str0,
        "frame_encoder");
  }

  @Test
  public void test0521() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0521");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LAST_CLOSED_TX_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "last_closed_tx_id" + "'", str0,
        "last_closed_tx_id");
  }

  @Test
  public void test0522() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0522");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ROLE_NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "roleName" + "'", str0, "roleName");
  }

  @Test
  public void test0523() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0523");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPF__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--from-pagecache" + "'", str0,
        "--from-pagecache");
  }

  @Test
  public void test0524() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0524");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__UNKNOWN_ADDRESS_LOGGING_THROTTLE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.unknown_address_logging_throttle" + "'", str0,
        "causal_clustering.unknown_address_logging_throttle");
  }

  @Test
  public void test0525() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0525");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_FTF__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<true/false>" + "'", str0,
        "<true/false>");
  }

  @Test
  public void test0526() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0526");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_DATABASE_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_database_id" + "'", str0,
        "hnd_req_database_id");
  }

  @Test
  public void test0527() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0527");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__BACKUP__INCREMENTAL__STRATEGY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.backup.incremental.strategy" + "'",
        str0, "dbms.backup.incremental.strategy");
  }

  @Test
  public void test0528() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0528");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PAGE_FAULTS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "page_faults" + "'", str0, "page_faults");
  }

  @Test
  public void test0529() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0529");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RANEAY_LONG;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Largest batch processed by RAFT in bytes" + "'", str0,
        "Largest batch processed by RAFT in bytes");
  }

  @Test
  public void test0530() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0530");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_FTF__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "If an incremental backup fails backup will move the old backup to <name>.err.<N> and fallback to a full."
            + "'", str0,
        "If an incremental backup fails backup will move the old backup to <name>.err.<N> and fallback to a full.");
  }

  @Test
  public void test0531() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0531");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE_DEFAULT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DatabaseDefault" + "'", str0,
        "DatabaseDefault");
  }

  @Test
  public void test0532() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0532");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECORNES_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Akka cluster phi accrual failure detector. Number of member nodes that each member will send heartbeat messages to, i.e. each node will be monitored by this number of other nodes."
            + "'", str0,
        "Akka cluster phi accrual failure detector. Number of member nodes that each member will send heartbeat messages to, i.e. each node will be monitored by this number of other nodes.");
  }

  @Test
  public void test0533() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0533");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__BP_PATH__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>" + "'", str0, "<path>");
  }

  @Test
  public void test0534() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0534");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED_CON_PX_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of different property names used in the database. (gauge)" + "'", str0,
        "The total number of different property names used in the database. (gauge)");
  }

  @Test
  public void test0535() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0535");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCHUP__TX_PULL_REQUESTS_RECEIVED;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.catchup.tx_pull_requests_received" + "'", str0,
        "causal_clustering.catchup.tx_pull_requests_received");
  }

  @Test
  public void test0536() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0536");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOTEE_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "An LDAP system account username to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`. Note that the `dbms.security.ldap.authentication.user_dn_template` will not be applied to this username, so you may have to specify a full DN."
            + "'", str0,
        "An LDAP system account username to use for authorization searches when `dbms.security.ldap.authorization.use_system_account` is `true`. Note that the `dbms.security.ldap.authentication.user_dn_template` will not be applied to this username, so you may have to specify a full DN.");
  }

  @Test
  public void test0537() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0537");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VISIBLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "visible" + "'", str0, "visible");
  }

  @Test
  public void test0538() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0538");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY5;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Administration command: ALTER USER" + "'", str0,
        "Administration command: ALTER USER");
  }

  @Test
  public void test0539() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0539");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.APPENDED_BYTES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "appended_bytes" + "'", str0,
        "appended_bytes");
  }

  @Test
  public void test0540() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0540");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LG_SC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lgSc" + "'", str0, "lgSc");
  }

  @Test
  public void test0541() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0541");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P___DBMS__CLUSTER___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/dbms/cluster.*" + "'", str0,
        "/dbms/cluster.*");
  }

  @Test
  public void test0542() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0542");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "time" + "'", str0, "time");
  }

  @Test
  public void test0543() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0543");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_PRUNING_FREQUENCY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_log_pruning_frequency" + "'", str0,
        "causal_clustering.raft_log_pruning_frequency");
  }

  @Test
  public void test0544() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0544");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PARAMETERS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parameters" + "'", str0, "parameters");
  }

  @Test
  public void test0545() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0545");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SERVER___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "server.*" + "'", str0, "server.*");
  }

  @Test
  public void test0546() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0546");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_GARBAGE_COLLECTION_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".GC metrics." + "'", str0,
        ".GC metrics.");
  }

  @Test
  public void test0547() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0547");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STORE_COPY2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "storeCopy" + "'", str0, "storeCopy");
  }

  @Test
  public void test0548() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0548");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_CLUSTER_API___PATH_PARAM__GDB_NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "databaseName" + "'", str0,
        "databaseName");
  }

  @Test
  public void test0549() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0549");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAEDE_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Time that seed nodes will spend trying to find an existing cluster before forming a new cluster"
            + "'", str0,
        "Time that seed nodes will spend trying to find an existing cluster before forming a new cluster");
  }

  @Test
  public void test0550() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0550");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P___VAR__RUN__SECRETS__KUBERNETES__IO__SERVICEACCOUNT__CA__CRT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "/var/run/secrets/kubernetes.io/serviceaccount/ca.crt" + "'", str0,
        "/var/run/secrets/kubernetes.io/serviceaccount/ca.crt");
  }

  @Test
  public void test0551() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0551");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_IMPLEMENTATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_log_implementation" + "'", str0,
        "causal_clustering.raft_log_implementation");
  }

  @Test
  public void test0552() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0552");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_EVCO_ERRS_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of exceptions seen during the eviction process in the page cache. (counter)"
            + "'", str0,
        "The total number of exceptions seen during the eviction process in the page cache. (counter)");
  }

  @Test
  public void test0553() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0553");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEGHB_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test0554() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0554");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_COCDTVORY_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Comma separated list of groups to be used by the connect-randomly-to-server-group selection strategy. The connect-randomly-to-server-group strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `connect-randomly-to-server-group`. "
            + "'", str0,
        "Comma separated list of groups to be used by the connect-randomly-to-server-group selection strategy. The connect-randomly-to-server-group strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `connect-randomly-to-server-group`. ");
  }

  @Test
  public void test0555() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0555");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__PROMETHEUS__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.prometheus.enabled" + "'", str0,
        "metrics.prometheus.enabled");
  }

  @Test
  public void test0556() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0556");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LTS_PATH__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--from-path-tx" + "'", str0,
        "--from-path-tx");
  }

  @Test
  public void test0557() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0557");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RELATIONSHIP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "relationship" + "'", str0,
        "relationship");
  }

  @Test
  public void test0558() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0558");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "User" + "'", str0, "User");
  }

  @Test
  public void test0559() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0559");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE3;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DATABASE" + "'", str0, "DATABASE");
  }

  @Test
  public void test0560() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0560");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_ELECTION_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.leader_election_timeout" + "'", str0,
        "causal_clustering.leader_election_timeout");
  }

  @Test
  public void test0561() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0561");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONVERGED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "converged" + "'", str0, "converged");
  }

  @Test
  public void test0562() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0562");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_SD_CSZ;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Count of successful database stop operations. (counter)" + "'",
        str0, "Count of successful database stop operations. (counter)");
  }

  @Test
  public void test0563() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0563");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HANDSHAKE_INITIALIZER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "handshake_initializer" + "'", str0,
        "handshake_initializer");
  }

  @Test
  public void test0564() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0564");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_VM__MEMORY__POOL__G1_OLD_GEN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*vm.memory.pool.g1_old_gen" + "'", str0,
        "*vm.memory.pool.g1_old_gen");
  }

  @Test
  public void test0565() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0565");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATION_LEADER_AWAIT_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.replication_leader_await_timeout" + "'", str0,
        "causal_clustering.replication_leader_await_timeout");
  }

  @Test
  public void test0566() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0566");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__TH_PATH__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str0,
        "Path to the home directory for the copied database. Default is the same as the database copied from.");
  }

  @Test
  public void test0567() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0567");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HIGH_LIMIT_V3_0_0;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_0_0" + "'", str0,
        "high_limitV3_0_0");
  }

  @Test
  public void test0568() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0568");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___IS_SSEDD;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "List all available roles." + "'", str0,
        "List all available roles.");
  }

  @Test
  public void test0569() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0569");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__LOGGING_FILTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.logging-filter" + "'", str0,
        "akka.logging-filter");
  }

  @Test
  public void test0570() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0570");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY4;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Delete the specified user." + "'", str0,
        "Delete the specified user.");
  }

  @Test
  public void test0571() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0571");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.QUERY_PLAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "queryPlan" + "'", str0, "queryPlan");
  }

  @Test
  public void test0572() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0572");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SERVER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "server" + "'", str0, "server");
  }

  @Test
  public void test0573() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0573");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_RES_COPY_FIN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_res_copy_fin" + "'", str0,
        "hnd_res_copy_fin");
  }

  @Test
  public void test0574() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0574");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CHECKPOINT_COUNTER_ADAPTER___DOCUMENTED_CK_PTX_CNT_LTM_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total time, in milliseconds, spent in check pointing so far. (counter)" + "'", str0,
        "The total time, in milliseconds, spent in check pointing so far. (counter)");
  }

  @Test
  public void test0575() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0575");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CREATE_RELATIONSHIP_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "createRelationshipType" + "'", str0,
        "createRelationshipType");
  }

  @Test
  public void test0576() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0576");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SNAPPY_VALIDATING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Snappy_validating" + "'", str0,
        "Snappy_validating");
  }

  @Test
  public void test0577() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0577");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__LEVEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.logs.security.level" + "'", str0,
        "dbms.logs.security.level");
  }

  @Test
  public void test0578() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0578");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPF__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The size of the page cache to use for reading." + "'", str0,
        "The size of the page cache to use for reading.");
  }

  @Test
  public void test0579() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0579");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__IS_EASCI__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<true/false>" + "'", str0,
        "<true/false>");
  }

  @Test
  public void test0580() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0580");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ZLIB_DECODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zlib_decoder" + "'", str0,
        "zlib_decoder");
  }

  @Test
  public void test0581() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0581");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LAST_LEADER_MESSAGE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "last_leader_message" + "'", str0,
        "last_leader_message");
  }

  @Test
  public void test0582() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0582");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_MTO;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "method" + "'", str0, "method");
  }

  @Test
  public void test0583() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0583");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DEC_REQ_DISPATCH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dec_req_dispatch" + "'", str0,
        "dec_req_dispatch");
  }

  @Test
  public void test0584() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0584");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__TRE_FROM_PATHS__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>[,<path>...]" + "'", str0,
        "<path>[,<path>...]");
  }

  @Test
  public void test0585() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0585");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE_LOGGING__LEVEL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware_logging.level" + "'", str0,
        "causal_clustering.middleware_logging.level");
  }

  @Test
  public void test0586() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0586");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__API;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.api" + "'", str0, "driver.api");
  }

  @Test
  public void test0587() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0587");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_GET_METADATA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_get_metadata" + "'", str0,
        "enc_get_metadata");
  }

  @Test
  public void test0588() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0588");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LABEL_SELECTOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "labelSelector" + "'", str0,
        "labelSelector");
  }

  @Test
  public void test0589() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0589");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MAX_BYTES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_bytes" + "'", str0, "max_bytes");
  }

  @Test
  public void test0590() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0590");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_DIVIAS_SOCKET_ADDRESS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Host and port to bind the cluster member discovery management communication." + "'",
        str0, "Host and port to bind the cluster member discovery management communication.");
  }

  @Test
  public void test0591() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0591");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__LOGLEVEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.loglevel" + "'", str0,
        "akka.loglevel");
  }

  @Test
  public void test0592() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0592");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RELATIONSHIP_TYPE_DISTRIBUTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "relationship-type-distribution" + "'",
        str0, "relationship-type-distribution");
  }

  @Test
  public void test0593() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0593");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__LABEL_SELECTOR;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.kubernetes.label_selector" + "'", str0,
        "causal_clustering.kubernetes.label_selector");
  }

  @Test
  public void test0594() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0594");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.THREAD__TOTAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "thread.total" + "'", str0,
        "thread.total");
  }

  @Test
  public void test0595() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0595");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HTTPS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "https" + "'", str0, "https");
  }

  @Test
  public void test0596() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0596");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.INITIAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial" + "'", str0, "initial");
  }

  @Test
  public void test0597() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0597");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TYPICALLY_CONNECT_TO_RANDOM_READ_REPLICA;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "typically-connect-to-random-read-replica" + "'", str0,
        "typically-connect-to-random-read-replica");
  }

  @Test
  public void test0598() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0598");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURES___NAME___LIST_LBL_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "labels" + "'", str0, "labels");
  }

  @Test
  public void test0599() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0599");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_DRO_CSZ;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Count of successful database drop operations. (counter)" + "'",
        str0, "Count of successful database drop operations. (counter)");
  }

  @Test
  public void test0600() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0600");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_API___PATH___CONFIG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
  }

  @Test
  public void test0601() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0601");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_FTF__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--fallback-to-full" + "'", str0,
        "--fallback-to-full");
  }

  @Test
  public void test0602() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0602");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__STREAM__CONCURRENCY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric.stream.concurrency" + "'", str0,
        "fabric.stream.concurrency");
  }

  @Test
  public void test0603() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0603");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CONNECTION_TIMEOUT2;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.connection_timeout" + "'", str0,
        "causal_clustering.middleware.akka.connection_timeout");
  }

  @Test
  public void test0604() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0604");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONNECT_RANDOMLY_WITHIN_SERVER_GROUP;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "connect-randomly-within-server-group" + "'", str0,
        "connect-randomly-within-server-group");
  }

  @Test
  public void test0605() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0605");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_CYRNND_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test0606() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0606");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_HIT_RAI_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The ratio of hits to the total number of lookups in the page cache. (gauge)" + "'", str0,
        "The ratio of hits to the total number of lookups in the page cache. (gauge)");
  }

  @Test
  public void test0607() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0607");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ADDRESS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "address" + "'", str0, "address");
  }

  @Test
  public void test0608() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0608");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_READER_POOL_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_log_reader_pool_size" + "'", str0,
        "causal_clustering.raft_log_reader_pool_size");
  }

  @Test
  public void test0609() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0609");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JETTY_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Server metrics" + "'", str0,
        ".Server metrics");
  }

  @Test
  public void test0610() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0610");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__LOGGERS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.loggers" + "'", str0,
        "akka.loggers");
  }

  @Test
  public void test0611() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0611");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPT__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<size>" + "'", str0, "<size>");
  }

  @Test
  public void test0612() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0612");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_POOL__TRANSACTION___STAR___USED_NATIVE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*pool.transaction.*.used_native" + "'",
        str0, "*pool.transaction.*.used_native");
  }

  @Test
  public void test0613() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0613");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION__BROWSER_RETAIN_CONNECTION_CREDENTIALS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Allows browser to persist login / password." + "'", str0,
        "Allows browser to persist login / password.");
  }

  @Test
  public void test0614() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0614");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___COMMAND__HEADER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Removes and archives all cluster state." + "'", str0,
        "Removes and archives all cluster state.");
  }

  @Test
  public void test0615() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0615");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.APPLIED_INDEX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "applied_index" + "'", str0,
        "applied_index");
  }

  @Test
  public void test0616() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0616");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAETLSE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors"
            + "'", str0,
        "Parallelism level of default dispatcher used by Akka based cluster topology discovery, including cluster, replicator, and discovery actors");
  }

  @Test
  public void test0617() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0617");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY3;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Administration command: REVOKE ROLE FROM USER" + "'", str0,
        "Administration command: REVOKE ROLE FROM USER");
  }

  @Test
  public void test0618() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0618");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_CONTENT_TYPE_DISPATCHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft_content_type_dispatcher" + "'",
        str0, "raft_content_type_dispatcher");
  }

  @Test
  public void test0619() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0619");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_JOAPO_DURATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Time out for a new member to catch up" + "'", str0,
        "Time out for a new member to catch up");
  }

  @Test
  public void test0620() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0620");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FOR_DATABASE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FOR_DATABASE" + "'", str0,
        "FOR_DATABASE");
  }

  @Test
  public void test0621() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0621");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__TRANS_IDX__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.upgradeStatusDetails" + "'", str0,
        "dbms.upgradeStatusDetails");
  }

  @Test
  public void test0622() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0622");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__CLUSTERING__ENABLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.clustering.enable" + "'", str0,
        "dbms.clustering.enable");
  }

  @Test
  public void test0623() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0623");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEEIGL_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test0624() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0624");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_MESSAGE_COMPOSER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft_message_composer" + "'", str0,
        "raft_message_composer");
  }

  @Test
  public void test0625() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0625");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_ELMT_CSZ_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "In-flight cache element count. (gauge)" + "'", str0,
        "In-flight cache element count. (gauge)");
  }

  @Test
  public void test0626() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0626");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENTERPRISE_SECURITY_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.showCurrentUser" + "'", str0,
        "dbms.showCurrentUser");
  }

  @Test
  public void test0627() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0627");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "duration" + "'", str0, "duration");
  }

  @Test
  public void test0628() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0628");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_TEMASE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The maximum file size before the term state file is rotated (in unit of entries)" + "'",
        str0, "The maximum file size before the term state file is rotated (in unit of entries)");
  }

  @Test
  public void test0629() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0629");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ABSTRACT_MULTI_GDB_SERVICE___PATH___EXCEPTION4;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
  }

  @Test
  public void test0630() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0630");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "read" + "'", str0, "read");
  }

  @Test
  public void test0631() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0631");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTIERTTE_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The attribute to use when looking up users.\nUsing this setting requires `dbms.security.ldap.authentication.search_for_attribute` to be true and thus `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured."
            + "'", str0,
        "The attribute to use when looking up users.\nUsing this setting requires `dbms.security.ldap.authentication.search_for_attribute` to be true and thus `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.");
  }

  @Test
  public void test0632() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0632");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY8;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Delete the specified role. Any role assignments will be removed."
            + "'", str0, "Delete the specified role. Any role assignments will be removed.");
  }

  @Test
  public void test0633() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0633");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_GET_INFO;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_get_info" + "'", str0,
        "hnd_req_get_info");
  }

  @Test
  public void test0634() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0634");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NORMALIZED_DATABASE_NAME_PATH_OPTION_WRAPPER___OPTION__NORMALIZED_DATABASE_NAME__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--from-database" + "'", str0,
        "--from-database");
  }

  @Test
  public void test0635() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0635");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVGNL_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the duration of garbage collections. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the duration of garbage collections. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test0636() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0636");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GZIP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Gzip" + "'", str0, "Gzip");
  }

  @Test
  public void test0637() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0637");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.L_Z4_HIGH_COMPRESSION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LZ4_high_compression" + "'", str0,
        "LZ4_high_compression");
  }

  @Test
  public void test0638() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0638");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__UPSTREAM_SELECTION_STRATEGY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.upstream_selection_strategy" + "'", str0,
        "causal_clustering.upstream_selection_strategy");
  }

  @Test
  public void test0639() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0639");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_USE__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.createRole" + "'", str0,
        "dbms.security.createRole");
  }

  @Test
  public void test0640() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0640");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TX_CATCHUP_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".CatchUp Metrics" + "'", str0,
        ".CatchUp Metrics");
  }

  @Test
  public void test0641() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0641");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRT_PATH__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--to-data-tx-directory" + "'", str0,
        "--to-data-tx-directory");
  }

  @Test
  public void test0642() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0642");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TPX_NEW_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Raft replication new request count. (counter)" + "'", str0,
        "Raft replication new request count. (counter)");
  }

  @Test
  public void test0643() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0643");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LOOPBACK_OPERATOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LOOPBACK_OPERATOR" + "'", str0,
        "LOOPBACK_OPERATOR");
  }

  @Test
  public void test0644() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0644");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BATCH_SIZE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BatchSize" + "'", str0, "BatchSize");
  }

  @Test
  public void test0645() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0645");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_APLD_IDX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Applied index of the RAFT log. (gauge)" + "'", str0,
        "Applied index of the RAFT log. (gauge)");
  }

  @Test
  public void test0646() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0646");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MIUETZOI_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Minimum number of Core machines initially required to form a cluster. The cluster will form when at least this many Core members have discovered each other."
            + "'", str0,
        "Minimum number of Core machines initially required to form a cluster. The cluster will form when at least this many Core members have discovered each other.");
  }

  @Test
  public void test0647() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0647");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_WX_TXS_ACI_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The number of currently active write transactions. (gauge)" + "'",
        str0, "The number of currently active write transactions. (gauge)");
  }

  @Test
  public void test0648() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0648");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__ROTATION__KEEP_NUMBER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.logs.security.rotation.keep_number" + "'", str0,
        "dbms.logs.security.rotation.keep_number");
  }

  @Test
  public void test0649() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0649");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ALLOCATED_BYTES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "allocatedBytes" + "'", str0,
        "allocatedBytes");
  }

  @Test
  public void test0650() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0650");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONNECTIONS_CLOSED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connections_closed" + "'", str0,
        "connections_closed");
  }

  @Test
  public void test0651() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0651");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_IOP_LIIR_TIE_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of times page cache flush IO limiter was throttled during ongoing IO operations."
            + "'", str0,
        "The total number of times page cache flush IO limiter was throttled during ongoing IO operations.");
  }

  @Test
  public void test0652() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0652");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_QUALIFIER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UserQualifier" + "'", str0,
        "UserQualifier");
  }

  @Test
  public void test0653() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0653");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_RES_CATCHUP_ERROR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_res_catchup_error" + "'", str0,
        "hnd_res_catchup_error");
  }

  @Test
  public void test0654() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0654");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_COCRC_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "The number of remote graphs" + "'", str0,
        "The number of remote graphs");
  }

  @Test
  public void test0655() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0655");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_SNAPSHOT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_snapshot" + "'", str0,
        "enc_snapshot");
  }

  @Test
  public void test0656() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0656");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SAMACCOUNTNAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "samaccountname" + "'", str0,
        "samaccountname");
  }

  @Test
  public void test0657() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0657");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__NAMESPACE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.kubernetes.namespace" + "'", str0,
        "causal_clustering.kubernetes.namespace");
  }

  @Test
  public void test0658() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0658");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FUNCTION_QUALIFIER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FunctionQualifier" + "'", str0,
        "FunctionQualifier");
  }

  @Test
  public void test0659() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0659");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.QUARANTINED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "quarantined" + "'", str0, "quarantined");
  }

  @Test
  public void test0660() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0660");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Discovery core metrics" + "'", str0,
        ".Discovery core metrics");
  }

  @Test
  public void test0661() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0661");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.V_127_0_0_1;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "127.0.0.1" + "'", str0, "127.0.0.1");
  }

  @Test
  public void test0662() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0662");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_RP__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use."
            + "'", str0,
        "Allow multiple threads to apply pulled transactions to a backup in parallel. For some databases and workloads this may reduce backup times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.");
  }

  @Test
  public void test0663() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0663");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__LOGGING__LEVEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.logging.level" + "'", str0,
        "driver.logging.level");
  }

  @Test
  public void test0664() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0664");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PROK_TOKEN_NAME_PROPERTY_D_T_O__NAMES;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "--keep-only-relationship-properties" + "'", str0,
        "--keep-only-relationship-properties");
  }

  @Test
  public void test0665() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0665");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_SESN_BEG_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of Bolt sessions started since this instance started. This includes both succeeded and failed sessions (deprecated, use connections_opened instead). (counter)"
            + "'", str0,
        "The total number of Bolt sessions started since this instance started. This includes both succeeded and failed sessions (deprecated, use connections_opened instead). (counter)");
  }

  @Test
  public void test0666() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0666");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_POOL__TRANSACTION___STAR___USED_HEAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*pool.transaction.*.used_heap" + "'",
        str0, "*pool.transaction.*.used_heap");
  }

  @Test
  public void test0667() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0667");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ROLLBACKS_READ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rollbacks_read" + "'", str0,
        "rollbacks_read");
  }

  @Test
  public void test0668() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0668");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HOUR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hour" + "'", str0, "hour");
  }

  @Test
  public void test0669() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0669");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__JVM__MEMORY__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.jvm.memory.enabled" + "'", str0,
        "metrics.jvm.memory.enabled");
  }

  @Test
  public void test0670() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0670");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTICS_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "LDAP authentication mechanism. This is one of `simple` or a SASL mechanism supported by JNDI, for example `DIGEST-MD5`. `simple` is basic username and password authentication and SASL is used for more advanced mechanisms. See RFC 2251 LDAPv3 documentation for more details."
            + "'", str0,
        "LDAP authentication mechanism. This is one of `simple` or a SASL mechanism supported by JNDI, for example `DIGEST-MD5`. `simple` is basic username and password authentication and SASL is used for more advanced mechanisms. See RFC 2251 LDAPv3 documentation for more details.");
  }

  @Test
  public void test0671() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0671");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TLS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TLS" + "'", str0, "TLS");
  }

  @Test
  public void test0672() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0672");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_SIZ_HEA_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The transactions' size on heap in bytes. (histogram)" + "'", str0,
        "The transactions' size on heap in bytes. (histogram)");
  }

  @Test
  public void test0673() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0673");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_F__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--from" + "'", str0, "--from");
  }

  @Test
  public void test0674() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0674");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__CA_PATH__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Configuration file to supply additional configuration in." + "'",
        str0, "Configuration file to supply additional configuration in.");
  }

  @Test
  public void test0675() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0675");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___JOB_SCHEDULER__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.scheduler.profile" + "'", str0,
        "dbms.scheduler.profile");
  }

  @Test
  public void test0676() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0676");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__GROUP_TO_ROLE_MAPPING;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authorization.group_to_role_mapping" + "'",
        str0, "dbms.security.ldap.authorization.group_to_role_mapping");
  }

  @Test
  public void test0677() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0677");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NONE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "none" + "'", str0, "none");
  }

  @Test
  public void test0678() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0678");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ABSTRACT_MULTI_GDB_SERVICE___PATH___EXCEPTION3;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "available" + "'", str0, "available");
  }

  @Test
  public void test0679() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0679");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATION_RETRY_TIMEOUT_BASE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.replication_retry_timeout_base" + "'", str0,
        "causal_clustering.replication_retry_timeout_base");
  }

  @Test
  public void test0680() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0680");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__IS_FRE__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Force the command to run even if the integrity of the database can not be verified."
            + "'", str0,
        "Force the command to run even if the integrity of the database can not be verified.");
  }

  @Test
  public void test0681() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0681");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JOINER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "joiner" + "'", str0, "joiner");
  }

  @Test
  public void test0682() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0682");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JAVA__NAMING__SECURITY__CREDENTIALS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "java.naming.security.credentials" + "'",
        str0, "java.naming.security.credentials");
  }

  @Test
  public void test0683() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0683");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_CHUNKED_WRITER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft_chunked_writer" + "'", str0,
        "raft_chunked_writer");
  }

  @Test
  public void test0684() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0684");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_VM__PAUSE_TIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*vm.pause_time" + "'", str0,
        "*vm.pause_time");
  }

  @Test
  public void test0685() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0685");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURES___DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Create a named node key constraint. Backing index will use specified index provider and configuration (optional). Yield: name, labels, properties, providerName, status"
            + "'", str0,
        "Create a named node key constraint. Backing index will use specified index provider and configuration (optional). Yield: name, labels, properties, providerName, status");
  }

  @Test
  public void test0686() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0686");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.APPLICATION_PROTOCOL_VERSION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "applicationProtocolVersion" + "'", str0,
        "applicationProtocolVersion");
  }

  @Test
  public void test0687() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0687");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__NEO4J__DATA__COUNTS__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.neo4j.data.counts.enabled" + "'",
        str0, "metrics.neo4j.data.counts.enabled");
  }

  @Test
  public void test0688() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0688");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVLCOA_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about the number of open file descriptors. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about the number of open file descriptors. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test0689() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0689");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__CSV__ROTATION__KEEP_NUMBER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.csv.rotation.keep_number" + "'",
        str0, "metrics.csv.rotation.keep_number");
  }

  @Test
  public void test0690() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0690");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__FORMAT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.logs.security.format" + "'", str0,
        "dbms.logs.security.format");
  }

  @Test
  public void test0691() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0691");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_FILE_STAT_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".JVM file descriptor metrics." + "'",
        str0, ".JVM file descriptor metrics.");
  }

  @Test
  public void test0692() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0692");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_CC__DEFAULT_VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
  }

  @Test
  public void test0693() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0693");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__BIND__HOSTNAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.remote.artery.bind.hostname" + "'",
        str0, "akka.remote.artery.bind.hostname");
  }

  @Test
  public void test0694() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0694");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DB_ROLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DbRole" + "'", str0, "DbRole");
  }

  @Test
  public void test0695() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0695");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__AUTHORIZATION_PROVIDERS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.authorization_providers" + "'", str0,
        "dbms.security.authorization_providers");
  }

  @Test
  public void test0696() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0696");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JETTY_ADAPTER___DOCUMENTED_THX_JET_IDL_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of idle threads in the jetty pool. (gauge)" + "'",
        str0, "The total number of idle threads in the jetty pool. (gauge)");
  }

  @Test
  public void test0697() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0697");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__SINK_PARALLELISM;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.sink-parallelism" + "'", str0,
        "causal_clustering.middleware.akka.sink-parallelism");
  }

  @Test
  public void test0698() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0698");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SUSPENDED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "suspended" + "'", str0, "suspended");
  }

  @Test
  public void test0699() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0699");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_IPT__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.createUser" + "'", str0,
        "dbms.security.createUser");
  }

  @Test
  public void test0700() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0700");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURES___NAME___STR_NC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "constraintName" + "'", str0,
        "constraintName");
  }

  @Test
  public void test0701() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0701");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.UNPINS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unpins" + "'", str0, "unpins");
  }

  @Test
  public void test0702() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0702");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MODIFIER_PROTOCOLS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "modifierProtocols" + "'", str0,
        "modifierProtocols");
  }

  @Test
  public void test0703() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0703");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME4;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.deleteUser" + "'", str0,
        "dbms.security.deleteUser");
  }

  @Test
  public void test0704() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0704");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JAVA__NAMING__PROVIDER__URL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "java.naming.provider.url" + "'", str0,
        "java.naming.provider.url");
  }

  @Test
  public void test0705() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0705");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_ROLES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.listRoles" + "'", str0,
        "dbms.security.listRoles");
  }

  @Test
  public void test0706() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0706");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_UNI_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of page unpins executed by the page cache. (counter)" + "'", str0,
        "The total number of page unpins executed by the page cache. (counter)");
  }

  @Test
  public void test0707() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0707");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_ROTATION_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_log_rotation_size" + "'", str0,
        "causal_clustering.raft_log_rotation_size");
  }

  @Test
  public void test0708() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0708");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__R__DEPRECATED_BY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Administration command: SHOW ROLES WITH USERS" + "'", str0,
        "Administration command: SHOW ROLES WITH USERS");
  }

  @Test
  public void test0709() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0709");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FAILURE_REASON;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "failureReason" + "'", str0,
        "failureReason");
  }

  @Test
  public void test0710() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0710");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MILLIS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "millis" + "'", str0, "millis");
  }

  @Test
  public void test0711() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0711");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_REEE_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of messages received via Bolt since this instance started. (counter)"
            + "'", str0,
        "The total number of messages received via Bolt since this instance started. (counter)");
  }

  @Test
  public void test0712() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0712");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__IS_EASCI__ARITY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "1" + "'", str0, "1");
  }

  @Test
  public void test0713() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0713");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE__ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "database.id" + "'", str0, "database.id");
  }

  @Test
  public void test0714() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0714");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SOURCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "source" + "'", str0, "source");
  }

  @Test
  public void test0715() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0715");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LOG_SHIPPING_MAX_LAG;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.log_shipping_max_lag" + "'", str0,
        "causal_clustering.log_shipping_max_lag");
  }

  @Test
  public void test0716() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0716");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTIEET_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "LDAP user DN template. An LDAP object is referenced by its distinguished name (DN), and a user DN is an LDAP fully-qualified unique user identifier. This setting is used to generate an LDAP DN that conforms with the LDAP directory's schema from the user principal that is submitted with the authentication token when logging in. The special token {0} is a placeholder where the user principal will be substituted into the DN string."
            + "'", str0,
        "LDAP user DN template. An LDAP object is referenced by its distinguished name (DN), and a user DN is an LDAP fully-qualified unique user identifier. This setting is used to generate an LDAP DN that conforms with the LDAP directory's schema from the user principal that is submitted with the authentication token when logging in. The special token {0} is a placeholder where the user principal will be substituted into the DN string.");
  }

  @Test
  public void test0717() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0717");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TOTAL_USED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "total_used" + "'", str0, "total_used");
  }

  @Test
  public void test0718() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0718");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_CLEDEIT_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Configures the time after which we retry binding to a cluster. Only applies to Akka discovery. A discovery type of DNS/SRV/K8S will be queried again on retry."
            + "'", str0,
        "Configures the time after which we retry binding to a cluster. Only applies to Akka discovery. A discovery type of DNS/SRV/K8S will be queried again on retry.");
  }

  @Test
  public void test0719() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0719");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__LOGGING__LEVEL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.logging.level" + "'", str0,
        "causal_clustering.middleware.logging.level");
  }

  @Test
  public void test0720() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0720");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__BIND__PORT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.remote.artery.bind.port" + "'",
        str0, "akka.remote.artery.bind.port");
  }

  @Test
  public void test0721() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0721");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.K8_KIND___TYPE__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ServiceList" + "'", str0, "ServiceList");
  }

  @Test
  public void test0722() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0722");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MAFN_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The maximum number of TCP channels between two nodes to operate the raft protocol.Each database gets allocated one channel, but a single channel can be used by more than one database."
            + "'", str0,
        "The maximum number of TCP channels between two nodes to operate the raft protocol.Each database gets allocated one channel, but a single channel can be used by more than one database.");
  }

  @Test
  public void test0723() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0723");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP___DESCRIPTION__SETTING_ONEUB_BOOLEAN;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Enable support for running online backups." + "'", str0,
        "Enable support for running online backups.");
  }

  @Test
  public void test0724() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0724");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ACCUMULATED_QUEUE_TIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "accumulated_queue_time" + "'", str0,
        "accumulated_queue_time");
  }

  @Test
  public void test0725() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0725");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CHECKPOINT_COUNTER_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Database checkpointing metrics" + "'",
        str0, ".Database checkpointing metrics");
  }

  @Test
  public void test0726() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0726");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__E__DEPRECATED_BY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Administration command: SHOW USERS" + "'", str0,
        "Administration command: SHOW USERS");
  }

  @Test
  public void test0727() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0727");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRVA_DRIVER_API;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Determines which driver API will be used. ASYNC must be used when the remote instance is 3.5"
            + "'", str0,
        "Determines which driver API will be used. ASYNC must be used when the remote instance is 3.5");
  }

  @Test
  public void test0728() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0728");
    }
    io.github.onograph.I18N.buildMessageMap();
  }

  @Test
  public void test0729() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0729");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENTERPRISE_SECURITY_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION2;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Clears authentication and authorization cache." + "'", str0,
        "Clears authentication and authorization cache.");
  }

  @Test
  public void test0730() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0730");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEUND_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test0731() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0731");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ELAPSED_TIME_MS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "elapsedTimeMs" + "'", str0,
        "elapsedTimeMs");
  }

  @Test
  public void test0732() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0732");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_DRROTOZ_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unlimited" + "'", str0, "Unlimited");
  }

  @Test
  public void test0733() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0733");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_TRANSACTION__ROLLBACKS_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*transaction.rollbacks*" + "'", str0,
        "*transaction.rollbacks*");
  }

  @Test
  public void test0734() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0734");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FOR_ROLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FOR_ROLE" + "'", str0, "FOR_ROLE");
  }

  @Test
  public void test0735() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0735");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TERMINATED_READ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "terminated_read" + "'", str0,
        "terminated_read");
  }

  @Test
  public void test0736() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0736");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_RP__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<true/false>" + "'", str0,
        "<true/false>");
  }

  @Test
  public void test0737() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0737");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_TX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_tx" + "'", str0, "hnd_req_tx");
  }

  @Test
  public void test0738() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0738");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_IDS_IN_USE__RELATIONSHIP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*ids_in_use.relationship" + "'", str0,
        "*ids_in_use.relationship");
  }

  @Test
  public void test0739() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0739");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CLUSTER_CLIENT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cluster-client" + "'", str0,
        "cluster-client");
  }

  @Test
  public void test0740() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0740");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_RES_PRE_COPY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_res_pre_copy" + "'", str0,
        "enc_res_pre_copy");
  }

  @Test
  public void test0741() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0741");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED_HEA_CMTX_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Amount of memory (in bytes) guaranteed to be available for use by the JVM. (gauge)"
            + "'", str0,
        "Amount of memory (in bytes) guaranteed to be available for use by the JVM. (gauge)");
  }

  @Test
  public void test0742() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0742");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_VOEASE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The maximum file size before the vote state file is rotated (in unit of entries)" + "'",
        str0, "The maximum file size before the vote state file is rotated (in unit of entries)");
  }

  @Test
  public void test0743() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0743");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDSR_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Use secure communication with the LDAP server using opportunistic TLS. First an initial insecure connection will be made with the LDAP server, and a STARTTLS command will be issued to negotiate an upgrade of the connection to TLS before initiating authentication."
            + "'", str0,
        "Use secure communication with the LDAP server using opportunistic TLS. First an initial insecure connection will be made with the LDAP server, and a STARTTLS command will be issued to negotiate an upgrade of the connection to TLS before initiating authentication.");
  }

  @Test
  public void test0744() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0744");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__IS_RP__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Allow multiple threads to apply transactions to a backup in parallel. For some databases and workloads this may reduce execution times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use."
            + "'", str0,
        "Allow multiple threads to apply transactions to a backup in parallel. For some databases and workloads this may reduce execution times significantly.\nNote: this is an EXPERIMENTAL option. Consult Neo4j support before use.");
  }

  @Test
  public void test0745() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0745");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HIT_RATIO;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hit_ratio" + "'", str0, "hit_ratio");
  }

  @Test
  public void test0746() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0746");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_REPLICA_DATABASE_ID_READER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "readReplicaDatabaseIdReader" + "'", str0,
        "readReplicaDatabaseIdReader");
  }

  @Test
  public void test0747() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0747");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROPERTY_KEY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PropertyKey" + "'", str0, "PropertyKey");
  }

  @Test
  public void test0748() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0748");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Boolean" + "'", str0, "Boolean");
  }

  @Test
  public void test0749() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0749");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___DATABASE_CONTEXT__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.functions" + "'", str0,
        "dbms.functions");
  }

  @Test
  public void test0750() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0750");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SESSION_TRACKER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "session-tracker" + "'", str0,
        "session-tracker");
  }

  @Test
  public void test0751() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0751");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___DATABASE_CONTEXT__DEPRECATED_BY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHOW FUNCTIONS command" + "'", str0,
        "SHOW FUNCTIONS command");
  }

  @Test
  public void test0752() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0752");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STORAGE_ENGINE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "storage_engine" + "'", str0,
        "storage_engine");
  }

  @Test
  public void test0753() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0753");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LDAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ldap" + "'", str0, "ldap");
  }

  @Test
  public void test0754() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0754");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USAGE_RATIO;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "usage_ratio" + "'", str0, "usage_ratio");
  }

  @Test
  public void test0755() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0755");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DISCOVERY_TO_NEO4J_DISPATCHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "discovery-to-neo4j-dispatcher" + "'",
        str0, "discovery-to-neo4j-dispatcher");
  }

  @Test
  public void test0756() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0756");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NORMALIZED_DATABASE_NAME_PATH_OPTION_WRAPPER___OPTION__PATH__DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Path to the database to copy from." + "'", str0,
        "Path to the database to copy from.");
  }

  @Test
  public void test0757() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0757");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NEO4J_CLUSTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NEO4J_CLUSTER" + "'", str0,
        "NEO4J_CLUSTER");
  }

  @Test
  public void test0758() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0758");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PUBLISHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "publisher" + "'", str0, "publisher");
  }

  @Test
  public void test0759() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0759");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__PROPERTY_LEVEL__ENABLED;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.property_level.enabled" + "'", str0,
        "dbms.security.property_level.enabled");
  }

  @Test
  public void test0760() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0760");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_BEG_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of started transactions. (counter)" + "'", str0,
        "The total number of started transactions. (counter)");
  }

  @Test
  public void test0761() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0761");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_CONTENT_TYPE_ENCODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft_content_type_encoder" + "'", str0,
        "raft_content_type_encoder");
  }

  @Test
  public void test0762() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0762");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LOAD_BALANCING__PLUGIN;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.load_balancing.plugin" + "'", str0,
        "causal_clustering.load_balancing.plugin");
  }

  @Test
  public void test0763() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0763");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_STORE_STATS_ADAPTER___DOCUMENTED_CNT_DST_SIZ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total size of the database and transaction logs, in bytes. (gauge)" + "'", str0,
        "The total size of the database and transaction logs, in bytes. (gauge)");
  }

  @Test
  public void test0764() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0764");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__CONNECTION_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.connection_timeout" + "'", str0,
        "dbms.security.ldap.connection_timeout");
  }

  @Test
  public void test0765() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0765");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LS_STRING__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<label>[,<label>...]" + "'", str0,
        "<label>[,<label>...]");
  }

  @Test
  public void test0766() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0766");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VM;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm" + "'", str0, "vm");
  }

  @Test
  public void test0767() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0767");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__ACCEPTABLE_HEARTBEAT_PAUSE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.cluster.failure-detector.acceptable-heartbeat-pause" + "'",
        str0, "akka.cluster.failure-detector.acceptable-heartbeat-pause");
  }

  @Test
  public void test0768() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0768");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HEAP__COMMITTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "heap.committed" + "'", str0,
        "heap.committed");
  }

  @Test
  public void test0769() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0769");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LEADER_NODE_GROUP_SETTING___DESCRIPTION__SETTING_LERPIO_NODE_GROUP_IDENTIFIER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The name of a server_group whose members should be prioritized as leaders for the given database. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible."
            + "'", str0,
        "The name of a server_group whose members should be prioritized as leaders for the given database. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible.");
  }

  @Test
  public void test0770() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0770");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWNOK_STRING__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<label>[,<label>...]" + "'", str0,
        "<label>[,<label>...]");
  }

  @Test
  public void test0771() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0771");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__ELECTION_FAILURE_DETECTION_WINDOW;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.election_failure_detection_window" + "'", str0,
        "causal_clustering.election_failure_detection_window");
  }

  @Test
  public void test0772() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0772");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.__DATABASE__;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".database." + "'", str0, ".database.");
  }

  @Test
  public void test0773() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0773");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
  }

  @Test
  public void test0774() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0774");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__ROTATION__DELAY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.logs.security.rotation.delay" + "'",
        str0, "dbms.logs.security.rotation.delay");
  }

  @Test
  public void test0775() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0775");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY4;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Administration command: DROP USER" + "'",
        str0, "Administration command: DROP USER");
  }

  @Test
  public void test0776() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0776");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECCAEEU_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Akka cluster phi accrual failure detector. Number of potentially lost/delayed heartbeats that will be accepted before considering it to be an anomaly. This margin is important to be able to survive sudden, occasional, pauses in heartbeat arrivals, due to for example garbage collect or network drop."
            + "'", str0,
        "Akka cluster phi accrual failure detector. Number of potentially lost/delayed heartbeats that will be accepted before considering it to be an anomaly. This margin is important to be able to survive sudden, occasional, pauses in heartbeat arrivals, due to for example garbage collect or network drop.");
  }

  @Test
  public void test0777() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0777");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_SNAPSHOT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_snapshot" + "'", str0,
        "hnd_req_snapshot");
  }

  @Test
  public void test0778() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0778");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__TRANSACTION_LISTEN_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.transaction_listen_address" + "'", str0,
        "causal_clustering.transaction_listen_address");
  }

  @Test
  public void test0779() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0779");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__CONNECTION__CONNECT_TIMEOUT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.connection.connect_timeout" + "'",
        str0, "driver.connection.connect_timeout");
  }

  @Test
  public void test0780() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0780");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__NEO4J__POOLS__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.neo4j.pools.enabled" + "'", str0,
        "metrics.neo4j.pools.enabled");
  }

  @Test
  public void test0781() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0781");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fabric" + "'", str0, "fabric");
  }

  @Test
  public void test0782() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0782");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DISCOVERY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "discovery" + "'", str0, "discovery");
  }

  @Test
  public void test0783() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0783");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENTERPRISE_CONSTRAINTS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enterpriseConstraints" + "'", str0,
        "enterpriseConstraints");
  }

  @Test
  public void test0784() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0784");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATA_IMPORT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data-import" + "'", str0, "data-import");
  }

  @Test
  public void test0785() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0785");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURES___NAME___MAP_CNISO__VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "config" + "'", str0, "config");
  }

  @Test
  public void test0786() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0786");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__EXTERNAL_CONFIG;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.external_config" + "'", str0,
        "causal_clustering.middleware.akka.external_config");
  }

  @Test
  public void test0787() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0787");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.READ_TIMEOUT_HANDLER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "read_timeout_handler" + "'", str0,
        "read_timeout_handler");
  }

  @Test
  public void test0788() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0788");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_REEASOLAI_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Threshold in Mb for when a downloaded batch of transactions for a read replicas should be incrementally applied. When a read replica has pulled transaction data overseeing this value they will be applied to the store"
            + "'", str0,
        "Threshold in Mb for when a downloaded batch of transactions for a read replicas should be incrementally applied. When a read replica has pulled transaction data overseeing this value they will be applied to the store");
  }

  @Test
  public void test0789() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0789");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_METRICS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "globalMetrics" + "'", str0,
        "globalMetrics");
  }

  @Test
  public void test0790() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0790");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.THREADS__JETTY__IDLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "threads.jetty.idle" + "'", str0,
        "threads.jetty.idle");
  }

  @Test
  public void test0791() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0791");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ACTIVE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active" + "'", str0, "active");
  }

  @Test
  public void test0792() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0792");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_VM__HEAP__USED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*vm.heap.used" + "'", str0,
        "*vm.heap.used");
  }

  @Test
  public void test0793() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0793");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RANEY_LONG;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Maximum number of bytes in the RAFT in-queue" + "'", str0,
        "Maximum number of bytes in the RAFT in-queue");
  }

  @Test
  public void test0794() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0794");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LZ4_ENCODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lz4_encoder" + "'", str0, "lz4_encoder");
  }

  @Test
  public void test0795() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0795");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ONLINE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "online" + "'", str0, "online");
  }

  @Test
  public void test0796() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0796");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Raft core metrics" + "'", str0,
        ".Raft core metrics");
  }

  @Test
  public void test0797() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0797");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CREATE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "create" + "'", str0, "create");
  }

  @Test
  public void test0798() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0798");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RANEA_INTEGER;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Largest batch processed by RAFT in number of entries" + "'", str0,
        "Largest batch processed by RAFT in number of entries");
  }

  @Test
  public void test0799() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0799");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNXS_CLS_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)"
            + "'", str0,
        "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections. (counter)");
  }

  @Test
  public void test0800() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0800");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Change the given user's password." + "'",
        str0, "Change the given user's password.");
  }

  @Test
  public void test0801() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0801");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BROWSER__RETAIN_CONNECTION_CREDENTIALS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "browser.retain_connection_credentials" + "'", str0,
        "browser.retain_connection_credentials");
  }

  @Test
  public void test0802() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0802");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_REQ_SNAPSHOT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_req_snapshot" + "'", str0,
        "enc_req_snapshot");
  }

  @Test
  public void test0803() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0803");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_DON_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of messages that completed processing since this instance started. This includes successful, failed and ignored Bolt messages. (counter)"
            + "'", str0,
        "The total number of messages that completed processing since this instance started. This includes successful, failed and ignored Bolt messages. (counter)");
  }

  @Test
  public void test0804() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0804");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P___VAR__RUN__SECRETS__KUBERNETES__IO__SERVICEACCOUNT__TOKEN;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "/var/run/secrets/kubernetes.io/serviceaccount/token" + "'", str0,
        "/var/run/secrets/kubernetes.io/serviceaccount/token");
  }

  @Test
  public void test0805() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0805");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__TH_PATH__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>" + "'", str0, "<path>");
  }

  @Test
  public void test0806() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0806");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECAPZ_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Akka cluster phi accrual failure detector. Number of the samples of inter-heartbeat arrival times to adaptively calculate the failure timeout for connections."
            + "'", str0,
        "Akka cluster phi accrual failure detector. Number of the samples of inter-heartbeat arrival times to adaptively calculate the failure timeout for connections.");
  }

  @Test
  public void test0807() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0807");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__NEO4J__COUNTS__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.neo4j.counts.enabled" + "'",
        str0, "metrics.neo4j.counts.enabled");
  }

  @Test
  public void test0808() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0808");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.K8_KIND___TYPE__NAME2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Status" + "'", str0, "Status");
  }

  @Test
  public void test0809() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0809");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___COMMAND__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Restore a backed up database." + "'",
        str0, "Restore a backed up database.");
  }

  @Test
  public void test0810() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0810");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__VERSION2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Shuts down the Neo4j server." + "'",
        str0, "Shuts down the Neo4j server.");
  }

  @Test
  public void test0811() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0811");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MEMORY_POOLS_ADAPTER_GDB_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Database neo4j pools metrics" + "'",
        str0, ".Database neo4j pools metrics");
  }

  @Test
  public void test0812() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0812");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__IDLE_TEST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.connection.pool.idle_test" + "'",
        str0, "driver.connection.pool.idle_test");
  }

  @Test
  public void test0813() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0813");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEUND_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about approximately how many entities are in the database; nodes, relationships, properties, etc. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about approximately how many entities are in the database; nodes, relationships, properties, etc. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test0814() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0814");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSCSRO_COMPRESSION_OPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Decides what compression to use for the csv history files." + "'",
        str0, "Decides what compression to use for the csv history files.");
  }

  @Test
  public void test0815() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0815");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HIGH_LIMIT_V3_0_6;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_0_6" + "'", str0,
        "high_limitV3_0_6");
  }

  @Test
  public void test0816() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0816");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.REPLICATION_MAYBE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "replication_maybe" + "'", str0,
        "replication_maybe");
  }

  @Test
  public void test0817() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0817");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_MEMBERSHIP_STATE_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.raft_membership_state_size" + "'", str0,
        "causal_clustering.raft_membership_state_size");
  }

  @Test
  public void test0818() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0818");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__FRMT__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--to-format" + "'", str0, "--to-format");
  }

  @Test
  public void test0819() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0819");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ARCHITECT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "architect" + "'", str0, "architect");
  }

  @Test
  public void test0820() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0820");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.IDS_IN_USE___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ids_in_use.*" + "'", str0,
        "ids_in_use.*");
  }

  @Test
  public void test0821() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0821");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.OUTPUT_STREAM;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "outputStream" + "'", str0,
        "outputStream");
  }

  @Test
  public void test0822() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0822");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_TRANSFER_INTERVAL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.leader_transfer_interval" + "'", str0,
        "causal_clustering.leader_transfer_interval");
  }

  @Test
  public void test0823() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0823");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__BIND_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.bind-timeout" + "'", str0,
        "causal_clustering.middleware.akka.bind-timeout");
  }

  @Test
  public void test0824() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0824");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROTOCOL_STACK;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PROTOCOL_STACK" + "'", str0,
        "PROTOCOL_STACK");
  }

  @Test
  public void test0825() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0825");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_BEG_CSZ;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Count of successful database start operations. (counter)" + "'",
        str0, "Count of successful database start operations. (counter)");
  }

  @Test
  public void test0826() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0826");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CREATE_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "createLabel" + "'", str0, "createLabel");
  }

  @Test
  public void test0827() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0827");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FOR" + "'", str0, "FOR");
  }

  @Test
  public void test0828() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0828");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PULL_UPDATES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pull_updates" + "'", str0,
        "pull_updates");
  }

  @Test
  public void test0829() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0829");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_BOLT__MESSAGES_STARTED_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*bolt.messages_started*" + "'", str0,
        "*bolt.messages_started*");
  }

  @Test
  public void test0830() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0830");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_F__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<host:port>" + "'", str0, "<host:port>");
  }

  @Test
  public void test0831() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0831");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRD_PATH__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>" + "'", str0, "<path>");
  }

  @Test
  public void test0832() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0832");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_PR__DEFAULT_VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
  }

  @Test
  public void test0833() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0833");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TEMP_COPY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "temp-copy" + "'", str0, "temp-copy");
  }

  @Test
  public void test0834() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0834");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DB__QUERY__EXECUTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db.query.execution" + "'", str0,
        "db.query.execution");
  }

  @Test
  public void test0835() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0835");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LZ4_DECODER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lz4_decoder" + "'", str0, "lz4_decoder");
  }

  @Test
  public void test0836() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0836");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PROCEDURES___NAME___STR_PN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "providerName" + "'", str0,
        "providerName");
  }

  @Test
  public void test0837() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0837");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RAFT_HANDLER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft_handler" + "'", str0,
        "raft_handler");
  }

  @Test
  public void test0838() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0838");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__ROTATION__SIZE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.logs.security.rotation.size" + "'",
        str0, "dbms.logs.security.rotation.size");
  }

  @Test
  public void test0839() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0839");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STATE_MACHINE_COMMIT_HELPER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "stateMachineCommitHelper" + "'", str0,
        "stateMachineCommitHelper");
  }

  @Test
  public void test0840() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0840");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAEDENTT_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Time that seed nodes will spend trying to find an existing cluster before forming a new cluster, when Neo4j is started for the first time"
            + "'", str0,
        "Time that seed nodes will spend trying to find an existing cluster before forming a new cluster, when Neo4j is started for the first time");
  }

  @Test
  public void test0841() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0841");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.THROTTLED__TIMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttled.times" + "'", str0,
        "throttled.times");
  }

  @Test
  public void test0842() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0842");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_M_B_IMPL___DOCUMENTED_MEO_BUF_USE_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Estimated amount of memory used by the pool. (gauge)" + "'", str0,
        "Estimated amount of memory used by the pool. (gauge)");
  }

  @Test
  public void test0843() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0843");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADERSHIP_BALANCING;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.leadership_balancing" + "'", str0,
        "causal_clustering.leadership_balancing");
  }

  @Test
  public void test0844() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0844");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_INGCXS_LONG;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The maximum number of bytes in the in-flight cache." + "'", str0,
        "The maximum number of bytes in the in-flight cache.");
  }

  @Test
  public void test0845() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0845");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DEPRECATED__A__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.3.0" + "'", str0, "4.3.0");
  }

  @Test
  public void test0846() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0846");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__FAILURE_DETECTOR__MAX_SAMPLE_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.cluster.failure-detector.max-sample-size" + "'", str0,
        "akka.cluster.failure-detector.max-sample-size");
  }

  @Test
  public void test0847() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0847");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRT_PATH__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory"
            + "'", str0,
        "Base directory for transaction logs. Usage of this option is only allowed if --from parameter point to exact one directory");
  }

  @Test
  public void test0848() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0848");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BROWSER__ALLOW_OUTGOING_CONNECTIONS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "browser.allow_outgoing_connections" + "'", str0,
        "browser.allow_outgoing_connections");
  }

  @Test
  public void test0849() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0849");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RESOURCE2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Resource" + "'", str0, "Resource");
  }

  @Test
  public void test0850() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0850");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKWARDS_COMPATIBILITY_REDIRECT_SERVICE___PATH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/server/causalclustering" + "'", str0,
        "/server/causalclustering");
  }

  @Test
  public void test0851() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0851");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.UNSUPPORTED__CAUSAL_CLUSTERING__EXPERIMENTAL_CATCHUP_PROTOCOL_ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "unsupported.causal_clustering.experimental_catchup_protocol_enabled" + "'", str0,
        "unsupported.causal_clustering.experimental_catchup_protocol_enabled");
  }

  @Test
  public void test0852() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0852");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RUNTIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "runtime" + "'", str0, "runtime");
  }

  @Test
  public void test0853() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0853");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__CSV__INTERVAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.csv.interval" + "'", str0,
        "metrics.csv.interval");
  }

  @Test
  public void test0854() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0854");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.THREAD_POOL_EXECUTOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "thread-pool-executor" + "'", str0,
        "thread-pool-executor");
  }

  @Test
  public void test0855() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0855");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RETRY__AFTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retry-After" + "'", str0, "Retry-After");
  }

  @Test
  public void test0856() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0856");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SET_CONFIG_VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.setConfigValue" + "'", str0,
        "dbms.setConfigValue");
  }

  @Test
  public void test0857() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0857");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_STORE_STATS_ADAPTER___DOCUMENTED_GDB_SIZ;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The size of the database, in bytes. (gauge)" + "'", str0,
        "The size of the database, in bytes. (gauge)");
  }

  @Test
  public void test0858() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0858");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__CACHE_ENABLED;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authentication.cache_enabled" + "'", str0,
        "dbms.security.ldap.authentication.cache_enabled");
  }

  @Test
  public void test0859() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0859");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_RS_STRING__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--skip-relationships" + "'", str0,
        "--skip-relationships");
  }

  @Test
  public void test0860() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0860");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HIGH_LIMIT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limit" + "'", str0, "high_limit");
  }

  @Test
  public void test0861() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0861");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".JVM Heap metrics." + "'", str0,
        ".JVM Heap metrics.");
  }

  @Test
  public void test0862() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0862");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__USE_SAMACCOUNTNAME;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authentication.use_samaccountname" + "'", str0,
        "dbms.security.ldap.authentication.use_samaccountname");
  }

  @Test
  public void test0863() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0863");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PAGE_CACHE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "page_cache" + "'", str0, "page_cache");
  }

  @Test
  public void test0864() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0864");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__BACKUP__LISTEN_ADDRESS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.backup.listen_address" + "'", str0,
        "dbms.backup.listen_address");
  }

  @Test
  public void test0865() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0865");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LOIGYO_DURATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Retry time for log shipping to followers after a stall" + "'",
        str0, "Retry time for log shipping to followers after a stall");
  }

  @Test
  public void test0866() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0866");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__PATH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.logs.security.path" + "'", str0,
        "dbms.logs.security.path");
  }

  @Test
  public void test0867() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0867");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__GRAPHITE__INTERVAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.graphite.interval" + "'", str0,
        "metrics.graphite.interval");
  }

  @Test
  public void test0868() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0868");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CORE_REPLICATED_DATABASE_STATE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CoreReplicatedDatabaseState" + "'", str0,
        "CoreReplicatedDatabaseState");
  }

  @Test
  public void test0869() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0869");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CORE_MEMBER_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "core-member-id" + "'", str0,
        "core-member-id");
  }

  @Test
  public void test0870() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0870");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CONNECT_RANDOMLY_TO_SERVER_GROUP;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.connect-randomly-to-server-group" + "'", str0,
        "causal_clustering.connect-randomly-to-server-group");
  }

  @Test
  public void test0871() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0871");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__NORMALIZED_DATABASE_NAME__DESCRIPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Name of the database after restore. Usage of this option is only allowed if --from parameter point to exact one directory"
            + "'", str0,
        "Name of the database after restore. Usage of this option is only allowed if --from parameter point to exact one directory");
  }

  @Test
  public void test0872() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0872");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STORE_COPY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "StoreCopy" + "'", str0, "StoreCopy");
  }

  @Test
  public void test0873() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0873");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_INACYE_LIST;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "A comma-separated list of other members of the cluster to join."
            + "'", str0, "A comma-separated list of other members of the cluster to join.");
  }

  @Test
  public void test0874() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0874");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_F__DEFAULT_VALUE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost:6362" + "'", str0,
        "localhost:6362");
  }

  @Test
  public void test0875() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0875");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKCYRRNLY_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Initial retry interval for akka restarter (which uses exponential backoff if it fails)"
            + "'", str0,
        "Initial retry interval for akka restarter (which uses exponential backoff if it fails)");
  }

  @Test
  public void test0876() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0876");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MESSAGES_DONE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "messages_done" + "'", str0,
        "messages_done");
  }

  @Test
  public void test0877() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0877");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SUCCEEDED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "succeeded" + "'", str0, "succeeded");
  }

  @Test
  public void test0878() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0878");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SYSTEM_TX_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "systemTxId" + "'", str0, "systemTxId");
  }

  @Test
  public void test0879() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0879");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.TRANSACTION___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "transaction.*" + "'", str0,
        "transaction.*");
  }

  @Test
  public void test0880() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0880");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__SEARCH_FOR_ATTRIBUTE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authentication.search_for_attribute" + "'",
        str0, "dbms.security.ldap.authentication.search_for_attribute");
  }

  @Test
  public void test0881() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0881");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PAUSE_TIME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pause_time" + "'", str0, "pause_time");
  }

  @Test
  public void test0882() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0882");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.J_V_M_ADAPTER_POOL_IMPL___DOCUMENTED_MEO_PC_USX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Estimated number of buffers in the pool. (gauge)" + "'", str0,
        "Estimated number of buffers in the pool. (gauge)");
  }

  @Test
  public void test0883() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0883");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__CA_PATH__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--additional-config" + "'", str0,
        "--additional-config");
  }

  @Test
  public void test0884() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0884");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DB;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
  }

  @Test
  public void test0885() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0885");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.OPERATOR_AUTH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "operator_auth" + "'", str0,
        "operator_auth");
  }

  @Test
  public void test0886() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0886");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "database" + "'", str0, "database");
  }

  @Test
  public void test0887() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0887");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.REMOTE_ADDRESS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "remoteAddress" + "'", str0,
        "remoteAddress");
  }

  @Test
  public void test0888() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0888");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__JOIN_CATCH_UP_MAX_LAG;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.join_catch_up_max_lag" + "'", str0,
        "causal_clustering.join_catch_up_max_lag");
  }

  @Test
  public void test0889() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0889");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JMEBD_BOOLEAN;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Set to `true` to enable the JMX metrics endpoint" + "'", str0,
        "Set to `true` to enable the JMX metrics endpoint");
  }

  @Test
  public void test0890() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0890");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.IOPS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "iops" + "'", str0, "iops");
  }

  @Test
  public void test0891() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0891");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__USE_SYSTEM_ACCOUNT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authorization.use_system_account" + "'", str0,
        "dbms.security.ldap.authorization.use_system_account");
  }

  @Test
  public void test0892() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0892");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PLANNING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "planning" + "'", str0, "planning");
  }

  @Test
  public void test0893() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0893");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__VERSION__NAME2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unsupported.dbms.shutdown" + "'", str0,
        "unsupported.dbms.shutdown");
  }

  @Test
  public void test0894() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0894");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_TIQ;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "queryId" + "'", str0, "queryId");
  }

  @Test
  public void test0895() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0895");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DEFRAGMENT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "defragment" + "'", str0, "defragment");
  }

  @Test
  public void test0896() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0896");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME7;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.listUsers" + "'", str0,
        "dbms.security.listUsers");
  }

  @Test
  public void test0897() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0897");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_REQ_ALL_DATABASES_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_req_all_databases_id" + "'", str0,
        "hnd_req_all_databases_id");
  }

  @Test
  public void test0898() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0898");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATION_RETRY_TIMEOUT_LIMIT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.replication_retry_timeout_limit" + "'", str0,
        "causal_clustering.replication_retry_timeout_limit");
  }

  @Test
  public void test0899() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0899");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_STORE__SIZE_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*store.size*" + "'", str0,
        "*store.size*");
  }

  @Test
  public void test0900() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0900");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RELATIONSHIP_TYPE2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RelationshipType" + "'", str0,
        "RelationshipType");
  }

  @Test
  public void test0901() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0901");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_HIT_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "In-flight cache hits. (counter)" + "'",
        str0, "In-flight cache hits. (counter)");
  }

  @Test
  public void test0902() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0902");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPT__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--to-pagecache" + "'", str0,
        "--to-pagecache");
  }

  @Test
  public void test0903() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0903");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__GROUP_MEMBERSHIP_ATTRIBUTES;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authorization.group_membership_attributes"
            + "'", str0, "dbms.security.ldap.authorization.group_membership_attributes");
  }

  @Test
  public void test0904() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0904");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__HEARTBEAT_INTERVAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "causal_clustering.middleware.akka.failure_detector.heartbeat_interval" + "'", str0,
        "causal_clustering.middleware.akka.failure_detector.heartbeat_interval");
  }

  @Test
  public void test0905() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0905");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_AUNTRE_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A list of security authentication providers containing the users and roles. This can be any of the built-in `native` or `ldap` providers, or it can be an externally provided plugin, with a custom name prefixed by `plugin-`, i.e. `plugin-<AUTH_PROVIDER_NAME>`. They will be queried in the given order when login is attempted."
            + "'", str0,
        "A list of security authentication providers containing the users and roles. This can be any of the built-in `native` or `ldap` providers, or it can be an externally provided plugin, with a custom name prefixed by `plugin-`, i.e. `plugin-<AUTH_PROVIDER_NAME>`. They will be queried in the given order when login is attempted.");
  }

  @Test
  public void test0906() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0906");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__BACKUP__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.backup.enabled" + "'", str0,
        "dbms.backup.enabled");
  }

  @Test
  public void test0907() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0907");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION__R;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "List all users currently assigned the specified role." + "'", str0,
        "List all users currently assigned the specified role.");
  }

  @Test
  public void test0908() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0908");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.UPGRADED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Upgraded" + "'", str0, "Upgraded");
  }

  @Test
  public void test0909() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0909");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BYTES_WRITTEN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bytes_written" + "'", str0,
        "bytes_written");
  }

  @Test
  public void test0910() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0910");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___COMMAND__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "restore" + "'", str0, "restore");
  }

  @Test
  public void test0911() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0911");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAONRN_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RAFT log pruning frequency" + "'", str0,
        "RAFT log pruning frequency");
  }

  @Test
  public void test0912() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0912");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STCAREET_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Maximum retry time per request during store copy. Regular store files and indexes are downloaded in separate requests during store copy. This configures the maximum time failed requests are allowed to resend. "
            + "'", str0,
        "Maximum retry time per request during store copy. Regular store files and indexes are downloaded in separate requests during store copy. This configures the maximum time failed requests are allowed to resend. ");
  }

  @Test
  public void test0913() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0913");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_TRANSACTION_LOG_ADAPTER___DOCUMENTED_LG_ROTX_EVXS_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of transaction log rotations executed so far. (counter)" + "'", str0,
        "The total number of transaction log rotations executed so far. (counter)");
  }

  @Test
  public void test0914() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0914");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__USE_STARTTLS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.ldap.use_starttls" + "'",
        str0, "dbms.security.ldap.use_starttls");
  }

  @Test
  public void test0915() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0915");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCHUP_BATCH_SIZE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.catchup_batch_size" + "'", str0,
        "causal_clustering.catchup_batch_size");
  }

  @Test
  public void test0916() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0916");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_VM__THREAD_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*vm.thread*" + "'", str0, "*vm.thread*");
  }

  @Test
  public void test0917() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0917");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CYPHER_PLAN_ADAPTER___DOCUMENTED_REL_EVXS_TPX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The total number of times Cypher has decided to re-plan a query. (counter)" + "'", str0,
        "The total number of times Cypher has decided to re-plan a query. (counter)");
  }

  @Test
  public void test0918() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0918");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_CMT_IDX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Commit index of the RAFT log. (gauge)" + "'", str0,
        "Commit index of the RAFT log. (gauge)");
  }

  @Test
  public void test0919() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0919");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__LOCK_IDENTITY_HASH_CODE__NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.scheduler.groups" + "'", str0,
        "dbms.scheduler.groups");
  }

  @Test
  public void test0920() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0920");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_STATS_ADAPTER___DOCUMENTED_CON_REL_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of relationships in the database. (gauge)" + "'",
        str0, "The total number of relationships in the database. (gauge)");
  }

  @Test
  public void test0921() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0921");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE__;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "database." + "'", str0, "database.");
  }

  @Test
  public void test0922() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0922");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ARG1;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arg1" + "'", str0, "arg1");
  }

  @Test
  public void test0923() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0923");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ARG2;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arg2" + "'", str0, "arg2");
  }

  @Test
  public void test0924() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0924");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ACTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "action" + "'", str0, "action");
  }

  @Test
  public void test0925() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0925");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_REEASOLAUE_INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Maximum queued size of transactions in Mb to be applied. Pull update jobs will stop receiving new transactions when the limit is reached until the queue has been reduced."
            + "'", str0,
        "Maximum queued size of transactions in Mb to be applied. Pull update jobs will stop receiving new transactions when the limit is reached until the queue has been reduced.");
  }

  @Test
  public void test0926() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0926");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_WX_TXS_CMTX_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of committed write transactions. (counter)" + "'",
        str0, "The total number of committed write transactions. (counter)");
  }

  @Test
  public void test0927() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0927");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_DB__QUERY__EXECUTION_STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*db.query.execution*" + "'", str0,
        "*db.query.execution*");
  }

  @Test
  public void test0928() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0928");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PULL_UPDATE_HIGHEST_TX_ID_REQUESTED;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "pull_update_highest_tx_id_requested" + "'", str0,
        "pull_update_highest_tx_id_requested");
  }

  @Test
  public void test0929() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0929");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_ID_PUBLISH_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.cluster_id_publish_timeout" + "'", str0,
        "causal_clustering.cluster_id_publish_timeout");
  }

  @Test
  public void test0930() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0930");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__CLUSTER__RUN_COORDINATED_SHUTDOWN_WHEN_DOWN;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "akka.cluster.run-coordinated-shutdown-when-down" + "'", str0,
        "akka.cluster.run-coordinated-shutdown-when-down");
  }

  @Test
  public void test0931() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0931");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME8;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.deleteRole" + "'", str0,
        "dbms.security.deleteRole");
  }

  @Test
  public void test0932() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0932");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.AKKA__REMOTE__ARTERY__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "akka.remote.artery.enabled" + "'", str0,
        "akka.remote.artery.enabled");
  }

  @Test
  public void test0933() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0933");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.RELATIONSHIP_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "relationship_type" + "'", str0,
        "relationship_type");
  }

  @Test
  public void test0934() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0934");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PROK_TOKEN_NAME_PROPERTY_D_T_O__PARAM_LABEL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "<relationship.property>[,<relationship.property>...]" + "'", str0,
        "<relationship.property>[,<relationship.property>...]");
  }

  @Test
  public void test0935() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0935");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METADATA_SCRIPT__CYPHER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metadata_script.cypher" + "'", str0,
        "metadata_script.cypher");
  }

  @Test
  public void test0936() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0936");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PNOK_TOKEN_NAME_PROPERTY_D_T_O__PARAM_LABEL;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "<label.property>[,<label.property>...]" + "'", str0,
        "<label.property>[,<label.property>...]");
  }

  @Test
  public void test0937() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0937");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENC_REQ_TX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enc_req_tx" + "'", str0, "enc_req_tx");
  }

  @Test
  public void test0938() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0938");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__MI_AUTH_META_OPTIONS__NAMES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--include-metadata" + "'", str0,
        "--include-metadata");
  }

  @Test
  public void test0939() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0939");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ABSTRACT_NAMED_SERVICE_CLUSTER_APPROACH___DEPRECATED___MSL_SERVER_ID__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.0.3" + "'", str0, "4.0.3");
  }

  @Test
  public void test0940() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0940");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.YYYY_M_MDD_H_HMMSS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyyMMddHHmmss" + "'", str0,
        "yyyyMMddHHmmss");
  }

  @Test
  public void test0941() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0941");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRTECCT_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Pooled connections that have been idle in the pool for longer than this timeout will be tested before they are used again, to ensure they are still alive.\nIf this option is set too low, an additional network call will be incurred when acquiring a connection, which causes a performance hit.\nIf this is set high, no longer live connections might be used which might lead to errors.\nHence, this parameter tunes a balance between the likelihood of experiencing connection problems and performance\nNormally, this parameter should not need tuning.\nValue 0 means connections will always be tested for validity"
            + "'", str0,
        "Pooled connections that have been idle in the pool for longer than this timeout will be tested before they are used again, to ensure they are still alive.\nIf this option is set too low, an additional network call will be incurred when acquiring a connection, which causes a performance hit.\nIf this is set high, no longer live connections might be used which might lead to errors.\nHence, this parameter tunes a balance between the likelihood of experiencing connection problems and performance\nNormally, this parameter should not need tuning.\nValue 0 means connections will always be tested for validity");
  }

  @Test
  public void test0942() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0942");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__DEPRECATED_BY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Administration command: ALTER USER" + "'", str0,
        "Administration command: ALTER USER");
  }

  @Test
  public void test0943() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0943");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECHO_DOUBLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes."
            + "'", str0,
        "Akka cluster phi accrual failure detector. Defines the failure detector threshold. A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect actual crashes.");
  }

  @Test
  public void test0944() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0944");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MINUTE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "minute" + "'", str0, "minute");
  }

  @Test
  public void test0945() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0945");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_ROLES_FOR_USER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.listRolesForUser" + "'",
        str0, "dbms.security.listRolesForUser");
  }

  @Test
  public void test0946() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0946");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__DEFAULT_PARALLELISM2;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.middleware.akka.default_parallelism" + "'", str0,
        "causal_clustering.middleware.akka.default_parallelism");
  }

  @Test
  public void test0947() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0947");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CC_CORE_TOPOLOGY_ACTOR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-core-topology-actor" + "'", str0,
        "cc-core-topology-actor");
  }

  @Test
  public void test0948() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0948");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.STORE_DOWNLOAD_STORE_ID_READER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "storeDownloadStoreIdReader" + "'", str0,
        "storeDownloadStoreIdReader");
  }

  @Test
  public void test0949() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0949");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.JAVA__NAMING__FACTORY__INITIAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "java.naming.factory.initial" + "'", str0,
        "java.naming.factory.initial");
  }

  @Test
  public void test0950() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0950");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.P___CLUSTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/cluster" + "'", str0, "/cluster");
  }

  @Test
  public void test0951() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0951");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__REFERRAL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms.security.ldap.referral" + "'", str0,
        "dbms.security.ldap.referral");
  }

  @Test
  public void test0952() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0952");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS__CSV__ENABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.csv.enabled" + "'", str0,
        "metrics.csv.enabled");
  }

  @Test
  public void test0953() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0953");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SECURITY___DEPRECATED__SETTING_LDUTIECT_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.3.0" + "'", str0, "4.3.0");
  }

  @Test
  public void test0954() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0954");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__PROTOCOL_IMPLEMENTATIONS__RAFT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.protocol_implementations.raft" + "'", str0,
        "causal_clustering.protocol_implementations.raft");
  }

  @Test
  public void test0955() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0955");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__STREAM__BUFFER__LOW_WATERMARK;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "fabric.stream.buffer.low_watermark" + "'", str0,
        "fabric.stream.buffer.low_watermark");
  }

  @Test
  public void test0956() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0956");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DUMP_DATA;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dump_data" + "'", str0, "dump_data");
  }

  @Test
  public void test0957() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0957");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NERND_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Enable reporting metrics about Server threading info. Deprecated - use metrics.filter instead."
            + "'", str0,
        "Enable reporting metrics about Server threading info. Deprecated - use metrics.filter instead.");
  }

  @Test
  public void test0958() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0958");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_LIMT_BTXS_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "In-flight cache max bytes. (gauge)" + "'", str0,
        "In-flight cache max bytes. (gauge)");
  }

  @Test
  public void test0959() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0959");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLEODE_BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str0,
        "Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
  }

  @Test
  public void test0960() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0960");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.I18N_RESOURCE_BUNDLE_DEF_OVERRIDE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/tmp/i18n-messages.en.properties" + "'",
        str0, "/tmp/i18n-messages.en.properties");
  }

  @Test
  public void test0961() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0961");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MESSAGE_PROCESSING_TIMER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "message_processing_timer" + "'", str0,
        "message_processing_timer");
  }

  @Test
  public void test0962() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0962");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DATABASE_STATUS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "databaseStatus" + "'", str0,
        "databaseStatus");
  }

  @Test
  public void test0963() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0963");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.PULL_UPDATE_HIGHEST_TX_ID_RECEIVED;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "pull_update_highest_tx_id_received" + "'", str0,
        "pull_update_highest_tx_id_received");
  }

  @Test
  public void test0964() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0964");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY6;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Administration command: SHOW USERS" + "'", str0,
        "Administration command: SHOW USERS");
  }

  @Test
  public void test0965() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0965");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ENTERPRISE_AUTH_DISABLED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enterprise-auth-disabled" + "'", str0,
        "enterprise-auth-disabled");
  }

  @Test
  public void test0966() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0966");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Label" + "'", str0, "Label");
  }

  @Test
  public void test0967() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0967");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".Bolt metrics" + "'", str0,
        ".Bolt metrics");
  }

  @Test
  public void test0968() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0968");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__CONNECT_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "fabric.driver.connection.connect_timeout" + "'", str0,
        "fabric.driver.connection.connect_timeout");
  }

  @Test
  public void test0969() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0969");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Settings available in the Enterprise server" + "'", str0,
        "Settings available in the Enterprise server");
  }

  @Test
  public void test0970() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0970");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAPACITY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "capacity" + "'", str0, "capacity");
  }

  @Test
  public void test0971() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0971");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION__BROWSER_CREDENTIAL_TIMEOUT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Sets browser credential timeout. Use 0 (zero) for no timeout."
            + "'", str0, "Sets browser credential timeout. Use 0 (zero) for no timeout.");
  }

  @Test
  public void test0972() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0972");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CAUEAIM_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The catch up protocol times out if the given duration elapses with no network activity. Every message received by the client from the server extends the time out duration."
            + "'", str0,
        "The catch up protocol times out if the given duration elapses with no network activity. Every message received by the client from the server extends the time out duration.");
  }

  @Test
  public void test0973() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0973");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRREM_DURATION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level."
            + "'", str0,
        "Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level.");
  }

  @Test
  public void test0974() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0974");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.VM__THREAD___STAR_;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vm.thread.*" + "'", str0, "vm.thread.*");
  }

  @Test
  public void test0975() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0975");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DRIVER__LOGGING__LEAKED_SESSIONS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "driver.logging.leaked_sessions" + "'",
        str0, "driver.logging.leaked_sessions");
  }

  @Test
  public void test0976() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0976");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_UNWROGT_DURATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Throttle limit for logging unknown cluster member address" + "'",
        str0, "Throttle limit for logging unknown cluster member address");
  }

  @Test
  public void test0977() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0977");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ROLES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "roles" + "'", str0, "roles");
  }

  @Test
  public void test0978() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0978");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NERND_BOOLEAN__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.2.0" + "'", str0, "4.2.0");
  }

  @Test
  public void test0979() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0979");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED_CON_REL_TPX;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "The total number of relationships stored in the database. (gauge)"
            + "'", str0, "The total number of relationships stored in the database. (gauge)");
  }

  @Test
  public void test0980() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0980");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.ALL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "all" + "'", str0, "all");
  }

  @Test
  public void test0981() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0981");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HIGH_LIMIT_V3_1_0;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_1_0" + "'", str0,
        "high_limitV3_1_0");
  }

  @Test
  public void test0982() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0982");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DEFAULT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
  }

  @Test
  public void test0983() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0983");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.META_WRAPPER___DEPRECATED___M_E_T_A__W_R_A_P_P_E_R__Q_U_N_M_R__W_A_T_C_H__T_A_G__SINCE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "4.3.0" + "'", str0, "4.3.0");
  }

  @Test
  public void test0984() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0984");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LOG_SUCCESSFUL_AUTHENTICATION;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.log_successful_authentication" + "'", str0,
        "dbms.security.log_successful_authentication");
  }

  @Test
  public void test0985() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0985");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_CRA_CSZ;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Count of successful database create operations. (counter)" + "'",
        str0, "Count of successful database create operations. (counter)");
  }

  @Test
  public void test0986() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0986");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__ENABLE_PRE_VOTING;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.enable_pre_voting" + "'", str0,
        "causal_clustering.enable_pre_voting");
  }

  @Test
  public void test0987() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0987");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HND_RES_DATABASE_ID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hnd_res_database_id" + "'", str0,
        "hnd_res_database_id");
  }

  @Test
  public void test0988() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0988");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__ATTRIBUTE;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "dbms.security.ldap.authentication.attribute" + "'", str0,
        "dbms.security.ldap.authentication.attribute");
  }

  @Test
  public void test0989() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0989");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__A__DEPRECATED_BY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHOW PROCEDURES command" + "'", str0,
        "SHOW PROCEDURES command");
  }

  @Test
  public void test0990() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0990");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSTNS_LONG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str0,
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
  }

  @Test
  public void test0991() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0991");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_TRANSFER_MEMBER_BACKOFF;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.leader_transfer_member_backoff" + "'", str0,
        "causal_clustering.leader_transfer_member_backoff");
  }

  @Test
  public void test0992() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0992");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_DYITLI_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked."
            + "'", str0,
        "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked.");
  }

  @Test
  public void test0993() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0993");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants._STAR_IDS_IN_USE__PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*ids_in_use.property" + "'", str0,
        "*ids_in_use.property");
  }

  @Test
  public void test0994() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0994");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.LATENCY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "latency" + "'", str0, "latency");
  }

  @Test
  public void test0995() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0995");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__AKKA_ACTOR_SYSTEM_RESTARTER__INITIAL_DELAY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "causal_clustering.akka_actor_system_restarter.initial_delay" + "'",
        str0, "causal_clustering.akka_actor_system_restarter.initial_delay");
  }

  @Test
  public void test0996() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0996");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.HIGH_LIMIT_V3_4_0;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_4_0" + "'", str0,
        "high_limitV3_4_0");
  }

  @Test
  public void test0997() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0997");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAIAS_SOCKET_ADDRESS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Network interface and port for the RAFT server to listen on."
            + "'", str0, "Network interface and port for the RAFT server to listen on.");
  }

  @Test
  public void test0998() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0998");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__CA_PATH__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<path>" + "'", str0, "<path>");
  }

  @Test
  public void test0999() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0999");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PS_STRING__PARAM_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<property>[,<property>...]" + "'", str0,
        "<property>[,<property>...]");
  }

  @Test
  public void test1000() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test1000");
    }
    java.lang.String str0 = io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DAASA_STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '"
            + "Name of the Fabric database. Only one Fabric database is currently supported per Neo4j instance."
            + "'", str0,
        "Name of the Fabric database. Only one Fabric database is currently supported per Neo4j instance.");
  }
}

