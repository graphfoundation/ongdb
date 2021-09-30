package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.neo4j.configuration.Config;
import org.neo4j.logging.NullLogProvider;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModErrTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test1");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach configuredNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach();
    configuredNamedServiceClusterApproach0.ineForClCoLoSe(null, Config.defaults(),
        NullLogProvider.nullLogProvider(), null);

    configuredNamedServiceClusterApproach0.setup();
  }

  @Test
  public void test2() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test2");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    org.neo4j.dbms.database.DatabaseManager<?> wildcardDatabaseManager1 = dataSyncRunnerStatsManager0.databaseManagerDaamnObject;

    //dataSyncRunnerStatsManager0.strForStLoLo("store_random_id", (java.lang.Long) 52L, (java.lang.Long) (-1L));
  }

  @Test
  public void test3() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test3");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    //dataSyncRunnerStatsManager0.strForStLoLo("joiner", (java.lang.Long) 97L, (java.lang.Long) 1536L);
  }

  @Test
  public void test4() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test4");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach defaultNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach();
    defaultNamedServiceClusterApproach0.ineForClCoLoSe(null, Config.defaults(),
        NullLogProvider.nullLogProvider(), null);

    defaultNamedServiceClusterApproach0.setup();
  }
}

