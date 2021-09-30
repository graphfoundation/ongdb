package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModErrTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test1");
    }
    io.github.onograph.dbms.DatabaseStateEnterpriseImpl databaseStateEnterpriseImpl0 = io.github.onograph.dbms.DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl();
    boolean boolean1 = databaseStateEnterpriseImpl0.hasFailed();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = databaseStateEnterpriseImpl0.databaseId();
    java.util.Optional<java.lang.Throwable> throwableOptional3 = databaseStateEnterpriseImpl0.failure();
  }

  @Test
  public void test2() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test2");
    }
    io.github.onograph.dbms.DatabaseStateEnterpriseImpl databaseStateEnterpriseImpl0 = io.github.onograph.dbms.DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl();
    boolean boolean1 = databaseStateEnterpriseImpl0.hasFailed();
    io.github.onograph.dbms.DatabaseStateEnterpriseImpl databaseStateEnterpriseImpl2 = io.github.onograph.dbms.DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl();
    io.github.onograph.dbms.DatabaseStateEnterpriseImpl databaseStateEnterpriseImpl3 = databaseStateEnterpriseImpl2.helyDatabaseStateEnterpriseImpl();
  }

  @Test
  public void test3() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test3");
    }
    io.github.onograph.dbms.DatabaseStateEnterpriseImpl databaseStateEnterpriseImpl0 = io.github.onograph.dbms.DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl();
    io.github.onograph.dbms.DatabaseStateEnterpriseImpl databaseStateEnterpriseImpl1 = databaseStateEnterpriseImpl0.helyDatabaseStateEnterpriseImpl();
    io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl operatorStateEnterpriseTypeImpl2 = databaseStateEnterpriseImpl0.operatorState();
  }
}

