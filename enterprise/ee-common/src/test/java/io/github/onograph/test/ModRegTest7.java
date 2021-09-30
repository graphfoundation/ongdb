package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest7 {

  public static boolean debug = false;

  @Test
  public void test3501() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3501");
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
        "causal_clustering.transaction_advertised_address", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.kubernetes.label_selector", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.remote.artery.bind.bind-timeout", objArray12);
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
            + "MISSING VAL FOR KEY:causal_clustering.transaction_advertised_address" + "'", str18,
        "MISSING VAL FOR KEY:causal_clustering.transaction_advertised_address");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.label_selector"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.kubernetes.label_selector");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.bind-timeout" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.bind-timeout");
  }

  @Test
  public void test3502() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3502");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Commit index of the RAFT log. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3503() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3503");
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
    java.lang.String str16 = io.github.onograph.I18N.format("procedure", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:procedure" + "'",
        str16, "MISSING VAL FOR KEY:procedure");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3504() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3504");
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
        "A comma separated list of relationships to ignore.", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(".Database page cache metrics",
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
            + "MISSING VAL FOR KEY:A comma separated list of relationships to ignore." + "'", str18,
        "MISSING VAL FOR KEY:A comma separated list of relationships to ignore.");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:.Database page cache metrics" + "'", str19,
        "MISSING VAL FOR KEY:.Database page cache metrics");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3505() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3505");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The ratio of number of used pages to total number of available pages. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3506() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3506");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3507() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3507");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("bytes_written");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3508() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3508");
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
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.auth_cache_use_ttl", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.showCurrentUser", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_cache_use_ttl" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_cache_use_ttl");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.showCurrentUser"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.showCurrentUser");
  }

  @Test
  public void test3509() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3509");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*db.query.execution*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3510() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3510");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:ids_in_use.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3511() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3511");
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
    java.lang.String str21 = io.github.onograph.I18N.format("String", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Limits amount of global threads for applying commands.", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:String" + "'",
        str21, "MISSING VAL FOR KEY:String");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Limits amount of global threads for applying commands." + "'", str22,
        "MISSING VAL FOR KEY:Limits amount of global threads for applying commands.");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3512() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3512");
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
    java.lang.String str30 = io.github.onograph.I18N.format("akka.remote.artery.bind.port",
        objArray17);
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
        "'" + str30 + "' != '" + "MISSING VAL FOR KEY:akka.remote.artery.bind.port" + "'", str30,
        "MISSING VAL FOR KEY:akka.remote.artery.bind.port");
    org.junit.Assert.assertNotNull(wildcardClass31);
  }

  @Test
  public void test3513() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3513");
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
    java.lang.String str16 = io.github.onograph.I18N.format("prefer-follower", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:prefer-follower" + "'", str16,
        "MISSING VAL FOR KEY:prefer-follower");
  }

  @Test
  public void test3514() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3514");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.user_search_base", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)" + "'",
        str17, "MISSING VAL FOR KEY:Estimated total capacity of buffers in the pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base" + "'", str18,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3515() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3515");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Discovery cluster member size. (gauge)",
        objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:PropertyKey", objArray6);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:PropertyKey"
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:PropertyKey");
  }

  @Test
  public void test3516() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3516");
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
    java.lang.String str21 = io.github.onograph.I18N.format("resource", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Upgraded",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Store copy chunk size", objArray14);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:resource" + "'",
        str21, "MISSING VAL FOR KEY:resource");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgraded" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Store copy chunk size"
            + "'", str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Store copy chunk size");
  }

  @Test
  public void test3517() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3517");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:query-logging");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3518() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3518");
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
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.scheduler.groups", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.ldap.connection_timeout",
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.scheduler.groups" + "'", str14,
        "MISSING VAL FOR KEY:dbms.scheduler.groups");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout" + "'",
        str15, "MISSING VAL FOR KEY:dbms.security.ldap.connection_timeout");
  }

  @Test
  public void test3519() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3519");
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
        "Directory to hold cluster state including Raft log", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("*vm.memory.pool.g1_eden_space",
        objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "This command will create a copy of a database.%nIf your labels, properties or relationships contain dots or commas you can use ` to escape them, e.g. `My,label`.property ",
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
            + "MISSING VAL FOR KEY:Directory to hold cluster state including Raft log" + "'", str19,
        "MISSING VAL FOR KEY:Directory to hold cluster state including Raft log");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space" + "'", str20,
        "MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:This command will create a copy of a database.%nIf your labels, properties or relationships contain dots or commas you can use ` to escape them, e.g. `My,label`.property "
            + "'", str21,
        "MISSING VAL FOR KEY:This command will create a copy of a database.%nIf your labels, properties or relationships contain dots or commas you can use ` to escape them, e.g. `My,label`.property ");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test3520() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3520");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*causal_clustering.core.is_leader");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3521() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3521");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Timeout for Akka socket binding");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3522() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3522");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("bolt.*", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("--skip-node-properties", objArray8);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:--skip-node-properties" + "'", str13,
        "MISSING VAL FOR KEY:--skip-node-properties");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3523() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3523");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("Upgraded", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("lz4_encoder", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("database.", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution", objArray5);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Maximum timeout for cluster status request execution"
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3524() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3524");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("time", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("metadata_script.cypher", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("blockSize", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:metadata_script.cypher" + "'", str10,
        "MISSING VAL FOR KEY:metadata_script.cypher");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:blockSize" + "'",
        str11, "MISSING VAL FOR KEY:blockSize");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3525() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3525");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:active");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3526() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3526");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("pull_updates");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3527() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3527");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("temp-bootstrap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3528() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3528");
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
    java.lang.String str20 = io.github.onograph.I18N.format("server_policies", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "causal_clustering.log_shipping_max_lag", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("lz4_encoder", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:authentication",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("true", objArray14);
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:server_policies" + "'", str20,
        "MISSING VAL FOR KEY:server_policies");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag" + "'",
        str21, "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str22, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:authentication" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:authentication");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str24,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3529() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3529");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.leader_transfer_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3530() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3530");
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
        "This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window.",
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
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str23, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window."
            + "'", str24,
        "MISSING VAL FOR KEY:This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window.");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3531() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3531");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.core.*", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*"
            + "'", str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*");
  }

  @Test
  public void test3532() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3532");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("function", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("causal_clustering.read_replica",
        objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The maximum file size before the membership state file is rotated (in unit of entries)",
        objArray10);
    java.lang.String str18 = io.github.onograph.I18N.format("com.sun.jndi.ldap.read.timeout",
        objArray10);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:elapsedTimeMs",
        objArray10);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft Replication fail count. (counter)", objArray10);
    java.lang.Class<?> wildcardClass21 = objArray10.getClass();
    org.junit.Assert.assertNotNull(objArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str11,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str12, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str13,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str14, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str15,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)"
            + "'", str17,
        "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout" + "'", str18,
        "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft Replication fail count. (counter)" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft Replication fail count. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3533() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3533");
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:--delete-nodes-with-labels" + "'", str18,
        "MISSING VAL FOR KEY:--delete-nodes-with-labels");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3534() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3534");
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
    java.lang.String str16 = io.github.onograph.I18N.format("LabelQualifierAll", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.upgradeDetails", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("*dbms.pool.bolt.used_heap",
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str16,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.upgradeDetails" + "'", str17,
        "MISSING VAL FOR KEY:dbms.upgradeDetails");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:*dbms.pool.bolt.used_heap" + "'", str18,
        "MISSING VAL FOR KEY:*dbms.pool.bolt.used_heap");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3535() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3535");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("samaccountname", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:samaccountname" + "'", str2,
        "MISSING VAL FOR KEY:samaccountname");
  }

  @Test
  public void test3536() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3536");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(".dbms");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3537() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3537");
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
        "causal_clustering.protocol_implementations.catchup", objArray13);
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
            + "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.catchup" + "'", str22,
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.catchup");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3538() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3538");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:ServiceList");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3539() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3539");
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
    java.lang.String str26 = io.github.onograph.I18N.format("databaseName", objArray15);
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
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:databaseName" + "'",
        str26, "MISSING VAL FOR KEY:databaseName");
  }

  @Test
  public void test3540() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3540");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.in_flight_cache.type");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3541() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3541");
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
        "causal_clustering.initial_discovery_members", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.initial_discovery_members"
            + "'", str16, "MISSING VAL FOR KEY:causal_clustering.initial_discovery_members");
  }

  @Test
  public void test3542() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3542");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3543() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3543");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("reader");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3544() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3544");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*vm.memory.buffer.direct.used");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3545() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3545");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("FOR_DATABASE", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy.",
        objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:handshake_server_encoder", objArray5);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy."
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:handshake_server_encoder"
            + "'", str10, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:handshake_server_encoder");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3546() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3546");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Delete the specified role. Any role assignments will be removed.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3547() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3547");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The number of currently active read transactions. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3548() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3548");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.akka_actor_system_restarter.max_acceptable_failures");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3549() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3549");
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str12,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:ssl_handler" + "'",
        str13, "MISSING VAL FOR KEY:ssl_handler");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3550() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3550");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("success");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3551() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3551");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3552() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3552");
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
    java.lang.String str14 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id",
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*transaction.last_committed_tx_id" + "'",
        str14, "MISSING VAL FOR KEY:*transaction.last_committed_tx_id");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3553() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3553");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3554() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3554");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("PROTOCOL_STACK");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3555() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3555");
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
    java.lang.String str20 = io.github.onograph.I18N.format("LOOPBACK", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:LOOPBACK" + "'",
        str20, "MISSING VAL FOR KEY:LOOPBACK");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3556() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3556");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("lz4_encoder", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("name", objArray4);
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
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str7, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:name" + "'", str8,
        "MISSING VAL FOR KEY:name");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3557() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3557");
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
        "causal_clustering.in_flight_cache.max_entries", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries"
            + "'", str14, "MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3558() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3558");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Raft Replication fail count. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3559() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3559");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The time window within which the loss of the leader is detected and the first re-election attempt is held.The window should be significantly larger than typical communication delays to make conflicts unlikely.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3560() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3560");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Discovery cluster convergence. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3561() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3561");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3562() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3562");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3563() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3563");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The name of a server_group whose members should be prioritized as leaders for the given database. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3564() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3564");
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
    java.lang.String str21 = io.github.onograph.I18N.format("String", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("annotationData", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:String" + "'",
        str21, "MISSING VAL FOR KEY:String");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:annotationData" + "'", str22,
        "MISSING VAL FOR KEY:annotationData");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3565() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3565");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("ccstate", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.connection_timeout", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("db.listLocks", objArray7);
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
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout" + "'", str10,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection_timeout");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:db.listLocks" + "'",
        str11, "MISSING VAL FOR KEY:db.listLocks");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3566() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3566");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Sum total size of capacity of the heap and/or native memory pool. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3567() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3567");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*transaction.committed*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3568() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3568");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("true", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("metrics.neo4j.counts.enabled",
        objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("replication_fail", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:cc-core-topology-actor", objArray9);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:replication_fail" + "'", str13,
        "MISSING VAL FOR KEY:replication_fail");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cc-core-topology-actor"
            + "'", str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cc-core-topology-actor");
  }

  @Test
  public void test3569() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3569");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The reporting interval for Graphite. That is, how often to send updated metrics to Graphite.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("raft_message_composer", objArray10);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The reporting interval for Graphite. That is, how often to send updated metrics to Graphite."
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The reporting interval for Graphite. That is, how often to send updated metrics to Graphite.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:raft_message_composer" + "'", str16,
        "MISSING VAL FOR KEY:raft_message_composer");
  }

  @Test
  public void test3570() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3570");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3571() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3571");
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
    java.lang.String str15 = io.github.onograph.I18N.format("messages_failed", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("*vm.memory.buffer.direct.used",
        objArray8);
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:messages_failed" + "'", str15,
        "MISSING VAL FOR KEY:messages_failed");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:*vm.memory.buffer.direct.used" + "'", str16,
        "MISSING VAL FOR KEY:*vm.memory.buffer.direct.used");
  }

  @Test
  public void test3572() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3572");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)",
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)");
  }

  @Test
  public void test3573() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3573");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:designated_seeder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3574() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3574");
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
        "Maximum timeout for cluster status request execution", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("FunctionQualifier", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("applicationProtocolVersion",
        objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("evictions", objArray14);
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
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str20,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:" + "'", str21,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:FunctionQualifier" + "'", str22,
        "MISSING VAL FOR KEY:FunctionQualifier");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:applicationProtocolVersion" + "'", str23,
        "MISSING VAL FOR KEY:applicationProtocolVersion");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:evictions" + "'",
        str24, "MISSING VAL FOR KEY:evictions");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3575() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3575");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:frame_encoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3576() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3576");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The time limit within which a leadership transfer request should be completed, otherwise the leader will resume accepting writes.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3577() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3577");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("*ids_in_use.node", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("metrics.neo4j.server.enabled",
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.server.enabled" + "'", str9,
        "MISSING VAL FOR KEY:metrics.neo4j.server.enabled");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3578() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3578");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("elapsedTimeMs", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("driver.connection.max_lifetime",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("hostnameOrIp", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str14,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:driver.connection.max_lifetime" + "'", str15,
        "MISSING VAL FOR KEY:driver.connection.max_lifetime");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:hostnameOrIp" + "'",
        str17, "MISSING VAL FOR KEY:hostnameOrIp");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3579() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3579");
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
    java.lang.String str20 = io.github.onograph.I18N.format("memory.pool", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("dbms.security.addRoleToUser",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("commit_index", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str20, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms.security.addRoleToUser" + "'", str21,
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:commit_index" + "'",
        str22, "MISSING VAL FOR KEY:commit_index");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3580() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3580");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`.",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`."
            + "'", str15,
        "MISSING VAL FOR KEY:The time allowed for a database on a Neo4j server to either join a cluster or form a new cluster with the other Neo4j Core Servers provided by `causal_clustering.initial_discovery_members`.");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3581() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3581");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("admin.ini", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "List the job groups that are active in the database internal job scheduler.", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("hnd_info", objArray5);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:hnd_info" + "'",
        str10, "MISSING VAL FOR KEY:hnd_info");
  }

  @Test
  public void test3582() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3582");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.",
        objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str20,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3583() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3583");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("fabric.stream.buffer.low_watermark");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3584() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3584");
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
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_snapshot",
        objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The maximum batch size when catching up (in unit of entries)",
        objArray8);
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_snapshot" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_snapshot");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The maximum batch size when catching up (in unit of entries)"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The maximum batch size when catching up (in unit of entries)");
  }

  @Test
  public void test3585() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3585");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The maximum lag allowed before log shipping pauses (in unit of entries)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3586() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3586");
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
    java.lang.String str20 = io.github.onograph.I18N.format("driver.connection.pool.max_size",
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str20,
        "MISSING VAL FOR KEY:driver.connection.pool.max_size");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3587() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3587");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total_time",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:restarting-cluster-client", objArray12);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back read transactions. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_time" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_time");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client"
            + "'", str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3588() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3588");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("causal_clustering.raft_in_queue_size",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_in_queue_size" + "'",
        str2, "MISSING VAL FOR KEY:causal_clustering.raft_in_queue_size");
  }

  @Test
  public void test3589() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3589");
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
    java.lang.String str21 = io.github.onograph.I18N.format("dec_dispatch", objArray16);
    java.lang.String str22 = io.github.onograph.I18N.format("localhost", objArray16);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.csv.rotation.compression", objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format("enc_res_database_id", objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.",
        objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ",
        objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.",
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str21, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str22, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str24,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:enc_res_database_id" + "'", str25,
        "MISSING VAL FOR KEY:enc_res_database_id");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load."
            + "'", str26,
        "MISSING VAL FOR KEY:Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load.");
    org.junit.Assert.assertEquals("'" + str27 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. "
            + "'", str27,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used."
            + "'", str28,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
  }

  @Test
  public void test3590() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3590");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("dbms.security.suspendUser", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:dbms.security.suspendUser" + "'", str2,
        "MISSING VAL FOR KEY:dbms.security.suspendUser");
  }

  @Test
  public void test3591() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3591");
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
        "causal_clustering.leader_transfer_timeout", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.leader_transfer_timeout"
            + "'", str16, "MISSING VAL FOR KEY:causal_clustering.leader_transfer_timeout");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3592() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3592");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("*transaction.rollbacks*", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("java.naming.security.authentication",
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
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:*transaction.rollbacks*" + "'", str8,
        "MISSING VAL FOR KEY:*transaction.rollbacks*");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str10, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3593() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3593");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("transactionLogCatchup", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:transactionLogCatchup" + "'", str2,
        "MISSING VAL FOR KEY:transactionLogCatchup");
  }

  @Test
  public void test3594() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3594");
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
    java.lang.String str10 = io.github.onograph.I18N.format("HAS_DB_ROLE", objArray5);
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:HAS_DB_ROLE" + "'",
        str10, "MISSING VAL FOR KEY:HAS_DB_ROLE");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3595() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3595");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:pageFaults");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3596() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3596");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("tx_size_heap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3597() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3597");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Use native transport if available. Epoll for Linux or Kqueue for MacOS/BSD. If this setting is set to false, or if native transport is not available, Nio transport will be used.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3598() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3598");
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
    java.lang.String str18 = io.github.onograph.I18N.format("List all procedures in the DBMS.",
        objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("ServiceList", objArray11);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:List all procedures in the DBMS." + "'",
        str18, "MISSING VAL FOR KEY:List all procedures in the DBMS.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:ServiceList" + "'",
        str19, "MISSING VAL FOR KEY:ServiceList");
  }

  @Test
  public void test3599() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3599");
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
    java.lang.String str14 = io.github.onograph.I18N.format("metrics.csv.rotation.size", objArray7);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:metrics.csv.rotation.size" + "'", str14,
        "MISSING VAL FOR KEY:metrics.csv.rotation.size");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3600() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3600");
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
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:messages_failed",
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:messages_failed" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:messages_failed");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3601() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3601");
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
    java.lang.String str14 = io.github.onograph.I18N.format("dbms.procedures", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.procedures" + "'", str14,
        "MISSING VAL FOR KEY:dbms.procedures");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3602() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3602");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.backup.address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3603() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3603");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.leader_election_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3604() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3604");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "*causal_clustering.core.replication_fail", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("akka.remote.artery.enabled",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.system_username", objArray8);
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8),
        "[same, dbms.upgrade, Maximum retry interval for akka restarter (which uses exponential backoff if it fails), dbms.security.ldap.authentication.attribute]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:Display ServerId of instance." + "'", str9,
        "MISSING VAL FOR KEY:Display ServerId of instance.");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail"
            + "'", str10, "MISSING VAL FOR KEY:*causal_clustering.core.replication_fail");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:akka.remote.artery.enabled" + "'", str11,
        "MISSING VAL FOR KEY:akka.remote.artery.enabled");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.system_username" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.system_username");
  }

  @Test
  public void test3605() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3605");
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
    java.lang.String str17 = io.github.onograph.I18N.format("BatchSize", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.protocol_implementations.raft", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("messages_failed", objArray12);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str17, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft" + "'", str19,
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:messages_failed" + "'", str20,
        "MISSING VAL FOR KEY:messages_failed");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3606() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3606");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of page flushes executed by the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3607() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3607");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.cluster.seed_node_timeout_on_first_start");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3608() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3608");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("Upgraded", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("messages_received", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str18 = io.github.onograph.I18N.format("db.listLocks", objArray10);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.catch_up_client_inactivity_timeout", objArray10);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:read", objArray10);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str15,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str16,
        "MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:db.listLocks" + "'",
        str18, "MISSING VAL FOR KEY:db.listLocks");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.catch_up_client_inactivity_timeout" + "'", str19,
        "MISSING VAL FOR KEY:causal_clustering.catch_up_client_inactivity_timeout");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3609() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3609");
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
    java.lang.String str14 = io.github.onograph.I18N.format("total", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("active_write", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:Upgraded" + "'",
        str11, "MISSING VAL FOR KEY:Upgraded");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:" + "'", str12,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str13,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:total" + "'", str14,
        "MISSING VAL FOR KEY:total");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:active_write" + "'",
        str15, "MISSING VAL FOR KEY:active_write");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured."
            + "'", str16,
        "MISSING VAL FOR KEY:Perform authentication by searching for an unique attribute of a user.\nUsing this setting requires `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3610() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3610");
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
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:LZ_validating",
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:enc_get_metadata" + "'", str15,
        "MISSING VAL FOR KEY:enc_get_metadata");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:native" + "'",
        str16, "MISSING VAL FOR KEY:native");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating" + "'",
        str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3611() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3611");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.backup.address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3612() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3612");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Advertised hostname/IP address and port for the transaction shipping server.", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server."
            + "'", str18,
        "MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3613() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3613");
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
    java.lang.String str14 = io.github.onograph.I18N.format("metrics.neo4j.tx.enabled", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.tx.enabled" + "'", str14,
        "MISSING VAL FOR KEY:metrics.neo4j.tx.enabled");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3614() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3614");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "causal_clustering.join_catch_up_timeout", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout" + "'",
        str2, "MISSING VAL FOR KEY:causal_clustering.join_catch_up_timeout");
  }

  @Test
  public void test3615() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3615");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("snappy_encoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3616() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3616");
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
    java.lang.String str18 = io.github.onograph.I18N.format("vm.memory.pool.*", objArray11);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str18,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3617() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3617");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("quarantined");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3618() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3618");
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
        "MISSING VAL FOR KEY:The total number of page evictions executed by the page cache. (counter)",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str18,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:vm.thread.*" + "'",
        str19, "MISSING VAL FOR KEY:vm.thread.*");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of page evictions executed by the page cache. (counter)"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of page evictions executed by the page cache. (counter)");
  }

  @Test
  public void test3619() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3619");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:latency");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3620() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3620");
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
    java.lang.String str19 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("off", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("causal_clustering.read_replica",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("success", objArray13);
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str19,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:off" + "'", str20,
        "MISSING VAL FOR KEY:off");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str21,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:success" + "'",
        str22, "MISSING VAL FOR KEY:success");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3621() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3621");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--to-pagecache");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3622() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3622");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_get_metadata");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3623() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3623");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("backup");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3624() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3624");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3625() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3625");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Change the current user's password.", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Change the current user's password." + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Change the current user's password.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3626() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3626");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3627() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3627");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.backup.listen_address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3628() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3628");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:raft-member-mapping");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3629() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3629");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3630() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3630");
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
    java.lang.String str22 = io.github.onograph.I18N.format("addresses", objArray13);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str22, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3631() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3631");
    }
    java.lang.Object[] objArray13 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str14 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray13);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray13);
    java.lang.String str16 = io.github.onograph.I18N.format("elapsedTimeMs", objArray13);
    java.lang.String str17 = io.github.onograph.I18N.format("driver.connection.max_lifetime",
        objArray13);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ",
        objArray13);
    java.lang.String str19 = io.github.onograph.I18N.format("follow", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("Delete the specified user.",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:active_write",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "<label.property>[,<label.property>...]", objArray13);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str16,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:driver.connection.max_lifetime" + "'", str17,
        "MISSING VAL FOR KEY:driver.connection.max_lifetime");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery "
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Parallelism level of dispatcher used for communication from Akka based cluster topology discovery ");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:follow" + "'",
        str19, "MISSING VAL FOR KEY:follow");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Delete the specified user." + "'", str20,
        "MISSING VAL FOR KEY:Delete the specified user.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active_write" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active_write");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:<label.property>[,<label.property>...]" + "'",
        str22, "MISSING VAL FOR KEY:<label.property>[,<label.property>...]");
  }

  @Test
  public void test3632() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3632");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--neo4j-home-directory");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3633() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3633");
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
    java.lang.String str12 = io.github.onograph.I18N.format("driver.connection.pool.max_size",
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str12,
        "MISSING VAL FOR KEY:driver.connection.pool.max_size");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3634() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3634");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The maximum batch size when catching up (in unit of entries)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3635() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3635");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("status", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Maximum number of history files for the csv files.", objArray7);
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str10,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the csv files." + "'", str11,
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3636() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3636");
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
        "MISSING VAL FOR KEY:RAFT log pruning frequency", objArray12);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RAFT log pruning frequency" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:RAFT log pruning frequency");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3637() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3637");
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
        "The attribute to use when looking up users.\nUsing this setting requires `dbms.security.ldap.authentication.search_for_attribute` to be true and thus `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The name of the base object or named context to search for user objects when LDAP authorization is enabled. A common case is that this matches the last part of `dbms.security.ldap.authentication.user_dn_template`.",
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
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str11, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size"
            + "'", str12,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.max_sample_size");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:The attribute to use when looking up users.\nUsing this setting requires `dbms.security.ldap.authentication.search_for_attribute` to be true and thus `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured."
            + "'", str13,
        "MISSING VAL FOR KEY:The attribute to use when looking up users.\nUsing this setting requires `dbms.security.ldap.authentication.search_for_attribute` to be true and thus `dbms.security.ldap.authorization.system_username` and `dbms.security.ldap.authorization.system_password` to be configured.");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The name of the base object or named context to search for user objects when LDAP authorization is enabled. A common case is that this matches the last part of `dbms.security.ldap.authentication.user_dn_template`."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The name of the base object or named context to search for user objects when LDAP authorization is enabled. A common case is that this matches the last part of `dbms.security.ldap.authentication.user_dn_template`.");
  }

  @Test
  public void test3638() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3638");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("--to-data-tx-directory");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3639() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3639");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Name of the database after restore. Usage of this option is only allowed if --from parameter point to exact one directory");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3640() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3640");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3641() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3641");
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
    java.lang.String str18 = io.github.onograph.I18N.format("enc_req_precopy", objArray11);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:enc_req_precopy" + "'", str18,
        "MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3642() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3642");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.filter");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3643() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3643");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Activate a suspended user.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3644() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3644");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "unsupported.causal_clustering.experimental_raft_protocol_enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3645() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3645");
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
        "The total number of threads (both idle and busy) in the jetty pool. (gauge)", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "causal_clustering.store_copy_chunk_size", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "causal_clustering.in_flight_cache.max_entries", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:GRANTED",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:LabelQualifierAll",
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)"
            + "'", str16,
        "MISSING VAL FOR KEY:The total number of threads (both idle and busy) in the jetty pool. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size"
            + "'", str17, "MISSING VAL FOR KEY:causal_clustering.store_copy_chunk_size");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries"
            + "'", str18, "MISSING VAL FOR KEY:causal_clustering.in_flight_cache.max_entries");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:GRANTED" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:GRANTED");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LabelQualifierAll" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3646() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3646");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("page_cache", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica",
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:page_cache" + "'",
        str15, "MISSING VAL FOR KEY:page_cache");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:typically-connect-to-random-read-replica");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3647() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3647");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3648() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3648");
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
    java.lang.String str9 = io.github.onograph.I18N.format("rollbacks_write", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.",
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
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:rollbacks_write" + "'", str9,
        "MISSING VAL FOR KEY:rollbacks_write");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3649() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3649");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.scheduler.failedJobs");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3650() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3650");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("SCHEMA", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("total_bytes", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("thread.count", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:akka", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str15, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str16, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:total_bytes" + "'",
        str17, "MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:thread.count" + "'",
        str18, "MISSING VAL FOR KEY:thread.count");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka");
  }

  @Test
  public void test3651() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3651");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Advertised hostname/IP address and port for the transaction shipping server.", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:transaction",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str17,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str18,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server."
            + "'", str19,
        "MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server.");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:transaction" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:transaction");
  }

  @Test
  public void test3652() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3652");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "Count of successful database start operations. (counter)", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:Count of successful database start operations. (counter)" + "'",
        str2, "MISSING VAL FOR KEY:Count of successful database start operations. (counter)");
  }

  @Test
  public void test3653() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3653");
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
        "MISSING VAL FOR KEY:dbms.security.removeRoleFromUser", objArray11);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.removeRoleFromUser");
  }

  @Test
  public void test3654() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3654");
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
    java.lang.String str18 = io.github.onograph.I18N.format("Role", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:Role" + "'", str18,
        "MISSING VAL FOR KEY:Role");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3655() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3655");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbName");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3656() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3656");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:localhost" + "'",
        str17, "MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The ID of the last closed transaction. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3657() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3657");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("TRACKING_RESPONSE_HANDLER",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("Transaction retries. (counter)",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(".Database data metrics", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("List all functions in the DBMS.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.",
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute"
            + "'", str13, "MISSING VAL FOR KEY:dbms.security.ldap.authentication.attribute");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER" + "'", str14,
        "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Transaction retries. (counter)" + "'", str15,
        "MISSING VAL FOR KEY:Transaction retries. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:.Database data metrics" + "'", str16,
        "MISSING VAL FOR KEY:.Database data metrics");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:List all functions in the DBMS." + "'", str17,
        "MISSING VAL FOR KEY:List all functions in the DBMS.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric."
            + "'", str18,
        "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.");
  }

  @Test
  public void test3658() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3658");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_req_tx");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3659() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3659");
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
        "causal_clustering.transaction_advertised_address", objArray10);
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
            + "MISSING VAL FOR KEY:causal_clustering.transaction_advertised_address" + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.transaction_advertised_address");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3660() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3660");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:FOR");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3661() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3661");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dump_data");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3662() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3662");
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
    java.lang.String str21 = io.github.onograph.I18N.format("vm.thread.*", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("append_index", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("", objArray14);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:vm.thread.*" + "'",
        str21, "MISSING VAL FOR KEY:vm.thread.*");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:append_index" + "'",
        str23, "MISSING VAL FOR KEY:append_index");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:" + "'", str24,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test3663() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3663");
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
    java.lang.String str17 = io.github.onograph.I18N.format("FOR", objArray10);
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:FOR" + "'", str17,
        "MISSING VAL FOR KEY:FOR");
  }

  @Test
  public void test3664() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3664");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("entries");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3665() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3665");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*check_point.duration");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3666() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3666");
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
        "This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window.",
        objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_max_queue_size",
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
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs" + "'",
        str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str24, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window."
            + "'", str25,
        "MISSING VAL FOR KEY:This setting is moved and enhanced into causal_clustering.leader_failure_detection_window and causal_clustering.election_failure_detection_window.");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_max_queue_size"
            + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.read_replica_transaction_applier_max_queue_size");
  }

  @Test
  public void test3667() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3667");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Set to `true` to enable the JMX metrics endpoint");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3668() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3668");
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
    java.lang.String str15 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:databaseName",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("messages_received", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:databaseName" + "'",
        str15, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:databaseName");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str16,
        "MISSING VAL FOR KEY:messages_received");
  }

  @Test
  public void test3669() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3669");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("ccstate", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("rollbacks", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("error_handler_tail", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.dynamic.setting.allowlist",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str11, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:error_handler_tail" + "'", str12,
        "MISSING VAL FOR KEY:error_handler_tail");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist" + "'", str13,
        "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3670() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3670");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:create");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3671() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3671");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total time, in milliseconds, spent in check pointing so far. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3672() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3672");
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
    java.lang.String str19 = io.github.onograph.I18N.format("roles", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:Retry-After",
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:roles" + "'", str19,
        "MISSING VAL FOR KEY:roles");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Retry-After" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Retry-After");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3673() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3673");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A comma separated list of labels. All nodes that have ANY of the specified labels will be kept.Can not be combined with --delete-nodes-with-labels.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3674() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3674");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("driver.ssl_enabled", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:driver.ssl_enabled" + "'", str2,
        "MISSING VAL FOR KEY:driver.ssl_enabled");
  }

  @Test
  public void test3675() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3675");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("leader-only", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A common prefix for the reported metrics field names.", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("latency", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "The maximum lag allowed before log shipping pauses (in unit of entries)", objArray12);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str15, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names."
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A common prefix for the reported metrics field names.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:latency" + "'",
        str18, "MISSING VAL FOR KEY:latency");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str19,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:The maximum lag allowed before log shipping pauses (in unit of entries)"
            + "'", str20,
        "MISSING VAL FOR KEY:The maximum lag allowed before log shipping pauses (in unit of entries)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3676() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3676");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*vm.file.descriptors.count", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.file.descriptors.count"
            + "'", str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.file.descriptors.count");
  }

  @Test
  public void test3677() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3677");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("active_read");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3678() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3678");
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
    java.lang.String str22 = io.github.onograph.I18N.format("metrics.prometheus.enabled",
        objArray16);
    java.lang.String str23 = io.github.onograph.I18N.format("modifierProtocols", objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format("Is this server the leader? (gauge)",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases", objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format("dbms.security.ldap.read_timeout",
        objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format("dbms.showCurrentUser", objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format(
        "Removes and archives all cluster state, so that the instance can rebind to a cluster.",
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
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.enabled" + "'", str22,
        "MISSING VAL FOR KEY:metrics.prometheus.enabled");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:modifierProtocols" + "'", str23,
        "MISSING VAL FOR KEY:modifierProtocols");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:Is this server the leader? (gauge)" + "'",
        str24, "MISSING VAL FOR KEY:Is this server the leader? (gauge)");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases" + "'",
        str25, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.read_timeout" + "'", str26,
        "MISSING VAL FOR KEY:dbms.security.ldap.read_timeout");
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "MISSING VAL FOR KEY:dbms.showCurrentUser" + "'", str27,
        "MISSING VAL FOR KEY:dbms.showCurrentUser");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
            + "MISSING VAL FOR KEY:Removes and archives all cluster state, so that the instance can rebind to a cluster."
            + "'", str28,
        "MISSING VAL FOR KEY:Removes and archives all cluster state, so that the instance can rebind to a cluster.");
    org.junit.Assert.assertNotNull(wildcardClass29);
  }

  @Test
  public void test3679() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3679");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause",
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause"
            + "'", str22,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3680() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3680");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of exceptions seen during the eviction process in the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3681() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3681");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Delay between RAFT message receive and process. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3682() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3682");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:backup-server");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3683() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3683");
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
    java.lang.String str19 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("replication_maybe", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("Security log level threshold.",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("--to-data-tx-directory", objArray13);
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str19,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str20,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:Security log level threshold." + "'", str21,
        "MISSING VAL FOR KEY:Security log level threshold.");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:--to-data-tx-directory" + "'", str22,
        "MISSING VAL FOR KEY:--to-data-tx-directory");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3684() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3684");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("cn");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3685() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3685");
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
    java.lang.String str14 = io.github.onograph.I18N.format("Unbounded", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:Unbounded" + "'",
        str14, "MISSING VAL FOR KEY:Unbounded");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3686() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3686");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format("function", objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("FOR_DATABASE", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.default-parallelism", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("*store.size*", objArray5);
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
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.default-parallelism" + "'", str9,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.default-parallelism");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:*store.size*" + "'",
        str10, "MISSING VAL FOR KEY:*store.size*");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3687() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3687");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:raft-member-id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3688() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3688");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:session-tracker");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3689() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3689");
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
    java.lang.String str21 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hostnameOrIp",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("dbms.directories.cluster_state",
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hostnameOrIp" + "'",
        str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hostnameOrIp");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.directories.cluster_state" + "'", str22,
        "MISSING VAL FOR KEY:dbms.directories.cluster_state");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3690() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3690");
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
    java.lang.String str16 = io.github.onograph.I18N.format("countAllNodesMetrics", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:countAllNodesMetrics" + "'", str16,
        "MISSING VAL FOR KEY:countAllNodesMetrics");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3691() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3691");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("used_heap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3692() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3692");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(".Database transaction metrics",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("metrics.jvm.memory.enabled",
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
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:.Database transaction metrics" + "'", str10,
        "MISSING VAL FOR KEY:.Database transaction metrics");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:metrics.jvm.memory.enabled" + "'", str11,
        "MISSING VAL FOR KEY:metrics.jvm.memory.enabled");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3693() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3693");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_req_snapshot");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3694() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3694");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3695() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3695");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3696() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3696");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_res_pre_copy");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3697() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3697");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3698() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3698");
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
    java.lang.String str21 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray16);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray16);
    java.lang.String str23 = io.github.onograph.I18N.format("connections_closed", objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format("dbms.backup.listen_address",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format(
        "The number of operations to be processed before the state machines flush to disk",
        objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format("throttled.millis", objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format(
        "causal_clustering.catchup.tx_pull_requests_received", objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format(
        "Prepare backup for restore by applying the latest transactions which were pulled at the time of backup, but not applied to the store.",
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
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str21,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str22,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:connections_closed" + "'", str23,
        "MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.listen_address" + "'", str24,
        "MISSING VAL FOR KEY:dbms.backup.listen_address");
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
            + "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk"
            + "'", str25,
        "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:throttled.millis" + "'", str26,
        "MISSING VAL FOR KEY:throttled.millis");
    org.junit.Assert.assertEquals("'" + str27 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.catchup.tx_pull_requests_received" + "'", str27,
        "MISSING VAL FOR KEY:causal_clustering.catchup.tx_pull_requests_received");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
            + "MISSING VAL FOR KEY:Prepare backup for restore by applying the latest transactions which were pulled at the time of backup, but not applied to the store."
            + "'", str28,
        "MISSING VAL FOR KEY:Prepare backup for restore by applying the latest transactions which were pulled at the time of backup, but not applied to the store.");
  }

  @Test
  public void test3699() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3699");
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
    java.lang.String str17 = io.github.onograph.I18N.format("cc-database-status-actor", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("addresses", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:cc-database-status-actor" + "'", str17,
        "MISSING VAL FOR KEY:cc-database-status-actor");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:addresses" + "'",
        str18, "MISSING VAL FOR KEY:addresses");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3700() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3700");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("status", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("operator_auth", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format("Restore a backed up database.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("passwordChangeRequired", objArray10);
    java.lang.String str17 = io.github.onograph.I18N.format("hours", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str14,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Restore a backed up database." + "'", str15,
        "MISSING VAL FOR KEY:Restore a backed up database.");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:passwordChangeRequired" + "'", str16,
        "MISSING VAL FOR KEY:passwordChangeRequired");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:hours" + "'", str17,
        "MISSING VAL FOR KEY:hours");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3701() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3701");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:FOR", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:FOR" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:FOR");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3702() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3702");
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
    java.lang.String str20 = io.github.onograph.I18N.format("driver.connection.pool.max_size",
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:driver.connection.pool.max_size" + "'", str20,
        "MISSING VAL FOR KEY:driver.connection.pool.max_size");
  }

  @Test
  public void test3703() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3703");
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
    java.lang.String str11 = io.github.onograph.I18N.format("type", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.driver.connection.pool.acquisition_timeout", objArray6);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:type" + "'", str11,
        "MISSING VAL FOR KEY:type");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.connection.pool.acquisition_timeout"
            + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3704() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3704");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("true", objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("User", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost",
        objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.Database operation count metrics", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating", objArray10);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:User" + "'", str13,
        "MISSING VAL FOR KEY:User");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost" + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.Database operation count metrics" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating");
  }

  @Test
  public void test3705() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3705");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hit_ratio");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3706() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3706");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("RAFT Term of this server. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3707() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3707");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:memory.pool",
        objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:cypher", objArray4);
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
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:memory.pool" + "'", str7,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher" + "'", str8,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cypher");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3708() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3708");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.bind-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3709() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3709");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_formation");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3710() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3710");
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
        "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout", objArray11);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3711() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3711");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("LZ4");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3712() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3712");
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
    java.lang.String str17 = io.github.onograph.I18N.format("messages_started", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:messages_started" + "'", str17,
        "MISSING VAL FOR KEY:messages_started");
  }

  @Test
  public void test3713() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3713");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of page merges executed by the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3714() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3714");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:--skip-relationships");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3715() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3715");
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
    java.lang.String str22 = io.github.onograph.I18N.format("none", objArray13);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:none" + "'", str22,
        "MISSING VAL FOR KEY:none");
  }

  @Test
  public void test3716() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3716");
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
    java.lang.String str11 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:appended_bytes", objArray7);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:appended_bytes" + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:appended_bytes");
  }

  @Test
  public void test3717() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3717");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:driver.logging.level");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3718() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3718");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("leader-only", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "URI of the Neo4j DBMS hosting the database associated to the Fabric graph. Example: neo4j://somewhere:7687 \nA comma separated list of URIs is acceptable. This is useful when the Fabric graph is hosted on a clusterand more that one bootstrap address needs to be provided in order to avoid a single point of failure.The provided addresses will be considered as an initial source of a routing table.Example: neo4j://core-1:1111,neo4j://core-2:2222",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str11, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:URI of the Neo4j DBMS hosting the database associated to the Fabric graph. Example: neo4j://somewhere:7687 \nA comma separated list of URIs is acceptable. This is useful when the Fabric graph is hosted on a clusterand more that one bootstrap address needs to be provided in order to avoid a single point of failure.The provided addresses will be considered as an initial source of a routing table.Example: neo4j://core-1:1111,neo4j://core-2:2222"
            + "'", str12,
        "MISSING VAL FOR KEY:URI of the Neo4j DBMS hosting the database associated to the Fabric graph. Example: neo4j://somewhere:7687 \nA comma separated list of URIs is acceptable. This is useful when the Fabric graph is hosted on a clusterand more that one bootstrap address needs to be provided in order to avoid a single point of failure.The provided addresses will be considered as an initial source of a routing table.Example: neo4j://core-1:1111,neo4j://core-2:2222");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3719() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3719");
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
    java.lang.String str24 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_catchup_error",
        objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_catchup_error" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_catchup_error");
  }

  @Test
  public void test3720() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3720");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("rollbacks", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("fabric.driver.connection.pool.max_size",
        objArray4);
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
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str7, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "MISSING VAL FOR KEY:fabric.driver.connection.pool.max_size" + "'",
        str8, "MISSING VAL FOR KEY:fabric.driver.connection.pool.max_size");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3721() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3721");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("lz4_encoder", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("name", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format("<size>", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.protocol_implementations.compression", objArray6);
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:lz4_encoder" + "'",
        str9, "MISSING VAL FOR KEY:lz4_encoder");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:name" + "'", str10,
        "MISSING VAL FOR KEY:name");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:<size>" + "'",
        str11, "MISSING VAL FOR KEY:<size>");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.compression" + "'", str12,
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.compression");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3722() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3722");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("true", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("status", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("dbms.functions", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.down_unreachable_on_new_joiner",
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:status" + "'",
        str18, "MISSING VAL FOR KEY:status");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dbms.functions" + "'", str19,
        "MISSING VAL FOR KEY:dbms.functions");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.down_unreachable_on_new_joiner"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.down_unreachable_on_new_joiner");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3723() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3723");
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
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hit_ratio",
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:queryPlan" + "'",
        str18, "MISSING VAL FOR KEY:queryPlan");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hit_ratio" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:hit_ratio");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3724() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3724");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*transaction.rollbacks*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3725() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3725");
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
    java.lang.String str16 = io.github.onograph.I18N.format("_NEO4J_RAFT_LOG_", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:_NEO4J_RAFT_LOG_" + "'", str16,
        "MISSING VAL FOR KEY:_NEO4J_RAFT_LOG_");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3726() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3726");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "Delay between RAFT message receive and process. (gauge)", objArray13);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:Delay between RAFT message receive and process. (gauge)" + "'",
        str22, "MISSING VAL FOR KEY:Delay between RAFT message receive and process. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3727() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3727");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Count of database operations which failed previously but have recovered. (counter)",
        objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("profiles", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format("metrics.bolt.messages.enabled",
        objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("operator_auth", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("createProperty", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("akka.remote.artery.bind.port",
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)"
            + "'", str19,
        "MISSING VAL FOR KEY:Count of database operations which failed previously but have recovered. (counter)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:profiles" + "'",
        str20, "MISSING VAL FOR KEY:profiles");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:metrics.bolt.messages.enabled" + "'", str21,
        "MISSING VAL FOR KEY:metrics.bolt.messages.enabled");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:operator_auth" + "'", str22,
        "MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:createProperty" + "'", str23,
        "MISSING VAL FOR KEY:createProperty");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:akka.remote.artery.bind.port" + "'", str24,
        "MISSING VAL FOR KEY:akka.remote.artery.bind.port");
  }

  @Test
  public void test3728() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3728");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "dbms.logs.security.rotation.keep_number");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3729() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3729");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:raftBootstrap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3730() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3730");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout"
            + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.cluster_id_publish_timeout");
  }

  @Test
  public void test3731() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3731");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "The total number of page evictions executed by the page cache. (counter)", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:The total number of page evictions executed by the page cache. (counter)"
            + "'", str14,
        "MISSING VAL FOR KEY:The total number of page evictions executed by the page cache. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3732() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3732");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Estimated number of active threads in the current thread group. (gauge)", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:fabric.driver.timeout", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)"
            + "'", str19,
        "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.timeout"
            + "'", str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.timeout");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3733() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3733");
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
    java.lang.String str16 = io.github.onograph.I18N.format("LabelQualifierAll", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("vm.memory.buffer.*", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("authorization", objArray11);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str16,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:vm.memory.buffer.*" + "'", str17,
        "MISSING VAL FOR KEY:vm.memory.buffer.*");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:authorization" + "'", str18,
        "MISSING VAL FOR KEY:authorization");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3734() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3734");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3735() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3735");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.connection-timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3736() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3736");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.ldap.use_starttls");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3737() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3737");
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
    java.lang.String str19 = io.github.onograph.I18N.format(
        "Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating", objArray12);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\""
            + "'", str19,
        "MISSING VAL FOR KEY:Catchup protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.1, 1.2, 2.1, 2.2\"");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:LZ_validating");
  }

  @Test
  public void test3738() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3738");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space", objArray9);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*vm.memory.pool.g1_eden_space");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3739() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3739");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("hi!");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3740() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3740");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:logging-dispatcher.type", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:logging-dispatcher.type"
            + "'", str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:logging-dispatcher.type");
  }

  @Test
  public void test3741() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3741");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:handshake_client_decoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3742() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3742");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3743() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3743");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler."
            + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.");
  }

  @Test
  public void test3744() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3744");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3745() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3745");
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
    java.lang.String str16 = io.github.onograph.I18N.format("threads.jetty.idle", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:threads.jetty.idle" + "'", str16,
        "MISSING VAL FOR KEY:threads.jetty.idle");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3746() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3746");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of committed write transactions. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3747() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3747");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("function", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("admin.ini", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format("member-data", objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.",
        objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. ",
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:admin.ini" + "'",
        str9, "MISSING VAL FOR KEY:admin.ini");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:member-data" + "'",
        str10, "MISSING VAL FOR KEY:member-data");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value."
            + "'", str11,
        "MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. "
            + "'", str12,
        "MISSING VAL FOR KEY:Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. ");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3748() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3748");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:inbound");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3749() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3749");
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
    java.lang.String str22 = io.github.onograph.I18N.format("dec_dispatch", objArray17);
    java.lang.String str23 = io.github.onograph.I18N.format("PropertyKey", objArray17);
    java.lang.String str24 = io.github.onograph.I18N.format("relationship-type-distribution",
        objArray17);
    java.lang.String str25 = io.github.onograph.I18N.format("causal_clustering.refuse_to_be_leader",
        objArray17);
    java.lang.String str26 = io.github.onograph.I18N.format("DEFAULT", objArray17);
    java.lang.String str27 = io.github.onograph.I18N.format(
        "Maximum amount of lag accepted for a new follower to join the Raft group", objArray17);
    java.lang.String str28 = io.github.onograph.I18N.format("prometheus", objArray17);
    java.lang.String str29 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT", objArray17);
    java.lang.String str30 = io.github.onograph.I18N.format("dbms.security.ldap.referral",
        objArray17);
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str19, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:read" + "'", str20,
        "MISSING VAL FOR KEY:read");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:invisible" + "'",
        str21, "MISSING VAL FOR KEY:invisible");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str22, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:PropertyKey" + "'",
        str23, "MISSING VAL FOR KEY:PropertyKey");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str24,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader" + "'",
        str25, "MISSING VAL FOR KEY:causal_clustering.refuse_to_be_leader");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:DEFAULT" + "'",
        str26, "MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertEquals("'" + str27 + "' != '"
            + "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group"
            + "'", str27,
        "MISSING VAL FOR KEY:Maximum amount of lag accepted for a new follower to join the Raft group");
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MISSING VAL FOR KEY:prometheus" + "'",
        str28, "MISSING VAL FOR KEY:prometheus");
    org.junit.Assert.assertEquals("'" + str29 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT" + "'", str29,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:DEFAULT");
    org.junit.Assert.assertEquals(
        "'" + str30 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.referral" + "'", str30,
        "MISSING VAL FOR KEY:dbms.security.ldap.referral");
    org.junit.Assert.assertNotNull(wildcardClass31);
  }

  @Test
  public void test3750() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3750");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Timeout for Akka socket binding");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3751() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3751");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str8 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("true", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("causal_clustering.read_replica",
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:true" + "'", str9,
        "MISSING VAL FOR KEY:true");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str10,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3752() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3752");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Copy a database and optionally apply filters.", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:Copy a database and optionally apply filters."
            + "'", str16, "MISSING VAL FOR KEY:Copy a database and optionally apply filters.");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3753() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3753");
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
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.procedures", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("COMMAND_READER_FACTORY", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.procedures" + "'", str15,
        "MISSING VAL FOR KEY:dbms.procedures");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:COMMAND_READER_FACTORY" + "'", str16,
        "MISSING VAL FOR KEY:COMMAND_READER_FACTORY");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3754() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3754");
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
    java.lang.String str16 = io.github.onograph.I18N.format("databaseMetrics", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:databaseMetrics" + "'", str16,
        "MISSING VAL FOR KEY:databaseMetrics");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3755() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3755");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3756() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3756");
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
        "MISSING VAL FOR KEY:dbms.security.auth_provider", objArray11);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_provider" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.auth_provider");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3757() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3757");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Type of in-flight cache.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3758() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3758");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "A list of security authentication providers containing the users and roles. This can be any of the built-in `native` or `ldap` providers, or it can be an externally provided plugin, with a custom name prefixed by `plugin-`, i.e. `plugin-<AUTH_PROVIDER_NAME>`. They will be queried in the given order when login is attempted.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3759() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3759");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str10 = io.github.onograph.I18N.format("dbms.pool", objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "causal_clustering.minimum_core_cluster_size_at_runtime", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("method", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "Configure the Neo4j Browser to store or not store user editor history.", objArray9);
    org.junit.Assert.assertNotNull(objArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9),
        "[causal_clustering.leader_transfer_interval, The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter), This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting., metrics.jvm.pause_time.enabled, FOR_ROLE]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:dbms.pool" + "'",
        str10, "MISSING VAL FOR KEY:dbms.pool");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime" + "'", str11,
        "MISSING VAL FOR KEY:causal_clustering.minimum_core_cluster_size_at_runtime");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:method" + "'",
        str12, "MISSING VAL FOR KEY:method");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:Configure the Neo4j Browser to store or not store user editor history."
            + "'", str13,
        "MISSING VAL FOR KEY:Configure the Neo4j Browser to store or not store user editor history.");
  }

  @Test
  public void test3760() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3760");
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
        "Path to the home directory for the copied database. Default is the same as the database copied from.",
        objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("connections_closed", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("dbms.backup.listen_address",
        objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "The number of operations to be processed before the state machines flush to disk",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format("throttled.millis", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client", objArray15);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from."
            + "'", str21,
        "MISSING VAL FOR KEY:Path to the home directory for the copied database. Default is the same as the database copied from.");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:connections_closed" + "'", str22,
        "MISSING VAL FOR KEY:connections_closed");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:dbms.backup.listen_address" + "'", str23,
        "MISSING VAL FOR KEY:dbms.backup.listen_address");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk"
            + "'", str24,
        "MISSING VAL FOR KEY:The number of operations to be processed before the state machines flush to disk");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "MISSING VAL FOR KEY:throttled.millis" + "'", str25,
        "MISSING VAL FOR KEY:throttled.millis");
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client"
            + "'", str26,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:restarting-cluster-client");
  }

  @Test
  public void test3761() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3761");
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
    java.lang.String str14 = io.github.onograph.I18N.format("passwordChangeRequired", objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format("arg1", objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:java.naming.security.principal", objArray8);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:passwordChangeRequired" + "'", str14,
        "MISSING VAL FOR KEY:passwordChangeRequired");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:arg1" + "'", str15,
        "MISSING VAL FOR KEY:arg1");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:java.naming.security.principal" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:java.naming.security.principal");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3762() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3762");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3763() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3763");
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
    java.lang.String str15 = io.github.onograph.I18N.format("", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable reporting metrics about number of entities in the database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:" + "'", str15,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3764() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3764");
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
    java.lang.String str18 = io.github.onograph.I18N.format("editor", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("Boolean", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Network interface and port for the RAFT server to listen on.", objArray12);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:editor" + "'",
        str18, "MISSING VAL FOR KEY:editor");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:Boolean" + "'",
        str19, "MISSING VAL FOR KEY:Boolean");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Network interface and port for the RAFT server to listen on." + "'",
        str20, "MISSING VAL FOR KEY:Network interface and port for the RAFT server to listen on.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3765() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3765");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3766() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3766");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:operator_auth");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3767() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3767");
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
    java.lang.String str21 = io.github.onograph.I18N.format("akka.logging-filter", objArray12);
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
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:akka.logging-filter" + "'", str21,
        "MISSING VAL FOR KEY:akka.logging-filter");
  }

  @Test
  public void test3768() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3768");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Deprecated, use dbms.databases.default_to_read_only");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3769() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3769");
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
    java.lang.String str15 = io.github.onograph.I18N.format("writable", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("requirePasswordChange", objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:writable" + "'",
        str15, "MISSING VAL FOR KEY:writable");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:requirePasswordChange" + "'", str16,
        "MISSING VAL FOR KEY:requirePasswordChange");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3770() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3770");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{
        "causal_clustering.leader_transfer_interval",
        "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)",
        "This has been replaced by privilege management on roles. Setting it to true will prevent the server from starting.",
        "metrics.jvm.pause_time.enabled", "FOR_ROLE"};
    java.lang.String str9 = io.github.onograph.I18N.format("dbms.pool", objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "akka.remote.artery.advanced.connection-timeout", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.",
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
            + "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout" + "'", str10,
        "MISSING VAL FOR KEY:akka.remote.artery.advanced.connection-timeout");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value."
            + "'", str11,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3771() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3771");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Raft Replication success count. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3772() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3772");
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
    java.lang.String str15 = io.github.onograph.I18N.format("metrics", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format("designated_seeder", objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format("metrics.neo4j.logs.enabled",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:metrics" + "'",
        str15, "MISSING VAL FOR KEY:metrics");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:designated_seeder" + "'", str16,
        "MISSING VAL FOR KEY:designated_seeder");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:total"
            + "'", str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:total");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.logs.enabled" + "'", str18,
        "MISSING VAL FOR KEY:metrics.neo4j.logs.enabled");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3773() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3773");
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
    java.lang.String str20 = io.github.onograph.I18N.format("memory.pool", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("dbms.security.addRoleToUser",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("java.naming.provider.url", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str20, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms.security.addRoleToUser" + "'", str21,
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:java.naming.provider.url" + "'", str22,
        "MISSING VAL FOR KEY:java.naming.provider.url");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3774() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3774");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("-serializer");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3775() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3775");
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
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:rotation_events",
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:rotation_events" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:rotation_events");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3776() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3776");
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
        "dbms.security.ldap.authorization.user_search_base", objArray15);
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
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base" + "'", str26,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_base");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test3777() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3777");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("arg2");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3778() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3778");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics.neo4j.pools.enabled");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3779() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3779");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeStateReader", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeStateReader" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeStateReader");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3780() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3780");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3781() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3781");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.group_to_role_mapping");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3782() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3782");
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
        "MISSING VAL FOR KEY:*bolt.messages_started*", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*bolt.messages_started*"
            + "'", str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3783() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3783");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Strategy for incremental backup. START_TIME means that this server will send transactions until the time of when the backup started has been reached. UNBOUNDED will keep sending until all committed transactions have been sent, even if they where committed after the backup job started. ");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3784() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3784");
    }
    java.lang.Object[] objArray3 = new java.lang.Object[]{};
    java.lang.String str4 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray3);
    java.lang.String str5 = io.github.onograph.I18N.format("Upgraded", objArray3);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter",
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
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter"
            + "'", str6,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.security.ldap.authorization.user_search_filter");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test3785() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3785");
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
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:PUBLIC",
        objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("raftBootstrap", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The level of middleware logging", objArray13);
    java.lang.String str23 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray13);
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PUBLIC" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:PUBLIC");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:raftBootstrap" + "'", str20,
        "MISSING VAL FOR KEY:raftBootstrap");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder"
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The level of middleware logging" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str23,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
  }

  @Test
  public void test3786() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3786");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.raft_messages_log_path");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3787() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3787");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:hours");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3788() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3788");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "causal_clustering.raft_vote_state_size", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("second", objArray14);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_vote_state_size" + "'",
        str23, "MISSING VAL FOR KEY:causal_clustering.raft_vote_state_size");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:second" + "'",
        str24, "MISSING VAL FOR KEY:second");
  }

  @Test
  public void test3789() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3789");
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
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_req_precopy",
        objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.scheduler.groups", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases", objArray14);
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
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str21,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_precopy");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.scheduler.groups"
            + "'", str23, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.scheduler.groups");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3790() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3790");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)",
        objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "causal_clustering.last_applied_state_size", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray13);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.last_applied_state_size"
            + "'", str21, "MISSING VAL FOR KEY:causal_clustering.last_applied_state_size");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str22,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
  }

  @Test
  public void test3791() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3791");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Enable reporting metrics about number of occurred replanning events. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3792() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3792");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("heap.used");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3793() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3793");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:CREATE CONSTRAINT ... IS NODE KEY command");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3794() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3794");
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
    java.lang.String str22 = io.github.onograph.I18N.format("External config file for Akka",
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:leader-only" + "'",
        str20, "MISSING VAL FOR KEY:leader-only");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:External config file for Akka" + "'", str22,
        "MISSING VAL FOR KEY:External config file for Akka");
  }

  @Test
  public void test3795() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3795");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("clusteringBatchingTransaction");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3796() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3796");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)",
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:*transaction.peak_concurrent" + "'", str15,
        "MISSING VAL FOR KEY:*transaction.peak_concurrent");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)");
  }

  @Test
  public void test3797() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3797");
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
    java.lang.String str17 = io.github.onograph.I18N.format("akka.actor.allow-java-serialization",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:akka.actor.allow-java-serialization" + "'",
        str17, "MISSING VAL FOR KEY:akka.actor.allow-java-serialization");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3798() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3798");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial_members");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3799() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3799");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3800() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3800");
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
    java.lang.String str16 = io.github.onograph.I18N.format("java.naming.provider.url", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:java.naming.provider.url" + "'", str16,
        "MISSING VAL FOR KEY:java.naming.provider.url");
  }

  @Test
  public void test3801() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3801");
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
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server.",
        objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server."
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server.");
  }

  @Test
  public void test3802() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3802");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:ldap", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ldap" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:ldap");
  }

  @Test
  public void test3803() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3803");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("time", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "Host and port to bind the cluster member discovery management communication.", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total_bytes",
        objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("*ids_in_use.relationship", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("*pool.transaction.*.total_used",
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:time" + "'", str11,
        "MISSING VAL FOR KEY:time");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication."
            + "'", str12,
        "MISSING VAL FOR KEY:Host and port to bind the cluster member discovery management communication.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.relationship" + "'", str14,
        "MISSING VAL FOR KEY:*ids_in_use.relationship");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:*pool.transaction.*.total_used" + "'", str15,
        "MISSING VAL FOR KEY:*pool.transaction.*.total_used");
  }

  @Test
  public void test3804() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3804");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:127.0.0.1");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3805() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3805");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.security.auth_cache_ttl");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3806() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3806");
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
        "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address", objArray12);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3807() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3807");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("true", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("storeDownloadStoreIdReader",
        objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("vm.memory.pool.*", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("--to-data-tx-directory", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("metadata_script.cypher", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:roles",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.logs.security.rotation.delay",
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:storeDownloadStoreIdReader" + "'", str15,
        "MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:vm.memory.pool.*" + "'", str16,
        "MISSING VAL FOR KEY:vm.memory.pool.*");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:--to-data-tx-directory" + "'", str17,
        "MISSING VAL FOR KEY:--to-data-tx-directory");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:metadata_script.cypher" + "'", str18,
        "MISSING VAL FOR KEY:metadata_script.cypher");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:roles" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:roles");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.rotation.delay" + "'",
        str20, "MISSING VAL FOR KEY:dbms.logs.security.rotation.delay");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3808() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3808");
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
        "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.",
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler."
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3809() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3809");
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
    java.lang.String str21 = io.github.onograph.I18N.format("metrics.prometheus.endpoint",
        objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_resolution_timeout", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.cluster.min_nr_of_members", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format("In-flight cache total bytes. (gauge)",
        objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format("<host:port>", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("discovery", objArray15);
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
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:metrics.prometheus.endpoint" + "'", str21,
        "MISSING VAL FOR KEY:metrics.prometheus.endpoint");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.discovery_resolution_timeout" + "'", str22,
        "MISSING VAL FOR KEY:causal_clustering.discovery_resolution_timeout");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.min_nr_of_members" + "'",
        str23, "MISSING VAL FOR KEY:causal_clustering.middleware.akka.cluster.min_nr_of_members");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:In-flight cache total bytes. (gauge)" + "'",
        str24, "MISSING VAL FOR KEY:In-flight cache total bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MISSING VAL FOR KEY:<host:port>" + "'",
        str25, "MISSING VAL FOR KEY:<host:port>");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MISSING VAL FOR KEY:discovery" + "'",
        str26, "MISSING VAL FOR KEY:discovery");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test3810() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3810");
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
        "Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead.",
        objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("https", objArray10);
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead."
            + "'", str15,
        "MISSING VAL FOR KEY:Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:https" + "'", str16,
        "MISSING VAL FOR KEY:https");
  }

  @Test
  public void test3811() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3811");
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
    java.lang.String str16 = io.github.onograph.I18N.format("replication_maybe", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:security.log",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str16,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:security.log" + "'",
        str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:security.log");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Available unused memory in the pool, in bytes. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3812() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3812");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level"
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3813() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3813");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3814() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3814");
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
    java.lang.String str20 = io.github.onograph.I18N.format("false", objArray15);
    java.lang.String str21 = io.github.onograph.I18N.format("INBOUND", objArray15);
    java.lang.String str22 = io.github.onograph.I18N.format("*bolt.messages_started*", objArray15);
    java.lang.String str23 = io.github.onograph.I18N.format("metrics.prefix", objArray15);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "No connection liveliness check is done by default.", objArray15);
    java.lang.String str25 = io.github.onograph.I18N.format("dirty", objArray15);
    java.lang.String str26 = io.github.onograph.I18N.format("dbms.security.ldap.host", objArray15);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:false" + "'", str20,
        "MISSING VAL FOR KEY:false");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:INBOUND" + "'",
        str21, "MISSING VAL FOR KEY:INBOUND");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_started*" + "'", str22,
        "MISSING VAL FOR KEY:*bolt.messages_started*");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:metrics.prefix" + "'", str23,
        "MISSING VAL FOR KEY:metrics.prefix");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:No connection liveliness check is done by default." + "'", str24,
        "MISSING VAL FOR KEY:No connection liveliness check is done by default.");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MISSING VAL FOR KEY:dirty" + "'", str25,
        "MISSING VAL FOR KEY:dirty");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:dbms.security.ldap.host" + "'", str26,
        "MISSING VAL FOR KEY:dbms.security.ldap.host");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test3815() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3815");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Maximum number of history files for the csv files.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3816() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3816");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)",
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:" + "'", str8,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)"
            + "'", str9,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread. (counter)");
  }

  @Test
  public void test3817() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3817");
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
    java.lang.String str16 = io.github.onograph.I18N.format("hnd_info", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("millisecond", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:--skip-relationship-properties", objArray11);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:hnd_info" + "'",
        str16, "MISSING VAL FOR KEY:hnd_info");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:millisecond" + "'",
        str17, "MISSING VAL FOR KEY:millisecond");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--skip-relationship-properties" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:--skip-relationship-properties");
  }

  @Test
  public void test3818() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3818");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.unknown_address_logging_throttle");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3819() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3819");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:high_limitV3_0_0",
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:hnd_info" + "'",
        str15, "MISSING VAL FOR KEY:hnd_info");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:high_limitV3_0_0" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:high_limitV3_0_0");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3820() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3820");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("DENIED");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3821() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3821");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raft-messages.log");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3822() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3822");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("metrics.neo4j.size.enabled", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:metrics.neo4j.size.enabled" + "'", str2,
        "MISSING VAL FOR KEY:metrics.neo4j.size.enabled");
  }

  @Test
  public void test3823() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3823");
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
        "Discovery cluster convergence. (gauge)", objArray9);
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
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster convergence. (gauge)" + "'",
        str15, "MISSING VAL FOR KEY:Discovery cluster convergence. (gauge)");
  }

  @Test
  public void test3824() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3824");
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
    java.lang.String str15 = io.github.onograph.I18N.format("dbms.procedures", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("causal_clustering.core", objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.procedures" + "'", str15,
        "MISSING VAL FOR KEY:dbms.procedures");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.core" + "'", str16,
        "MISSING VAL FOR KEY:causal_clustering.core");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3825() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3825");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "List the job groups that are active in the database internal job scheduler.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3826() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3826");
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
        "MISSING VAL FOR KEY:<label>[,<label>...]", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Report the current status of the system database sub-graph schema, providing details for each sub-graph component.",
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str16,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str17, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Report the current status of the system database sub-graph schema, providing details for each sub-graph component."
            + "'", str18,
        "MISSING VAL FOR KEY:Report the current status of the system database sub-graph schema, providing details for each sub-graph component.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3827() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3827");
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
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node" + "'",
        str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:*ids_in_use.node");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3828() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3828");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("labels", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:*ids_in_use.node",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray7);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test3829() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3829");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Estimated number of active threads in the current thread group. (gauge)", objArray11);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)"
            + "'", str18,
        "MISSING VAL FOR KEY:Estimated number of active threads in the current thread group. (gauge)");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3830() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3830");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("vm.file.descriptors.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3831() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3831");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.cluster_domain");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3832() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3832");
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
    java.lang.String str16 = io.github.onograph.I18N.format("dbms.directories.metrics", objArray10);
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
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:dbms.directories.metrics" + "'", str16,
        "MISSING VAL FOR KEY:dbms.directories.metrics");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3833() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3833");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str10 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(".JVM pause time metrics.", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("error_handler_head", objArray9);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:.JVM pause time metrics." + "'", str13,
        "MISSING VAL FOR KEY:.JVM pause time metrics.");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:error_handler_head" + "'", str14,
        "MISSING VAL FOR KEY:error_handler_head");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3834() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3834");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("status", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("--to-data-tx-directory", objArray6);
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:--to-data-tx-directory" + "'", str9,
        "MISSING VAL FOR KEY:--to-data-tx-directory");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3835() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3835");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("dbms.scheduler.jobs");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3836() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3836");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Append index of the RAFT log. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3837() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3837");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:-fail");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3838() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3838");
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
        "causal_clustering.raft_in_queue_max_batch_bytes", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("dbms.upgrade", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.raft_in_queue_max_batch_bytes" + "'", str21,
        "MISSING VAL FOR KEY:causal_clustering.raft_in_queue_max_batch_bytes");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.upgrade" + "'",
        str22, "MISSING VAL FOR KEY:dbms.upgrade");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3839() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3839");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:bytes_written",
        objArray13);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:restore", objArray13);
    java.lang.Class<?> wildcardClass24 = objArray13.getClass();
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
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:bytes_written" + "'",
        str22, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:bytes_written");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:restore" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:restore");
    org.junit.Assert.assertNotNull(wildcardClass24);
  }

  @Test
  public void test3840() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3840");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("prepare-restore");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3841() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3841");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3842() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3842");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:8m");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3843() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3843");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*transaction.last_committed_tx_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3844() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3844");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("ids_in_use");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3845() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3845");
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
    java.lang.String str17 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:FOR", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authorization.system_username", objArray11);
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
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:FOR" + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:FOR");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:dbms.security.ldap.authorization.system_username" + "'", str18,
        "MISSING VAL FOR KEY:dbms.security.ldap.authorization.system_username");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3846() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3846");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.leader_transfer_interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3847() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3847");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The LDAP group to which a user must belong to get any access to the system.Set this to restrict access to a subset of LDAP users belonging to a particular group. If this is not set, any user to successfully authenticate via LDAP will have access to the PUBLIC role and any other roles assigned to them via dbms.security.ldap.authorization.group_to_role_mapping.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3848() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3848");
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
    java.lang.String str20 = io.github.onograph.I18N.format("memory.pool", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("dbms.security.addRoleToUser",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(".JVM file descriptor metrics.",
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str20, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:dbms.security.addRoleToUser" + "'", str21,
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:.JVM file descriptor metrics." + "'", str22,
        "MISSING VAL FOR KEY:.JVM file descriptor metrics.");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3849() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3849");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Advertised hostname/IP address and port for the transaction shipping server.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3850() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3850");
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
    java.lang.String str22 = io.github.onograph.I18N.format("enc_req_database_id", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:akka.remote.artery.bind.port", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(".metrics", objArray14);
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
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:enc_req_database_id" + "'", str22,
        "MISSING VAL FOR KEY:enc_req_database_id");
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port" + "'", str23,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:akka.remote.artery.bind.port");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:.metrics" + "'",
        str24, "MISSING VAL FOR KEY:.metrics");
  }

  @Test
  public void test3851() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3851");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeDownloadStoreIdReader", objArray7);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeDownloadStoreIdReader"
            + "'", str14,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:storeDownloadStoreIdReader");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3852() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3852");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:hnd_get_all_database_ids");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3853() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3853");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3854() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3854");
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
        "MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("metrics.jvm.pause_time.enabled",
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:metrics.csv.rotation.compression");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\""
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Raft protocol implementation versions that this instance will allow in negotiation as a comma-separated list. Order is not relevant: the greatest value will be preferred. An empty list will allow all supported versions. Example value: \"1.0, 1.3, 2.0, 2.1\"");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:metrics.jvm.pause_time.enabled" + "'", str22,
        "MISSING VAL FOR KEY:metrics.jvm.pause_time.enabled");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3855() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3855");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:fabric.driver.connection.pool.acquisition_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3856() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3856");
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
    java.lang.String str14 = io.github.onograph.I18N.format(
        "dbms.security.authentication_providers", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:dbms.security.authentication_providers" + "'",
        str14, "MISSING VAL FOR KEY:dbms.security.authentication_providers");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3857() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3857");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3858() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3858");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("accumulated_queue_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3859() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3859");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("events");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3860() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3860");
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
    java.lang.String str22 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:active",
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
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:active");
  }

  @Test
  public void test3861() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3861");
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3862() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3862");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("metrics");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3863() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3863");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_req_database_id");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3864() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3864");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:graph");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3865() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3865");
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
    java.lang.String str20 = io.github.onograph.I18N.format("fabric.stream.buffer.low_watermark",
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark" + "'",
        str20, "MISSING VAL FOR KEY:fabric.stream.buffer.low_watermark");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3866() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3866");
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
    java.lang.String str14 = io.github.onograph.I18N.format("txs", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:txs" + "'", str14,
        "MISSING VAL FOR KEY:txs");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3867() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3867");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("true", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("dbms.security.auth_provider",
        objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("lz4_decoder", objArray8);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:lz4_decoder" + "'",
        str12, "MISSING VAL FOR KEY:lz4_decoder");
  }

  @Test
  public void test3868() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3868");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Largest batch processed by RAFT in number of entries");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3869() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3869");
    }
    java.lang.Object[] objArray5 = new java.lang.Object[]{};
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray5);
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray5);
    java.lang.String str8 = io.github.onograph.I18N.format("Upgraded", objArray5);
    java.lang.String str9 = io.github.onograph.I18N.format("store_random_id", objArray5);
    java.lang.String str10 = io.github.onograph.I18N.format("Unassign a role from the user.",
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
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:store_random_id" + "'", str9,
        "MISSING VAL FOR KEY:store_random_id");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "MISSING VAL FOR KEY:Unassign a role from the user." + "'", str10,
        "MISSING VAL FOR KEY:Unassign a role from the user.");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3870() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3870");
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
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.clustering.enable", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("database.", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.",
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.clustering.enable" + "'", str18,
        "MISSING VAL FOR KEY:dbms.clustering.enable");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:database." + "'",
        str19, "MISSING VAL FOR KEY:database.");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3871() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3871");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3872() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3872");
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
    java.lang.String str22 = io.github.onograph.I18N.format("dbms.max_databases", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("/{databaseName}/cluster", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:temp-bootstrap",
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:relationship-type-distribution" + "'", str19,
        "MISSING VAL FOR KEY:relationship-type-distribution");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]"
            + "'", str20, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:metrics.jmx.enabled" + "'", str21,
        "MISSING VAL FOR KEY:metrics.jmx.enabled");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:dbms.max_databases" + "'", str22,
        "MISSING VAL FOR KEY:dbms.max_databases");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:/{databaseName}/cluster" + "'", str23,
        "MISSING VAL FOR KEY:/{databaseName}/cluster");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:temp-bootstrap" + "'",
        str24, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:temp-bootstrap");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3873() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3873");
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
        "The reporting interval for Graphite. That is, how often to send updated metrics to Graphite.",
        objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("dec_req_dispatch", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("dbms.scheduler.groups", objArray12);
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:The reporting interval for Graphite. That is, how often to send updated metrics to Graphite."
            + "'", str18,
        "MISSING VAL FOR KEY:The reporting interval for Graphite. That is, how often to send updated metrics to Graphite.");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:dec_req_dispatch" + "'", str19,
        "MISSING VAL FOR KEY:dec_req_dispatch");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:dbms.scheduler.groups" + "'", str20,
        "MISSING VAL FOR KEY:dbms.scheduler.groups");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3874() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3874");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "dbms.security.authentication_providers", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_resolution_retry_interval",
        objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:dbms.security.authentication_providers" + "'",
        str15, "MISSING VAL FOR KEY:dbms.security.authentication_providers");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_resolution_retry_interval"
            + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_resolution_retry_interval");
  }

  @Test
  public void test3875() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3875");
    }
    java.lang.Object[] objArray4 = new java.lang.Object[]{};
    java.lang.String str5 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray4);
    java.lang.String str6 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray4);
    java.lang.String str7 = io.github.onograph.I18N.format("Upgraded", objArray4);
    java.lang.String str8 = io.github.onograph.I18N.format("min", objArray4);
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
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MISSING VAL FOR KEY:min" + "'", str8,
        "MISSING VAL FOR KEY:min");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test3876() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3876");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Boolean");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3877() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3877");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.backup.address");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3878() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3878");
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
        "MISSING VAL FOR KEY:readReplicaStoreIdReader", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:readReplicaStoreIdReader"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:readReplicaStoreIdReader");
  }

  @Test
  public void test3879() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3879");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("function", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Used or reserved native memory in bytes. (gauge)", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("java.naming.security.authentication",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'",
        objArray8);
    java.lang.String str14 = io.github.onograph.I18N.format("causal_clustering.read_replica",
        objArray8);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "The maximum file size before the membership state file is rotated (in unit of entries)",
        objArray8);
    java.lang.String str16 = io.github.onograph.I18N.format("com.sun.jndi.ldap.read.timeout",
        objArray8);
    java.lang.Class<?> wildcardClass17 = objArray8.getClass();
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str9,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str10, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str11,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:java.naming.security.authentication" + "'",
        str12, "MISSING VAL FOR KEY:java.naming.security.authentication");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'"
            + "'", str13,
        "MISSING VAL FOR KEY:SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.read_replica" + "'", str14,
        "MISSING VAL FOR KEY:causal_clustering.read_replica");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)"
            + "'", str15,
        "MISSING VAL FOR KEY:The maximum file size before the membership state file is rotated (in unit of entries)");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout" + "'", str16,
        "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3880() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3880");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("time", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("metadata_script.cypher", objArray6);
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
        "'" + str9 + "' != '" + "MISSING VAL FOR KEY:metadata_script.cypher" + "'", str9,
        "MISSING VAL FOR KEY:metadata_script.cypher");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3881() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3881");
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
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:days", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The name of a server_group whose members should be prioritized as leaders for the given database. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible.",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("suspended", objArray11);
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days" + "'", str16,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:days");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The name of a server_group whose members should be prioritized as leaders for the given database. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible."
            + "'", str17,
        "MISSING VAL FOR KEY:The name of a server_group whose members should be prioritized as leaders for the given database. This does not guarantee that members of this group will be leader at all times, but the cluster will attempt to transfer leadership to such a member when possible.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:suspended" + "'",
        str18, "MISSING VAL FOR KEY:suspended");
  }

  @Test
  public void test3882() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3882");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("function", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format("admin.ini", objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "List the job groups that are active in the database internal job scheduler.", objArray7);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.",
        objArray7);
    java.lang.String str13 = io.github.onograph.I18N.format("raft_message_composer", objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.middleware.akka.bind_timeout", objArray7);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`."
            + "'", str8,
        "MISSING VAL FOR KEY:The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MISSING VAL FOR KEY:function" + "'",
        str9, "MISSING VAL FOR KEY:function");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MISSING VAL FOR KEY:admin.ini" + "'",
        str10, "MISSING VAL FOR KEY:admin.ini");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler."
            + "'", str11,
        "MISSING VAL FOR KEY:List the job groups that are active in the database internal job scheduler.");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written."
            + "'", str12,
        "MISSING VAL FOR KEY:The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written.");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:raft_message_composer" + "'", str13,
        "MISSING VAL FOR KEY:raft_message_composer");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.middleware.akka.bind_timeout" + "'", str14,
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.bind_timeout");
  }

  @Test
  public void test3883() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3883");
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
    java.lang.String str20 = io.github.onograph.I18N.format("Time out for a new member to catch up",
        objArray10);
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Time out for a new member to catch up" + "'",
        str20, "MISSING VAL FOR KEY:Time out for a new member to catch up");
  }

  @Test
  public void test3884() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3884");
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
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)",
        objArray11);
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of different relationship types stored in the database. (gauge)");
  }

  @Test
  public void test3885() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3885");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("fabric.driver.idle_check_interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3886() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3886");
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
    java.lang.String str24 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:server",
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
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:server" + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:server");
  }

  @Test
  public void test3887() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3887");
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
    java.lang.String str14 = io.github.onograph.I18N.format("eviction_exceptions", objArray9);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:eviction_exceptions" + "'", str14,
        "MISSING VAL FOR KEY:eviction_exceptions");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3888() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3888");
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
    java.lang.String str11 = io.github.onograph.I18N.format("capacity", objArray7);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:capacity" + "'",
        str11, "MISSING VAL FOR KEY:capacity");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3889() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3889");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("Upgraded", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.",
        objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("appended_bytes", objArray9);
    java.lang.String str16 = io.github.onograph.I18N.format("DatabaseDefault", objArray9);
    java.lang.String str17 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str18 = io.github.onograph.I18N.format(
        "Maximum number of history files for the security log.", objArray9);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:" + "'", str13,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable reporting metrics about the store size of each database. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:appended_bytes" + "'", str15,
        "MISSING VAL FOR KEY:appended_bytes");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:DatabaseDefault" + "'", str16,
        "MISSING VAL FOR KEY:DatabaseDefault");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:" + "'", str17,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:Maximum number of history files for the security log." + "'", str18,
        "MISSING VAL FOR KEY:Maximum number of history files for the security log.");
  }

  @Test
  public void test3890() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3890");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("setting");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3891() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3891");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:page_faults");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3892() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3892");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:createProperty",
        objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:createProperty" + "'",
        str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:createProperty");
  }

  @Test
  public void test3893() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3893");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format("*ids_in_use.node", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("temp-copy", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format("dbms.logs.security.format", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Set to `true` to enable the Prometheus endpoint", objArray9);
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:temp-copy" + "'",
        str12, "MISSING VAL FOR KEY:temp-copy");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:dbms.logs.security.format" + "'", str13,
        "MISSING VAL FOR KEY:dbms.logs.security.format");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Set to `true` to enable the Prometheus endpoint" + "'", str15,
        "MISSING VAL FOR KEY:Set to `true` to enable the Prometheus endpoint");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3894() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3894");
    }
    java.lang.Object[] objArray10 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str11 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray10);
    java.lang.String str12 = io.github.onograph.I18N.format("browser.credential_timeout",
        objArray10);
    java.lang.String str13 = io.github.onograph.I18N.format("", objArray10);
    java.lang.String str14 = io.github.onograph.I18N.format(".JVM pause time metrics.", objArray10);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:raftBootstrap", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("DbRole", objArray10);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:.JVM pause time metrics." + "'", str14,
        "MISSING VAL FOR KEY:.JVM pause time metrics.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:raftBootstrap" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:raftBootstrap");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:DbRole" + "'",
        str16, "MISSING VAL FOR KEY:DbRole");
  }

  @Test
  public void test3895() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3895");
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
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_info", objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format("ldap", objArray12);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_info" + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_res_info");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:ldap" + "'", str21,
        "MISSING VAL FOR KEY:ldap");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test3896() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3896");
    }
    java.lang.Object[] objArray7 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str8 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray7);
    java.lang.String str9 = io.github.onograph.I18N.format("", objArray7);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ",
        objArray7);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Limits amount of global threads for store copy.", objArray7);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. "
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configure if the `dbms.routing.getRoutingTable()` procedure should include the leader as read endpoint or return only read replicas/followers. Note: leader is returned as read endpoint if no other member is present all. ");
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "MISSING VAL FOR KEY:Limits amount of global threads for store copy." + "'", str11,
        "MISSING VAL FOR KEY:Limits amount of global threads for store copy.");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test3897() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3897");
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
        "The transactions' size in native memory in bytes. (histogram)", objArray12);
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
            + "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)" + "'",
        str20, "MISSING VAL FOR KEY:The transactions' size in native memory in bytes. (histogram)");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3898() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3898");
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
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray8);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3899() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3899");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("raftBootstrap", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MISSING VAL FOR KEY:raftBootstrap" + "'",
        str2, "MISSING VAL FOR KEY:raftBootstrap");
  }

  @Test
  public void test3900() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3900");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("TRACKING_RESPONSE_HANDLER",
        objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(
        "Enable reporting metrics about Bolt Protocol message processing. Deprecated - use metrics.filter instead.",
        objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Activate a suspended user.", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("", objArray11);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER" + "'", str14,
        "MISSING VAL FOR KEY:TRACKING_RESPONSE_HANDLER");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric."
            + "'", str15,
        "MISSING VAL FOR KEY:Specifies which metrics should be enabled by using a comma separated list of globbing patterns. Only the metrics matching the filter will be enabled. For example '*check_point*,neo4j.page_cache.evictions' will enable any checkpoint metrics and the pagecache eviction metric.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "MISSING VAL FOR KEY:Enable reporting metrics about Bolt Protocol message processing. Deprecated - use metrics.filter instead."
            + "'", str16,
        "MISSING VAL FOR KEY:Enable reporting metrics about Bolt Protocol message processing. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Activate a suspended user." + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Activate a suspended user.");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test3901() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3901");
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
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Count of successful database create operations. (counter)", objArray10);
    java.lang.String str16 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:server_policies",
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.discovery_listen_address");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str13, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str14, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Count of successful database create operations. (counter)" + "'",
        str15, "MISSING VAL FOR KEY:Count of successful database create operations. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:server_policies" + "'",
        str16, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:server_policies");
  }

  @Test
  public void test3902() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3902");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Privilege");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3903() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3903");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str9 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "dbms.security.ldap.authentication.attribute", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("LZ_validating", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format(".JVM threads metrics.", objArray8);
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
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:.JVM threads metrics." + "'", str12,
        "MISSING VAL FOR KEY:.JVM threads metrics.");
  }

  @Test
  public void test3904() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3904");
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
    java.lang.String str21 = io.github.onograph.I18N.format("PUBLIC", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("high_limit", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MISSING VAL FOR KEY:PUBLIC" + "'",
        str21, "MISSING VAL FOR KEY:PUBLIC");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:high_limit" + "'",
        str22, "MISSING VAL FOR KEY:high_limit");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3905() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3905");
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
    java.lang.String str20 = io.github.onograph.I18N.format("metrics.csv.rotation.size",
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:metrics.csv.rotation.size" + "'", str20,
        "MISSING VAL FOR KEY:metrics.csv.rotation.size");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3906() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3906");
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
        "The default database on the target DBMS. Typically 'Neo4j'", objArray13);
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
            + "MISSING VAL FOR KEY:The default database on the target DBMS. Typically 'Neo4j'" + "'",
        str22, "MISSING VAL FOR KEY:The default database on the target DBMS. Typically 'Neo4j'");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3907() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3907");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("suspended");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3908() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3908");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:RelationshipQualifier");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3909() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3909");
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
    java.lang.String str13 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dbms.procedures",
        objArray7);
    java.lang.String str14 = io.github.onograph.I18N.format("roleName", objArray7);
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
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.procedures" + "'",
        str13, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:dbms.procedures");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:roleName" + "'",
        str14, "MISSING VAL FOR KEY:roleName");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3910() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3910");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("replan_wait_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3911() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3911");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3912() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3912");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:raft_content_decoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3913() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3913");
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
        "causal_clustering.raft_log_rotation_size", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:neo4j.count.*" + "'", str18,
        "MISSING VAL FOR KEY:neo4j.count.*");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:*pool.transaction.*.used_native" + "'", str19,
        "MISSING VAL FOR KEY:*pool.transaction.*.used_native");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.raft_log_rotation_size"
            + "'", str20, "MISSING VAL FOR KEY:causal_clustering.raft_log_rotation_size");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3914() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3914");
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
    java.lang.String str17 = io.github.onograph.I18N.format("--pagecache", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("pull_update_highest_tx_id_requested",
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:dec_dispatch" + "'",
        str16, "MISSING VAL FOR KEY:dec_dispatch");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:--pagecache" + "'",
        str17, "MISSING VAL FOR KEY:--pagecache");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:pull_update_highest_tx_id_requested" + "'",
        str18, "MISSING VAL FOR KEY:pull_update_highest_tx_id_requested");
  }

  @Test
  public void test3915() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3915");
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
    java.lang.String str17 = io.github.onograph.I18N.format("LabelQualifierAll", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("dbms.upgradeDetails", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("*dbms.pool.bolt.used_heap",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str17,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:dbms.upgradeDetails" + "'", str18,
        "MISSING VAL FOR KEY:dbms.upgradeDetails");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:*dbms.pool.bolt.used_heap" + "'", str19,
        "MISSING VAL FOR KEY:*dbms.pool.bolt.used_heap");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component."
            + "'", str20,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
  }

  @Test
  public void test3916() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3916");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("converged");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3917() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3917");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:cn");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3918() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3918");
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
        "MISSING VAL FOR KEY:causal_clustering.core.*", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "Set to `true` to enable the Prometheus endpoint", objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.",
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*"
            + "'", str19, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.core.*");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
            + "MISSING VAL FOR KEY:Set to `true` to enable the Prometheus endpoint" + "'", str20,
        "MISSING VAL FOR KEY:Set to `true` to enable the Prometheus endpoint");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands."
            + "'", str21,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Display ServerId of instance. The ServerId can be used to identify this server in cypher commands.");
  }

  @Test
  public void test3919() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3919");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("snappy_encoder", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("The level of middleware logging",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("TO", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format("", objArray11);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:snappy_encoder" + "'", str14,
        "MISSING VAL FOR KEY:snappy_encoder");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:The level of middleware logging" + "'", str15,
        "MISSING VAL FOR KEY:The level of middleware logging");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:" + "'", str16,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap"
            + "'", str17,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.akka.allow_any_core_to_bootstrap");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:TO" + "'", str18,
        "MISSING VAL FOR KEY:TO");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:" + "'", str19,
        "MISSING VAL FOR KEY:");
  }

  @Test
  public void test3920() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3920");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Accumulated detected VM pause time. (gauge)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3921() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3921");
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
    java.lang.String str14 = io.github.onograph.I18N.format("Maximum timeout for akka shutdown",
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:Maximum timeout for akka shutdown" + "'",
        str14, "MISSING VAL FOR KEY:Maximum timeout for akka shutdown");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3922() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3922");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("countAllNodesMetrics", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:countAllNodesMetrics" + "'", str2,
        "MISSING VAL FOR KEY:countAllNodesMetrics");
  }

  @Test
  public void test3923() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3923");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("raft.log.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3924() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3924");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Maximum number of akka restart attempts before we panic the DBMS. Set to -1 to retry forever");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3925() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3925");
    }
    java.lang.Object[] objArray6 = new java.lang.Object[]{};
    java.lang.String str7 = io.github.onograph.I18N.format(
        "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`.",
        objArray6);
    java.lang.String str8 = io.github.onograph.I18N.format("function", objArray6);
    java.lang.String str9 = io.github.onograph.I18N.format("FOR_DATABASE", objArray6);
    java.lang.String str10 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy.",
        objArray6);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:handshake_server_encoder", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.security.deleteUser", objArray6);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy."
            + "'", str10,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Network interface and port for the transaction shipping server to listen on. Please note that it is also possible to run the backup client against this port so always limit access to it via the firewall and configure an ssl policy.");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:handshake_server_encoder"
            + "'", str11, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:handshake_server_encoder");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:dbms.security.deleteUser" + "'", str12,
        "MISSING VAL FOR KEY:dbms.security.deleteUser");
  }

  @Test
  public void test3926() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3926");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Upgrade the system database schema if it is not the current schema, providing upgrade status results for each sub-graph component.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3927() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3927");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:dirty");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3928() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3928");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Set to `true` to enable the Prometheus endpoint");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3929() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3929");
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
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format("LZ_validating", objArray6);
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MISSING VAL FOR KEY:" + "'", str11,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:LZ_validating" + "'", str12,
        "MISSING VAL FOR KEY:LZ_validating");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test3930() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3930");
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
    java.lang.String str18 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies.",
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:Sets level for driver internal logging."
            + "'", str15, "MISSING VAL FOR KEY:Sets level for driver internal logging.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:max_elements" + "'",
        str16, "MISSING VAL FOR KEY:max_elements");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)" + "'", str17,
        "MISSING VAL FOR KEY:Used or reserved native memory in bytes. (gauge)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies."
            + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:A list of group names for the server used when configuring load balancing and replication policies.");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3931() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3931");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("Timeout for Akka handshake", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:Timeout for Akka handshake" + "'", str2,
        "MISSING VAL FOR KEY:Timeout for Akka handshake");
  }

  @Test
  public void test3932() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3932");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("time", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Host and port to bind the cluster member discovery management communication.", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:total_bytes",
        objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("*ids_in_use.relationship", objArray8);
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
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes" + "'", str12,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "MISSING VAL FOR KEY:*ids_in_use.relationship" + "'", str13,
        "MISSING VAL FOR KEY:*ids_in_use.relationship");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3933() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3933");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("enc_req_tx");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3934() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3934");
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
    java.lang.String str26 = io.github.onograph.I18N.format(
        "Enable metrics. Setting this to `false` will to turn off all metrics.", objArray15);
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
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
            + "MISSING VAL FOR KEY:Enable metrics. Setting this to `false` will to turn off all metrics."
            + "'", str26,
        "MISSING VAL FOR KEY:Enable metrics. Setting this to `false` will to turn off all metrics.");
  }

  @Test
  public void test3935() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3935");
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
        "MISSING VAL FOR KEY:createRelationshipType", objArray9);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:createRelationshipType"
            + "'", str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:createRelationshipType");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3936() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3936");
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
    java.lang.String str14 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:enc_snapshot",
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_snapshot" + "'",
        str14, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:enc_snapshot");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3937() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3937");
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
    java.lang.String str19 = io.github.onograph.I18N.format("messages_received", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format(
        "causal_clustering.kubernetes.namespace", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format("countAllRelationshipMetrics",
        objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops", objArray13);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:messages_received" + "'", str19,
        "MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace" + "'",
        str20, "MISSING VAL FOR KEY:causal_clustering.kubernetes.namespace");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:countAllRelationshipMetrics" + "'", str21,
        "MISSING VAL FOR KEY:countAllRelationshipMetrics");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops"
            + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3938() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3938");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:OUTBOUND");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3939() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3939");
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
    java.lang.String str24 = io.github.onograph.I18N.format("{}", objArray14);
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
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MISSING VAL FOR KEY:{}" + "'", str24,
        "MISSING VAL FOR KEY:{}");
  }

  @Test
  public void test3940() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3940");
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
    java.lang.String str16 = io.github.onograph.I18N.format("node", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:node" + "'", str16,
        "MISSING VAL FOR KEY:node");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3941() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3941");
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MISSING VAL FOR KEY:" + "'", str22,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3942() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3942");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("is_suspended");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3943() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3943");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "TX pull requests received from read replicas. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3944() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3944");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The timeout for establishing an LDAP connection. If a connection with the LDAP server cannot be established within the given time the attempt is aborted. A value of 0 means to use the network protocol's (i.e., TCP's) timeout value.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3945() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3945");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*cypher.replan_events");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3946() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3946");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "The highest transaction id that has been pulled in the last pull updates by this instance. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3947() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3947");
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
    java.lang.String str18 = io.github.onograph.I18N.format("idCacheClusterCleanup", objArray11);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:idCacheClusterCleanup" + "'", str18,
        "MISSING VAL FOR KEY:idCacheClusterCleanup");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3948() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3948");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("*ids_in_use.node", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("temp-copy", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("dbms.logs.security.format", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "akka.cluster.run-coordinated-shutdown-when-down", objArray8);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:akka.cluster.run-coordinated-shutdown-when-down" + "'", str13,
        "MISSING VAL FOR KEY:akka.cluster.run-coordinated-shutdown-when-down");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3949() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3949");
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
        "Enable multi-data center features. Requires appropriate licensing.", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:addresses", objArray9);
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
            + "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:addresses" + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:addresses");
  }

  @Test
  public void test3950() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3950");
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
    java.lang.String str16 = io.github.onograph.I18N.format("QUALIFIED", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:QUALIFIED" + "'",
        str16, "MISSING VAL FOR KEY:QUALIFIED");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3951() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3951");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str13 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format(".Database operation count metrics",
        objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("SCHEMA", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("total_bytes", objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("thread.count", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)",
        objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("vm.pause_time.*", objArray12);
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
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:.Database operation count metrics" + "'",
        str15, "MISSING VAL FOR KEY:.Database operation count metrics");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:SCHEMA" + "'",
        str16, "MISSING VAL FOR KEY:SCHEMA");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:total_bytes" + "'",
        str17, "MISSING VAL FOR KEY:total_bytes");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:thread.count" + "'",
        str18, "MISSING VAL FOR KEY:thread.count");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:The total number of live threads including daemon and non-daemon threads. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:vm.pause_time.*" + "'", str20,
        "MISSING VAL FOR KEY:vm.pause_time.*");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3952() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3952");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str12 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format("status", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("raft-server", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format("transaction.*", objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format(".Query execution metrics", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("cn", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("simple", objArray11);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.initial_delay",
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:raft-server" + "'",
        str14, "MISSING VAL FOR KEY:raft-server");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:transaction.*" + "'", str15,
        "MISSING VAL FOR KEY:transaction.*");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:.Query execution metrics" + "'", str16,
        "MISSING VAL FOR KEY:.Query execution metrics");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MISSING VAL FOR KEY:cn" + "'", str17,
        "MISSING VAL FOR KEY:cn");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:simple" + "'",
        str18, "MISSING VAL FOR KEY:simple");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.initial_delay"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.akka_actor_system_restarter.initial_delay");
  }

  @Test
  public void test3953() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3953");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:handshake_server_encoder");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3954() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3954");
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
    java.lang.String str16 = io.github.onograph.I18N.format("LabelQualifierAll", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.upgradeDetails", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:localhost",
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:LabelQualifierAll" + "'", str16,
        "MISSING VAL FOR KEY:LabelQualifierAll");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.upgradeDetails" + "'", str17,
        "MISSING VAL FOR KEY:dbms.upgradeDetails");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost" + "'", str18,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:localhost");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3955() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3955");
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
    java.lang.String str18 = io.github.onograph.I18N.format("server_policies", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format(
        "causal_clustering.log_shipping_max_lag", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("applicationProtocolVersion",
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:server_policies" + "'", str18,
        "MISSING VAL FOR KEY:server_policies");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag" + "'",
        str19, "MISSING VAL FOR KEY:causal_clustering.log_shipping_max_lag");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:applicationProtocolVersion" + "'", str20,
        "MISSING VAL FOR KEY:applicationProtocolVersion");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3956() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3956");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:" + "'", str18,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3957() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3957");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "The total number of Bolt sessions started since this instance started. This includes both succeeded and failed sessions (deprecated, use connections_opened instead). (counter)",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:The total number of Bolt sessions started since this instance started. This includes both succeeded and failed sessions (deprecated, use connections_opened instead). (counter)"
            + "'", str2,
        "MISSING VAL FOR KEY:The total number of Bolt sessions started since this instance started. This includes both succeeded and failed sessions (deprecated, use connections_opened instead). (counter)");
  }

  @Test
  public void test3958() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3958");
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
    java.lang.String str14 = io.github.onograph.I18N.format("enc_res_tx_pull", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace", objArray9);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:enc_res_tx_pull" + "'", str14,
        "MISSING VAL FOR KEY:enc_res_tx_pull");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace"
            + "'", str15,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:/var/run/secrets/kubernetes.io/serviceaccount/namespace");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3959() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3959");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:A comma separated list of property keys to keep for nodes with the specified label. Any labels not explicitly mentioned will keep their properties. Can not be combined with --skip-properties or --skip-node-properties.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3960() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3960");
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
    java.lang.String str20 = io.github.onograph.I18N.format("vm.gc.*", objArray12);
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
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:vm.gc.*" + "'",
        str20, "MISSING VAL FOR KEY:vm.gc.*");
  }

  @Test
  public void test3961() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3961");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("pins");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3962() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3962");
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
        "The total number of page flushes executed by the page cache. (counter)", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.id", objArray13);
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
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:The total number of page flushes executed by the page cache. (counter)"
            + "'", str21,
        "MISSING VAL FOR KEY:The total number of page flushes executed by the page cache. (counter)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.id" + "'", str22,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:database.id");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3963() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3963");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.discovery_resolution_retry_interval");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3964() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3964");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:Timer for RAFT message processing. (counter, histogram)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3965() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3965");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:DbRole", objArray1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DbRole" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:DbRole");
  }

  @Test
  public void test3966() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3966");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:vm.thread.*");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3967() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3967");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:--additional-config");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3968() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3968");
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
    java.lang.String str19 = io.github.onograph.I18N.format("PROTOCOL_STACK", objArray13);
    java.lang.String str20 = io.github.onograph.I18N.format("replication_maybe", objArray13);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "causal_clustering.election_failure_detection_window", objArray13);
    java.lang.String str22 = io.github.onograph.I18N.format("<label>[,<label>...]", objArray13);
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
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:PROTOCOL_STACK" + "'", str19,
        "MISSING VAL FOR KEY:PROTOCOL_STACK");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:replication_maybe" + "'", str20,
        "MISSING VAL FOR KEY:replication_maybe");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.election_failure_detection_window" + "'", str21,
        "MISSING VAL FOR KEY:causal_clustering.election_failure_detection_window");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:<label>[,<label>...]" + "'", str22,
        "MISSING VAL FOR KEY:<label>[,<label>...]");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3969() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3969");
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
    java.lang.String str18 = io.github.onograph.I18N.format("DeletedDatabase", objArray11);
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
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:DeletedDatabase" + "'", str18,
        "MISSING VAL FOR KEY:DeletedDatabase");
  }

  @Test
  public void test3970() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3970");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:messages_received");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3971() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3971");
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
    java.lang.String str17 = io.github.onograph.I18N.format("In-flight cache misses. (counter)",
        objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:tx_size_heap",
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:In-flight cache misses. (counter)" + "'",
        str17, "MISSING VAL FOR KEY:In-flight cache misses. (counter)");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:tx_size_heap" + "'",
        str18, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:tx_size_heap");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3972() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3972");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*vm.pause_time");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3973() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3973");
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
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:*bolt.messages_received*" + "'", str20,
        "MISSING VAL FOR KEY:*bolt.messages_received*");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test3974() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3974");
    }
    java.lang.Object[] objArray11 = new java.lang.Object[]{"same", "dbms.upgrade",
        "Maximum retry interval for akka restarter (which uses exponential backoff if it fails)",
        "dbms.security.ldap.authentication.attribute"};
    java.lang.String str12 = io.github.onograph.I18N.format("Display ServerId of instance.",
        objArray11);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "causal_clustering.discovery_listen_address", objArray11);
    java.lang.String str14 = io.github.onograph.I18N.format("elapsedTimeMs", objArray11);
    java.lang.String str15 = io.github.onograph.I18N.format(
        "Pooled connections older than this threshold will be closed and removed from the pool.\nSetting this option to a low value will cause a high connection churn and might result in a performance hit.\nIt is recommended to set maximum lifetime to a slightly smaller value than the one configured in network\nequipment (load balancer, proxy, firewall, etc. can also limit maximum connection lifetime).\nZero and negative values result in lifetime not being checked.",
        objArray11);
    java.lang.String str16 = io.github.onograph.I18N.format("enc_req_tx", objArray11);
    java.lang.String str17 = io.github.onograph.I18N.format(
        "The number of currently active read transactions. (gauge)", objArray11);
    java.lang.String str18 = io.github.onograph.I18N.format(".Database data metrics", objArray11);
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
        "'" + str14 + "' != '" + "MISSING VAL FOR KEY:elapsedTimeMs" + "'", str14,
        "MISSING VAL FOR KEY:elapsedTimeMs");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "MISSING VAL FOR KEY:Pooled connections older than this threshold will be closed and removed from the pool.\nSetting this option to a low value will cause a high connection churn and might result in a performance hit.\nIt is recommended to set maximum lifetime to a slightly smaller value than the one configured in network\nequipment (load balancer, proxy, firewall, etc. can also limit maximum connection lifetime).\nZero and negative values result in lifetime not being checked."
            + "'", str15,
        "MISSING VAL FOR KEY:Pooled connections older than this threshold will be closed and removed from the pool.\nSetting this option to a low value will cause a high connection churn and might result in a performance hit.\nIt is recommended to set maximum lifetime to a slightly smaller value than the one configured in network\nequipment (load balancer, proxy, firewall, etc. can also limit maximum connection lifetime).\nZero and negative values result in lifetime not being checked.");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:enc_req_tx" + "'",
        str16, "MISSING VAL FOR KEY:enc_req_tx");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
            + "MISSING VAL FOR KEY:The number of currently active read transactions. (gauge)" + "'",
        str17, "MISSING VAL FOR KEY:The number of currently active read transactions. (gauge)");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "MISSING VAL FOR KEY:.Database data metrics" + "'", str18,
        "MISSING VAL FOR KEY:.Database data metrics");
  }

  @Test
  public void test3975() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3975");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("Log format to use for security log.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3976() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3976");
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
        "Maximum timeout for cluster status request execution", objArray6);
    java.lang.String str12 = io.github.onograph.I18N.format(
        "causal_clustering.initial_discovery_members", objArray6);
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
            + "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution" + "'", str11,
        "MISSING VAL FOR KEY:Maximum timeout for cluster status request execution");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.initial_discovery_members"
            + "'", str12, "MISSING VAL FOR KEY:causal_clustering.initial_discovery_members");
  }

  @Test
  public void test3977() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3977");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:dbms.security.authentication_providers");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3978() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3978");
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
    java.lang.String str19 = io.github.onograph.I18N.format("BatchSize", objArray14);
    java.lang.String str20 = io.github.onograph.I18N.format("", objArray14);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "causal_clustering.protocol_implementations.raft", objArray14);
    java.lang.String str22 = io.github.onograph.I18N.format("messages_failed", objArray14);
    java.lang.String str23 = io.github.onograph.I18N.format("causal_clustering.core", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:temp-bootstrap", objArray14);
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MISSING VAL FOR KEY:BatchSize" + "'",
        str19, "MISSING VAL FOR KEY:BatchSize");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MISSING VAL FOR KEY:" + "'", str20,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft" + "'", str21,
        "MISSING VAL FOR KEY:causal_clustering.protocol_implementations.raft");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "MISSING VAL FOR KEY:messages_failed" + "'", str22,
        "MISSING VAL FOR KEY:messages_failed");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "MISSING VAL FOR KEY:causal_clustering.core" + "'", str23,
        "MISSING VAL FOR KEY:causal_clustering.core");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:temp-bootstrap" + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:temp-bootstrap");
  }

  @Test
  public void test3979() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3979");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:messages_failed", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:messages_failed" + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:messages_failed");
  }

  @Test
  public void test3980() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3980");
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
    java.lang.String str16 = io.github.onograph.I18N.format("--pagecache", objArray10);
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MISSING VAL FOR KEY:--pagecache" + "'",
        str16, "MISSING VAL FOR KEY:--pagecache");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3981() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3981");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Enable reporting metrics about the duration of garbage collections. Deprecated - use metrics.filter instead.");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3982() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3982");
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
        "Enable multi-data center features. Requires appropriate licensing.", objArray9);
    java.lang.String str15 = io.github.onograph.I18N.format("handshake_server", objArray9);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing."
            + "'", str14,
        "MISSING VAL FOR KEY:Enable multi-data center features. Requires appropriate licensing.");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "MISSING VAL FOR KEY:handshake_server" + "'", str15,
        "MISSING VAL FOR KEY:handshake_server");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3983() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3983");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("admin");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3984() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3984");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "If the initial seed node cannot be found attempt to bootstrap with other cores");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3985() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3985");
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
    java.lang.String str23 = io.github.onograph.I18N.format("dbms", objArray14);
    java.lang.String str24 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout", objArray14);
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
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:dbms" + "'", str23,
        "MISSING VAL FOR KEY:dbms");
    org.junit.Assert.assertEquals("'" + str24 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout" + "'", str24,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:com.sun.jndi.ldap.read.timeout");
  }

  @Test
  public void test3986() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3986");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "Count of successful database stop operations. (counter)");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3987() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3987");
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
    java.lang.String str23 = io.github.onograph.I18N.format("memory.pool", objArray16);
    java.lang.String str24 = io.github.onograph.I18N.format("dbms.security.addRoleToUser",
        objArray16);
    java.lang.String str25 = io.github.onograph.I18N.format("commit_index", objArray16);
    java.lang.String str26 = io.github.onograph.I18N.format("List all procedures in the DBMS.",
        objArray16);
    java.lang.String str27 = io.github.onograph.I18N.format("LOOPBACK", objArray16);
    java.lang.String str28 = io.github.onograph.I18N.format("in_flight_cache", objArray16);
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
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MISSING VAL FOR KEY:memory.pool" + "'",
        str23, "MISSING VAL FOR KEY:memory.pool");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "MISSING VAL FOR KEY:dbms.security.addRoleToUser" + "'", str24,
        "MISSING VAL FOR KEY:dbms.security.addRoleToUser");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MISSING VAL FOR KEY:commit_index" + "'",
        str25, "MISSING VAL FOR KEY:commit_index");
    org.junit.Assert.assertEquals(
        "'" + str26 + "' != '" + "MISSING VAL FOR KEY:List all procedures in the DBMS." + "'",
        str26, "MISSING VAL FOR KEY:List all procedures in the DBMS.");
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MISSING VAL FOR KEY:LOOPBACK" + "'",
        str27, "MISSING VAL FOR KEY:LOOPBACK");
    org.junit.Assert.assertEquals(
        "'" + str28 + "' != '" + "MISSING VAL FOR KEY:in_flight_cache" + "'", str28,
        "MISSING VAL FOR KEY:in_flight_cache");
  }

  @Test
  public void test3988() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3988");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:initial");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3989() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3989");
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
        "MISSING VAL FOR KEY:causal_clustering.middleware.logging.level", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("raft_content_decoder", objArray12);
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
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level"
            + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:causal_clustering.middleware.logging.level");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:raft_content_decoder" + "'", str20,
        "MISSING VAL FOR KEY:raft_content_decoder");
  }

  @Test
  public void test3990() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3990");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "causal_clustering.replication_leader_await_timeout");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3991() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3991");
    }
    java.lang.Object[] objArray8 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str9 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray8);
    java.lang.String str10 = io.github.onograph.I18N.format("status", objArray8);
    java.lang.String str11 = io.github.onograph.I18N.format("", objArray8);
    java.lang.String str12 = io.github.onograph.I18N.format("bolt.*", objArray8);
    java.lang.String str13 = io.github.onograph.I18N.format("init", objArray8);
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
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MISSING VAL FOR KEY:init" + "'", str13,
        "MISSING VAL FOR KEY:init");
  }

  @Test
  public void test3992() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3992");
    }
    java.lang.String str1 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:causal_clustering.state_machine_apply_max_batch_size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3993() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3993");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("backup-server");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3994() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3994");
    }
    java.lang.Object[] objArray12 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str13 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray12);
    java.lang.String str14 = io.github.onograph.I18N.format("ccstate", objArray12);
    java.lang.String str15 = io.github.onograph.I18N.format("rollbacks", objArray12);
    java.lang.String str16 = io.github.onograph.I18N.format("error_handler_tail", objArray12);
    java.lang.String str17 = io.github.onograph.I18N.format("dbms.dynamic.setting.allowlist",
        objArray12);
    java.lang.String str18 = io.github.onograph.I18N.format("count", objArray12);
    java.lang.String str19 = io.github.onograph.I18N.format("MISSING VAL FOR KEY:iops", objArray12);
    java.lang.String str20 = io.github.onograph.I18N.format("Log format to use for security log.",
        objArray12);
    java.lang.String str21 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:last_leader_message", objArray12);
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:ccstate" + "'",
        str14, "MISSING VAL FOR KEY:ccstate");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:rollbacks" + "'",
        str15, "MISSING VAL FOR KEY:rollbacks");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "MISSING VAL FOR KEY:error_handler_tail" + "'", str16,
        "MISSING VAL FOR KEY:error_handler_tail");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist" + "'", str17,
        "MISSING VAL FOR KEY:dbms.dynamic.setting.allowlist");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MISSING VAL FOR KEY:count" + "'", str18,
        "MISSING VAL FOR KEY:count");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops" + "'", str19,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:iops");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "MISSING VAL FOR KEY:Log format to use for security log." + "'",
        str20, "MISSING VAL FOR KEY:Log format to use for security log.");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:last_leader_message"
            + "'", str21, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:last_leader_message");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test3995() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3995");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Time out for a new member to catch up", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Time out for a new member to catch up" + "'",
        str2, "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Time out for a new member to catch up");
  }

  @Test
  public void test3996() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3996");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "The hostname or IP address of the Graphite server", objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:The hostname or IP address of the Graphite server" + "'", str2,
        "MISSING VAL FOR KEY:The hostname or IP address of the Graphite server");
  }

  @Test
  public void test3997() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3997");
    }
    java.lang.Object[] objArray1 = null;
    java.lang.String str2 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ",
        objArray1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. "
            + "'", str2,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:Configuration of a user-defined upstream selection strategy. The user-defined strategy is used if the list of strategies (`causal_clustering.upstream_selection_strategy`) includes the value `user_defined`. ");
  }

  @Test
  public void test3998() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3998");
    }
    java.lang.String str1 = io.github.onograph.I18N.format("*dbms.pool.bolt.total_size");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test3999() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test3999");
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
        "The total number of rolled back transactions. (counter)", objArray13);
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
            + "MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)" + "'",
        str22, "MISSING VAL FOR KEY:The total number of rolled back transactions. (counter)");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test4000() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest7.test4000");
    }
    java.lang.Object[] objArray9 = new java.lang.Object[]{"hnd_req_get_info", "capacity",
        "unavailable"};
    java.lang.String str10 = io.github.onograph.I18N.format(
        "The total number of messages that failed processing since this instance started. (counter)",
        objArray9);
    java.lang.String str11 = io.github.onograph.I18N.format(
        "Discovery cluster member size. (gauge)", objArray9);
    java.lang.String str12 = io.github.onograph.I18N.format("akka", objArray9);
    java.lang.String str13 = io.github.onograph.I18N.format(
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only", objArray9);
    java.lang.String str14 = io.github.onograph.I18N.format("", objArray9);
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
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)" + "'",
        str11, "MISSING VAL FOR KEY:Discovery cluster member size. (gauge)");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MISSING VAL FOR KEY:akka" + "'", str12,
        "MISSING VAL FOR KEY:akka");
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only" + "'", str13,
        "MISSING VAL FOR KEY:MISSING VAL FOR KEY:MISSING VAL FOR KEY:read-only");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MISSING VAL FOR KEY:" + "'", str14,
        "MISSING VAL FOR KEY:");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MISSING VAL FOR KEY:count" + "'", str15,
        "MISSING VAL FOR KEY:count");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }
}

