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
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream6 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0502() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0502");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test0503() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0503");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream6 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
  }

  @Test
  public void test0504() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0504");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream5 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test0505() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0505");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream16 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
  }

  @Test
  public void test0506() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0506");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test0507() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0507");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
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
  public void test0508() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0508");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream5 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test0509() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0509");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0510() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0510");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream4 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test0511() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0511");
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
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.lang.String[] strArray15 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList12,
          (java.util.List<java.lang.String>) strList16, "", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test0512() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0512");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream15 = dbmsProcedures0.limepStream();
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
  public void test0513() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0513");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream4 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test0514() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0514");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream5 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0515() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0515");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test0516() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0516");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (byte) 100);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test0517() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0517");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test0518() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0518");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test0519() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0519");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", 1L);
  }

  @Test
  public void test0520() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0520");
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
    java.lang.Class<?> wildcardClass9 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0521() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0521");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0522() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0522");
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test0523() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0523");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI11;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test0524() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0524");
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
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0525() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0525");
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
  public void test0526() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0526");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test0527() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0527");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream7 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0528() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0528");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0529() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0529");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test0530() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0530");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream12 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test0531() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0531");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    java.lang.Class<?> wildcardClass8 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0532() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0532");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test0533() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0533");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream6 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test0534() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0534");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) 100, "");
  }

  @Test
  public void test0535() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0535");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 10L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test0536() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0536");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream5 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test0537() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0537");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream5 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test0538() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0538");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream15 = dbmsProcedures0.limepStream();
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
  public void test0539() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0539");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 0L, "");
  }

  @Test
  public void test0540() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0540");
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
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test0541() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0541");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0542() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0542");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
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
  public void test0543() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0543");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.String str11 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
  }

  @Test
  public void test0544() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0544");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream5 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0545() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0545");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
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
  public void test0546() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0546");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0547() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0547");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test0548() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0548");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test0549() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0549");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test0550() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0550");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test0551() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0551");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
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
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test0552() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0552");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) 0, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    long long6 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test0553() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0553");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
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
  }

  @Test
  public void test0554() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0554");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream6 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
  }

  @Test
  public void test0555() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0555");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test0556() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0556");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test0557() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0557");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
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
  public void test0558() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0558");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    java.lang.Class<?> wildcardClass5 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0559() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0559");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream5 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0560() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0560");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test0561() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0561");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream5 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0562() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0562");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
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
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test0563() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0563");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) '#', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test0564() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0564");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream16 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test0565() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0565");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream6 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test0566() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0566");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    try {
      java.lang.Class<?> wildcardClass11 = kernelTransaction10.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test0567() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0567");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream6 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test0568() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0568");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream12 = dbmsProcedures0.litpodeStream();
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
  public void test0569() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0569");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
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
  public void test0570() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0570");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
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
  public void test0571() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0571");
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
    org.neo4j.graphdb.Transaction transaction15 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = null;
    dbmsProcedures0.securityContext = securityContext16;
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
    org.junit.Assert.assertNull(transaction15);
  }

  @Test
  public void test0572() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0572");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test0573() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0573");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
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
  public void test0574() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0574");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    java.lang.String[] strArray11 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.lang.String[] strArray15 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList12,
          (java.util.List<java.lang.String>) strList16, "", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test0575() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0575");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream13 = dbmsProcedures0.litfnStream();
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
  public void test0576() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0576");
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
    org.neo4j.graphdb.Transaction transaction17 = null;
    dbmsProcedures0.transaction = transaction17;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream19 = dbmsProcedures0.updstdtStream();
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
  public void test0577() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0577");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
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
  public void test0578() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0578");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test0579() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0579");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!"};
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
          "hi!", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList14, "hi!", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test0580() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0580");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test0581() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0581");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test0582() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0582");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test0583() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0583");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream13 = dbmsProcedures0.updstdtStream();
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
  public void test0584() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0584");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test0585() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0585");
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
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
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
  public void test0586() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0586");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0587() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0587");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    java.util.List<java.lang.String> strList8 = null;
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream16 = procedures0.cranekyStream(
          "", strList8, (java.util.List<java.lang.String>) strList12, "hi!", strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test0588() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0588");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream16 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test0589() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0589");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test0590() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0590");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(securityContext12);
  }

  @Test
  public void test0591() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0591");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    java.lang.String[] strArray10 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.util.List<java.lang.String> strList13 = null;
    java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream16 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList11, strList13, "", strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test0592() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0592");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test0593() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0593");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream17 = dbmsProcedures0.litfnStream();
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
  public void test0594() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0594");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    java.lang.Class<?> wildcardClass8 = procedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0595() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0595");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test0596() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0596");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0597() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0597");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test0598() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0598");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test0599() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0599");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
  }

  @Test
  public void test0600() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0600");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test0601() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0601");
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
  }

  @Test
  public void test0602() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0602");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0603() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0603");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream7 = dbmsProcedures0.litpodeStream();
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
  public void test0604() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0604");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream17 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
    org.junit.Assert.assertNull(securityContext16);
  }

  @Test
  public void test0605() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0605");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream5 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0606() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0606");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream11 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0607() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0607");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test0608() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0608");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream12 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test0609() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0609");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
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
  public void test0610() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0610");
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test0611() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0611");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.common.DependencyResolver dependencyResolver12 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test0612() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0612");
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
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test0613() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0613");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
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
  public void test0614() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0614");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 10);
    java.lang.Class<?> wildcardClass4 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0615() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0615");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream14 = dbmsProcedures0.upredtlStream();
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
  public void test0616() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0616");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (byte) 100);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
  }

  @Test
  public void test0617() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0617");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 0L, "hi!");
  }

  @Test
  public void test0618() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0618");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0619() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0619");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0620() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0620");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test0621() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0621");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test0622() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0622");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream6 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0623() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0623");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream5 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test0624() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0624");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test0625() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0625");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream5 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0626() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0626");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 100);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test0627() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0627");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 0L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test0628() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0628");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream11 = dbmsProcedures0.sceljsStream();
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
  public void test0629() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0629");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream14 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test0630() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0630");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream5 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test0631() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0631");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream6 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0632() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0632");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test0633() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0633");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    long long9 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
  }

  @Test
  public void test0634() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0634");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
  }

  @Test
  public void test0635() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0635");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream10 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0636() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0636");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test0637() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0637");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
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
  public void test0638() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0638");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test0639() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0639");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream14 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test0640() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0640");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) '#', "");
    java.lang.Class<?> wildcardClass5 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0641() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0641");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    java.lang.String[] strArray8 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.lang.String[] strArray13 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList14, "", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test0642() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0642");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream6 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test0643() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0643");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream8 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log7);
  }

  @Test
  public void test0644() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0644");
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
    java.lang.Class<?> wildcardClass11 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0645() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0645");
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
  public void test0646() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0646");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (byte) 0, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test0647() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0647");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream5 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0648() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0648");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test0649() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0649");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream14 = dbmsProcedures0.chcotStream();
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
  public void test0650() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0650");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test0651() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0651");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
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
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test0652() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0652");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(systemGraphComponents4);
  }

  @Test
  public void test0653() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0653");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream7 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test0654() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0654");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream15 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test0655() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0655");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream12 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test0656() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0656");
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
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test0657() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0657");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    long long9 = transactionResourceLockMeta4.rxId;
    long long10 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
  }

  @Test
  public void test0658() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0658");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
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
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test0659() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0659");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test0660() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0660");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test0661() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0661");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream10 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0662() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0662");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test0663() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0663");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test0664() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0664");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
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
  public void test0665() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0665");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0666() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0666");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 100, "");
  }

  @Test
  public void test0667() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0667");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream16 = dbmsProcedures0.litpodeStream();
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
  public void test0668() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0668");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList10, strArray9);
    java.util.List<java.lang.String> strList12 = null;
    java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream15 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList10, strList12, "", strMap14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test0669() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0669");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    java.lang.String[] strArray9 = new java.lang.String[]{""};
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
          "", (java.util.List<java.lang.String>) strList10,
          (java.util.List<java.lang.String>) strList14, "", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test0670() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0670");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream14 = dbmsProcedures0.scuacgsStream();
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
  public void test0671() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0671");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.shtw();
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
  public void test0672() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0672");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test0673() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0673");
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
    org.neo4j.graphdb.Transaction transaction17 = null;
    dbmsProcedures0.transaction = transaction17;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream22 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test0674() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0674");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test0675() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0675");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test0676() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0676");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test0677() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0677");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream16 = dbmsProcedures0.litfnStream();
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
  public void test0678() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0678");
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
      java.lang.Class<?> wildcardClass8 = graphDatabaseAPI7.getClass();
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
  public void test0679() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0679");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
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
  public void test0680() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0680");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream7 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0681() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0681");
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
    org.neo4j.logging.Log log14 = null;
    dbmsProcedures0.log = log14;
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
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test0682() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0682");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
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
  public void test0683() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0683");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test0684() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0684");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream4 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI3);
  }

  @Test
  public void test0685() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0685");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream7 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test0686() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0686");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream5 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test0687() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0687");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream13 = dbmsProcedures0.sceljsStream();
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
  public void test0688() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0688");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) 0, "hi!");
  }

  @Test
  public void test0689() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0689");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test0690() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0690");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", 1L);
  }

  @Test
  public void test0691() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0691");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0692() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0692");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream5 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test0693() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0693");
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
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!", "hi!"};
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
          "hi!", (java.util.List<java.lang.String>) strList15,
          (java.util.List<java.lang.String>) strList19, "", strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test0694() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0694");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream7 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0695() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0695");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    java.util.List<java.lang.String> strList9 = null;
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream16 = procedures0.cranekyStream(
          "", strList9, (java.util.List<java.lang.String>) strList12, "hi!", strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test0696() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0696");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream6 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0697() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0697");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test0698() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0698");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0699() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0699");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test0700() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0700");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test0701() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0701");
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
  public void test0702() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0702");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream5 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test0703() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0703");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    java.lang.Class<?> wildcardClass5 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(graphDatabaseAPI4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0704() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0704");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream13 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
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
  public void test0705() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0705");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test0706() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0706");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream11 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test0707() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0707");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream14 = dbmsProcedures0.sceljsStream();
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
  public void test0708() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0708");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream8 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test0709() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0709");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream12 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test0710() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0710");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0711() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0711");
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
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.lang.String[] strArray19 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
    boolean boolean21 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList20, strArray19);
    java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream24 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList15,
          (java.util.List<java.lang.String>) strList20, "hi!", strMap23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
  }

  @Test
  public void test0712() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0712");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test0713() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0713");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test0714() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0714");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test0715() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0715");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0716() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0716");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test0717() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0717");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream13 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test0718() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0718");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", 32L);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test0719() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0719");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver7 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
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
  public void test0720() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0720");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
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
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0721() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0721");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream4 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test0722() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0722");
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
    org.neo4j.graphdb.Transaction transaction14 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream15 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction13);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test0723() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0723");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream7 = dbmsProcedures0.litlcStream();
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
  public void test0724() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0724");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream7 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test0725() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0725");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream17 = dbmsProcedures0.upredtlStream();
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
  public void test0726() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0726");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test0727() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0727");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream5 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(systemGraphComponents2);
  }

  @Test
  public void test0728() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0728");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream11 = dbmsProcedures0.litlcStream();
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
  public void test0729() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0729");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream6 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test0730() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0730");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream2 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
  }

  @Test
  public void test0731() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0731");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test0732() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0732");
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
          "", (java.util.List<java.lang.String>) strList17,
          (java.util.List<java.lang.String>) strList21, "", strMap24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test0733() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0733");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream6 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test0734() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0734");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream13 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test0735() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0735");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (byte) -1);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
  }

  @Test
  public void test0736() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0736");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test0737() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0737");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream13 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0738() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0738");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0739() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0739");
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
    try {
      java.lang.Class<?> wildcardClass11 = systemGraphComponents10.getClass();
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
  public void test0740() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0740");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test0741() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0741");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    long long10 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
  }

  @Test
  public void test0742() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0742");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test0743() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0743");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test0744() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0744");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream4 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test0745() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0745");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test0746() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0746");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "");
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
  public void test0747() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0747");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) 100, "hi!");
  }

  @Test
  public void test0748() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0748");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream10 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0749() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0749");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0750() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0750");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    java.lang.String[] strArray8 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.lang.String[] strArray13 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList14, "", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test0751() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0751");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0752() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0752");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0753() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0753");
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
  }

  @Test
  public void test0754() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0754");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test0755() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0755");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
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
  public void test0756() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0756");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test0757() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0757");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream8 = dbmsProcedures0.updstdtStream();
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
  public void test0758() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0758");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    procedures0.kernelTransaction = kernelTransaction9;
    java.lang.String[] strArray13 = new java.lang.String[]{""};
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
          "hi!", (java.util.List<java.lang.String>) strList14,
          (java.util.List<java.lang.String>) strList18, "hi!", strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test0759() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0759");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream4 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test0760() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0760");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0761() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0761");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0762() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0762");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test0763() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0763");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream18 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
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
  public void test0764() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0764");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test0765() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0765");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0766() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0766");
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
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test0767() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0767");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream12 = dbmsProcedures0.litpodeStream();
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
  public void test0768() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0768");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0769() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0769");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 10);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    long long7 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
  }

  @Test
  public void test0770() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0770");
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
    java.lang.Class<?> wildcardClass13 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0771() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0771");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
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
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test0772() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0772");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
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
  }

  @Test
  public void test0773() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0773");
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test0774() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0774");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream10 = dbmsProcedures0.litlcStream();
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
  public void test0775() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0775");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test0776() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0776");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test0777() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0777");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0778() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0778");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0779() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0779");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream15 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(graphDatabaseAPI14);
  }

  @Test
  public void test0780() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0780");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test0781() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0781");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test0782() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0782");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) '#');
  }

  @Test
  public void test0783() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0783");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0784() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0784");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.Class<?> wildcardClass7 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0785() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0785");
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
      dbmsProcedures0.shtw();
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
  public void test0786() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0786");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream13 = dbmsProcedures0.litlcStream();
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
  public void test0787() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0787");
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
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test0788() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0788");
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
  }

  @Test
  public void test0789() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0789");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0790() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0790");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
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
  public void test0791() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0791");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) '4');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test0792() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0792");
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
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!"};
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
          "hi!", (java.util.List<java.lang.String>) strList15,
          (java.util.List<java.lang.String>) strList19, "hi!", strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test0793() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0793");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream13 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test0794() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0794");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream16 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test0795() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0795");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test0796() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0796");
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
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!"};
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
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test0797() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0797");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream9 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0798() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0798");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream7 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test0799() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0799");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test0800() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0800");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test0801() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0801");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream10 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test0802() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0802");
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
      dbmsProcedures0.secfvuForStSt("", "");
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
  public void test0803() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0803");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream10 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0804() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0804");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    try {
      java.lang.Class<?> wildcardClass4 = kernelTransaction3.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test0805() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0805");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream14 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test0806() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0806");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test0807() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0807");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream8 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(log4);
  }

  @Test
  public void test0808() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0808");
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
    org.junit.Assert.assertNull(systemGraphComponents16);
  }

  @Test
  public void test0809() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0809");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test0810() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0810");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test0811() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0811");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
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
  public void test0812() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0812");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream11 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test0813() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0813");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.String str11 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
  }

  @Test
  public void test0814() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0814");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream17 = dbmsProcedures0.chcotStream();
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
  public void test0815() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0815");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0816() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0816");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test0817() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0817");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream13 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test0818() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0818");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
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
  public void test0819() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0819");
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
    java.lang.String[] strArray12 = new java.lang.String[]{"", "hi!"};
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
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test0820() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0820");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test0821() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0821");
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
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
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
  public void test0822() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0822");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
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
  public void test0823() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0823");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream7 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test0824() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0824");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream7 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction4);
  }

  @Test
  public void test0825() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0825");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test0826() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0826");
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
  public void test0827() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0827");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream10 = dbmsProcedures0.litpodeStream();
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
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test0828() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0828");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test0829() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0829");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream5 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0830() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0830");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents12;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log15 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(procedureCallContext14);
    org.junit.Assert.assertNull(log15);
  }

  @Test
  public void test0831() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0831");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
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
  public void test0832() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0832");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (-1));
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    long long6 = currentResourceLockMeta3.resourceId;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    java.lang.Class<?> wildcardClass8 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0833() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0833");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    java.lang.Class<?> wildcardClass10 = procedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0834() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0834");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
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
  public void test0835() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0835");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (-1));
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.Class<?> wildcardClass6 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0836() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0836");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver17 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(kernelTransaction16);
    org.junit.Assert.assertNull(dependencyResolver17);
  }

  @Test
  public void test0837() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0837");
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
    java.lang.String str12 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
  }

  @Test
  public void test0838() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0838");
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
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test0839() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0839");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test0840() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0840");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
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
  }

  @Test
  public void test0841() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0841");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream19 = dbmsProcedures0.scufajrnStream();
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
  public void test0842() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0842");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0843() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0843");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream8 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(systemGraphComponents4);
  }

  @Test
  public void test0844() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0844");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0845() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0845");
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
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test0846() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0846");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test0847() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0847");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0848() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0848");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 0L, "hi!");
    java.lang.Class<?> wildcardClass5 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0849() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0849");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test0850() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0850");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream5 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0851() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0851");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test0852() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0852");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream13 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test0853() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0853");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream18 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test0854() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0854");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream6 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test0855() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0855");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test0856() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0856");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream3 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0857() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0857");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test0858() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0858");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (byte) 1, "hi!");
  }

  @Test
  public void test0859() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0859");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test0860() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0860");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver11;
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
  public void test0861() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0861");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
  }

  @Test
  public void test0862() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0862");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test0863() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0863");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream17 = dbmsProcedures0.scuacgsStream();
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
  public void test0864() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0864");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 52L, "");
    java.lang.Class<?> wildcardClass5 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0865() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0865");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test0866() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0866");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (byte) 1, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test0867() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0867");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext19 = null;
    dbmsProcedures0.securityContext = securityContext19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test0868() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0868");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream13 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test0869() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0869");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream19 = dbmsProcedures0.scufajrnStream();
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
  public void test0870() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0870");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
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
  public void test0871() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0871");
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
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test0872() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0872");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream7 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test0873() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0873");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream17 = dbmsProcedures0.sceljsStream();
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
  public void test0874() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0874");
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
    org.neo4j.graphdb.Transaction transaction19 = null;
    dbmsProcedures0.transaction = transaction19;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
  }

  @Test
  public void test0875() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0875");
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
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(securityContext18);
    org.junit.Assert.assertNull(kernelTransaction19);
  }

  @Test
  public void test0876() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0876");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 10L, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test0877() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0877");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0878() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0878");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test0879() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0879");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test0880() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0880");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.lang.String[] strArray13 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList14, strArray13);
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList14, "", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test0881() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0881");
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
  public void test0882() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0882");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test0883() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0883");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 1, "hi!");
    java.lang.Class<?> wildcardClass5 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0884() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0884");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
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
  public void test0885() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0885");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream20 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(securityContext18);
    org.junit.Assert.assertNull(kernelTransaction19);
  }

  @Test
  public void test0886() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0886");
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
  public void test0887() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0887");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) (byte) -1, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.Class<?> wildcardClass6 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0888() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0888");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream4 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test0889() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0889");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0890() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0890");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream13 = dbmsProcedures0.litfnStream();
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
  public void test0891() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0891");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    try {
      java.lang.Class<?> wildcardClass10 = dependencyResolver9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test0892() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0892");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents5;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0893() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0893");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test0894() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0894");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log7 = null;
    dbmsProcedures0.log = log7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test0895() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0895");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream6 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0896() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0896");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
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
  }

  @Test
  public void test0897() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0897");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
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
  public void test0898() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0898");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(log10);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test0899() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0899");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test0900() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0900");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI14 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream15 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(graphDatabaseAPI14);
  }

  @Test
  public void test0901() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0901");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream10 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test0902() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0902");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream12 = dbmsProcedures0.litpodeStream();
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
  public void test0903() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0903");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction14;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test0904() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0904");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) 100);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test0905() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0905");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test0906() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0906");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test0907() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0907");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test0908() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0908");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream5 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0909() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0909");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.logging.Log log8 = null;
    dbmsProcedures0.log = log8;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext10 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext10);
  }

  @Test
  public void test0910() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0910");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test0911() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0911");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream10 = dbmsProcedures0.limepStream();
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
  public void test0912() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0912");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
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
  public void test0913() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0913");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.lang.String[] strArray16 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList17, strArray16);
    java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream21 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList12,
          (java.util.List<java.lang.String>) strList17, "", strMap20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test0914() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0914");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) '#', "hi!");
  }

  @Test
  public void test0915() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0915");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream18 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(systemGraphComponents16);
  }

  @Test
  public void test0916() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0916");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test0917() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0917");
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
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test0918() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0918");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0919() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0919");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream7 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0920() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0920");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
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
  public void test0921() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0921");
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
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
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
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test0922() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0922");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream9 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0923() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0923");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test0924() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0924");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream4 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0925() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0925");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    java.lang.String[] strArray9 = new java.lang.String[]{"", ""};
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
          "", (java.util.List<java.lang.String>) strList10,
          (java.util.List<java.lang.String>) strList14, "", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test0926() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0926");
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
    org.neo4j.logging.Log log9 = null;
    dbmsProcedures0.log = log9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream11 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test0927() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0927");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
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
  public void test0928() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0928");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test0929() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0929");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream12 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test0930() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0930");
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
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test0931() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0931");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test0932() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0932");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream7 = dbmsProcedures0.litlcStream();
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
  public void test0933() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0933");
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
    java.lang.Class<?> wildcardClass10 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0934() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0934");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test0935() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0935");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test0936() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0936");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test0937() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0937");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0938() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0938");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test0939() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0939");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
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
  }

  @Test
  public void test0940() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0940");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 10L, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass6 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0941() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0941");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream17 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test0942() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0942");
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
    java.lang.String[] strArray11 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.lang.String[] strArray16 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList17, strArray16);
    java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream21 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList12,
          (java.util.List<java.lang.String>) strList17, "", strMap20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test0943() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0943");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream5 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0944() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0944");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList9, strArray8);
    java.lang.String[] strArray12 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream17 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList13, "", strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test0945() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0945");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (-1), "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    long long6 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
  }

  @Test
  public void test0946() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0946");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test0947() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0947");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test0948() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0948");
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
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!", "hi!"};
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
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test0949() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0949");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0950() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0950");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream14 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0951() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0951");
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
      dbmsProcedures0.shtw();
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
  public void test0952() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0952");
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
    org.neo4j.graphdb.Transaction transaction17 = null;
    dbmsProcedures0.transaction = transaction17;
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
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test0953() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0953");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream9 = dbmsProcedures0.scuacgsStream();
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
  public void test0954() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0954");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction9;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test0955() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0955");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test0956() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0956");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    java.lang.Class<?> wildcardClass6 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0957() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0957");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test0958() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0958");
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
  }

  @Test
  public void test0959() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0959");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
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
    org.junit.Assert.assertNull(procedureCallContext9);
  }

  @Test
  public void test0960() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0960");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents8 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test0961() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0961");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
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
  public void test0962() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0962");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test0963() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0963");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test0964() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0964");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0965() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0965");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext15 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log12);
  }

  @Test
  public void test0966() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0966");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0967() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0967");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test0968() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0968");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test0969() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0969");
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
  }

  @Test
  public void test0970() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0970");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test0971() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0971");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream7 = dbmsProcedures0.updstdtStream();
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
  public void test0972() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0972");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream5 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test0973() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0973");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test0974() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0974");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0975() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0975");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
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
  public void test0976() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0976");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream7 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test0977() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0977");
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
  public void test0978() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0978");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test0979() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0979");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream18 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test0980() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0980");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext9 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream14 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test0981() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0981");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test0982() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0982");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream14 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test0983() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0983");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream9 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test0984() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0984");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) 10, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test0985() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0985");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test0986() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0986");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    procedures0.dependencyResolver = dependencyResolver2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    procedures0.kernelTransaction = kernelTransaction8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = procedures0.kernelTransaction;
    java.lang.String[] strArray14 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.lang.String[] strArray19 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
    boolean boolean21 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList20, strArray19);
    java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream24 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList15,
          (java.util.List<java.lang.String>) strList20, "hi!", strMap23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
  }

  @Test
  public void test0987() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0987");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (byte) 10, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test0988() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0988");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (short) 100, "");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
  }

  @Test
  public void test0989() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0989");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
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
  public void test0990() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0990");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test0991() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0991");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) ' ', "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
  }

  @Test
  public void test0992() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0992");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream16 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(systemGraphComponents14);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test0993() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0993");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream15 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver13);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test0994() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0994");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test0995() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0995");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test0996() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0996");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0997() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0997");
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
    java.lang.Class<?> wildcardClass19 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0998() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0998");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test0999() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0999");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
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
  public void test1000() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test1000");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }
}

