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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream17 = dbmsProcedures0.updstdtStream();
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
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test2502() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2502");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test2503() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2503");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2504() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2504");
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
      dbmsProcedures0.shtw();
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
  public void test2505() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2505");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2506() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2506");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2507() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2507");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2508() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2508");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test2509() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2509");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = null;
    dbmsProcedures0.securityContext = securityContext15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2510() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2510");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream6 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2511() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2511");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2512() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2512");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream9 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(securityContext6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test2513() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2513");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test2514() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2514");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(transaction4);
  }

  @Test
  public void test2515() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2515");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log17 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream18 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(systemGraphComponents16);
    org.junit.Assert.assertNull(log17);
  }

  @Test
  public void test2516() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2516");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream7 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2517() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2517");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2518() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2518");
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
    java.lang.Class<?> wildcardClass13 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2519() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2519");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2520() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2520");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2521() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2521");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
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
  public void test2522() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2522");
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
    org.neo4j.graphdb.Transaction transaction14 = null;
    dbmsProcedures0.transaction = transaction14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream18 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(dependencyResolver16);
  }

  @Test
  public void test2523() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2523");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
  }

  @Test
  public void test2524() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2524");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext20 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext20;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(securityContext18);
    org.junit.Assert.assertNull(kernelTransaction19);
  }

  @Test
  public void test2525() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2525");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream19 = dbmsProcedures0.limepStream();
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
  }

  @Test
  public void test2526() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2526");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2527() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2527");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream15 = dbmsProcedures0.chcotStream();
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
  public void test2528() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2528");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", 32L);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    long long5 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
  }

  @Test
  public void test2529() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2529");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2530() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2530");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream8 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2531() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2531");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test2532() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2532");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) '4');
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2533() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2533");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2534() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2534");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream7 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2535() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2535");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2536() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2536");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2537() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2537");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2538() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2538");
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
    java.lang.String[] strArray15 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
    boolean boolean22 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList21, strArray20);
    java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream25 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList16,
          (java.util.List<java.lang.String>) strList21, "hi!", strMap24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test2539() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2539");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream8 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2540() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2540");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
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
  public void test2541() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2541");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test2542() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2542");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test2543() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2543");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2544() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2544");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test2545() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2545");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream10 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2546() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2546");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2547() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2547");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2548() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2548");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream17 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(systemGraphComponents16);
  }

  @Test
  public void test2549() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2549");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2550() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2550");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2551() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2551");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test2552() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2552");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext15;
    org.neo4j.graphdb.Transaction transaction17 = null;
    dbmsProcedures0.transaction = transaction17;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents19 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream20 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(systemGraphComponents19);
  }

  @Test
  public void test2553() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2553");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream13 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test2554() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2554");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream10 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2555() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2555");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2556() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2556");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream14 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2557() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2557");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2558() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2558");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) '4');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
  }

  @Test
  public void test2559() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2559");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test2560() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2560");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2561() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2561");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    org.neo4j.graphdb.Transaction transaction18 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(transaction18);
  }

  @Test
  public void test2562() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2562");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test2563() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2563");
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
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream17 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(dependencyResolver16);
  }

  @Test
  public void test2564() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2564");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2565() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2565");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test2566() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2566");
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
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2567() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2567");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
  }

  @Test
  public void test2568() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2568");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream14 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2569() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2569");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2570() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2570");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test2571() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2571");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2572() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2572");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream17 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test2573() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2573");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test2574() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2574");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2575() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2575");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
  }

  @Test
  public void test2576() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2576");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2577() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2577");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2578() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2578");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    java.lang.String[] strArray7 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList8, strArray7);
    java.lang.String[] strArray12 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream17 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList8,
          (java.util.List<java.lang.String>) strList13, "", strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test2579() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2579");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
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
  public void test2580() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2580");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList10, strArray9);
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!", ""};
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
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test2581() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2581");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(dependencyResolver1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2582() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2582");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2583() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2583");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(log7);
  }

  @Test
  public void test2584() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2584");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test2585() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2585");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext18 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream19 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver15);
    org.junit.Assert.assertNull(procedureCallContext18);
  }

  @Test
  public void test2586() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2586");
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
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test2587() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2587");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test2588() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2588");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream17 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2589() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2589");
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
    try {
      dbmsProcedures0.shtw();
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
  public void test2590() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2590");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
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
  public void test2591() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2591");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test2592() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2592");
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
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext16 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2593() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2593");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2594() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2594");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (-1), "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2595() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2595");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test2596() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2596");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test2597() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2597");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (-1));
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
  }

  @Test
  public void test2598() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2598");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream12 = dbmsProcedures0.litfnStream();
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
  public void test2599() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2599");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2600() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2600");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2601() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2601");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test2602() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2602");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext12);
  }

  @Test
  public void test2603() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2603");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2604() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2604");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test2605() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2605");
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
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2606() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2606");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream12 = dbmsProcedures0.upredtlStream();
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
  public void test2607() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2607");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", 10L);
    java.lang.Class<?> wildcardClass4 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test2608() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2608");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver16 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver17 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver14);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(dependencyResolver16);
    org.junit.Assert.assertNull(dependencyResolver17);
  }

  @Test
  public void test2609() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2609");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
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
  }

  @Test
  public void test2610() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2610");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2611() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2611");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2612() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2612");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2613() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2613");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test2614() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2614");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 1L);
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    java.lang.Class<?> wildcardClass7 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2615() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2615");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream14 = dbmsProcedures0.litpodeStream();
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
  public void test2616() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2616");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2617() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2617");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream16 = dbmsProcedures0.litlcStream();
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
  public void test2618() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2618");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
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
    org.junit.Assert.assertNull(log15);
  }

  @Test
  public void test2619() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2619");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2620() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2620");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 52L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test2621() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2621");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    org.neo4j.logging.Log log17 = null;
    dbmsProcedures0.log = log17;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext19 = dbmsProcedures0.procedureCallContext;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNull(procedureCallContext19);
  }

  @Test
  public void test2622() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2622");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2623() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2623");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream16 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2624() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2624");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2625() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2625");
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
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test2626() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2626");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test2627() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2627");
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
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream13 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2628() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2628");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2629() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2629");
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
    try {
      dbmsProcedures0.shtw();
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
  public void test2630() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2630");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2631() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2631");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test2632() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2632");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2633() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2633");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    java.lang.String[] strArray15 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
    boolean boolean22 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList21, strArray20);
    java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream25 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList16,
          (java.util.List<java.lang.String>) strList21, "hi!", strMap24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test2634() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2634");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2635() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2635");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream19 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test2636() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2636");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2637() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2637");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2638() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2638");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream5 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2639() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2639");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2640() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2640");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(procedureCallContext3);
  }

  @Test
  public void test2641() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2641");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 10, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
  }

  @Test
  public void test2642() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2642");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    java.lang.Class<?> wildcardClass14 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2643() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2643");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream10 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2644() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2644");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream14 = dbmsProcedures0.scufajrnStream();
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
  public void test2645() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2645");
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
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test2646() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2646");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2647() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2647");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2648() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2648");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2649() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2649");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream17 = dbmsProcedures0.chcotStream();
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
  }

  @Test
  public void test2650() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2650");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
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
  public void test2651() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2651");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2652() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2652");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) 10, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2653() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2653");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2654() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2654");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) -1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.Class<?> wildcardClass5 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test2655() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2655");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test2656() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2656");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2657() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2657");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test2658() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2658");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test2659() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2659");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test2660() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2660");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream6 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2661() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2661");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2662() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2662");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction4);
  }

  @Test
  public void test2663() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2663");
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
  public void test2664() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2664");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test2665() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2665");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test2666() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2666");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test2667() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2667");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 10);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test2668() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2668");
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
      java.lang.Class<?> wildcardClass11 = systemGraphComponents10.getClass();
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
  public void test2669() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2669");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents16;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream21 = dbmsProcedures0.scupregpStream(
          "", "", "");
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
  public void test2670() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2670");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2671() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2671");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.neo4j.graphdb.Transaction transaction14 = null;
    dbmsProcedures0.transaction = transaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream16 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2672() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2672");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(log8);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2673() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2673");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test2674() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2674");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test2675() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2675");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream14 = dbmsProcedures0.litpodeStream();
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
  public void test2676() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2676");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(log10);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test2677() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2677");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2678() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2678");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 1);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test2679() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2679");
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
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream14 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2680() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2680");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    java.lang.Class<?> wildcardClass11 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test2681() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2681");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2682() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2682");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2683() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2683");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2684() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2684");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    java.lang.Class<?> wildcardClass14 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test2685() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2685");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream6 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2686() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2686");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test2687() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2687");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test2688() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2688");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    long long8 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
  }

  @Test
  public void test2689() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2689");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test2690() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2690");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream14 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test2691() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2691");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2692() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2692");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", 97L);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
  }

  @Test
  public void test2693() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2693");
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
      dbmsProcedures0.secfvuForStSt("", "");
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
  public void test2694() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2694");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream12 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test2695() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2695");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test2696() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2696");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI14);
  }

  @Test
  public void test2697() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2697");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2698() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2698");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
  }

  @Test
  public void test2699() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2699");
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
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test2700() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2700");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test2701() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2701");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (short) 1, "");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
  }

  @Test
  public void test2702() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2702");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream13 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2703() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2703");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2704() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2704");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    long long7 = currentResourceLockMeta3.resourceId;
    long long8 = currentResourceLockMeta3.resourceId;
    java.lang.String str9 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test2705() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2705");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) 10);
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
  }

  @Test
  public void test2706() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2706");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (byte) 100, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test2707() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2707");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (short) -1, "");
  }

  @Test
  public void test2708() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2708");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test2709() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2709");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) '#');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test2710() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2710");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (byte) 0, "hi!");
  }

  @Test
  public void test2711() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2711");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test2712() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2712");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
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
  public void test2713() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2713");
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
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
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
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2714() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2714");
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
    org.neo4j.graphdb.Transaction transaction16 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver17 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(transaction16);
    org.junit.Assert.assertNull(dependencyResolver17);
  }

  @Test
  public void test2715() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2715");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents10;
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test2716() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2716");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test2717() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2717");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream15 = dbmsProcedures0.scuacgsStream();
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
  }

  @Test
  public void test2718() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2718");
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
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test2719() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2719");
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
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test2720() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2720");
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
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test2721() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2721");
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
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test2722() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2722");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2723() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2723");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2724() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2724");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (-1), "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2725() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2725");
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
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream13 = dbmsProcedures0.litlcStream();
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
  public void test2726() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2726");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2727() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2727");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test2728() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2728");
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
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2729() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2729");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(securityContext6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test2730() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2730");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2731() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2731");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream17 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList13, "hi!", strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test2732() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2732");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test2733() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2733");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
  }

  @Test
  public void test2734() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2734");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test2735() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2735");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2736() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2736");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test2737() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2737");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2738() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2738");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI15;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext17 = null;
    dbmsProcedures0.securityContext = securityContext17;
  }

  @Test
  public void test2739() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2739");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream15 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2740() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2740");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream16 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test2741() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2741");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2742() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2742");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2743() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2743");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
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
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2744() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2744");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) 100);
    java.lang.Class<?> wildcardClass4 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test2745() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2745");
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
    org.neo4j.common.DependencyResolver dependencyResolver19 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver19;
    org.neo4j.graphdb.Transaction transaction21 = null;
    dbmsProcedures0.transaction = transaction21;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2746() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2746");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (byte) -1, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test2747() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2747");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream14 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2748() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2748");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream13 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test2749() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2749");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test2750() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2750");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    long long7 = transactionResourceLockMeta4.rxId;
    long long8 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
  }

  @Test
  public void test2751() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2751");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream15 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2752() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2752");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI17 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI17;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2753() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2753");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = null;
    dbmsProcedures0.securityContext = securityContext15;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream18 = dbmsProcedures0.upredtlStream();
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
    org.junit.Assert.assertNull(kernelTransaction17);
  }

  @Test
  public void test2754() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2754");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream13 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2755() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2755");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents17 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver18 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNull(systemGraphComponents17);
    org.junit.Assert.assertNull(dependencyResolver18);
  }

  @Test
  public void test2756() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2756");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = null;
    dbmsProcedures0.securityContext = securityContext16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test2757() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2757");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) 1);
  }

  @Test
  public void test2758() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2758");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
  }

  @Test
  public void test2759() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2759");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test2760() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2760");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2761() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2761");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2762() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2762");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    long long7 = currentResourceLockMeta3.resourceId;
    long long8 = currentResourceLockMeta3.resourceId;
    long long9 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
  }

  @Test
  public void test2763() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2763");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test2764() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2764");
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
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(securityContext12);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test2765() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2765");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test2766() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2766");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test2767() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2767");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(securityContext18);
  }

  @Test
  public void test2768() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2768");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction17;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test2769() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2769");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2770() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2770");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream17 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2771() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2771");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) 100);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test2772() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2772");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream17 = dbmsProcedures0.upredtlStream();
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
  }

  @Test
  public void test2773() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2773");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) '#');
  }

  @Test
  public void test2774() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2774");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2775() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2775");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream11 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2776() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2776");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) 0);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test2777() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2777");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test2778() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2778");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(procedureCallContext12);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test2779() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2779");
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
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test2780() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2780");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test2781() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2781");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream17 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test2782() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2782");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 32L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test2783() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2783");
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
    org.neo4j.logging.Log log15 = null;
    dbmsProcedures0.log = log15;
    org.neo4j.graphdb.Transaction transaction17 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNull(transaction17);
  }

  @Test
  public void test2784() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2784");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test2785() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2785");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(log4);
  }

  @Test
  public void test2786() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2786");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
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
  public void test2787() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2787");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 97L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
  }

  @Test
  public void test2788() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2788");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver11 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
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
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test2789() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2789");
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
  public void test2790() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2790");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream7 = dbmsProcedures0.scufajrnStream();
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
  public void test2791() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2791");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 100L);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2792() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2792");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test2793() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2793");
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
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test2794() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2794");
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
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
  }

  @Test
  public void test2795() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2795");
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
    org.neo4j.common.DependencyResolver dependencyResolver14 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
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
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(dependencyResolver14);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2796() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2796");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test2797() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2797");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test2798() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2798");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2799() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2799");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test2800() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2800");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream13 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2801() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2801");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream15 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2802() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2802");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test2803() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2803");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test2804() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2804");
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
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2805() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2805");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2806() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2806");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 100L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass7 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2807() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2807");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2808() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2808");
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
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream14 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2809() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2809");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
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
  public void test2810() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2810");
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
  public void test2811() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2811");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream12 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2812() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2812");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test2813() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2813");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream18 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2814() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2814");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test2815() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2815");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2816() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2816");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2817() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2817");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) 0);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test2818() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2818");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream16 = dbmsProcedures0.upredtlStream();
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
  public void test2819() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2819");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2820() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2820");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2821() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2821");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test2822() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2822");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2823() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2823");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test2824() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2824");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    java.util.List<java.lang.String> strList9 = null;
    java.lang.String[] strArray12 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream17 = procedures0.cranekyStream(
          "hi!", strList9, (java.util.List<java.lang.String>) strList13, "", strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test2825() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2825");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test2826() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2826");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream14 = dbmsProcedures0.limepStream();
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
  public void test2827() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2827");
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
          "", "", "");
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
  public void test2828() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2828");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
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
  public void test2829() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2829");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test2830() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2830");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2831() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2831");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2832() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2832");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test2833() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2833");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2834() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2834");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test2835() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2835");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream15 = dbmsProcedures0.limepStream();
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
  public void test2836() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2836");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.neo4j.logging.Log log17 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver18 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver19 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver19;
    org.neo4j.common.DependencyResolver dependencyResolver21 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver21;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(log17);
    org.junit.Assert.assertNull(dependencyResolver18);
  }

  @Test
  public void test2837() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2837");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test2838() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2838");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2839() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2839");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2840() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2840");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 100L);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test2841() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2841");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    java.lang.Class<?> wildcardClass18 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test2842() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2842");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2843() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2843");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2844() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2844");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test2845() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2845");
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
      java.lang.Class<?> wildcardClass10 = graphDatabaseAPI9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2846() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2846");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test2847() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2847");
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
    org.neo4j.common.DependencyResolver dependencyResolver15 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver15;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents17 = dbmsProcedures0.systemGraphComponents;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents17);
  }

  @Test
  public void test2848() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2848");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
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
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2849() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2849");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = null;
    dbmsProcedures0.securityContext = securityContext16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test2850() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2850");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (short) 10, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    long long7 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
  }

  @Test
  public void test2851() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2851");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2852() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2852");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test2853() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2853");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log15);
  }

  @Test
  public void test2854() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2854");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream20 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2855() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2855");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) '4', "hi!");
  }

  @Test
  public void test2856() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2856");
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
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream12 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test2857() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2857");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    procedures0.kernelTransaction = kernelTransaction16;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test2858() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2858");
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
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    org.neo4j.common.DependencyResolver dependencyResolver18 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver19 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(dependencyResolver18);
  }

  @Test
  public void test2859() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2859");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test2860() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2860");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) 'a', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test2861() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2861");
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
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2862() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2862");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream12 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2863() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2863");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    java.lang.String str8 = currentResourceLockMeta3.mode;
    long long9 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
  }

  @Test
  public void test2864() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2864");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    java.lang.String[] strArray12 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.List<java.lang.String> strList15 = null;
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList13, strList15, "hi!", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test2865() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2865");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    try {
      java.lang.Class<?> wildcardClass9 = dependencyResolver8.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test2866() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2866");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test2867() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2867");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test2868() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2868");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test2869() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2869");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test2870() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2870");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    org.neo4j.graphdb.Transaction transaction18 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log19 = null;
    dbmsProcedures0.log = log19;
    org.neo4j.graphdb.Transaction transaction21 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream22 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(transaction18);
    org.junit.Assert.assertNull(transaction21);
  }

  @Test
  public void test2871() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2871");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream16 = dbmsProcedures0.updstdtStream();
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
    org.junit.Assert.assertNull(log15);
  }

  @Test
  public void test2872() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2872");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", 35L);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test2873() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2873");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream12 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2874() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2874");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents20 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext21 = null;
    dbmsProcedures0.securityContext = securityContext21;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(systemGraphComponents20);
  }

  @Test
  public void test2875() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2875");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (byte) -1);
  }

  @Test
  public void test2876() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2876");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = null;
    dbmsProcedures0.securityContext = securityContext18;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2877() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2877");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents10;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream14 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test2878() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2878");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test2879() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2879");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream7 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2880() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2880");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2881() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2881");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2882() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2882");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream16 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test2883() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2883");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI15;
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test2884() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2884");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test2885() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2885");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI16;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction13);
  }

  @Test
  public void test2886() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2886");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream7 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test2887() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2887");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test2888() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2888");
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
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test2889() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2889");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream14 = dbmsProcedures0.scuacgsStream();
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
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2890() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2890");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2891() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2891");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", 32L, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass7 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2892() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2892");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2893() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2893");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test2894() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2894");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test2895() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2895");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test2896() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2896");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream20 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2897() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2897");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream7 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test2898() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2898");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    long long7 = currentResourceLockMeta3.resourceId;
    long long8 = currentResourceLockMeta3.resourceId;
    java.lang.String str9 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test2899() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2899");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test2900() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2900");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2901() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2901");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream10 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test2902() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2902");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test2903() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2903");
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
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test2904() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2904");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test2905() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2905");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (-1), "");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
  }

  @Test
  public void test2906() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2906");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test2907() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2907");
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
    org.neo4j.common.DependencyResolver dependencyResolver19 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver19;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents21 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents21;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream23 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test2908() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2908");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test2909() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2909");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2910() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2910");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.graphdb.Transaction transaction16 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext17 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(transaction16);
    org.junit.Assert.assertNull(securityContext17);
  }

  @Test
  public void test2911() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2911");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2912() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2912");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    java.lang.Class<?> wildcardClass5 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test2913() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2913");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test2914() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2914");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    long long8 = currentResourceLockMeta3.resourceId;
    java.lang.Class<?> wildcardClass9 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test2915() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2915");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test2916() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2916");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test2917() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2917");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream10 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test2918() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2918");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(procedureCallContext12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test2919() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2919");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2920() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2920");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log16 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(securityContext14);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(log16);
  }

  @Test
  public void test2921() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2921");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test2922() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2922");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 10, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test2923() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2923");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test2924() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2924");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream13 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2925() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2925");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2926() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2926");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test2927() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2927");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test2928() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2928");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test2929() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2929");
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
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver16;
    org.neo4j.common.DependencyResolver dependencyResolver18 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream19 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(dependencyResolver18);
  }

  @Test
  public void test2930() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2930");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(systemGraphComponents4);
  }

  @Test
  public void test2931() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2931");
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
    java.lang.Class<?> wildcardClass12 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test2932() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2932");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test2933() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2933");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
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
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2934() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2934");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.common.DependencyResolver dependencyResolver14 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver14);
  }

  @Test
  public void test2935() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2935");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (short) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    java.lang.String str10 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test2936() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2936");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.neo4j.logging.Log log17 = null;
    dbmsProcedures0.log = log17;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test2937() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2937");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    java.lang.Class<?> wildcardClass8 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test2938() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2938");
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
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test2939() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2939");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 100);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    long long7 = currentResourceLockMeta3.resourceId;
    long long8 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
  }

  @Test
  public void test2940() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2940");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test2941() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2941");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream16 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2942() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2942");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!"};
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
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test2943() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2943");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2944() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2944");
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
    org.neo4j.graphdb.Transaction transaction18 = null;
    dbmsProcedures0.transaction = transaction18;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
    org.junit.Assert.assertNull(procedureCallContext17);
  }

  @Test
  public void test2945() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2945");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test2946() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2946");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2947() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2947");
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
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.lang.String[] strArray18 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream23 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList14,
          (java.util.List<java.lang.String>) strList19, "", strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test2948() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2948");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream7 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2949() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2949");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream17 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test2950() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2950");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2951() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2951");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test2952() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2952");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream16 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(log10);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test2953() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2953");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream8 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test2954() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2954");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (short) 0, "");
  }

  @Test
  public void test2955() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2955");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    java.lang.Class<?> wildcardClass7 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test2956() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2956");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test2957() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2957");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2958() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2958");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction3);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test2959() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2959");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = procedures0.kernelTransaction;
    java.lang.String[] strArray17 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.lang.String[] strArray22 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
    boolean boolean24 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList23, strArray22);
    java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream27 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList18,
          (java.util.List<java.lang.String>) strList23, "", strMap26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
  }

  @Test
  public void test2960() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2960");
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
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test2961() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2961");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
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
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test2962() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2962");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents19 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream20 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNull(systemGraphComponents19);
  }

  @Test
  public void test2963() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2963");
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
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test2964() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2964");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test2965() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2965");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
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
  public void test2966() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2966");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    java.lang.Class<?> wildcardClass13 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test2967() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2967");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream7 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test2968() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2968");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test2969() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2969");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2970() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2970");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    procedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test2971() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2971");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream5 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2972() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2972");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream12 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2973() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2973");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test2974() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2974");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test2975() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2975");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (short) 1, "hi!");
  }

  @Test
  public void test2976() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2976");
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
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test2977() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2977");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    procedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.List<java.lang.String> strList15 = null;
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList13, strList15, "", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test2978() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2978");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream6 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test2979() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2979");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    org.neo4j.graphdb.Transaction transaction17 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction18;
    org.neo4j.logging.Log log20 = null;
    dbmsProcedures0.log = log20;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(transaction17);
  }

  @Test
  public void test2980() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2980");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test2981() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2981");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test2982() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2982");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test2983() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2983");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test2984() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2984");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver14 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(dependencyResolver14);
  }

  @Test
  public void test2985() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2985");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test2986() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2986");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (short) 100, "hi!");
  }

  @Test
  public void test2987() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2987");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test2988() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2988");
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
    try {
      dbmsProcedures0.shtw();
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
  }

  @Test
  public void test2989() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2989");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test2990() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2990");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test2991() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2991");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext15;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI17 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream18 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI17);
  }

  @Test
  public void test2992() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2992");
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
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream15 = dbmsProcedures0.chcotStream();
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
  public void test2993() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2993");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(log8);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test2994() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2994");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test2995() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2995");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream6 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
  }

  @Test
  public void test2996() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2996");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (-1L));
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
  }

  @Test
  public void test2997() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2997");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test2998() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2998");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test2999() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test2999");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test3000() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest5.test3000");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver15 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(transaction14);
  }
}

