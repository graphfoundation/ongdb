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
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(log10);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test2002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2002");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test2003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2003");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2004");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test2005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2005");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2006");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 1L);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    long long6 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
  }

  @Test
  public void test2007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2007");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream16 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(systemGraphComponents12);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2008");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2009");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext17 = null;
    dbmsProcedures0.securityContext = securityContext17;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream22 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2010");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test2011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2011");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
  }

  @Test
  public void test2012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2012");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test2013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2013");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test2014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2014");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents5;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2015");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2016");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream20 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2017");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) 0, "");
  }

  @Test
  public void test2018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2018");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents18 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(systemGraphComponents18);
  }

  @Test
  public void test2019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2019");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream12 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2020");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(securityContext15);
  }

  @Test
  public void test2021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2021");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream14 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2022");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 'a', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2023");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2024");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2025");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2026");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream13 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2027");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    java.lang.String str9 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test2028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2028");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (byte) 100);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    long long6 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
  }

  @Test
  public void test2029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2029");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test2030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2030");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream18 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2031");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2032");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream8 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2033");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) '4');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    long long7 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
  }

  @Test
  public void test2034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2034");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (-1), "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test2035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2035");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2036");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2037");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2038");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2039");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) -1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2040");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2041");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test2042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2042");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream16 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2043");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2044");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2045");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2046");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction3 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(transaction3);
    org.junit.Assert.assertNull(transaction4);
  }

  @Test
  public void test2047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2047");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 0L);
  }

  @Test
  public void test2048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2048");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2049");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test2050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2050");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2051");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
    java.lang.String str11 = transactionResourceLockMeta4.rtName;
    java.lang.String str12 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
  }

  @Test
  public void test2052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2052");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) 1);
  }

  @Test
  public void test2053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2053");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2054");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2055");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream5 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2056");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream14 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test2057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2057");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test2058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2058");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2059");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream7 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2060");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test2061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2061");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream12 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2062");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
  }

  @Test
  public void test2063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2063");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream15 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2064");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(securityContext12);
  }

  @Test
  public void test2065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2065");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2066");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream17 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2067");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents15 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents15;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI17 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log18 = null;
    dbmsProcedures0.log = log18;
    org.neo4j.graphdb.Transaction transaction20 = null;
    dbmsProcedures0.transaction = transaction20;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream22 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(graphDatabaseAPI17);
  }

  @Test
  public void test2068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2068");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream10 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2069");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2070");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (-1), "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2071");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2072");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream6 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test2073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2073");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
  }

  @Test
  public void test2074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2074");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) '4');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2075");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
  }

  @Test
  public void test2076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2076");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test2077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2077");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2078");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    org.neo4j.logging.Log log16 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver17 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI18 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(log16);
    org.junit.Assert.assertNull(dependencyResolver17);
    org.junit.Assert.assertNull(graphDatabaseAPI18);
  }

  @Test
  public void test2079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2079");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test2080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2080");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2081");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = null;
    dbmsProcedures0.securityContext = securityContext15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2082");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2083");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI15;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents17 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(systemGraphComponents14);
    org.junit.Assert.assertNull(systemGraphComponents17);
  }

  @Test
  public void test2084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2084");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2085");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test2086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2086");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(log8);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test2087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2087");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream6 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2088");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream15 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test2089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2089");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2090");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(procedureCallContext8);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2091");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) '#', "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test2092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2092");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2093");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream7 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2094");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test2095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2095");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test2096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2096");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta profileReturnedMeta1 = new io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta(
        "hi!");
    java.lang.String str2 = profileReturnedMeta1.prfe;
    java.lang.String str3 = profileReturnedMeta1.prfe;
    java.lang.String str4 = profileReturnedMeta1.prfe;
    java.lang.String str5 = profileReturnedMeta1.prfe;
    java.lang.String str6 = profileReturnedMeta1.prfe;
    java.lang.String str7 = profileReturnedMeta1.prfe;
    java.lang.Class<?> wildcardClass8 = profileReturnedMeta1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2097");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 0L, "");
  }

  @Test
  public void test2098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2098");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test2099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2099");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test2100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2100");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2101");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 1L);
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test2102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2102");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    java.lang.Class<?> wildcardClass8 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2103");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 10, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass8 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2104");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2105");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents10;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream17 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2106");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test2107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2107");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream3 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2108");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2109");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2110");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test2111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2111");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2112");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream13 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2113");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test2114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2114");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test2115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2115");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) ' ', "");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
  }

  @Test
  public void test2116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2116");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2117");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream15 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2118");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 0L, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass8 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2119");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream17 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(systemGraphComponents12);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2120");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.String str11 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
  }

  @Test
  public void test2121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2121");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction15 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream16 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(transaction15);
  }

  @Test
  public void test2122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2122");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    java.lang.String[] strArray10 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream19 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList11,
          (java.util.List<java.lang.String>) strList15, "hi!", strMap18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test2123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2123");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2124");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (byte) 100, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    long long6 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
  }

  @Test
  public void test2125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2125");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(log7);
  }

  @Test
  public void test2126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2126");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    long long8 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
  }

  @Test
  public void test2127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2127");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2128");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2129");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream17 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test2130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2130");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test2131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2131");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream13 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2132");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    java.lang.String[] strArray7 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList8, strArray7);
    java.lang.String[] strArray12 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream17 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList8,
          (java.util.List<java.lang.String>) strList13, "hi!", strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test2133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2133");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.String str11 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
  }

  @Test
  public void test2134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2134");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2135");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2136");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
  }

  @Test
  public void test2137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2137");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test2138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2138");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(log12);
  }

  @Test
  public void test2139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2139");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    java.lang.String[] strArray12 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.lang.String[] strArray17 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList13,
          (java.util.List<java.lang.String>) strList18, "hi!", strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test2140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2140");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) '#', "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
  }

  @Test
  public void test2141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2141");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test2142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2142");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (short) 10);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
  }

  @Test
  public void test2143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2143");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2144");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = dbmsProcedures0.securityContext;
    try {
      java.lang.Class<?> wildcardClass19 = securityContext18.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(securityContext18);
  }

  @Test
  public void test2145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2145");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList10, strArray9);
    java.lang.String[] strArray14 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream19 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList10,
          (java.util.List<java.lang.String>) strList15, "", strMap18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test2146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2146");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream16 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2147");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test2148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2148");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", 0L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test2149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2149");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2150");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2151");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2152");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2153");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream16 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2154");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2155");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    long long6 = currentResourceLockMeta3.resourceId;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test2156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2156");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
  }

  @Test
  public void test2157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2157");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream7 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2158");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test2159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2159");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2160");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream7 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2161");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    try {
      java.lang.Class<?> wildcardClass12 = log11.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2162");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2163");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 100L, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test2164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2164");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream15 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2165");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test2166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2166");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 10);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test2167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2167");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test2168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2168");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 32L, "");
  }

  @Test
  public void test2169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2169");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream11 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2170");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2171");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream13 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2172");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test2173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2173");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream17 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2174");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2175");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test2176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2176");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.Class<?> wildcardClass4 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test2177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2177");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2178");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2179");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2180");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) 1);
  }

  @Test
  public void test2181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2181");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2182");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (byte) 100);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    long long5 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
  }

  @Test
  public void test2183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2183");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction3 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(transaction3);
    org.junit.Assert.assertNull(transaction4);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2184");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream15 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2185");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    java.lang.String[] strArray14 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.lang.String[] strArray18 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream23 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList15,
          (java.util.List<java.lang.String>) strList19, "", strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test2186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2186");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    java.lang.String[] strArray7 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList8, strArray7);
    java.lang.String[] strArray11 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream16 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList8,
          (java.util.List<java.lang.String>) strList12, "", strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test2187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2187");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 1);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    long long7 = currentResourceLockMeta3.resourceId;
    long long8 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
  }

  @Test
  public void test2188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2188");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test2189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2189");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 0, "");
  }

  @Test
  public void test2190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2190");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = procedures0.kernelTransaction;
    java.lang.String[] strArray18 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.lang.String[] strArray23 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
    boolean boolean25 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList24, strArray23);
    java.util.Map<java.lang.String, java.lang.Object> strMap27 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream28 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList19,
          (java.util.List<java.lang.String>) strList24, "hi!", strMap27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
  }

  @Test
  public void test2191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2191");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test2192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2192");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test2193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2193");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream16 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(securityContext13);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNull(log15);
  }

  @Test
  public void test2194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2194");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test2195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2195");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 1, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
  }

  @Test
  public void test2196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2196");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents18 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents18;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test2197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2197");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2198");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) 'a');
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test2199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2199");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream16 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log15);
  }

  @Test
  public void test2200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2200");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test2201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2201");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test2202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2202");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", 32L);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
  }

  @Test
  public void test2203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2203");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream15 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test2204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2204");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2205");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    procedures0.kernelTransaction = kernelTransaction14;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2206");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2207");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2208");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    try {
      java.lang.Class<?> wildcardClass9 = log8.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test2209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2209");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2210");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.logging.Log log13 = null;
    dbmsProcedures0.log = log13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2211");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 'a', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2212");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream17 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2213");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2214");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream11 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2215");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test2216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2216");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver14 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(dependencyResolver14);
  }

  @Test
  public void test2217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2217");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream14 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2218");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log15);
  }

  @Test
  public void test2219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2219");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2220");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (byte) -1, "");
  }

  @Test
  public void test2221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2221");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2222");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2223");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2224");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 100L, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test2225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2225");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2226");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents15 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream20 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test2227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2227");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2228");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = null;
    dbmsProcedures0.securityContext = securityContext16;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream18 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test2229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2229");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test2230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2230");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2231");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test2232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2232");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2233");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test2234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2234");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver13 = procedures0.dependencyResolver;
    java.lang.String[] strArray16 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList17, strArray16);
    java.util.List<java.lang.String> strList19 = null;
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList17, strList19, "", strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test2235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2235");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2236");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(securityContext15);
  }

  @Test
  public void test2237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2237");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream17 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(systemGraphComponents16);
  }

  @Test
  public void test2238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2238");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents15 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream17 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents15);
  }

  @Test
  public void test2239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2239");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2240");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream16 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test2241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2241");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2242");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream10 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2243");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    java.lang.String[] strArray10 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream19 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList11,
          (java.util.List<java.lang.String>) strList15, "", strMap18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test2244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2244");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream16 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2245");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    java.lang.Class<?> wildcardClass12 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2246");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test2247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2247");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = null;
    dbmsProcedures0.securityContext = securityContext15;
    org.neo4j.logging.Log log17 = null;
    dbmsProcedures0.log = log17;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI19 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNull(graphDatabaseAPI19);
  }

  @Test
  public void test2248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2248");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
  }

  @Test
  public void test2249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2249");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test2250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2250");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    long long7 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
  }

  @Test
  public void test2251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2251");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream18 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test2252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2252");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    java.lang.String[] strArray11 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.lang.String[] strArray15 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList12,
          (java.util.List<java.lang.String>) strList16, "", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test2253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2253");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 1);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2254");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2255");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList10, strArray9);
    java.lang.String[] strArray13 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList10,
          (java.util.List<java.lang.String>) strList14, "hi!", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test2256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2256");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = procedures0.kernelTransaction;
    java.lang.String[] strArray14 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.lang.String[] strArray18 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream23 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList15,
          (java.util.List<java.lang.String>) strList19, "", strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test2257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2257");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    java.lang.Class<?> wildcardClass5 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test2258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2258");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2259");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test2260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2260");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2261");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
    long long11 = transactionResourceLockMeta4.rxId;
    java.lang.String str12 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
  }

  @Test
  public void test2262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2262");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2263");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2264");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (short) -1, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test2265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2265");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction14 = null;
    dbmsProcedures0.transaction = transaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream16 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test2266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2266");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test2267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2267");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream8 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test2268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2268");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2269");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test2270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2270");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2271");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
    long long11 = transactionResourceLockMeta4.rxId;
    java.lang.String str12 = transactionResourceLockMeta4.mdstr;
    java.lang.String str13 = transactionResourceLockMeta4.rtName;
    java.lang.String str14 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
  }

  @Test
  public void test2272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2272");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test2273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2273");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents15 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test2274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2274");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 100);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test2275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2275");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test2276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2276");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (-1L), "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    java.lang.String str10 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test2277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2277");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2278");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2279");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream16 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test2280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2280");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2281");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2282");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream10 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test2283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2283");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream7 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test2284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2284");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream6 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2285");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream6 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2286");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream12 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test2287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2287");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = null;
    dbmsProcedures0.securityContext = securityContext15;
    org.neo4j.common.DependencyResolver dependencyResolver17 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver17;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents19 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test2288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2288");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test2289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2289");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.neo4j.graphdb.Transaction transaction16 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log17 = null;
    dbmsProcedures0.log = log17;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction16);
  }

  @Test
  public void test2290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2290");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2291");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2292");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2293");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    try {
      java.lang.Class<?> wildcardClass15 = securityContext14.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test2294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2294");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2295");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2296");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2297");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2298");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction14 = null;
    dbmsProcedures0.transaction = transaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream16 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction13);
  }

  @Test
  public void test2299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2299");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2300");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNull(securityContext12);
  }

  @Test
  public void test2301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2301");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream12 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2302");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents10;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test2303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2303");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 1, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test2304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2304");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI17 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI17;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test2305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2305");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test2306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2306");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test2307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2307");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(graphDatabaseAPI4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2308");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream16 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test2309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2309");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 0L, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test2310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2310");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2311");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(graphDatabaseAPI4);
  }

  @Test
  public void test2312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2312");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test2313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2313");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2314");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test2315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2315");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    try {
      java.lang.Class<?> wildcardClass7 = kernelTransaction6.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2316");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver3 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream7 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(dependencyResolver3);
  }

  @Test
  public void test2317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2317");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2318");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream7 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2319");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2320");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver12 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    procedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    procedures0.kernelTransaction = kernelTransaction16;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2321");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.common.DependencyResolver dependencyResolver14 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver15 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    procedures0.kernelTransaction = kernelTransaction16;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver14);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2322");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = null;
    dbmsProcedures0.securityContext = securityContext16;
    org.neo4j.logging.Log log18 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(log18);
  }

  @Test
  public void test2323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2323");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test2324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2324");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (byte) 1, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2325");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2326");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2327");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream8 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test2328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2328");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(procedureCallContext8);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test2329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2329");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(graphDatabaseAPI4);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test2330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2330");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test2331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2331");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2332");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.neo4j.graphdb.Transaction transaction15 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(transaction15);
  }

  @Test
  public void test2333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2333");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.logging.Log log13 = null;
    dbmsProcedures0.log = log13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test2334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2334");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream9 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2335");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream14 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2336");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (byte) 100);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test2337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2337");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream7 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2338");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2339");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", 1L);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
  }

  @Test
  public void test2340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2340");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream11 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2341");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test2342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2342");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test2343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2343");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test2344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2344");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test2345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2345");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2346");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2347");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test2348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2348");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test2349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2349");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2350");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2351");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2352");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test2353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2353");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2354");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 0L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    long long8 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
  }

  @Test
  public void test2355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2355");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2356");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test2357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2357");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream8 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2358");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2359");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2360");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) -1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test2361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2361");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.util.List<java.lang.String> strList16 = null;
    java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream19 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList14, strList16, "hi!", strMap18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test2362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2362");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream7 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test2363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2363");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test2364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2364");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2365");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
    java.lang.String str11 = transactionResourceLockMeta4.mdstr;
    java.lang.String str12 = transactionResourceLockMeta4.mdstr;
    java.lang.String str13 = transactionResourceLockMeta4.mdstr;
    java.lang.String str14 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
  }

  @Test
  public void test2366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2366");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream12 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2367");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2368");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream13 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2369");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test2370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2370");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2371");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test2372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2372");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
  }

  @Test
  public void test2373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2373");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2374");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2375");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2376");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test2377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2377");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2378");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2379");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2380");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test2381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2381");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2382");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2383");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2384");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents16;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents18 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents18;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream21 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2385");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    java.lang.Class<?> wildcardClass12 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2386");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2387");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test2388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2388");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream6 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test2389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2389");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2390");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test2391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2391");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext17 = dbmsProcedures0.procedureCallContext;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
    org.junit.Assert.assertNull(procedureCallContext17);
  }

  @Test
  public void test2392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2392");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (-1));
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    long long7 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
  }

  @Test
  public void test2393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2393");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream6 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(graphDatabaseAPI4);
  }

  @Test
  public void test2394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2394");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream14 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2395");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) 10);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2396");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList10, strArray9);
    java.lang.String[] strArray14 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream19 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList10,
          (java.util.List<java.lang.String>) strList15, "", strMap18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test2397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2397");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2398");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.neo4j.logging.Log log16 = null;
    dbmsProcedures0.log = log16;
    java.lang.Class<?> wildcardClass18 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2399");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream13 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2400");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test2401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2401");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test2402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2402");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2403");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents16;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI18 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI18;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test2404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2404");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream7 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test2405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2405");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2406");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.lang.String[] strArray17 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList13,
          (java.util.List<java.lang.String>) strList18, "hi!", strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test2407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2407");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test2408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2408");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2409");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2410");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream5 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2411");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = null;
    dbmsProcedures0.securityContext = securityContext15;
    org.neo4j.logging.Log log17 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(securityContext14);
    org.junit.Assert.assertNull(log17);
  }

  @Test
  public void test2412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2412");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2413");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    java.lang.String[] strArray13 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.lang.String[] strArray17 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList14,
          (java.util.List<java.lang.String>) strList18, "hi!", strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test2414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2414");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2415");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test2416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2416");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (short) 100, "");
  }

  @Test
  public void test2417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2417");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream6 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test2418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2418");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2419");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test2420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2420");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2421");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test2422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2422");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2423");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2424");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2425");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    long long7 = transactionResourceLockMeta4.rxId;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    long long11 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
  }

  @Test
  public void test2426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2426");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2427");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream15 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test2428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2428");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream12 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2429");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    org.neo4j.logging.Log log16 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver17 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents18 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents18;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream20 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(log16);
    org.junit.Assert.assertNull(dependencyResolver17);
  }

  @Test
  public void test2430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2430");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 'a', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test2431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2431");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test2432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2432");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2433");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI9);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2434");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver14 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream15 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(systemGraphComponents12);
    org.junit.Assert.assertNull(securityContext13);
    org.junit.Assert.assertNull(dependencyResolver14);
  }

  @Test
  public void test2435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2435");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test2436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2436");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream14 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2437");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2438");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
  }

  @Test
  public void test2439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2439");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream13 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2440");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2441");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream4 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test2442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2442");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream7 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
  }

  @Test
  public void test2443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2443");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(securityContext14);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test2444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2444");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test2445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2445");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    java.lang.String[] strArray11 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.lang.String[] strArray15 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList12,
          (java.util.List<java.lang.String>) strList16, "hi!", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(dependencyResolver1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test2446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2446");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream14 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2447");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.String str11 = transactionResourceLockMeta4.mdstr;
    java.lang.String str12 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
  }

  @Test
  public void test2448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2448");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2449");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream23 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(securityContext18);
    org.junit.Assert.assertNull(kernelTransaction19);
  }

  @Test
  public void test2450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2450");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2451");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test2452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2452");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.neo4j.logging.Log log16 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(log16);
  }

  @Test
  public void test2453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2453");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.lang.String[] strArray17 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList13,
          (java.util.List<java.lang.String>) strList18, "hi!", strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test2454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2454");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents18 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents18;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream20 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2455");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2456");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2457");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(procedureCallContext3);
  }

  @Test
  public void test2458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2458");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream16 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test2459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2459");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    try {
      java.lang.Class<?> wildcardClass10 = systemGraphComponents9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext8);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2460");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2461");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2462");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (short) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test2463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2463");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test2464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2464");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(procedureCallContext8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2465");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2466");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.graphdb.Transaction transaction15 = dbmsProcedures0.transaction;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(transaction15);
  }

  @Test
  public void test2467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2467");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2468");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream11 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2469");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test2470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2470");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2471");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream12 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2472");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver15);
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test2473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2473");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2474");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2475");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents15 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream17 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test2476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2476");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test2477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2477");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2478");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream18 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2479");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2480");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext12);
  }

  @Test
  public void test2481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2481");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream14 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2482");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2483");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2484");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents15 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents15;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream19 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(kernelTransaction17);
    org.junit.Assert.assertNull(kernelTransaction18);
  }

  @Test
  public void test2485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2485");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test2486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2486");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2487");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream15 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2488");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2489");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream6 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2490");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2491");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2492");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) 10);
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test2493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2493");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test2494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2494");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test2495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2495");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test2496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2496");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2497");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = procedures0.kernelTransaction;
    java.lang.String[] strArray17 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.lang.String[] strArray21 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
    boolean boolean23 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList22, strArray21);
    java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream26 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList18,
          (java.util.List<java.lang.String>) strList22, "hi!", strMap25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strArray21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
  }

  @Test
  public void test2498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2498");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test2499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2499");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
  }

  @Test
  public void test2500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2500");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }
}

