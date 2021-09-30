package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest8 {

  public static boolean debug = false;

  @Test
  public void test4001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4001");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", 52L);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test4002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4002");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream6 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test4003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4003");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext20 = null;
    dbmsProcedures0.securityContext = securityContext20;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(transaction17);
  }

  @Test
  public void test4004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4004");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test4005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4005");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream20 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
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
  public void test4006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4006");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext3);
  }

  @Test
  public void test4007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4007");
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
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test4008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4008");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (short) -1, "hi!");
  }

  @Test
  public void test4009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4009");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", 32L);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test4010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4010");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 'a', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4011");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test4012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4012");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (short) -1);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4013");
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
    org.neo4j.common.DependencyResolver dependencyResolver14 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream15 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNull(dependencyResolver14);
  }

  @Test
  public void test4014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4014");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList14, "hi!", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test4015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4015");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(systemGraphComponents16);
  }

  @Test
  public void test4016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4016");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) -1);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test4017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4017");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test4018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4018");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4019");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 35L, "hi!");
  }

  @Test
  public void test4020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4020");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test4021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4021");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test4022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4022");
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
  public void test4023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4023");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) 'a', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test4024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4024");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test4025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4025");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream16 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test4026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4026");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (byte) 100, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test4027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4027");
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
    org.neo4j.graphdb.Transaction transaction15 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNull(transaction15);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test4028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4028");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test4029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4029");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext16 = dbmsProcedures0.procedureCallContext;
    java.lang.Class<?> wildcardClass17 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(procedureCallContext16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test4030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4030");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 100, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
  }

  @Test
  public void test4031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4031");
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
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream19 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
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
  public void test4032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4032");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(securityContext13);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test4033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4033");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test4034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4034");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream14 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test4035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4035");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(log8);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test4036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4036");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test4037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4037");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNull(systemGraphComponents8);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test4038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4038");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test4039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4039");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    long long9 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
  }

  @Test
  public void test4040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4040");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext16 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream17 = dbmsProcedures0.litlcStream();
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
    org.junit.Assert.assertNull(procedureCallContext16);
  }

  @Test
  public void test4041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4041");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI17 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(transaction16);
    org.junit.Assert.assertNull(graphDatabaseAPI17);
  }

  @Test
  public void test4042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4042");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test4043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4043");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (short) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.Class<?> wildcardClass7 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test4044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4044");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test4045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4045");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream11 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test4046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4046");
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
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test4047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4047");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test4048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4048");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(dependencyResolver16);
    org.junit.Assert.assertNull(kernelTransaction17);
  }

  @Test
  public void test4049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4049");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test4050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4050");
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
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4051");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    procedures0.dependencyResolver = dependencyResolver14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    procedures0.dependencyResolver = dependencyResolver16;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test4052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4052");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream16 = dbmsProcedures0.scufajrnStream();
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
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test4053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4053");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test4054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4054");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4055");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test4056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4056");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream15 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test4057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4057");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test4058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4058");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (short) 1, "");
    java.lang.Class<?> wildcardClass5 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test4059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4059");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test4060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4060");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.mode;
    java.lang.String str9 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test4061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4061");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext17 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(kernelTransaction16);
    org.junit.Assert.assertNull(procedureCallContext17);
  }

  @Test
  public void test4062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4062");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    long long10 = transactionResourceLockMeta4.rxId;
    java.lang.String str11 = transactionResourceLockMeta4.rtName;
    long long12 = transactionResourceLockMeta4.rxId;
    java.lang.String str13 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
  }

  @Test
  public void test4063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4063");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(log12);
  }

  @Test
  public void test4064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4064");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test4065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4065");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test4066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4066");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    org.neo4j.logging.Log log16 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNull(log16);
  }

  @Test
  public void test4067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4067");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream11 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test4068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4068");
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
    java.util.List<java.lang.String> strList15 = null;
    java.lang.String[] strArray17 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "", strList15, (java.util.List<java.lang.String>) strList18, "", strMap21);
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
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test4069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4069");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(log4);
  }

  @Test
  public void test4070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4070");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!", ""};
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
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test4071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4071");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test4072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4072");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    java.util.List<java.lang.String> strList11 = null;
    java.lang.String[] strArray14 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream19 = procedures0.cranekyStream(
          "", strList11, (java.util.List<java.lang.String>) strList15, "", strMap18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test4073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4073");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test4074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4074");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test4075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4075");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", 32L, "hi!");
  }

  @Test
  public void test4076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4076");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test4077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4077");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test4078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4078");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.neo4j.logging.Log log16 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(log16);
  }

  @Test
  public void test4079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4079");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test4080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4080");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test4081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4081");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents7;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream13 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test4082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4082");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test4083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4083");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext15;
    org.neo4j.logging.Log log17 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream18 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNull(systemGraphComponents14);
    org.junit.Assert.assertNull(log17);
  }

  @Test
  public void test4084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4084");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", 32L);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4085");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 100, "");
  }

  @Test
  public void test4086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4086");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = null;
    dbmsProcedures0.securityContext = securityContext18;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test4087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4087");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test4088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4088");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test4089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4089");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4090");
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
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test4091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4091");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test4092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4092");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    long long10 = transactionResourceLockMeta4.rxId;
    java.lang.String str11 = transactionResourceLockMeta4.mdstr;
    java.lang.String str12 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
  }

  @Test
  public void test4093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4093");
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
    org.neo4j.common.DependencyResolver dependencyResolver19 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver19;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext21 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver15);
    org.junit.Assert.assertNull(procedureCallContext18);
    org.junit.Assert.assertNull(securityContext21);
  }

  @Test
  public void test4094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4094");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test4095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4095");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) '4');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test4096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4096");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream18 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(log17);
  }

  @Test
  public void test4097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4097");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    procedures0.kernelTransaction = kernelTransaction14;
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test4098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4098");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test4099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4099");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test4100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4100");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (-1L));
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4101");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test4102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4102");
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
    org.neo4j.graphdb.Transaction transaction15 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver16 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNull(transaction15);
    org.junit.Assert.assertNull(dependencyResolver16);
  }

  @Test
  public void test4103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4103");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(systemGraphComponents12);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
  }

  @Test
  public void test4104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4104");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (-1L), "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
  }

  @Test
  public void test4105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4105");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test4106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4106");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test4107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4107");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test4108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4108");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test4109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4109");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI15 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
  }

  @Test
  public void test4110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4110");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
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
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4111");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream12 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test4112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4112");
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
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
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
  }

  @Test
  public void test4113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4113");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
  }

  @Test
  public void test4114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4114");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test4115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4115");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (short) -1, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test4116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4116");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test4117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4117");
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
    try {
      java.lang.Class<?> wildcardClass13 = kernelTransaction12.getClass();
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
  }

  @Test
  public void test4118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4118");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction17;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream19 = dbmsProcedures0.scuacgsStream();
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
  public void test4119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4119");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4120");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test4121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4121");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (short) -1);
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
  }

  @Test
  public void test4122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4122");
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
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    procedures0.dependencyResolver = dependencyResolver14;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test4123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4123");
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
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test4124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4124");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test4125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4125");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = null;
    dbmsProcedures0.securityContext = securityContext7;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test4126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4126");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 0L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test4127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4127");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test4128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4128");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test4129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4129");
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
    org.neo4j.logging.Log log13 = null;
    dbmsProcedures0.log = log13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4130");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(log7);
  }

  @Test
  public void test4131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4131");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test4132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4132");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test4133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4133");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test4134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4134");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = null;
    dbmsProcedures0.securityContext = securityContext14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4135");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test4136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4136");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext6);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4137");
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
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(transaction13);
  }

  @Test
  public void test4138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4138");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test4139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4139");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test4140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4140");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test4141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4141");
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
    java.lang.String str12 = transactionResourceLockMeta4.mdstr;
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
  public void test4142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4142");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test4143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4143");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta profileReturnedMeta1 = new io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta(
        "hi!");
    java.lang.String str2 = profileReturnedMeta1.prfe;
    java.lang.String str3 = profileReturnedMeta1.prfe;
    java.lang.String str4 = profileReturnedMeta1.prfe;
    java.lang.String str5 = profileReturnedMeta1.prfe;
    java.lang.String str6 = profileReturnedMeta1.prfe;
    java.lang.String str7 = profileReturnedMeta1.prfe;
    java.lang.String str8 = profileReturnedMeta1.prfe;
    java.lang.String str9 = profileReturnedMeta1.prfe;
    java.lang.String str10 = profileReturnedMeta1.prfe;
    java.lang.String str11 = profileReturnedMeta1.prfe;
    java.lang.String str12 = profileReturnedMeta1.prfe;
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
  }

  @Test
  public void test4144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4144");
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
      dbmsProcedures0.shtw();
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
  public void test4145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4145");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test4146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4146");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test4147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4147");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4148");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
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
  public void test4149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4149");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", 10L);
    java.lang.Class<?> wildcardClass4 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test4150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4150");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    java.lang.Class<?> wildcardClass8 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test4151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4151");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4152");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test4153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4153");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    long long10 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
  }

  @Test
  public void test4154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4154");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test4155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4155");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test4156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4156");
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
      dbmsProcedures0.shtw();
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
  public void test4157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4157");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 10, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test4158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4158");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream12 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test4159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4159");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (short) 0);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.Class<?> wildcardClass6 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test4160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4160");
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
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test4161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4161");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
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
  public void test4162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4162");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test4163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4163");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.logging.Log log11 = null;
    dbmsProcedures0.log = log11;
    org.neo4j.logging.Log log13 = null;
    dbmsProcedures0.log = log13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4164");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 100L, "hi!");
  }

  @Test
  public void test4165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4165");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext16 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log17 = dbmsProcedures0.log;
    org.neo4j.logging.Log log18 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext16);
    org.junit.Assert.assertNull(log17);
    org.junit.Assert.assertNull(log18);
  }

  @Test
  public void test4166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4166");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test4167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4167");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test4168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4168");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4169");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream10 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4170");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test4171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4171");
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
    java.lang.Class<?> wildcardClass13 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test4172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4172");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
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
  public void test4173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4173");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test4174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4174");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream8 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test4175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4175");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (byte) -1, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test4176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4176");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    long long9 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
  }

  @Test
  public void test4177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4177");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log2 = null;
    dbmsProcedures0.log = log2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream4 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
  }

  @Test
  public void test4178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4178");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    procedures0.dependencyResolver = dependencyResolver14;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test4179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4179");
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
    java.lang.Class<?> wildcardClass16 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test4180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4180");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    procedures0.dependencyResolver = dependencyResolver13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver16 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(dependencyResolver15);
    org.junit.Assert.assertNull(dependencyResolver16);
  }

  @Test
  public void test4181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4181");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test4182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4182");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI9;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test4183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4183");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test4184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4184");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4185");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) '4', "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test4186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4186");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(log7);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4187");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test4188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4188");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test4189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4189");
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
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream16 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction13);
  }

  @Test
  public void test4190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4190");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test4191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4191");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test4192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4192");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test4193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4193");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext17 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream18 = dbmsProcedures0.litlcStream();
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
    org.junit.Assert.assertNull(procedureCallContext17);
  }

  @Test
  public void test4194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4194");
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
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test4195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4195");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test4196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4196");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream8 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4197");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) '#', "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test4198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4198");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test4199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4199");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test4200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4200");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4201");
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
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.lang.String[] strArray17 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList14,
          (java.util.List<java.lang.String>) strList18, "hi!", strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test4202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4202");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI18 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(graphDatabaseAPI18);
  }

  @Test
  public void test4203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4203");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(transaction15);
    org.junit.Assert.assertNull(systemGraphComponents16);
  }

  @Test
  public void test4204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4204");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
  }

  @Test
  public void test4205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4205");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test4206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4206");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.Class<?> wildcardClass11 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test4207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4207");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = null;
    dbmsProcedures0.securityContext = securityContext16;
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test4208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4208");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.String str11 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
  }

  @Test
  public void test4209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4209");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test4210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4210");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test4211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4211");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNull(procedureCallContext8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test4212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4212");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
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
  }

  @Test
  public void test4213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4213");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(securityContext12);
  }

  @Test
  public void test4214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4214");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4215");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test4216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4216");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream14 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test4217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4217");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test4218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4218");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test4219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4219");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test4220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4220");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4221");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test4222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4222");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) 100);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    long long6 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
  }

  @Test
  public void test4223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4223");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test4224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4224");
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
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(log12);
  }

  @Test
  public void test4225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4225");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (byte) 0);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test4226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4226");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (byte) 1, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test4227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4227");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    java.lang.String[] strArray4 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList5, strArray4);
    java.lang.String[] strArray8 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream13 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList5,
          (java.util.List<java.lang.String>) strList9, "hi!", strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test4228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4228");
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
    java.lang.Class<?> wildcardClass15 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test4229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4229");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream15 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test4230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4230");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4231");
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
      dbmsProcedures0.shtw();
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
  public void test4232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4232");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test4233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4233");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
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
  public void test4234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4234");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream7 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
  }

  @Test
  public void test4235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4235");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test4236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4236");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI18 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext19 = null;
    dbmsProcedures0.securityContext = securityContext19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI17);
    org.junit.Assert.assertNull(graphDatabaseAPI18);
  }

  @Test
  public void test4237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4237");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test4238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4238");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.lang.String[] strArray18 = new java.lang.String[]{"", ""};
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
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test4239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4239");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", 52L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test4240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4240");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream7 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test4241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4241");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log7);
  }

  @Test
  public void test4242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4242");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
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
  public void test4243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4243");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test4244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4244");
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
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
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
  }

  @Test
  public void test4245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4245");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 0L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test4246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4246");
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
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log14 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test4247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4247");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test4248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4248");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream5 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
  }

  @Test
  public void test4249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4249");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext17 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream18 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(systemGraphComponents16);
    org.junit.Assert.assertNull(procedureCallContext17);
  }

  @Test
  public void test4250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4250");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test4251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4251");
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
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver16 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(dependencyResolver15);
    org.junit.Assert.assertNull(dependencyResolver16);
  }

  @Test
  public void test4252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4252");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(log7);
  }

  @Test
  public void test4253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4253");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
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
  public void test4254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4254");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream21 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI17);
  }

  @Test
  public void test4255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4255");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
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
  public void test4256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4256");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test4257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4257");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test4258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4258");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test4259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4259");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test4260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4260");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream10 = dbmsProcedures0.litpodeStream();
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
  public void test4261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4261");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test4262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4262");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test4263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4263");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test4264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4264");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test4265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4265");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    java.lang.Class<?> wildcardClass6 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test4266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4266");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
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
  public void test4267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4267");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test4268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4268");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4269");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test4270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4270");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 1, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test4271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4271");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test4272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4272");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test4273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4273");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 32L, "hi!");
  }

  @Test
  public void test4274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4274");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) '4');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    long long8 = currentResourceLockMeta3.resourceId;
    java.lang.String str9 = currentResourceLockMeta3.mode;
    java.lang.String str10 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test4275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4275");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test4276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4276");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
    java.lang.String[] strArray18 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.lang.String[] strArray23 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
    boolean boolean25 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList24, strArray23);
    java.util.Map<java.lang.String, java.lang.Object> strMap27 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream28 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList19,
          (java.util.List<java.lang.String>) strList24, "", strMap27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
  }

  @Test
  public void test4277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4277");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
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
  public void test4278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4278");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test4279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4279");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream9 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test4280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4280");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test4281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4281");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream14 = dbmsProcedures0.scuacgsStream();
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
  public void test4282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4282");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test4283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4283");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream16 = dbmsProcedures0.updstdtStream();
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
  public void test4284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4284");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver15;
    org.neo4j.logging.Log log17 = null;
    dbmsProcedures0.log = log17;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents19 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(systemGraphComponents19);
  }

  @Test
  public void test4285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4285");
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
  public void test4286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4286");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test4287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4287");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 0L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test4288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4288");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 0);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    long long7 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
  }

  @Test
  public void test4289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4289");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(systemGraphComponents2);
  }

  @Test
  public void test4290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4290");
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
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    org.neo4j.logging.Log log16 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream17 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNull(log15);
    org.junit.Assert.assertNull(log16);
  }

  @Test
  public void test4291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4291");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream7 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test4292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4292");
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
    org.neo4j.common.DependencyResolver dependencyResolver16 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(dependencyResolver16);
  }

  @Test
  public void test4293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4293");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream13 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4294");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream16 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test4295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4295");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test4296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4296");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test4297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4297");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext18 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext19 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents20 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents20;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(procedureCallContext18);
    org.junit.Assert.assertNull(securityContext19);
  }

  @Test
  public void test4298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4298");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test4299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4299");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test4300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4300");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (byte) 1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
  }

  @Test
  public void test4301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4301");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (-1));
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    long long6 = currentResourceLockMeta3.resourceId;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    long long9 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
  }

  @Test
  public void test4302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4302");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream7 = dbmsProcedures0.chcotStream();
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
  public void test4303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4303");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test4304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4304");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test4305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4305");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.neo4j.graphdb.Transaction transaction13 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(transaction13);
  }

  @Test
  public void test4306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4306");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.lang.String[] strArray18 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream23 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList14,
          (java.util.List<java.lang.String>) strList19, "hi!", strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test4307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4307");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (-1L), "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
  }

  @Test
  public void test4308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4308");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext14;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI16 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction17;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test4309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4309");
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
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test4310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4310");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test4311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4311");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (byte) -1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.Class<?> wildcardClass6 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test4312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4312");
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
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNull(systemGraphComponents13);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test4313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4313");
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
    java.lang.String str12 = transactionResourceLockMeta4.rtName;
    java.lang.String str13 = transactionResourceLockMeta4.rtName;
    java.lang.String str14 = transactionResourceLockMeta4.mdstr;
    java.lang.String str15 = transactionResourceLockMeta4.mdstr;
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
  }

  @Test
  public void test4314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4314");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (short) 0, "hi!");
  }

  @Test
  public void test4315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4315");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test4316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4316");
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
    org.neo4j.graphdb.Transaction transaction18 = dbmsProcedures0.transaction;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(transaction18);
  }

  @Test
  public void test4317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4317");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test4318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4318");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    java.util.List<java.lang.String> strList6 = null;
    java.lang.String[] strArray8 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream13 = procedures0.cranekyStream(
          "hi!", strList6, (java.util.List<java.lang.String>) strList9, "hi!", strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test4319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4319");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test4320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4320");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction12 = null;
    dbmsProcedures0.transaction = transaction12;
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test4321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4321");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    procedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test4322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4322");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test4323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4323");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test4324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4324");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4325");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents8;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4326");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    java.lang.Class<?> wildcardClass9 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test4327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4327");
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
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test4328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4328");
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
      java.lang.Class<?> wildcardClass16 = graphDatabaseAPI15.getClass();
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
  public void test4329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4329");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI9 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test4330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4330");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
    java.lang.String[] strArray17 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.lang.String[] strArray21 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
    boolean boolean23 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList22, strArray21);
    java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream26 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList18,
          (java.util.List<java.lang.String>) strList22, "", strMap25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strArray21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
  }

  @Test
  public void test4331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4331");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4332");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test4333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4333");
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
    org.neo4j.logging.Log log15 = null;
    dbmsProcedures0.log = log15;
    org.neo4j.graphdb.Transaction transaction17 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream18 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction17);
  }

  @Test
  public void test4334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4334");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream17 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI15);
  }

  @Test
  public void test4335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4335");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test4336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4336");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4337");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test4338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4338");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    java.lang.Class<?> wildcardClass14 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test4339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4339");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream10 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test4340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4340");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 52L);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test4341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4341");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
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
  public void test4342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4342");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    procedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test4343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4343");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
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
  public void test4344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4344");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
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
  public void test4345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4345");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test4346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4346");
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
    long long14 = transactionResourceLockMeta4.rxId;
    long long15 = transactionResourceLockMeta4.rxId;
    long long16 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
  }

  @Test
  public void test4347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4347");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
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
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test4348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4348");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test4349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4349");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    java.lang.String[] strArray10 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.lang.String[] strArray15 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList11,
          (java.util.List<java.lang.String>) strList16, "", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test4350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4350");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream12 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4351");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) 'a', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4352");
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
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4353");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream13 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test4354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4354");
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
  }

  @Test
  public void test4355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4355");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (-1));
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test4356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4356");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 1, "");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
  }

  @Test
  public void test4357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4357");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test4358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4358");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test4359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4359");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
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
  public void test4360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4360");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream15 = dbmsProcedures0.litfnStream();
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
  public void test4361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4361");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test4362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4362");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(securityContext15);
  }

  @Test
  public void test4363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4363");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    procedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test4364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4364");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test4365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4365");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 'a');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test4366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4366");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test4367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4367");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (byte) -1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.Class<?> wildcardClass5 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test4368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4368");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test4369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4369");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction4);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4370");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test4371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4371");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test4372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4372");
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
    java.lang.String[] strArray15 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[]{"hi!", "hi!"};
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
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test4373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4373");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    org.neo4j.common.DependencyResolver dependencyResolver16 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream17 = dbmsProcedures0.upredtlStream();
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
    org.junit.Assert.assertNull(dependencyResolver16);
  }

  @Test
  public void test4374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4374");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream13 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test4375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4375");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4376");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log19 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
    org.junit.Assert.assertNull(dependencyResolver15);
    org.junit.Assert.assertNull(kernelTransaction18);
    org.junit.Assert.assertNull(log19);
  }

  @Test
  public void test4377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4377");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", 10L);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test4378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4378");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction15 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(securityContext14);
    org.junit.Assert.assertNull(transaction15);
  }

  @Test
  public void test4379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4379");
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
    org.neo4j.graphdb.Transaction transaction19 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(kernelTransaction17);
    org.junit.Assert.assertNull(kernelTransaction18);
    org.junit.Assert.assertNull(transaction19);
  }

  @Test
  public void test4380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4380");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test4381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4381");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction13 = null;
    dbmsProcedures0.transaction = transaction13;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream16 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(securityContext15);
  }

  @Test
  public void test4382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4382");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test4383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4383");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log2 = null;
    dbmsProcedures0.log = log2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test4384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4384");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test4385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4385");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 1, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    long long6 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
  }

  @Test
  public void test4386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4386");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test4387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4387");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (-1L), "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
  }

  @Test
  public void test4388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4388");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream16 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(transaction13);
  }

  @Test
  public void test4389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4389");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(log10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test4390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4390");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(graphDatabaseAPI4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test4391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4391");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 10L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    long long7 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
  }

  @Test
  public void test4392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4392");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    java.lang.Class<?> wildcardClass13 = procedures0.getClass();
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test4393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4393");
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
    long long14 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
  }

  @Test
  public void test4394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4394");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) 100);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test4395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4395");
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
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = null;
    dbmsProcedures0.securityContext = securityContext11;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test4396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4396");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test4397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4397");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 10L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4398");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) 10, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test4399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4399");
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
    org.neo4j.graphdb.Transaction transaction10 = null;
    dbmsProcedures0.transaction = transaction10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test4400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4400");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test4401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4401");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test4402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4402");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext11 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext11;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test4403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4403");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test4404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4404");
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
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test4405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4405");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
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
  public void test4406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4406");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log16 = null;
    dbmsProcedures0.log = log16;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(graphDatabaseAPI14);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test4407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4407");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test4408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4408");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream7 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4409");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) 10);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test4410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4410");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test4411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4411");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4412");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI19 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test4413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4413");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test4414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4414");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.common.DependencyResolver dependencyResolver15 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver15);
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test4415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4415");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test4416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4416");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI14;
    org.neo4j.logging.Log log16 = null;
    dbmsProcedures0.log = log16;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = null;
    dbmsProcedures0.securityContext = securityContext18;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(log10);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test4417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4417");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test4418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4418");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext3);
  }

  @Test
  public void test4419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4419");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test4420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4420");
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
    org.neo4j.common.DependencyResolver dependencyResolver15 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver15;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream17 = dbmsProcedures0.litlcStream();
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
  public void test4421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4421");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) 'a');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4422");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
    org.junit.Assert.assertNull(procedureCallContext3);
  }

  @Test
  public void test4423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4423");
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
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext11 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver12 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(securityContext11);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test4424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4424");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
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
  public void test4425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4425");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.lang.String[] strArray18 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream23 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList14,
          (java.util.List<java.lang.String>) strList19, "", strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test4426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4426");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction17;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents19 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test4427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4427");
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
    org.neo4j.logging.Log log10 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test4428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4428");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream14 = dbmsProcedures0.upredtlStream();
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
  public void test4429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4429");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", 32L, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    long long7 = transactionResourceLockMeta4.rxId;
    long long8 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
  }

  @Test
  public void test4430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4430");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test4431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4431");
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
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext18 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext18;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNull(kernelTransaction17);
  }

  @Test
  public void test4432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4432");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (-1L), "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    long long6 = transactionResourceLockMeta4.rxId;
    long long7 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
  }

  @Test
  public void test4433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4433");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test4434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4434");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents10 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test4435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4435");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test4436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4436");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 10, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass9 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test4437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4437");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI13);
  }

  @Test
  public void test4438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4438");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (byte) 10, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4439");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test4440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4440");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test4441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4441");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test4442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4442");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext15 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(securityContext15);
  }

  @Test
  public void test4443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4443");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(securityContext11);
  }

  @Test
  public void test4444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4444");
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
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test4445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4445");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test4446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4446");
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
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream14 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents12);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test4447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4447");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents17 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents17;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(graphDatabaseAPI16);
  }

  @Test
  public void test4448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4448");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 100);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test4449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4449");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test4450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4450");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test4451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4451");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    procedures0.kernelTransaction = kernelTransaction7;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test4452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4452");
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
    org.junit.Assert.assertNull(transaction14);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(kernelTransaction18);
  }

  @Test
  public void test4453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4453");
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
    org.neo4j.logging.Log log20 = null;
    dbmsProcedures0.log = log20;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext22 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext22;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext24 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(securityContext18);
    org.junit.Assert.assertNull(kernelTransaction19);
    org.junit.Assert.assertNull(securityContext24);
  }

  @Test
  public void test4454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4454");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
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
  public void test4455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4455");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
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
  }

  @Test
  public void test4456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4456");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream14 = dbmsProcedures0.scufajrnStream();
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
  public void test4457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4457");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test4458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4458");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
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
  public void test4459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4459");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test4460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4460");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test4461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4461");
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
    java.lang.String[] strArray16 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList17, strArray16);
    java.lang.String[] strArray20 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
    boolean boolean22 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList21, strArray20);
    java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream25 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList17,
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
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test4462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4462");
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
    org.neo4j.common.DependencyResolver dependencyResolver19 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver19;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream21 = dbmsProcedures0.litlcStream();
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
  public void test4463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4463");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test4464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4464");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction11;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test4465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4465");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test4466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4466");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream13 = dbmsProcedures0.litfnStream();
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
  public void test4467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4467");
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
    org.neo4j.graphdb.Transaction transaction19 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents20 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver21 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream22 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(transaction19);
    org.junit.Assert.assertNull(systemGraphComponents20);
    org.junit.Assert.assertNull(dependencyResolver21);
  }

  @Test
  public void test4468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4468");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test4469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4469");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test4470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4470");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test4471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4471");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    long long8 = currentResourceLockMeta3.resourceId;
    java.lang.String str9 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test4472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4472");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test4473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4473");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test4474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4474");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    procedures0.dependencyResolver = dependencyResolver14;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    procedures0.kernelTransaction = kernelTransaction16;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test4475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4475");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test4476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4476");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction9 = null;
    dbmsProcedures0.transaction = transaction9;
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test4477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4477");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test4478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4478");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream6 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test4479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4479");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver16 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver18 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(dependencyResolver16);
    org.junit.Assert.assertNull(kernelTransaction17);
    org.junit.Assert.assertNull(dependencyResolver18);
  }

  @Test
  public void test4480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4480");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test4481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4481");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = null;
    dbmsProcedures0.securityContext = securityContext9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test4482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4482");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream10 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test4483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4483");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 10L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
  }

  @Test
  public void test4484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4484");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test4485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4485");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test4486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4486");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log2 = null;
    dbmsProcedures0.log = log2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream6 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test4487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4487");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test4488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4488");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test4489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4489");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test4490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4490");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(systemGraphComponents7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test4491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4491");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(dependencyResolver1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test4492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4492");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents18 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents18;
    org.neo4j.common.DependencyResolver dependencyResolver20 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(graphDatabaseAPI17);
    org.junit.Assert.assertNull(dependencyResolver20);
  }

  @Test
  public void test4493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4493");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 0);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
  }

  @Test
  public void test4494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4494");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList10, strArray9);
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!", "hi!"};
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
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test4495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4495");
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
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction12 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(transaction12);
  }

  @Test
  public void test4496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4496");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test4497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4497");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test4498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4498");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test4499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4499");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream5 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(graphDatabaseAPI4);
  }

  @Test
  public void test4500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest8.test4500");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction14);
  }
}

