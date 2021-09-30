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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test1002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1002");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test1003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1003");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream8 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test1004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1004");
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
    java.lang.Class<?> wildcardClass12 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test1005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1005");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test1006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1006");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
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
  public void test1007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1007");
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
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
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
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test1008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1008");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver8);
  }

  @Test
  public void test1009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1009");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = null;
    dbmsProcedures0.securityContext = securityContext13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1010");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
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
  public void test1011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1011");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream13 = dbmsProcedures0.updstdtStream();
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
  public void test1012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1012");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test1013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1013");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test1014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1014");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream11 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test1015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1015");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test1016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1016");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test1017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1017");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream6 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test1018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1018");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test1019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1019");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test1020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1020");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (-1));
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test1021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1021");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test1022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1022");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream14 = dbmsProcedures0.updstdtStream();
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
  public void test1023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1023");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream9 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1024");
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
    org.neo4j.graphdb.Transaction transaction10 = dbmsProcedures0.transaction;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test1025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1025");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1026");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1027");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", 100L);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test1028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1028");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1029");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(kernelTransaction9);
  }

  @Test
  public void test1030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1030");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction11);
    org.junit.Assert.assertNull(securityContext12);
  }

  @Test
  public void test1031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1031");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
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
  public void test1032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1032");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(systemGraphComponents6);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test1033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1033");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    java.lang.String[] strArray10 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.lang.String[] strArray15 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList11,
          (java.util.List<java.lang.String>) strList16, "hi!", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test1034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1034");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test1035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1035");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) '4');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    long long6 = currentResourceLockMeta3.resourceId;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.Class<?> wildcardClass8 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1036");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI12 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI12;
    org.neo4j.common.DependencyResolver dependencyResolver14 = dbmsProcedures0.dependencyResolver;
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
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(dependencyResolver14);
  }

  @Test
  public void test1037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1037");
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
      dbmsProcedures0.shtw();
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
  public void test1038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1038");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    java.lang.Class<?> wildcardClass8 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1039");
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
  public void test1040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1040");
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
  public void test1041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1041");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test1042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1042");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream14 = dbmsProcedures0.updstdtStream();
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
  public void test1043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1043");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    long long9 = currentResourceLockMeta3.resourceId;
    java.lang.String str10 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test1044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1044");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
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
  public void test1045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1045");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream7 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1046");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
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
  public void test1047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1047");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test1048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1048");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test1049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1049");
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
    org.neo4j.common.DependencyResolver dependencyResolver9 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI10 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test1050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1050");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
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
  public void test1051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1051");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream6 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1052");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    java.lang.String[] strArray6 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList7, strArray6);
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList12, strArray11);
    java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream16 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList7,
          (java.util.List<java.lang.String>) strList12, "hi!", strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test1053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1053");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test1054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1054");
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
    org.neo4j.logging.Log log17 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(log17);
  }

  @Test
  public void test1055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1055");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
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
  public void test1056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1056");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
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
  public void test1057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1057");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream7 = dbmsProcedures0.scufajrnStream();
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
  public void test1058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1058");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
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
  public void test1059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1059");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
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
  public void test1060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1060");
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
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
  }

  @Test
  public void test1061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1061");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream12 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1062");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test1063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1063");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.graphdb.Transaction transaction7 = null;
    dbmsProcedures0.transaction = transaction7;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver9;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
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
  public void test1064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1064");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream13 = dbmsProcedures0.limepStream();
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
  public void test1065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1065");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext13 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream14 = dbmsProcedures0.sceljsStream();
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
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test1066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1066");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log7 = dbmsProcedures0.log;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
    org.junit.Assert.assertNull(log7);
  }

  @Test
  public void test1067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1067");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test1068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1068");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream8 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1069");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents14 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test1070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1070");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
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
  public void test1071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1071");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
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
  public void test1072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1072");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream15 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test1073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1073");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream7 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test1074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1074");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1075");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
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
  public void test1076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1076");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test1077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1077");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test1078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1078");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1079");
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
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!"};
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
          "", (java.util.List<java.lang.String>) strList12,
          (java.util.List<java.lang.String>) strList17, "hi!", strMap20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test1080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1080");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream9 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test1081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1081");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream7 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test1082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1082");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream14 = dbmsProcedures0.limepStream();
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
  public void test1083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1083");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream9 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test1084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1084");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test1085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1085");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test1086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1086");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream19 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(graphDatabaseAPI12);
    org.junit.Assert.assertNull(graphDatabaseAPI17);
  }

  @Test
  public void test1087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1087");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(securityContext8);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test1088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1088");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver10;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test1089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1089");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 10L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass7 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1090");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
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
  public void test1091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1091");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 0);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test1092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1092");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(securityContext18);
  }

  @Test
  public void test1093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1093");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream9 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test1094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1094");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test1095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1095");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream9 = dbmsProcedures0.litfnStream();
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
  public void test1096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1096");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    java.lang.Class<?> wildcardClass4 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1097");
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
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test1098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1098");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test1099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1099");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
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
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test1100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1100");
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
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test1101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1101");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test1102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1102");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream5 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(systemGraphComponents4);
  }

  @Test
  public void test1103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1103");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream7 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1104");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents16 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction15);
    org.junit.Assert.assertNull(systemGraphComponents16);
  }

  @Test
  public void test1105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1105");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test1106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1106");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream13 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1107");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream12 = dbmsProcedures0.scuacgsStream();
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
  public void test1108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1108");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", 52L, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test1109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1109");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream14 = dbmsProcedures0.litlcStream();
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
  public void test1110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1110");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test1111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1111");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    procedures0.kernelTransaction = kernelTransaction1;
    java.lang.String[] strArray5 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList6, strArray5);
    java.lang.String[] strArray10 = new java.lang.String[]{"hi!", ""};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream15 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList6,
          (java.util.List<java.lang.String>) strList11, "", strMap14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test1112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1112");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction13);
  }

  @Test
  public void test1113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1113");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream8 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext6);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test1114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1114");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (byte) 1);
    java.lang.String str4 = currentResourceLockMeta3.resourceType;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test1115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1115");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
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
  public void test1116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1116");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream7 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test1117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1117");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) 1);
  }

  @Test
  public void test1118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1118");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream3 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1119");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
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
  public void test1120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1120");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream15 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1121");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
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
  public void test1122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1122");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (short) -1, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test1123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1123");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream5 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1124");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream13 = dbmsProcedures0.litlcStream();
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
  public void test1125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1125");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test1126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1126");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream7 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test1127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1127");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test1128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1128");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1129");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
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
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test1130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1130");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test1131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1131");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    procedures0.kernelTransaction = kernelTransaction14;
    java.lang.String[] strArray18 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList19, strArray18);
    java.lang.String[] strArray22 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
    boolean boolean24 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList23, strArray22);
    java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream27 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList19,
          (java.util.List<java.lang.String>) strList23, "", strMap26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction12);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
  }

  @Test
  public void test1132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1132");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream21 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test1133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1133");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream11 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1134");
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
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test1135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1135");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver12;
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test1136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1136");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test1137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1137");
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
    java.lang.Class<?> wildcardClass11 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1138");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test1139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1139");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 10L, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test1140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1140");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    procedures0.dependencyResolver = dependencyResolver8;
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test1141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1141");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream14 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test1142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1142");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1143");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 100L, "");
  }

  @Test
  public void test1144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1144");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream16 = dbmsProcedures0.limepStream();
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
  public void test1145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1145");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream15 = dbmsProcedures0.limepStream();
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
  public void test1146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1146");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (byte) 1);
    java.lang.Class<?> wildcardClass4 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1147");
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
      java.lang.Class<?> wildcardClass10 = graphDatabaseAPI9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test1148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1148");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test1149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1149");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream15 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1150");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
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
  public void test1151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1151");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver13;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test1152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1152");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = null;
    dbmsProcedures0.securityContext = securityContext10;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test1153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1153");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream13 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1154");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    procedures0.dependencyResolver = dependencyResolver11;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test1155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1155");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream13 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1156");
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
    try {
      java.lang.Class<?> wildcardClass10 = securityContext9.getClass();
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
  public void test1157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1157");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test1158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1158");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", 32L);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test1159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1159");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream10 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test1160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1160");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream7 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test1161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1161");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1162");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
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
  public void test1163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1163");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext16 = null;
    dbmsProcedures0.securityContext = securityContext16;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test1164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1164");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream15 = dbmsProcedures0.sceljsStream();
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
    org.junit.Assert.assertNull(procedureCallContext13);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test1165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1165");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
  }

  @Test
  public void test1166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1166");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents7 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test1167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1167");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "hi!", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test1168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1168");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream7 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1169");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream10 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test1170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1170");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (-1), "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.Class<?> wildcardClass6 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test1171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1171");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test1172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1172");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream12 = dbmsProcedures0.chcotStream();
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
  public void test1173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1173");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(log10);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test1174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1174");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction11);
  }

  @Test
  public void test1175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1175");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI5;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
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
  public void test1176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1176");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test1177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1177");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log8 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test1178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1178");
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
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test1179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1179");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test1180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1180");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream14 = dbmsProcedures0.limepStream();
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
  public void test1181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1181");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream20 = dbmsProcedures0.chcotStream();
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
  public void test1182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1182");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
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
  public void test1183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1183");
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
    org.neo4j.logging.Log log10 = null;
    dbmsProcedures0.log = log10;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test1184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1184");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test1185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1185");
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
    org.neo4j.graphdb.Transaction transaction17 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(log14);
    org.junit.Assert.assertNull(transaction17);
  }

  @Test
  public void test1186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1186");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (byte) 100);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.mode;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    long long7 = currentResourceLockMeta3.resourceId;
    java.lang.String str8 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test1187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1187");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction4 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction5 = null;
    dbmsProcedures0.transaction = transaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
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
  public void test1188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1188");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
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
  public void test1189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1189");
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
    java.lang.String[] strArray16 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList17, strArray16);
    java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream21 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList13,
          (java.util.List<java.lang.String>) strList17, "hi!", strMap20);
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
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test1190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1190");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log4 = dbmsProcedures0.log;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test1191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1191");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 'a', "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test1192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1192");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream16 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1193");
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
    org.neo4j.logging.Log log12 = dbmsProcedures0.log;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(log12);
  }

  @Test
  public void test1194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1194");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream7 = dbmsProcedures0.scuacgsStream();
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
  public void test1195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1195");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream16 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test1196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1196");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test1197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1197");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    procedures0.dependencyResolver = dependencyResolver10;
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
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test1198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1198");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    procedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    procedures0.dependencyResolver = dependencyResolver9;
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test1199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1199");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream13 = dbmsProcedures0.litpodeStream();
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
  public void test1200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1200");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (short) 100);
  }

  @Test
  public void test1201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1201");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
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
  public void test1202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1202");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (short) 0);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test1203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1203");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream13 = dbmsProcedures0.sceljsStream();
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
  public void test1204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1204");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    procedures0.dependencyResolver = dependencyResolver7;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test1205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1205");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test1206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1206");
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
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test1207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1207");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream14 = dbmsProcedures0.scuacgsStream();
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
  public void test1208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1208");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream5 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test1209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1209");
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
  }

  @Test
  public void test1210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1210");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream11 = dbmsProcedures0.limepStream();
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
  public void test1211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1211");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (-1L), "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test1212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1212");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) (-1), "");
  }

  @Test
  public void test1213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1213");
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
  public void test1214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1214");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream9 = dbmsProcedures0.sceljsStream();
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
  public void test1215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1215");
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
    org.neo4j.graphdb.Transaction transaction17 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext18 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(securityContext14);
    org.junit.Assert.assertNull(transaction17);
    org.junit.Assert.assertNull(procedureCallContext18);
  }

  @Test
  public void test1216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1216");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test1217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1217");
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
    org.neo4j.graphdb.Transaction transaction14 = null;
    dbmsProcedures0.transaction = transaction14;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream16 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test1218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1218");
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
    try {
      dbmsProcedures0.secfvuForStSt("", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1219");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream5 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1220");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test1221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1221");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1222");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(procedureCallContext5);
    org.junit.Assert.assertNull(transaction6);
  }

  @Test
  public void test1223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1223");
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
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test1224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1224");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream15 = dbmsProcedures0.scupregpStream(
          "", "", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(procedureCallContext10);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test1225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1225");
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
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test1226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1226");
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
    java.util.List<java.lang.String> strList14 = null;
    java.lang.String[] strArray17 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream22 = procedures0.cranekyStream(
          "hi!", strList14, (java.util.List<java.lang.String>) strList18, "hi!", strMap21);
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
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test1227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1227");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    java.lang.String str11 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
  }

  @Test
  public void test1228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1228");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
  }

  @Test
  public void test1229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1229");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1230");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
  }

  @Test
  public void test1231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1231");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    java.lang.String[] strArray10 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.lang.String[] strArray15 = new java.lang.String[]{"", ""};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList11,
          (java.util.List<java.lang.String>) strList16, "hi!", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(dependencyResolver7);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test1232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1232");
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
  public void test1233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1233");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test1234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1234");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver14 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(dependencyResolver14);
  }

  @Test
  public void test1235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1235");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream17 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(procedureCallContext15);
    org.junit.Assert.assertNull(procedureCallContext16);
  }

  @Test
  public void test1236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1236");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
  }

  @Test
  public void test1237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1237");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.logging.Log log4 = null;
    dbmsProcedures0.log = log4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    java.lang.Class<?> wildcardClass8 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1238");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream7 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
  }

  @Test
  public void test1239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1239");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test1240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1240");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI11 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
  }

  @Test
  public void test1241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1241");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNull(securityContext10);
  }

  @Test
  public void test1242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1242");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream13 = dbmsProcedures0.upredtlStream();
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
  public void test1243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1243");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", 97L);
    long long4 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
  }

  @Test
  public void test1244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1244");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.logging.Log log2 = null;
    dbmsProcedures0.log = log2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream4 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
  }

  @Test
  public void test1245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1245");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (short) -1, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test1246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1246");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test1247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1247");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1248");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.graphdb.Transaction transaction8 = null;
    dbmsProcedures0.transaction = transaction8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream10 = dbmsProcedures0.litlcStream();
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
  public void test1249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1249");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream15 = dbmsProcedures0.chcotStream();
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
  public void test1250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1250");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream11 = dbmsProcedures0.scuacgsStream();
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
  public void test1251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1251");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI8);
  }

  @Test
  public void test1252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1252");
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
    org.neo4j.graphdb.Transaction transaction9 = dbmsProcedures0.transaction;
    org.junit.Assert.assertNull(transaction9);
  }

  @Test
  public void test1253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1253");
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
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test1254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1254");
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
      dbmsProcedures0.secfvuForStSt("", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test1255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1255");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream14 = dbmsProcedures0.litfnStream();
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
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test1256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1256");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test1257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1257");
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
  public void test1258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1258");
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
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver14;
    java.lang.Class<?> wildcardClass16 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test1259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1259");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.graphdb.Transaction transaction6 = null;
    dbmsProcedures0.transaction = transaction6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
  }

  @Test
  public void test1260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1260");
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
    org.junit.Assert.assertNull(dependencyResolver9);
  }

  @Test
  public void test1261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1261");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI1 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(graphDatabaseAPI1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test1262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1262");
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
    java.lang.Class<?> wildcardClass12 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test1263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1263");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) (short) -1, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    long long8 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
  }

  @Test
  public void test1264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1264");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream11 = dbmsProcedures0.scupregpStream(
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
  public void test1265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1265");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", (long) 10, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test1266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1266");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(kernelTransaction8);
  }

  @Test
  public void test1267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1267");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
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
  public void test1268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1268");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
  }

  @Test
  public void test1269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1269");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test1270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1270");
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
  }

  @Test
  public void test1271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1271");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
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
  public void test1272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1272");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream15 = dbmsProcedures0.sceljsStream();
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
  public void test1273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1273");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream8 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(log6);
  }

  @Test
  public void test1274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1274");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream10 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1275");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream8 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test1276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1276");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
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
  public void test1277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1277");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream14 = dbmsProcedures0.litlcStream();
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
  public void test1278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1278");
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
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test1279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1279");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = procedures0.dependencyResolver;
    java.lang.String[] strArray10 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.lang.String[] strArray15 = new java.lang.String[]{"", "hi!"};
    java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList16, strArray15);
    java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream20 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList11,
          (java.util.List<java.lang.String>) strList16, "", strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test1280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1280");
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
    java.lang.String[] strArray14 = new java.lang.String[]{""};
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
          "", (java.util.List<java.lang.String>) strList15,
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
  public void test1281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1281");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(dependencyResolver10);
    org.junit.Assert.assertNull(kernelTransaction11);
    org.junit.Assert.assertNull(dependencyResolver12);
  }

  @Test
  public void test1282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1282");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream14 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction13);
  }

  @Test
  public void test1283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1283");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream7 = dbmsProcedures0.limepStream();
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
  public void test1284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1284");
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
  public void test1285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1285");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream10 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test1286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1286");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream10 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test1287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1287");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream11 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1288");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream11 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test1289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1289");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test1290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1290");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream7 = dbmsProcedures0.upredtlStream();
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
  public void test1291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1291");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream20 = dbmsProcedures0.scupregpStream(
          "", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1292");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream17 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
    org.junit.Assert.assertNull(procedureCallContext15);
  }

  @Test
  public void test1293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1293");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream9 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1294");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext13 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(procedureCallContext12);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test1295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1295");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "", (long) (short) -1);
  }

  @Test
  public void test1296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1296");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext7;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(securityContext6);
  }

  @Test
  public void test1297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1297");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream15 = dbmsProcedures0.updstdtStream();
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
  public void test1298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1298");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    procedures0.kernelTransaction = kernelTransaction5;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test1299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1299");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream15 = dbmsProcedures0.scuacgsStream();
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
  public void test1300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1300");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream5 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1301");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
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
  public void test1302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1302");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    procedures0.kernelTransaction = kernelTransaction10;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test1303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1303");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream17 = dbmsProcedures0.chcotStream();
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
  public void test1304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1304");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction12);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test1305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1305");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream4 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test1306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1306");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test1307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1307");
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
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1308");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext14 = dbmsProcedures0.procedureCallContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(procedureCallContext14);
  }

  @Test
  public void test1309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1309");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 1, "");
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
  public void test1310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1310");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream11 = dbmsProcedures0.litlcStream();
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
  }

  @Test
  public void test1311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1311");
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
      java.lang.Class<?> wildcardClass14 = dependencyResolver13.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test1312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1312");
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
    org.neo4j.common.DependencyResolver dependencyResolver13 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream14 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(dependencyResolver13);
  }

  @Test
  public void test1313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1313");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = dbmsProcedures0.kernelTransaction;
    try {
      java.lang.Class<?> wildcardClass16 = kernelTransaction15.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(systemGraphComponents10);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test1314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1314");
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
    org.neo4j.graphdb.Transaction transaction11 = null;
    dbmsProcedures0.transaction = transaction11;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents13 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream14 = dbmsProcedures0.limepStream();
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
    org.junit.Assert.assertNull(systemGraphComponents13);
  }

  @Test
  public void test1315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1315");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.transIdx;
    java.lang.String str11 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
  }

  @Test
  public void test1316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1316");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 0L, "");
  }

  @Test
  public void test1317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1317");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction5;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    try {
      dbmsProcedures0.secfvuForStSt("", "");
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
  public void test1318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1318");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream17 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1319");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test1320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1320");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream6 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
  }

  @Test
  public void test1321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1321");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test1322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1322");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    procedures0.kernelTransaction = kernelTransaction12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver15 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(kernelTransaction14);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test1323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1323");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream15 = dbmsProcedures0.scufajrnStream();
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
  public void test1324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1324");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream12 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents11);
  }

  @Test
  public void test1325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1325");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
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
    org.junit.Assert.assertNull(graphDatabaseAPI4);
    org.junit.Assert.assertNull(kernelTransaction5);
  }

  @Test
  public void test1326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1326");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test1327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1327");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents2 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents3;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1328");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
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
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test1329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1329");
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
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream10 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test1330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1330");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 1L, "hi!");
  }

  @Test
  public void test1331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1331");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(transaction10);
  }

  @Test
  public void test1332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1332");
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
    java.lang.String[] strArray16 = new java.lang.String[]{"", "hi!"};
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
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(dependencyResolver12);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test1333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1333");
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
    org.neo4j.logging.Log log13 = dbmsProcedures0.log;
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
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test1334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1334");
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
    org.neo4j.graphdb.Transaction transaction15 = null;
    dbmsProcedures0.transaction = transaction15;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNull(transaction14);
  }

  @Test
  public void test1335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1335");
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
  public void test1336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1336");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test1337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1337");
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
      dbmsProcedures0.secfvuForStSt("", "");
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
  public void test1338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1338");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNull(systemGraphComponents4);
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1339");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
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
  public void test1340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1340");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    long long6 = currentResourceLockMeta3.resourceId;
    long long7 = currentResourceLockMeta3.resourceId;
    long long8 = currentResourceLockMeta3.resourceId;
    long long9 = currentResourceLockMeta3.resourceId;
    java.lang.String str10 = currentResourceLockMeta3.resourceType;
    long long11 = currentResourceLockMeta3.resourceId;
    long long12 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
  }

  @Test
  public void test1341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1341");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
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
  public void test1342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1342");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
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
  public void test1343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1343");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = dbmsProcedures0.kernelTransaction;
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
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test1344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1344");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream21 = dbmsProcedures0.upredtlStream();
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
  public void test1345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1345");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    procedures0.kernelTransaction = kernelTransaction6;
    java.lang.String[] strArray10 = new java.lang.String[]{""};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    java.lang.String[] strArray14 = new java.lang.String[]{""};
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
  public void test1346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1346");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    java.lang.Class<?> wildcardClass8 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1347");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(procedureCallContext4);
  }

  @Test
  public void test1348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1348");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI6;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = null;
    dbmsProcedures0.securityContext = securityContext8;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream10 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
  }

  @Test
  public void test1349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1349");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test1350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1350");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream12 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test1351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1351");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    java.lang.Class<?> wildcardClass6 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(log3);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test1352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1352");
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
  }

  @Test
  public void test1353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1353");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    java.lang.String str10 = transactionResourceLockMeta4.rtName;
    long long11 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
  }

  @Test
  public void test1354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1354");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 10, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
  }

  @Test
  public void test1355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1355");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver5 = dbmsProcedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test1356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1356");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(securityContext14);
    org.junit.Assert.assertNull(kernelTransaction15);
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test1357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1357");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI5 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(graphDatabaseAPI5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test1358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1358");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream10 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test1359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1359");
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
    org.neo4j.graphdb.Transaction transaction11 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream12 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction11);
  }

  @Test
  public void test1360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1360");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext2 = dbmsProcedures0.procedureCallContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test1361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1361");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream11 = dbmsProcedures0.litlcStream();
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
  public void test1362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1362");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext1;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext7 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream8 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test1363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1363");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream7 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test1364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1364");
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
    org.neo4j.common.DependencyResolver dependencyResolver10 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test1365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1365");
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
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    procedures0.dependencyResolver = dependencyResolver12;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = procedures0.kernelTransaction;
    org.junit.Assert.assertNull(dependencyResolver3);
    org.junit.Assert.assertNull(kernelTransaction14);
  }

  @Test
  public void test1366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1366");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext4 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext4;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext6;
    org.neo4j.graphdb.Transaction transaction8 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(transaction8);
  }

  @Test
  public void test1367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1367");
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
  public void test1368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1368");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream17 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1369");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
  }

  @Test
  public void test1370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1370");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI3 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver6 = dbmsProcedures0.dependencyResolver;
    try {
      dbmsProcedures0.secfvuForStSt("hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(dependencyResolver6);
  }

  @Test
  public void test1371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1371");
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
      dbmsProcedures0.shtw();
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
  public void test1372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1372");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
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
  public void test1373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1373");
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
    org.neo4j.common.DependencyResolver dependencyResolver11 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(dependencyResolver11);
  }

  @Test
  public void test1374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1374");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.graphdb.Transaction transaction1 = null;
    dbmsProcedures0.transaction = transaction1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    try {
      dbmsProcedures0.shtw();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1375");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream7 = dbmsProcedures0.limepStream();
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
  public void test1376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1376");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream16 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction15);
  }

  @Test
  public void test1377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1377");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents6 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream10 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(systemGraphComponents6);
  }

  @Test
  public void test1378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1378");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream12 = dbmsProcedures0.updstdtStream();
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
  public void test1379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1379");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream13 = dbmsProcedures0.litfnStream();
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
  }

  @Test
  public void test1380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1380");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(systemGraphComponents2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(log8);
  }

  @Test
  public void test1381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1381");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
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
  public void test1382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1382");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
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
  public void test1383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1383");
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
    try {
      java.lang.Class<?> wildcardClass15 = systemGraphComponents14.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test1384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1384");
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
      dbmsProcedures0.shtw();
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
  public void test1385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1385");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    long long7 = transactionResourceLockMeta4.rxId;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test1386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1386");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI7 = dbmsProcedures0.graphDatabaseAPI;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext8 = dbmsProcedures0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream9 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(securityContext8);
  }

  @Test
  public void test1387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1387");
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
    java.lang.String[] strArray14 = new java.lang.String[]{"", ""};
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
          "", (java.util.List<java.lang.String>) strList15,
          (java.util.List<java.lang.String>) strList20, "", strMap23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
  }

  @Test
  public void test1388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1388");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = dbmsProcedures0.kernelTransaction;
    try {
      java.lang.Class<?> wildcardClass17 = kernelTransaction16.getClass();
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
    org.junit.Assert.assertNull(kernelTransaction16);
  }

  @Test
  public void test1389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1389");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(transaction10);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }

  @Test
  public void test1390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1390");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction10;
    org.junit.Assert.assertNull(graphDatabaseAPI9);
  }

  @Test
  public void test1391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1391");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 10L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test1392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1392");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = procedures0.dependencyResolver;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test1393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1393");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream11 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext7);
  }

  @Test
  public void test1394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1394");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream10 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
  }

  @Test
  public void test1395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1395");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream11 = dbmsProcedures0.upredtlStream();
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
  public void test1396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1396");
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
    java.lang.Class<?> wildcardClass14 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test1397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1397");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "hi!", (long) (short) 0);
  }

  @Test
  public void test1398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1398");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream14 = dbmsProcedures0.chcotStream();
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
  public void test1399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1399");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 10L, "");
    java.lang.Class<?> wildcardClass5 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1400");
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
    java.lang.Class<?> wildcardClass9 = procedures0.getClass();
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver4);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1401");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.logging.Log log6 = null;
    dbmsProcedures0.log = log6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream8 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(log5);
  }

  @Test
  public void test1402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1402");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "", (long) (short) 0, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test1403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1403");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) ' ', "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.rtName;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test1404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1404");
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
  public void test1405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1405");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream7 = dbmsProcedures0.upredtlStream();
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
  public void test1406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1406");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test1407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1407");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents5 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver6;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext8 = dbmsProcedures0.procedureCallContext;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(procedureCallContext8);
  }

  @Test
  public void test1408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1408");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.logging.Log log3 = null;
    dbmsProcedures0.log = log3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream5 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test1409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1409");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext6 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver7 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver7;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1410");
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
    org.neo4j.logging.Log log11 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext12 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext12;
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
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNull(securityContext10);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test1411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1411");
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
    java.lang.Class<?> wildcardClass14 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext7);
    org.junit.Assert.assertNull(graphDatabaseAPI10);
    org.junit.Assert.assertNull(dependencyResolver11);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test1412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1412");
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
      dbmsProcedures0.shtw();
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
  public void test1413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1413");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
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
  public void test1414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1414");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    procedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver8 = procedures0.dependencyResolver;
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList13, strArray12);
    java.util.List<java.lang.String> strList15 = null;
    java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream18 = procedures0.cranekyStream(
          "hi!", (java.util.List<java.lang.String>) strList13, strList15, "", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNull(dependencyResolver8);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test1415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1415");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream9 = dbmsProcedures0.updstdtStream();
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
  public void test1416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1416");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream9 = dbmsProcedures0.litpodeStream();
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
  public void test1417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1417");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dbmsProcedures0.securityContext = securityContext2;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test1418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1418");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream15 = dbmsProcedures0.litlcStream();
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
  public void test1419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1419");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext14 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(securityContext9);
    org.junit.Assert.assertNull(kernelTransaction10);
    org.junit.Assert.assertNull(kernelTransaction13);
    org.junit.Assert.assertNull(securityContext14);
  }

  @Test
  public void test1420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1420");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream14 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1421");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream9 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext5);
  }

  @Test
  public void test1422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1422");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents12 = dbmsProcedures0.systemGraphComponents;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction7);
    org.junit.Assert.assertNull(systemGraphComponents12);
  }

  @Test
  public void test1423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1423");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    java.lang.String str8 = transactionResourceLockMeta4.mdstr;
    java.lang.String str9 = transactionResourceLockMeta4.mdstr;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
  }

  @Test
  public void test1424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1424");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.transIdx;
    long long11 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
  }

  @Test
  public void test1425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1425");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    java.lang.String str5 = transactionResourceLockMeta4.rtName;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.mdstr;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test1426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1426");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream8 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents7);
  }

  @Test
  public void test1427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1427");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext9 = dbmsProcedures0.securityContext;
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test1428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1428");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream17 = dbmsProcedures0.scupregpStream(
          "", "hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(procedureCallContext13);
  }

  @Test
  public void test1429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1429");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = null;
    dbmsProcedures0.securityContext = securityContext5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream7 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1430");
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
    org.junit.Assert.assertNull(procedureCallContext12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test1431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1431");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    long long9 = transactionResourceLockMeta4.rxId;
    java.lang.String str10 = transactionResourceLockMeta4.mdstr;
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
  public void test1432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1432");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream5 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1433");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 97L, "");
    java.lang.String str5 = transactionResourceLockMeta4.transIdx;
    java.lang.String str6 = transactionResourceLockMeta4.mdstr;
    long long7 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
  }

  @Test
  public void test1434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1434");
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
    org.junit.Assert.assertNull(procedureCallContext9);
    org.junit.Assert.assertNull(dependencyResolver10);
  }

  @Test
  public void test1435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1435");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.common.DependencyResolver dependencyResolver1 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver1;
    org.neo4j.graphdb.Transaction transaction3 = null;
    dbmsProcedures0.transaction = transaction3;
    org.neo4j.logging.Log log5 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction6 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream11 = dbmsProcedures0.scupregpStream(
          "hi!", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(transaction6);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test1436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1436");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream9 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log5);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1437");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.common.DependencyResolver dependencyResolver3 = null;
    dbmsProcedures0.dependencyResolver = dependencyResolver3;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
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
  public void test1438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1438");
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
    org.junit.Assert.assertNull(procedureCallContext12);
    org.junit.Assert.assertNull(securityContext13);
  }

  @Test
  public void test1439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1439");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
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
  }

  @Test
  public void test1440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1440");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream12 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction10);
  }

  @Test
  public void test1441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1441");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream12 = dbmsProcedures0.scufajrnStream();
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
  public void test1442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1442");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream8 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(securityContext5);
  }

  @Test
  public void test1443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1443");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream14 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI7);
    org.junit.Assert.assertNull(log10);
  }

  @Test
  public void test1444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1444");
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
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext17 = dbmsProcedures0.procedureCallContext;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = dbmsProcedures0.kernelTransaction;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
    org.junit.Assert.assertNull(securityContext16);
    org.junit.Assert.assertNull(procedureCallContext17);
    org.junit.Assert.assertNull(kernelTransaction18);
  }

  @Test
  public void test1445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1445");
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
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = null;
    dbmsProcedures0.securityContext = securityContext12;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(systemGraphComponents5);
    org.junit.Assert.assertNull(transaction8);
    org.junit.Assert.assertNull(securityContext9);
  }

  @Test
  public void test1446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1446");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    procedures0.dependencyResolver = dependencyResolver6;
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
    org.junit.Assert.assertNull(kernelTransaction8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test1447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1447");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents11 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents11;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProcExMeta> procExMetaStream13 = dbmsProcedures0.litpodeStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(procedureCallContext6);
  }

  @Test
  public void test1448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1448");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream9 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(systemGraphComponents8);
  }

  @Test
  public void test1449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1449");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", 0L, "hi!");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test1450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1450");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
  }

  @Test
  public void test1451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1451");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    dbmsProcedures0.kernelTransaction = kernelTransaction4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI8 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI8;
    org.junit.Assert.assertNull(log1);
  }

  @Test
  public void test1452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1452");
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
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents9 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents9;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream11 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1453");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "", 1L, "");
    long long5 = transactionResourceLockMeta4.rxId;
    long long6 = transactionResourceLockMeta4.rxId;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    long long8 = transactionResourceLockMeta4.rxId;
    java.lang.Class<?> wildcardClass9 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1454");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream11 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
  }

  @Test
  public void test1455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1455");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", (long) ' ', "hi!");
    java.lang.Class<?> wildcardClass5 = transactionResourceLockMeta4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1456");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream4 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(systemGraphComponents3);
  }

  @Test
  public void test1457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1457");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream16 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log13);
  }

  @Test
  public void test1458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1458");
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
      dbmsProcedures0.shtw();
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
  public void test1459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1459");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    org.neo4j.logging.Log log6 = dbmsProcedures0.log;
    org.neo4j.graphdb.Transaction transaction7 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.HeapMeta> heapMetaStream8 = dbmsProcedures0.limepStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
    org.junit.Assert.assertNull(log6);
    org.junit.Assert.assertNull(transaction7);
  }

  @Test
  public void test1460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1460");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    procedures0.kernelTransaction = kernelTransaction11;
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction6);
  }

  @Test
  public void test1461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1461");
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
    java.lang.String[] strArray14 = new java.lang.String[]{""};
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
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver9);
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test1462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1462");
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
    org.neo4j.common.DependencyResolver dependencyResolver15 = dbmsProcedures0.dependencyResolver;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream16 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(procedureCallContext2);
    org.junit.Assert.assertNull(dependencyResolver15);
  }

  @Test
  public void test1463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1463");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test1464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1464");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.common.DependencyResolver dependencyResolver4 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext5 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext5;
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(dependencyResolver4);
  }

  @Test
  public void test1465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1465");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    procedures0.kernelTransaction = kernelTransaction4;
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!"};
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
          "hi!", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList14, "hi!", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test1466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1466");
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
    org.neo4j.logging.Log log9 = dbmsProcedures0.log;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream10 = dbmsProcedures0.litlcStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction3);
    org.junit.Assert.assertNull(kernelTransaction4);
    org.junit.Assert.assertNull(log9);
  }

  @Test
  public void test1467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1467");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream9 = dbmsProcedures0.scufajrnStream();
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
  public void test1468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1468");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream18 = dbmsProcedures0.scupregpStream(
          "", "hi!", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(securityContext5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(transaction9);
    org.junit.Assert.assertNull(systemGraphComponents14);
  }

  @Test
  public void test1469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1469");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dbmsProcedures0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction5 = dbmsProcedures0.transaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream6 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(securityContext3);
    org.junit.Assert.assertNull(securityContext4);
    org.junit.Assert.assertNull(transaction5);
  }

  @Test
  public void test1470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1470");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    procedures0.kernelTransaction = kernelTransaction13;
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
  public void test1471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1471");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "hi!", "hi!", (long) 1, "");
    java.lang.String str5 = transactionResourceLockMeta4.mdstr;
    java.lang.String str6 = transactionResourceLockMeta4.transIdx;
    java.lang.String str7 = transactionResourceLockMeta4.transIdx;
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test1472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1472");
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
    java.lang.String[] strArray15 = new java.lang.String[]{"hi!"};
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
    org.junit.Assert.assertNull(dependencyResolver5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(kernelTransaction7);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test1473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1473");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    long long4 = currentResourceLockMeta3.resourceId;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.resourceType;
    java.lang.String str7 = currentResourceLockMeta3.resourceType;
    java.lang.String str8 = currentResourceLockMeta3.mode;
    java.lang.Class<?> wildcardClass9 = currentResourceLockMeta3.getClass();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1474");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = dbmsProcedures0.kernelTransaction;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dbmsProcedures0.securityContext = securityContext3;
    org.neo4j.logging.Log log5 = null;
    dbmsProcedures0.log = log5;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream7 = dbmsProcedures0.chcotStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(kernelTransaction2);
  }

  @Test
  public void test1475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1475");
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
  public void test1476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1476");
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
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = dbmsProcedures0.kernelTransaction;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream13 = dbmsProcedures0.scufajrnStream();
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
  public void test1477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1477");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream10 = dbmsProcedures0.updstdtStream();
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
  public void test1478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1478");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext3 = null;
    dbmsProcedures0.procedureCallContext = procedureCallContext3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = dbmsProcedures0.kernelTransaction;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI6 = dbmsProcedures0.graphDatabaseAPI;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphStatusInfo> metaGraphStatusInfoStream7 = dbmsProcedures0.updstdtStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(graphDatabaseAPI6);
  }

  @Test
  public void test1479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1479");
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
  public void test1480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1480");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) ' ');
    java.lang.String str4 = currentResourceLockMeta3.mode;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    long long6 = currentResourceLockMeta3.resourceId;
    long long7 = currentResourceLockMeta3.resourceId;
    long long8 = currentResourceLockMeta3.resourceId;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
  }

  @Test
  public void test1481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1481");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id hi! (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(kernelTransaction3);
  }

  @Test
  public void test1482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1482");
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
    java.lang.Class<?> wildcardClass12 = dbmsProcedures0.getClass();
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents9);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test1483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1483");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "", "hi!", (long) (byte) 1);
    java.lang.String str4 = currentResourceLockMeta3.mode;
    long long5 = currentResourceLockMeta3.resourceId;
    java.lang.String str6 = currentResourceLockMeta3.mode;
    java.lang.String str7 = currentResourceLockMeta3.mode;
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test1484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1484");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream16 = dbmsProcedures0.scupregpStream(
          "hi!", "hi!", "hi!");
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
  public void test1485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1485");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta transactionResourceLockMeta4 = new io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta(
        "", "hi!", 0L, "hi!");
    long long5 = transactionResourceLockMeta4.rxId;
    java.lang.String str6 = transactionResourceLockMeta4.rtName;
    long long7 = transactionResourceLockMeta4.rxId;
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
  }

  @Test
  public void test1486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1486");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.logging.Log log1 = dbmsProcedures0.log;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dbmsProcedures0.securityContext;
    org.neo4j.graphdb.Transaction transaction3 = dbmsProcedures0.transaction;
    org.neo4j.graphdb.Transaction transaction4 = null;
    dbmsProcedures0.transaction = transaction4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta> currentResourceLockMetaStream7 = dbmsProcedures0.liaclStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.kernel.api.exceptions.InvalidArgumentsException; message: Could not parse id  (expected format: query-<id>)");
    } catch (org.neo4j.kernel.api.exceptions.InvalidArgumentsException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(transaction3);
  }

  @Test
  public void test1487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1487");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta currentResourceLockMeta3 = new io.github.onograph.procedure.builtin.DbmsProcedures.CurrentResourceLockMeta(
        "hi!", "", (long) (short) 10);
    long long4 = currentResourceLockMeta3.resourceId;
    java.lang.String str5 = currentResourceLockMeta3.resourceType;
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test1488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1488");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.TransactionResourceLockMeta> transactionResourceLockMetaStream9 = dbmsProcedures0.litlcStream();
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
  public void test1489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1489");
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
    org.neo4j.logging.Log log12 = null;
    dbmsProcedures0.log = log12;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.MetaGraphUpdateInfo> metaGraphUpdateInfoStream14 = dbmsProcedures0.upredtlStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test1490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1490");
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
    java.lang.String[] strArray14 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList15, strArray14);
    java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
    try {
      java.util.stream.Stream<org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo> schemaIndexInfoStream19 = procedures0.cranekyStream(
          "", (java.util.List<java.lang.String>) strList10,
          (java.util.List<java.lang.String>) strList15, "hi!", strMap18);
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
  public void test1491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1491");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream12 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(procedureCallContext4);
    org.junit.Assert.assertNull(procedureCallContext11);
  }

  @Test
  public void test1492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1492");
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
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta> checkpointerMetaStream16 = dbmsProcedures0.chcotStream();
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
  public void test1493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1493");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction2 = null;
    procedures0.kernelTransaction = kernelTransaction2;
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    procedures0.dependencyResolver = dependencyResolver4;
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
          "", (java.util.List<java.lang.String>) strList9,
          (java.util.List<java.lang.String>) strList14, "hi!", strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test1494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1494");
    }
    io.github.onograph.procedure.builtin.Procedures procedures0 = new io.github.onograph.procedure.builtin.Procedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver2 = procedures0.dependencyResolver;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    procedures0.kernelTransaction = kernelTransaction3;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = procedures0.kernelTransaction;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = procedures0.kernelTransaction;
    org.neo4j.common.DependencyResolver dependencyResolver7 = procedures0.dependencyResolver;
    try {
      java.lang.Class<?> wildcardClass8 = dependencyResolver7.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(kernelTransaction5);
    org.junit.Assert.assertNull(kernelTransaction6);
    org.junit.Assert.assertNull(dependencyResolver7);
  }

  @Test
  public void test1495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1495");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.FuncExMeta> funcExMetaStream10 = dbmsProcedures0.litfnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI3);
    org.junit.Assert.assertNull(log4);
    org.junit.Assert.assertNull(dependencyResolver5);
  }

  @Test
  public void test1496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1496");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.common.DependencyResolver dependencyResolver2 = dbmsProcedures0.dependencyResolver;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dbmsProcedures0.securityContext;
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI4 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI4;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext6 = null;
    dbmsProcedures0.securityContext = securityContext6;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper> monitoredJobInfoWrapperStream8 = dbmsProcedures0.sceljsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(dependencyResolver2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test1497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1497");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.internal.kernel.api.procs.ProcedureCallContext procedureCallContext1 = dbmsProcedures0.procedureCallContext;
    org.neo4j.graphdb.Transaction transaction2 = dbmsProcedures0.transaction;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents3 = dbmsProcedures0.systemGraphComponents;
    org.neo4j.dbms.database.SystemGraphComponents systemGraphComponents4 = null;
    dbmsProcedures0.systemGraphComponents = systemGraphComponents4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ProfileReturnedMeta> profileReturnedMetaStream9 = dbmsProcedures0.scupregpStream(
          "", "", "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(procedureCallContext1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(systemGraphComponents3);
  }

  @Test
  public void test1498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1498");
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
    org.neo4j.kernel.internal.GraphDatabaseAPI graphDatabaseAPI13 = null;
    dbmsProcedures0.graphDatabaseAPI = graphDatabaseAPI13;
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(transaction5);
    org.junit.Assert.assertNull(procedureCallContext6);
    org.junit.Assert.assertNull(systemGraphComponents11);
    org.junit.Assert.assertNull(procedureCallContext12);
  }

  @Test
  public void test1499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1499");
    }
    io.github.onograph.procedure.builtin.DbmsProcedures dbmsProcedures0 = new io.github.onograph.procedure.builtin.DbmsProcedures();
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = dbmsProcedures0.kernelTransaction;
    org.neo4j.graphdb.Transaction transaction2 = null;
    dbmsProcedures0.transaction = transaction2;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = null;
    dbmsProcedures0.securityContext = securityContext4;
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.FailedJobRunDetails> failedJobRunDetailsStream6 = dbmsProcedures0.scufajrnStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(kernelTransaction1);
  }

  @Test
  public void test1500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1500");
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
    try {
      java.util.stream.Stream<io.github.onograph.procedure.builtin.DbmsProcedures.ActiveGroupThreadWrapper> activeGroupThreadWrapperStream13 = dbmsProcedures0.scuacgsStream();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(log1);
    org.junit.Assert.assertNull(transaction2);
    org.junit.Assert.assertNull(graphDatabaseAPI11);
    org.junit.Assert.assertNull(kernelTransaction12);
  }
}

