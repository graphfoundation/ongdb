package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest6 {

  public static boolean debug = false;

  @Test
  public void test3001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3001");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.comForKe(kernelTransaction14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction16, throwable17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    java.lang.Throwable throwable20 = null;
    queryLoggingService0.faleForExTh(executingQuery19, throwable20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    java.lang.Throwable throwable23 = null;
    queryLoggingService0.faleForExTh(executingQuery22, throwable23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    queryLoggingService0.sucsForEx(executingQuery25);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3002");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8, "hi!");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService0.strForEx(kernelTransaction11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService0.faleForExTh(executingQuery13, throwable14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.strForEx(kernelTransaction16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.faleForExTh(executingQuery18, "query-logging");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    queryLoggingService0.strForEx(executingQuery21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService0.faleForExTh(executingQuery23, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    queryLoggingService0.sucsForEx(executingQuery26);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3003");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    java.lang.String str6 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory7 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory8 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean10 = queryLoggingServiceExtensionFactory8.equals((java.lang.Object) (-1L));
    boolean boolean11 = queryLoggingServiceExtensionFactory7.equals((java.lang.Object) boolean10);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService12 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService12.strForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService12.faleForExTh(executingQuery15, throwable16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService12.rolcForKe(kernelTransaction18);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery20 = null;
    queryLoggingService12.sucsForEx(executingQuery20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryLoggingService12.strForEx(executingQuery22);
    boolean boolean24 = queryLoggingServiceExtensionFactory7.equals(
        (java.lang.Object) executingQuery22);
    boolean boolean25 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory7);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory26 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean28 = queryLoggingServiceExtensionFactory26.equals((java.lang.Object) (short) 1);
    java.lang.String str29 = queryLoggingServiceExtensionFactory26.toString();
    boolean boolean30 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory26);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService31 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery32 = null;
    queryLoggingService31.strForEx(executingQuery32);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery34 = null;
    java.lang.Throwable throwable35 = null;
    queryLoggingService31.faleForExTh(executingQuery34, throwable35);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction37 = null;
    java.lang.Throwable throwable38 = null;
    queryLoggingService31.rolcForKe(kernelTransaction37, throwable38);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery40 = null;
    queryLoggingService31.faleForExTh(executingQuery40, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery43 = null;
    queryLoggingService31.sucsForEx(executingQuery43);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction45 = null;
    queryLoggingService31.comForKe(kernelTransaction45);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery47 = null;
    queryLoggingService31.strForEx(executingQuery47);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery49 = null;
    queryLoggingService31.strForEx(executingQuery49);
    boolean boolean51 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery49);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService52 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction53 = null;
    queryLoggingService52.rolcForKe(kernelTransaction53);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction55 = null;
    java.lang.Throwable throwable56 = null;
    queryLoggingService52.rolcForKe(kernelTransaction55, throwable56);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction58 = null;
    queryLoggingService52.rolcForKe(kernelTransaction58);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction60 = null;
    java.lang.Throwable throwable61 = null;
    queryLoggingService52.rolcForKe(kernelTransaction60, throwable61);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery63 = null;
    queryLoggingService52.faleForExTh(executingQuery63, "hi!");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery66 = null;
    queryLoggingService52.faleForExTh(executingQuery66, "hi!");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery69 = null;
    queryLoggingService52.strForEx(executingQuery69);
    boolean boolean71 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService52);
    java.lang.String str72 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str73 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str74 = queryLoggingServiceExtensionFactory0.toString();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "query-logging" + "'", str6,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(queryLoggingService12);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertEquals(
        "'" + str29 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str29, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNotNull(queryLoggingService31);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    org.junit.Assert.assertNotNull(queryLoggingService52);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertEquals("'" + str72 + "' != '" + "query-logging" + "'", str72,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str73 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str73, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str74 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str74, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3004");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    java.lang.String str6 = queryLoggingServiceExtensionFactory3.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService7 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    queryLoggingService7.rolcForKe(kernelTransaction8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService7.faleForExTh(executingQuery10, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService7.faleForExTh(executingQuery13, throwable14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService7.faleForExTh(executingQuery16, throwable17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService7.strForEx(kernelTransaction19);
    java.lang.Class<?> wildcardClass21 = queryLoggingService7.getClass();
    boolean boolean22 = queryLoggingServiceExtensionFactory3.equals(
        (java.lang.Object) queryLoggingService7);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory23 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean25 = queryLoggingServiceExtensionFactory23.equals((java.lang.Object) (short) 1);
    java.lang.String str26 = queryLoggingServiceExtensionFactory23.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService27 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery28 = null;
    queryLoggingService27.strForEx(executingQuery28);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery30 = null;
    java.lang.Throwable throwable31 = null;
    queryLoggingService27.faleForExTh(executingQuery30, throwable31);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction33 = null;
    java.lang.Throwable throwable34 = null;
    queryLoggingService27.rolcForKe(kernelTransaction33, throwable34);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction36 = null;
    queryLoggingService27.comForKe(kernelTransaction36);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery38 = null;
    queryLoggingService27.strForEx(executingQuery38);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery40 = null;
    queryLoggingService27.strForEx(executingQuery40);
    boolean boolean42 = queryLoggingServiceExtensionFactory23.equals(
        (java.lang.Object) executingQuery40);
    java.lang.String str43 = queryLoggingServiceExtensionFactory23.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService44 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction45 = null;
    queryLoggingService44.rolcForKe(kernelTransaction45);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery47 = null;
    queryLoggingService44.faleForExTh(executingQuery47, "");
    java.lang.Class<?> wildcardClass50 = queryLoggingService44.getClass();
    boolean boolean51 = queryLoggingServiceExtensionFactory23.equals(
        (java.lang.Object) queryLoggingService44);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory52 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory53 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean55 = queryLoggingServiceExtensionFactory53.equals((java.lang.Object) (-1L));
    boolean boolean56 = queryLoggingServiceExtensionFactory52.equals((java.lang.Object) boolean55);
    java.lang.String str57 = queryLoggingServiceExtensionFactory52.toString();
    java.lang.String str58 = queryLoggingServiceExtensionFactory52.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory59 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean61 = queryLoggingServiceExtensionFactory59.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory62 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str63 = queryLoggingServiceExtensionFactory62.toString();
    boolean boolean64 = queryLoggingServiceExtensionFactory59.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory62);
    boolean boolean65 = queryLoggingServiceExtensionFactory52.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory59);
    java.lang.String str66 = queryLoggingServiceExtensionFactory52.getName();
    boolean boolean67 = queryLoggingServiceExtensionFactory23.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory52);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory68 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean70 = queryLoggingServiceExtensionFactory68.equals((java.lang.Object) (short) 1);
    boolean boolean71 = queryLoggingServiceExtensionFactory23.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory68);
    java.lang.String str72 = queryLoggingServiceExtensionFactory68.toString();
    boolean boolean73 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) str72);
    java.lang.String str74 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str75 = queryLoggingServiceExtensionFactory3.toString();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str6, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService7);
    org.junit.Assert.assertNotNull(wildcardClass21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "query-logging" + "'", str26,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService27);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertEquals("'" + str43 + "' != '" + "query-logging" + "'", str43,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService44);
    org.junit.Assert.assertNotNull(wildcardClass50);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertEquals(
        "'" + str57 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str57, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str58 + "' != '" + "query-logging" + "'", str58,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertEquals(
        "'" + str63 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str63, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertEquals("'" + str66 + "' != '" + "query-logging" + "'", str66,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    org.junit.Assert.assertEquals(
        "'" + str72 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str72, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    org.junit.Assert.assertEquals(
        "'" + str74 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str74, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str75 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str75, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3005");
    }
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl0 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction1, "hi!", config3,
        path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction6,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config8, path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction11, "hi!", config13,
        path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction16, "", config18,
        path19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.configuration.Config config23 = null;
    java.nio.file.Path path24 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction21, "hi!", config23,
        path24);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    org.neo4j.configuration.Config config28 = null;
    java.nio.file.Path path29 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction26, "", config28,
        path29);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction31 = null;
    org.neo4j.configuration.Config config33 = null;
    java.nio.file.Path path34 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction31, "query-logging",
        config33, path34);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config38 = null;
    java.nio.file.Path path39 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction36,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config38, path39);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction41 = null;
    org.neo4j.configuration.Config config43 = null;
    java.nio.file.Path path44 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction41,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config43, path44);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction46 = null;
    org.neo4j.configuration.Config config48 = null;
    java.nio.file.Path path49 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction46,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config48, path49);
  }

  @Test
  public void test3006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3006");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.faleForExTh(executingQuery12,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService0.rolcForKe(kernelTransaction15, throwable16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService0.comForKe(kernelTransaction18);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery20 = null;
    queryLoggingService0.sucsForEx(executingQuery20);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3007");
    }
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl0 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction1, "hi!", config3,
        path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction6,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config8, path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction11, "", config13,
        path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction16, "hi!", config18,
        path19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.configuration.Config config23 = null;
    java.nio.file.Path path24 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction21, "", config23,
        path24);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    org.neo4j.configuration.Config config28 = null;
    java.nio.file.Path path29 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction26, "hi!", config28,
        path29);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction31 = null;
    org.neo4j.configuration.Config config33 = null;
    java.nio.file.Path path34 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction31,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config33, path34);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config38 = null;
    java.nio.file.Path path39 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction36,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config38, path39);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction41 = null;
    org.neo4j.configuration.Config config43 = null;
    java.nio.file.Path path44 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction41, "hi!", config43,
        path44);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction46 = null;
    org.neo4j.configuration.Config config48 = null;
    java.nio.file.Path path49 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction46, "hi!", config48,
        path49);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction51 = null;
    org.neo4j.configuration.Config config53 = null;
    java.nio.file.Path path54 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction51, "query-logging",
        config53, path54);
  }

  @Test
  public void test3008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3008");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.rolcForKe(kernelTransaction4, throwable5);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.rolcForKe(kernelTransaction7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.rolcForKe(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService0.faleForExTh(executingQuery14, throwable15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.sucsForEx(executingQuery17);
    java.lang.Class<?> wildcardClass19 = queryLoggingService0.getClass();
    org.junit.Assert.assertNotNull(queryLoggingService0);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test3009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3009");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str1 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory2 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean4 = queryLoggingServiceExtensionFactory2.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory5 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str6 = queryLoggingServiceExtensionFactory5.toString();
    boolean boolean7 = queryLoggingServiceExtensionFactory2.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory5);
    java.lang.String str8 = queryLoggingServiceExtensionFactory2.getName();
    java.lang.String str9 = queryLoggingServiceExtensionFactory2.getName();
    boolean boolean10 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory2);
    java.lang.String str11 = queryLoggingServiceExtensionFactory2.toString();
    java.lang.String str12 = queryLoggingServiceExtensionFactory2.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService13 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService13.rolcForKe(kernelTransaction14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService13.rolcForKe(kernelTransaction16, throwable17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    java.lang.Throwable throwable20 = null;
    queryLoggingService13.rolcForKe(kernelTransaction19, throwable20);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    java.lang.Throwable throwable23 = null;
    queryLoggingService13.rolcForKe(kernelTransaction22, throwable23);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction25 = null;
    queryLoggingService13.rolcForKe(kernelTransaction25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService13.rolcForKe(kernelTransaction27);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction29 = null;
    java.lang.Throwable throwable30 = null;
    queryLoggingService13.rolcForKe(kernelTransaction29, throwable30);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction32 = null;
    java.lang.Throwable throwable33 = null;
    queryLoggingService13.rolcForKe(kernelTransaction32, throwable33);
    boolean boolean35 = queryLoggingServiceExtensionFactory2.equals(
        (java.lang.Object) queryLoggingService13);
    java.lang.String str36 = queryLoggingServiceExtensionFactory2.getName();
    java.lang.String str37 = queryLoggingServiceExtensionFactory2.toString();
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str1, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str6, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "query-logging" + "'", str8,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "query-logging" + "'", str9,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str11, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "query-logging" + "'", str12,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService13);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "query-logging" + "'", str36,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str37 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str37, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3010");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction8, throwable9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.sucsForEx(executingQuery11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.comForKe(kernelTransaction13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.rolcForKe(kernelTransaction15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService0.sucsForEx(executingQuery19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.faleForExTh(executingQuery21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService0.strForEx(kernelTransaction24);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction26 = null;
    queryLoggingService0.rolcForKe(kernelTransaction26);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery28 = null;
    queryLoggingService0.strForEx(executingQuery28);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3011");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (short) 1);
    java.lang.String str3 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService4 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery5 = null;
    queryLoggingService4.strForEx(executingQuery5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService4.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService4.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService4.comForKe(kernelTransaction13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService4.strForEx(executingQuery15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService4.strForEx(executingQuery17);
    boolean boolean19 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery17);
    java.lang.String str20 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str21 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str22 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str23 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str24 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str25 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str26 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory27 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory28 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean30 = queryLoggingServiceExtensionFactory28.equals((java.lang.Object) (-1L));
    boolean boolean31 = queryLoggingServiceExtensionFactory27.equals((java.lang.Object) boolean30);
    boolean boolean33 = queryLoggingServiceExtensionFactory27.equals((java.lang.Object) 0L);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory34 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory35 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean37 = queryLoggingServiceExtensionFactory35.equals((java.lang.Object) (-1L));
    boolean boolean38 = queryLoggingServiceExtensionFactory34.equals((java.lang.Object) boolean37);
    java.lang.Object obj39 = new java.lang.Object();
    boolean boolean40 = queryLoggingServiceExtensionFactory34.equals(obj39);
    java.lang.String str41 = queryLoggingServiceExtensionFactory34.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService42 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery43 = null;
    queryLoggingService42.strForEx(executingQuery43);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery45 = null;
    java.lang.Throwable throwable46 = null;
    queryLoggingService42.faleForExTh(executingQuery45, throwable46);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction48 = null;
    java.lang.Throwable throwable49 = null;
    queryLoggingService42.rolcForKe(kernelTransaction48, throwable49);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction51 = null;
    queryLoggingService42.comForKe(kernelTransaction51);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery53 = null;
    queryLoggingService42.strForEx(executingQuery53);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction55 = null;
    java.lang.Throwable throwable56 = null;
    queryLoggingService42.rolcForKe(kernelTransaction55, throwable56);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction58 = null;
    queryLoggingService42.comForKe(kernelTransaction58);
    boolean boolean60 = queryLoggingServiceExtensionFactory34.equals(
        (java.lang.Object) queryLoggingService42);
    boolean boolean61 = queryLoggingServiceExtensionFactory27.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory34);
    boolean boolean62 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory34);
    java.lang.String str63 = queryLoggingServiceExtensionFactory34.getName();
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl64 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction65 = null;
    org.neo4j.configuration.Config config67 = null;
    java.nio.file.Path path68 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl64.init(fileSystemAbstraction65, "", config67,
        path68);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction70 = null;
    org.neo4j.configuration.Config config72 = null;
    java.nio.file.Path path73 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl64.init(fileSystemAbstraction70,
        "query-logging", config72, path73);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction75 = null;
    org.neo4j.configuration.Config config77 = null;
    java.nio.file.Path path78 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl64.init(fileSystemAbstraction75, "hi!",
        config77, path78);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction80 = null;
    org.neo4j.configuration.Config config82 = null;
    java.nio.file.Path path83 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl64.init(fileSystemAbstraction80, "hi!",
        config82, path83);
    boolean boolean85 = queryLoggingServiceExtensionFactory34.equals(
        (java.lang.Object) fileSystemAbstraction80);
    java.lang.String str86 = queryLoggingServiceExtensionFactory34.toString();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "query-logging" + "'", str3,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService4);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "query-logging" + "'", str20,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str21, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str22, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "query-logging" + "'", str23,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "query-logging" + "'", str24,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str25, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "query-logging" + "'", str26,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertEquals("'" + str41 + "' != '" + "query-logging" + "'", str41,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService42);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertEquals("'" + str63 + "' != '" + "query-logging" + "'", str63,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    org.junit.Assert.assertEquals(
        "'" + str86 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str86, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3012");
    }
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl0 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction1, "hi!", config3,
        path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction6, "", config8,
        path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction11, "query-logging",
        config13, path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction16, "", config18,
        path19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.configuration.Config config23 = null;
    java.nio.file.Path path24 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction21,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config23, path24);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    org.neo4j.configuration.Config config28 = null;
    java.nio.file.Path path29 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction26, "hi!", config28,
        path29);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction31 = null;
    org.neo4j.configuration.Config config33 = null;
    java.nio.file.Path path34 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction31, "", config33,
        path34);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config38 = null;
    java.nio.file.Path path39 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction36, "query-logging",
        config38, path39);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction41 = null;
    org.neo4j.configuration.Config config43 = null;
    java.nio.file.Path path44 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction41, "", config43,
        path44);
  }

  @Test
  public void test3013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3013");
    }
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl0 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction1, "hi!", config3,
        path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction6,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config8, path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction11, "", config13,
        path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction16, "", config18,
        path19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.configuration.Config config23 = null;
    java.nio.file.Path path24 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction21, "", config23,
        path24);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    org.neo4j.configuration.Config config28 = null;
    java.nio.file.Path path29 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction26, "", config28,
        path29);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction31 = null;
    org.neo4j.configuration.Config config33 = null;
    java.nio.file.Path path34 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction31, "query-logging",
        config33, path34);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config38 = null;
    java.nio.file.Path path39 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction36, "", config38,
        path39);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction41 = null;
    org.neo4j.configuration.Config config43 = null;
    java.nio.file.Path path44 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction41, "", config43,
        path44);
  }

  @Test
  public void test3014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3014");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.strForEx(kernelTransaction14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.strForEx(executingQuery16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.rolcForKe(kernelTransaction21, throwable22);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3015");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService0.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.strForEx(kernelTransaction13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.faleForExTh(executingQuery15, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.strForEx(executingQuery18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.strForEx(kernelTransaction20);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    queryLoggingService0.strForEx(kernelTransaction22);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery24 = null;
    queryLoggingService0.faleForExTh(executingQuery24, "hi!");
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3016");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.faleForExTh(executingQuery6, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.comForKe(kernelTransaction9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.sucsForEx(executingQuery11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.comForKe(kernelTransaction13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService0.rolcForKe(kernelTransaction15, throwable16);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3017");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService5 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService5.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService5.faleForExTh(executingQuery8, throwable9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService5.rolcForKe(kernelTransaction11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService5.sucsForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService5.strForEx(executingQuery15);
    boolean boolean17 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery15);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService18 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService18.rolcForKe(kernelTransaction19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService18.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery24 = null;
    queryLoggingService18.faleForExTh(executingQuery24, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService18.rolcForKe(kernelTransaction27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery29 = null;
    java.lang.Throwable throwable30 = null;
    queryLoggingService18.faleForExTh(executingQuery29, throwable30);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery32 = null;
    queryLoggingService18.sucsForEx(executingQuery32);
    boolean boolean34 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService18);
    java.lang.String str35 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str36 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory37 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean39 = queryLoggingServiceExtensionFactory37.equals((java.lang.Object) (short) 1);
    java.lang.String str40 = queryLoggingServiceExtensionFactory37.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService41 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery42 = null;
    queryLoggingService41.strForEx(executingQuery42);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery44 = null;
    java.lang.Throwable throwable45 = null;
    queryLoggingService41.faleForExTh(executingQuery44, throwable45);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction47 = null;
    java.lang.Throwable throwable48 = null;
    queryLoggingService41.rolcForKe(kernelTransaction47, throwable48);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction50 = null;
    queryLoggingService41.comForKe(kernelTransaction50);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery52 = null;
    queryLoggingService41.strForEx(executingQuery52);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery54 = null;
    queryLoggingService41.strForEx(executingQuery54);
    boolean boolean56 = queryLoggingServiceExtensionFactory37.equals(
        (java.lang.Object) executingQuery54);
    java.lang.String str57 = queryLoggingServiceExtensionFactory37.getName();
    java.lang.String str58 = queryLoggingServiceExtensionFactory37.toString();
    java.lang.String str59 = queryLoggingServiceExtensionFactory37.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService60 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction61 = null;
    java.lang.Throwable throwable62 = null;
    queryLoggingService60.rolcForKe(kernelTransaction61, throwable62);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery64 = null;
    queryLoggingService60.sucsForEx(executingQuery64);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery66 = null;
    queryLoggingService60.strForEx(executingQuery66);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery68 = null;
    queryLoggingService60.faleForExTh(executingQuery68, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction71 = null;
    java.lang.Throwable throwable72 = null;
    queryLoggingService60.rolcForKe(kernelTransaction71, throwable72);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery74 = null;
    queryLoggingService60.sucsForEx(executingQuery74);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction76 = null;
    queryLoggingService60.rolcForKe(kernelTransaction76);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction78 = null;
    java.lang.Throwable throwable79 = null;
    queryLoggingService60.rolcForKe(kernelTransaction78, throwable79);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction81 = null;
    queryLoggingService60.comForKe(kernelTransaction81);
    java.lang.Class<?> wildcardClass83 = queryLoggingService60.getClass();
    boolean boolean84 = queryLoggingServiceExtensionFactory37.equals(
        (java.lang.Object) wildcardClass83);
    boolean boolean85 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean84);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext86 = null;
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies queryLoggingServiceDependencies87 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle88 = queryLoggingServiceExtensionFactory0.newInstance(
          extensionContext86, queryLoggingServiceDependencies87);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(queryLoggingService5);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(queryLoggingService18);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertEquals(
        "'" + str35 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str35, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "query-logging" + "'", str36,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "query-logging" + "'", str40,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService41);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertEquals("'" + str57 + "' != '" + "query-logging" + "'", str57,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str58 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str58, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str59 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str59, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService60);
    org.junit.Assert.assertNotNull(wildcardClass83);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
  }

  @Test
  public void test3018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3018");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.sucsForEx(executingQuery15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction19);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3019");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    boolean boolean7 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) 100.0d);
    java.lang.String str8 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str9 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str10 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str11 = queryLoggingServiceExtensionFactory3.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService12 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService12.rolcForKe(kernelTransaction13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService12.faleForExTh(executingQuery15, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService12.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService12.rolcForKe(kernelTransaction21);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction23 = null;
    queryLoggingService12.comForKe(kernelTransaction23);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction25 = null;
    java.lang.Throwable throwable26 = null;
    queryLoggingService12.rolcForKe(kernelTransaction25, throwable26);
    boolean boolean28 = queryLoggingServiceExtensionFactory3.equals(
        (java.lang.Object) kernelTransaction25);
    boolean boolean30 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) (byte) -1);
    java.lang.Class<?> wildcardClass31 = queryLoggingServiceExtensionFactory3.getClass();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str8, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "query-logging" + "'", str9,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "query-logging" + "'", str10,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "query-logging" + "'", str11,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService12);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(wildcardClass31);
  }

  @Test
  public void test3020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3020");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.strForEx(executingQuery10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction16, throwable17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService0.strForEx(executingQuery19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService0.rolcForKe(kernelTransaction21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService0.sucsForEx(executingQuery23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    queryLoggingService0.sucsForEx(executingQuery25);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery27 = null;
    queryLoggingService0.sucsForEx(executingQuery27);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction29 = null;
    queryLoggingService0.strForEx(kernelTransaction29);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction31 = null;
    queryLoggingService0.comForKe(kernelTransaction31);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3021");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.sucsForEx(executingQuery4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.comForKe(kernelTransaction6);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction8, throwable9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService0.strForEx(kernelTransaction11);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3022");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.faleForExTh(executingQuery12,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.strForEx(executingQuery17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.faleForExTh(executingQuery21, throwable22);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery24 = null;
    java.lang.Throwable throwable25 = null;
    queryLoggingService0.faleForExTh(executingQuery24, throwable25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    java.lang.Throwable throwable28 = null;
    queryLoggingService0.rolcForKe(kernelTransaction27, throwable28);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery30 = null;
    queryLoggingService0.strForEx(executingQuery30);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3023");
    }
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl0 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction1,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config3, path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction6,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config8, path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction11, "", config13,
        path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction16, "", config18,
        path19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.configuration.Config config23 = null;
    java.nio.file.Path path24 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction21, "query-logging",
        config23, path24);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    org.neo4j.configuration.Config config28 = null;
    java.nio.file.Path path29 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction26, "query-logging",
        config28, path29);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction31 = null;
    org.neo4j.configuration.Config config33 = null;
    java.nio.file.Path path34 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction31, "", config33,
        path34);
  }

  @Test
  public void test3024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3024");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.strForEx(kernelTransaction17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    java.lang.Throwable throwable20 = null;
    queryLoggingService0.rolcForKe(kernelTransaction19, throwable20);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    queryLoggingService0.comForKe(kernelTransaction22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService0.rolcForKe(kernelTransaction24);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    queryLoggingService0.strForEx(executingQuery26);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3025");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str1 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str2 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService3 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService3.rolcForKe(kernelTransaction4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    queryLoggingService3.sucsForEx(executingQuery7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService3.rolcForKe(kernelTransaction9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService3.sucsForEx(executingQuery11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService3.faleForExTh(executingQuery13, "hi!");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService3.strForEx(executingQuery16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService3.rolcForKe(kernelTransaction18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService3.comForKe(kernelTransaction21);
    boolean boolean23 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) kernelTransaction21);
    java.lang.String str24 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str25 = queryLoggingServiceExtensionFactory0.getName();
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str1, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str2, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService3);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str24, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "query-logging" + "'", str25,
        "query-logging");
  }

  @Test
  public void test3026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3026");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService0.faleForExTh(executingQuery12, throwable13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    java.lang.Throwable throwable18 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17, throwable18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.strForEx(kernelTransaction20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryLoggingService0.strForEx(executingQuery22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService0.comForKe(kernelTransaction24);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3027");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9, throwable10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3028");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    boolean boolean7 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) 100.0d);
    java.lang.String str8 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str9 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str10 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str11 = queryLoggingServiceExtensionFactory3.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService12 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService12.rolcForKe(kernelTransaction13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService12.rolcForKe(kernelTransaction15, throwable16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService12.rolcForKe(kernelTransaction18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    java.lang.Throwable throwable21 = null;
    queryLoggingService12.rolcForKe(kernelTransaction20, throwable21);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction23 = null;
    queryLoggingService12.rolcForKe(kernelTransaction23);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction25 = null;
    queryLoggingService12.comForKe(kernelTransaction25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService12.comForKe(kernelTransaction27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery29 = null;
    queryLoggingService12.strForEx(executingQuery29);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery31 = null;
    queryLoggingService12.sucsForEx(executingQuery31);
    boolean boolean33 = queryLoggingServiceExtensionFactory3.equals(
        (java.lang.Object) queryLoggingService12);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "query-logging" + "'", str8,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str9, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str10, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str11, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService12);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
  }

  @Test
  public void test3029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3029");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    java.lang.Object obj5 = new java.lang.Object();
    boolean boolean6 = queryLoggingServiceExtensionFactory0.equals(obj5);
    java.lang.String str7 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService8 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService8.strForEx(executingQuery9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService8.faleForExTh(executingQuery11, throwable12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService8.rolcForKe(kernelTransaction14, throwable15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService8.comForKe(kernelTransaction17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService8.strForEx(executingQuery19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService8.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService8.comForKe(kernelTransaction24);
    boolean boolean26 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService8);
    java.lang.String str27 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str28 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory29 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory30 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean32 = queryLoggingServiceExtensionFactory30.equals((java.lang.Object) (-1L));
    boolean boolean33 = queryLoggingServiceExtensionFactory29.equals((java.lang.Object) boolean32);
    java.lang.String str34 = queryLoggingServiceExtensionFactory29.toString();
    java.lang.String str35 = queryLoggingServiceExtensionFactory29.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService36 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction37 = null;
    java.lang.Throwable throwable38 = null;
    queryLoggingService36.rolcForKe(kernelTransaction37, throwable38);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery40 = null;
    queryLoggingService36.sucsForEx(executingQuery40);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery42 = null;
    queryLoggingService36.strForEx(executingQuery42);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery44 = null;
    queryLoggingService36.faleForExTh(executingQuery44, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction47 = null;
    java.lang.Throwable throwable48 = null;
    queryLoggingService36.rolcForKe(kernelTransaction47, throwable48);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery50 = null;
    queryLoggingService36.sucsForEx(executingQuery50);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction52 = null;
    queryLoggingService36.rolcForKe(kernelTransaction52);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction54 = null;
    java.lang.Throwable throwable55 = null;
    queryLoggingService36.rolcForKe(kernelTransaction54, throwable55);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction57 = null;
    queryLoggingService36.comForKe(kernelTransaction57);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery59 = null;
    queryLoggingService36.sucsForEx(executingQuery59);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery61 = null;
    queryLoggingService36.strForEx(executingQuery61);
    boolean boolean63 = queryLoggingServiceExtensionFactory29.equals(
        (java.lang.Object) queryLoggingService36);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery64 = null;
    java.lang.Throwable throwable65 = null;
    queryLoggingService36.faleForExTh(executingQuery64, throwable65);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction67 = null;
    java.lang.Throwable throwable68 = null;
    queryLoggingService36.rolcForKe(kernelTransaction67, throwable68);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery70 = null;
    queryLoggingService36.strForEx(executingQuery70);
    java.lang.Class<?> wildcardClass72 = queryLoggingService36.getClass();
    boolean boolean73 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) wildcardClass72);
    java.lang.Class<?> wildcardClass74 = queryLoggingServiceExtensionFactory0.getClass();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "query-logging" + "'", str7,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService8);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str27, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str28 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str28, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertEquals(
        "'" + str34 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str34, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "query-logging" + "'", str35,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService36);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    org.junit.Assert.assertNotNull(wildcardClass72);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    org.junit.Assert.assertNotNull(wildcardClass74);
  }

  @Test
  public void test3030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3030");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1.0d));
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService3 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService3.rolcForKe(kernelTransaction4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService3.faleForExTh(executingQuery6, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService3.faleForExTh(executingQuery9, throwable10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService3.faleForExTh(executingQuery12, throwable13);
    boolean boolean15 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery12);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory16 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean18 = queryLoggingServiceExtensionFactory16.equals((java.lang.Object) (short) 1);
    java.lang.String str19 = queryLoggingServiceExtensionFactory16.getName();
    boolean boolean20 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory16);
    java.lang.String str21 = queryLoggingServiceExtensionFactory16.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService22 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService22.faleForExTh(executingQuery23,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    queryLoggingService22.faleForExTh(executingQuery26,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction29 = null;
    queryLoggingService22.strForEx(kernelTransaction29);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction31 = null;
    java.lang.Throwable throwable32 = null;
    queryLoggingService22.rolcForKe(kernelTransaction31, throwable32);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction34 = null;
    queryLoggingService22.rolcForKe(kernelTransaction34);
    boolean boolean36 = queryLoggingServiceExtensionFactory16.equals(
        (java.lang.Object) queryLoggingService22);
    java.lang.String str37 = queryLoggingServiceExtensionFactory16.toString();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(queryLoggingService3);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "query-logging" + "'", str19,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "query-logging" + "'", str21,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService22);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertEquals(
        "'" + str37 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str37, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3031");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.sucsForEx(executingQuery4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11, throwable12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService0.faleForExTh(executingQuery16, throwable17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService0.faleForExTh(executingQuery19,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    java.lang.Throwable throwable23 = null;
    queryLoggingService0.rolcForKe(kernelTransaction22, throwable23);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3032");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.rolcForKe(kernelTransaction14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.faleForExTh(executingQuery18, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    java.lang.Throwable throwable25 = null;
    queryLoggingService0.rolcForKe(kernelTransaction24, throwable25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService0.strForEx(kernelTransaction27);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3033");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8, "hi!");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService0.strForEx(kernelTransaction11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService0.faleForExTh(executingQuery13, throwable14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.strForEx(kernelTransaction16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService0.comForKe(kernelTransaction18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.comForKe(kernelTransaction20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryLoggingService0.faleForExTh(executingQuery22,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction25 = null;
    java.lang.Throwable throwable26 = null;
    queryLoggingService0.rolcForKe(kernelTransaction25, throwable26);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery28 = null;
    queryLoggingService0.faleForExTh(executingQuery28, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction31 = null;
    queryLoggingService0.strForEx(kernelTransaction31);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3034");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.faleForExTh(executingQuery10, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService0.sucsForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.strForEx(executingQuery15);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3035");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService0.comForKe(kernelTransaction4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.strForEx(kernelTransaction9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11, throwable12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService0.rolcForKe(kernelTransaction14, throwable15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    java.lang.Throwable throwable18 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17, throwable18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    java.lang.Throwable throwable21 = null;
    queryLoggingService0.rolcForKe(kernelTransaction20, throwable21);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3036");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService0.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.strForEx(kernelTransaction13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.faleForExTh(executingQuery15, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.strForEx(executingQuery18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    java.lang.Throwable throwable21 = null;
    queryLoggingService0.rolcForKe(kernelTransaction20, throwable21);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction23 = null;
    queryLoggingService0.comForKe(kernelTransaction23);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction25 = null;
    queryLoggingService0.comForKe(kernelTransaction25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService0.rolcForKe(kernelTransaction27);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction29 = null;
    queryLoggingService0.rolcForKe(kernelTransaction29);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3037");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    java.lang.String str3 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService4 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction5 = null;
    queryLoggingService4.rolcForKe(kernelTransaction5);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    queryLoggingService4.strForEx(kernelTransaction7);
    java.lang.Class<?> wildcardClass9 = queryLoggingService4.getClass();
    boolean boolean10 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService4);
    java.lang.String str11 = queryLoggingServiceExtensionFactory0.getName();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str3, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService4);
    org.junit.Assert.assertNotNull(wildcardClass9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "query-logging" + "'", str11,
        "query-logging");
  }

  @Test
  public void test3038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3038");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.sucsForEx(executingQuery4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11, throwable12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService0.strForEx(kernelTransaction21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService0.sucsForEx(executingQuery23);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3039");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (short) 1);
    java.lang.String str3 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService4 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery5 = null;
    queryLoggingService4.strForEx(executingQuery5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService4.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService4.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService4.comForKe(kernelTransaction13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService4.strForEx(executingQuery15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService4.strForEx(executingQuery17);
    boolean boolean19 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery17);
    java.lang.String str20 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str21 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str22 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str23 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str24 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str25 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl26 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction27 = null;
    org.neo4j.configuration.Config config29 = null;
    java.nio.file.Path path30 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl26.init(fileSystemAbstraction27, "hi!",
        config29, path30);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction32 = null;
    org.neo4j.configuration.Config config34 = null;
    java.nio.file.Path path35 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl26.init(fileSystemAbstraction32,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config34, path35);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction37 = null;
    org.neo4j.configuration.Config config39 = null;
    java.nio.file.Path path40 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl26.init(fileSystemAbstraction37, "", config39,
        path40);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction42 = null;
    org.neo4j.configuration.Config config44 = null;
    java.nio.file.Path path45 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl26.init(fileSystemAbstraction42, "hi!",
        config44, path45);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction47 = null;
    org.neo4j.configuration.Config config49 = null;
    java.nio.file.Path path50 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl26.init(fileSystemAbstraction47, "", config49,
        path50);
    boolean boolean52 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) "");
    java.lang.String str53 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.Class<?> wildcardClass54 = queryLoggingServiceExtensionFactory0.getClass();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "query-logging" + "'", str3,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService4);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "query-logging" + "'", str20,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str21, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str22, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "query-logging" + "'", str23,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "query-logging" + "'", str24,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str25, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "query-logging" + "'", str53,
        "query-logging");
    org.junit.Assert.assertNotNull(wildcardClass54);
  }

  @Test
  public void test3040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3040");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction8, throwable9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.sucsForEx(executingQuery11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.comForKe(kernelTransaction13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.rolcForKe(kernelTransaction15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.sucsForEx(executingQuery17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.faleForExTh(executingQuery21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService0.rolcForKe(kernelTransaction24);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction26 = null;
    queryLoggingService0.strForEx(kernelTransaction26);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3041");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.faleForExTh(executingQuery9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.strForEx(kernelTransaction14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.strForEx(kernelTransaction16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.faleForExTh(executingQuery21, throwable22);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3042");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str1 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService2 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService2.rolcForKe(kernelTransaction3, throwable4);
    boolean boolean6 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) throwable4);
    java.lang.String str7 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str8 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService9 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService9.rolcForKe(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService9.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService9.rolcForKe(kernelTransaction15, throwable16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService9.comForKe(kernelTransaction18);
    boolean boolean20 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService9);
    java.lang.String str21 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory22 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean24 = queryLoggingServiceExtensionFactory22.equals((java.lang.Object) (short) 1);
    java.lang.String str25 = queryLoggingServiceExtensionFactory22.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService26 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery27 = null;
    queryLoggingService26.strForEx(executingQuery27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery29 = null;
    java.lang.Throwable throwable30 = null;
    queryLoggingService26.faleForExTh(executingQuery29, throwable30);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction32 = null;
    java.lang.Throwable throwable33 = null;
    queryLoggingService26.rolcForKe(kernelTransaction32, throwable33);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction35 = null;
    queryLoggingService26.comForKe(kernelTransaction35);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery37 = null;
    queryLoggingService26.strForEx(executingQuery37);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery39 = null;
    queryLoggingService26.strForEx(executingQuery39);
    boolean boolean41 = queryLoggingServiceExtensionFactory22.equals(
        (java.lang.Object) executingQuery39);
    java.lang.String str42 = queryLoggingServiceExtensionFactory22.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService43 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction44 = null;
    queryLoggingService43.rolcForKe(kernelTransaction44);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery46 = null;
    queryLoggingService43.faleForExTh(executingQuery46, "");
    java.lang.Class<?> wildcardClass49 = queryLoggingService43.getClass();
    boolean boolean50 = queryLoggingServiceExtensionFactory22.equals(
        (java.lang.Object) queryLoggingService43);
    java.lang.String str51 = queryLoggingServiceExtensionFactory22.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService52 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction53 = null;
    java.lang.Throwable throwable54 = null;
    queryLoggingService52.rolcForKe(kernelTransaction53, throwable54);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery56 = null;
    queryLoggingService52.sucsForEx(executingQuery56);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery58 = null;
    queryLoggingService52.strForEx(executingQuery58);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery60 = null;
    queryLoggingService52.strForEx(executingQuery60);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction62 = null;
    queryLoggingService52.rolcForKe(kernelTransaction62);
    boolean boolean64 = queryLoggingServiceExtensionFactory22.equals(
        (java.lang.Object) queryLoggingService52);
    boolean boolean65 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory22);
    java.lang.String str66 = queryLoggingServiceExtensionFactory0.getName();
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str1, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService2);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "query-logging" + "'", str7,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str8, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService9);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str21, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "query-logging" + "'", str25,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService26);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertEquals("'" + str42 + "' != '" + "query-logging" + "'", str42,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService43);
    org.junit.Assert.assertNotNull(wildcardClass49);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertEquals(
        "'" + str51 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str51, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService52);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertEquals("'" + str66 + "' != '" + "query-logging" + "'", str66,
        "query-logging");
  }

  @Test
  public void test3043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3043");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.faleForExTh(executingQuery1,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.faleForExTh(executingQuery4,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.rolcForKe(kernelTransaction7, throwable8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.faleForExTh(executingQuery10, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService0.strForEx(executingQuery13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.comForKe(kernelTransaction15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.sucsForEx(executingQuery17);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3044");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService0.comForKe(kernelTransaction4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11, throwable12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.strForEx(kernelTransaction16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.strForEx(executingQuery18);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3045");
    }
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl0 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction1,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config3, path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction6, "query-logging",
        config8, path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction11, "", config13,
        path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction16,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config18, path19);
  }

  @Test
  public void test3046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3046");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.strForEx(executingQuery12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.strForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService0.faleForExTh(executingQuery16, throwable17);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3047");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.faleForExTh(executingQuery6, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.faleForExTh(executingQuery11, throwable12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.faleForExTh(executingQuery16,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService0.strForEx(executingQuery19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService0.strForEx(kernelTransaction21);
    java.lang.Class<?> wildcardClass23 = queryLoggingService0.getClass();
    org.junit.Assert.assertNotNull(queryLoggingService0);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test3048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3048");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    boolean boolean7 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) 100.0d);
    java.lang.String str8 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str9 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str10 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str11 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str12 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str13 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str14 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str15 = queryLoggingServiceExtensionFactory3.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext16 = null;
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies queryLoggingServiceDependencies17 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle18 = queryLoggingServiceExtensionFactory3.newInstance(
          extensionContext16, queryLoggingServiceDependencies17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str8, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "query-logging" + "'", str9,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "query-logging" + "'", str10,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "query-logging" + "'", str11,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "query-logging" + "'", str12,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "query-logging" + "'", str13,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "query-logging" + "'", str14,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str15, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3049");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.faleForExTh(executingQuery12,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.faleForExTh(executingQuery15, "query-logging");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.sucsForEx(executingQuery18);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery20 = null;
    queryLoggingService0.faleForExTh(executingQuery20, "query-logging");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService0.faleForExTh(executingQuery23, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction26 = null;
    java.lang.Throwable throwable27 = null;
    queryLoggingService0.rolcForKe(kernelTransaction26, throwable27);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction29 = null;
    queryLoggingService0.comForKe(kernelTransaction29);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction31 = null;
    queryLoggingService0.strForEx(kernelTransaction31);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery33 = null;
    java.lang.Throwable throwable34 = null;
    queryLoggingService0.faleForExTh(executingQuery33, throwable34);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery36 = null;
    queryLoggingService0.faleForExTh(executingQuery36, "");
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3050");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.rolcForKe(kernelTransaction10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService0.faleForExTh(executingQuery12, throwable13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.faleForExTh(executingQuery15,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService0.strForEx(kernelTransaction21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService0.faleForExTh(executingQuery23,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    java.lang.Throwable throwable27 = null;
    queryLoggingService0.faleForExTh(executingQuery26, throwable27);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3051");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "hi!");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.faleForExTh(executingQuery12, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService0.rolcForKe(kernelTransaction15, throwable16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService0.comForKe(kernelTransaction21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService0.faleForExTh(executingQuery23, "query-logging");
    java.lang.Class<?> wildcardClass26 = queryLoggingService0.getClass();
    org.junit.Assert.assertNotNull(queryLoggingService0);
    org.junit.Assert.assertNotNull(wildcardClass26);
  }

  @Test
  public void test3052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3052");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (short) 1);
    java.lang.String str3 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str4 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService5 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService5.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService5.comForKe(kernelTransaction9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService5.faleForExTh(executingQuery11, throwable12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService5.rolcForKe(kernelTransaction14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService5.faleForExTh(executingQuery16, throwable17);
    java.lang.Class<?> wildcardClass19 = queryLoggingService5.getClass();
    boolean boolean20 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) wildcardClass19);
    java.lang.String str21 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str22 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory23 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean25 = queryLoggingServiceExtensionFactory23.equals((java.lang.Object) (short) 1);
    java.lang.String str26 = queryLoggingServiceExtensionFactory23.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService27 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery28 = null;
    queryLoggingService27.strForEx(executingQuery28);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery30 = null;
    java.lang.Throwable throwable31 = null;
    queryLoggingService27.faleForExTh(executingQuery30, throwable31);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction33 = null;
    java.lang.Throwable throwable34 = null;
    queryLoggingService27.rolcForKe(kernelTransaction33, throwable34);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction36 = null;
    queryLoggingService27.comForKe(kernelTransaction36);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery38 = null;
    queryLoggingService27.strForEx(executingQuery38);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery40 = null;
    queryLoggingService27.strForEx(executingQuery40);
    boolean boolean42 = queryLoggingServiceExtensionFactory23.equals(
        (java.lang.Object) executingQuery40);
    java.lang.String str43 = queryLoggingServiceExtensionFactory23.getName();
    java.lang.String str44 = queryLoggingServiceExtensionFactory23.toString();
    java.lang.String str45 = queryLoggingServiceExtensionFactory23.toString();
    java.lang.String str46 = queryLoggingServiceExtensionFactory23.getName();
    java.lang.String str47 = queryLoggingServiceExtensionFactory23.getName();
    java.lang.String str48 = queryLoggingServiceExtensionFactory23.toString();
    boolean boolean49 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory23);
    java.lang.String str50 = queryLoggingServiceExtensionFactory23.toString();
    java.lang.String str51 = queryLoggingServiceExtensionFactory23.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext52 = null;
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies queryLoggingServiceDependencies53 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle54 = queryLoggingServiceExtensionFactory23.newInstance(
          extensionContext52, queryLoggingServiceDependencies53);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str3, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "query-logging" + "'", str4,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService5);
    org.junit.Assert.assertNotNull(wildcardClass19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "query-logging" + "'", str21,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "query-logging" + "'", str22,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "query-logging" + "'", str26,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService27);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertEquals("'" + str43 + "' != '" + "query-logging" + "'", str43,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str44 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str44, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str45 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str45, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str46 + "' != '" + "query-logging" + "'", str46,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str47 + "' != '" + "query-logging" + "'", str47,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str48 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str48, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertEquals(
        "'" + str50 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str50, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str51 + "' != '" + "query-logging" + "'", str51,
        "query-logging");
  }

  @Test
  public void test3053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3053");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService0.rolcForKe(kernelTransaction14, throwable15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    java.lang.Throwable throwable18 = null;
    queryLoggingService0.faleForExTh(executingQuery17, throwable18);
    java.lang.Class<?> wildcardClass20 = queryLoggingService0.getClass();
    org.junit.Assert.assertNotNull(queryLoggingService0);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3054");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    java.lang.String str6 = queryLoggingServiceExtensionFactory3.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService7 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    queryLoggingService7.rolcForKe(kernelTransaction8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService7.faleForExTh(executingQuery10, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService7.faleForExTh(executingQuery13, throwable14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService7.faleForExTh(executingQuery16, throwable17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService7.strForEx(kernelTransaction19);
    java.lang.Class<?> wildcardClass21 = queryLoggingService7.getClass();
    boolean boolean22 = queryLoggingServiceExtensionFactory3.equals(
        (java.lang.Object) queryLoggingService7);
    java.lang.String str23 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str24 = queryLoggingServiceExtensionFactory3.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory25 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean27 = queryLoggingServiceExtensionFactory25.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory28 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str29 = queryLoggingServiceExtensionFactory28.toString();
    boolean boolean30 = queryLoggingServiceExtensionFactory25.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory28);
    boolean boolean32 = queryLoggingServiceExtensionFactory28.equals((java.lang.Object) 100.0d);
    java.lang.String str33 = queryLoggingServiceExtensionFactory28.getName();
    java.lang.String str34 = queryLoggingServiceExtensionFactory28.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService35 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction36 = null;
    java.lang.Throwable throwable37 = null;
    queryLoggingService35.rolcForKe(kernelTransaction36, throwable37);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction39 = null;
    queryLoggingService35.comForKe(kernelTransaction39);
    boolean boolean41 = queryLoggingServiceExtensionFactory28.equals(
        (java.lang.Object) queryLoggingService35);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery42 = null;
    queryLoggingService35.faleForExTh(executingQuery42,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery45 = null;
    queryLoggingService35.strForEx(executingQuery45);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction47 = null;
    java.lang.Throwable throwable48 = null;
    queryLoggingService35.rolcForKe(kernelTransaction47, throwable48);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction50 = null;
    java.lang.Throwable throwable51 = null;
    queryLoggingService35.rolcForKe(kernelTransaction50, throwable51);
    boolean boolean53 = queryLoggingServiceExtensionFactory3.equals(
        (java.lang.Object) kernelTransaction50);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str6, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService7);
    org.junit.Assert.assertNotNull(wildcardClass21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "query-logging" + "'", str23,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str24, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertEquals(
        "'" + str29 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str29, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "query-logging" + "'", str33,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str34 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str34, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService35);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
  }

  @Test
  public void test3055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3055");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService5 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService5.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService5.faleForExTh(executingQuery8, throwable9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService5.rolcForKe(kernelTransaction11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService5.sucsForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService5.strForEx(executingQuery15);
    boolean boolean17 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery15);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService18 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService18.rolcForKe(kernelTransaction19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService18.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery24 = null;
    queryLoggingService18.faleForExTh(executingQuery24, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService18.rolcForKe(kernelTransaction27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery29 = null;
    java.lang.Throwable throwable30 = null;
    queryLoggingService18.faleForExTh(executingQuery29, throwable30);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery32 = null;
    queryLoggingService18.sucsForEx(executingQuery32);
    boolean boolean34 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService18);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService35 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction36 = null;
    java.lang.Throwable throwable37 = null;
    queryLoggingService35.rolcForKe(kernelTransaction36, throwable37);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery39 = null;
    queryLoggingService35.sucsForEx(executingQuery39);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction41 = null;
    queryLoggingService35.comForKe(kernelTransaction41);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery43 = null;
    queryLoggingService35.faleForExTh(executingQuery43, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction46 = null;
    queryLoggingService35.strForEx(kernelTransaction46);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction48 = null;
    queryLoggingService35.comForKe(kernelTransaction48);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery50 = null;
    queryLoggingService35.strForEx(executingQuery50);
    boolean boolean52 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService35);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService53 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction54 = null;
    queryLoggingService53.rolcForKe(kernelTransaction54);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery56 = null;
    queryLoggingService53.faleForExTh(executingQuery56, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery59 = null;
    java.lang.Throwable throwable60 = null;
    queryLoggingService53.faleForExTh(executingQuery59, throwable60);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery62 = null;
    java.lang.Throwable throwable63 = null;
    queryLoggingService53.faleForExTh(executingQuery62, throwable63);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction65 = null;
    queryLoggingService53.strForEx(kernelTransaction65);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery67 = null;
    queryLoggingService53.faleForExTh(executingQuery67, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction70 = null;
    queryLoggingService53.rolcForKe(kernelTransaction70);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction72 = null;
    queryLoggingService53.rolcForKe(kernelTransaction72);
    boolean boolean74 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService53);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction75 = null;
    queryLoggingService53.rolcForKe(kernelTransaction75);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction77 = null;
    queryLoggingService53.comForKe(kernelTransaction77);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(queryLoggingService5);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(queryLoggingService18);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(queryLoggingService35);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    org.junit.Assert.assertNotNull(queryLoggingService53);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
  }

  @Test
  public void test3056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3056");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.sucsForEx(executingQuery10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.comForKe(kernelTransaction14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.strForEx(kernelTransaction16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.strForEx(executingQuery18);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3057");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.strForEx(executingQuery10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.strForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService0.comForKe(kernelTransaction18);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3058");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.strForEx(executingQuery10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService0.rolcForKe(kernelTransaction21);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction23 = null;
    queryLoggingService0.rolcForKe(kernelTransaction23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    queryLoggingService0.faleForExTh(executingQuery25, "query-logging");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery28 = null;
    queryLoggingService0.sucsForEx(executingQuery28);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction30 = null;
    java.lang.Throwable throwable31 = null;
    queryLoggingService0.rolcForKe(kernelTransaction30, throwable31);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3059");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.sucsForEx(executingQuery4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.sucsForEx(executingQuery11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService0.strForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService0.faleForExTh(executingQuery15, throwable16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.sucsForEx(executingQuery18);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3060");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    boolean boolean7 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) 100.0d);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService8 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService8.strForEx(executingQuery9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService8.faleForExTh(executingQuery11, throwable12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService8.rolcForKe(kernelTransaction14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService8.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService8.strForEx(executingQuery18);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery20 = null;
    queryLoggingService8.sucsForEx(executingQuery20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryLoggingService8.sucsForEx(executingQuery22);
    boolean boolean24 = queryLoggingServiceExtensionFactory3.equals(
        (java.lang.Object) executingQuery22);
    java.lang.String str25 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str26 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str27 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str28 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str29 = queryLoggingServiceExtensionFactory3.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext30 = null;
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies queryLoggingServiceDependencies31 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle32 = queryLoggingServiceExtensionFactory3.newInstance(
          extensionContext30, queryLoggingServiceDependencies31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(queryLoggingService8);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str25, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "query-logging" + "'", str26,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "query-logging" + "'", str27,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "query-logging" + "'", str28,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "query-logging" + "'", str29,
        "query-logging");
  }

  @Test
  public void test3061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3061");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.faleForExTh(executingQuery12,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.strForEx(executingQuery17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.faleForExTh(executingQuery21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    java.lang.Throwable throwable25 = null;
    queryLoggingService0.rolcForKe(kernelTransaction24, throwable25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService0.strForEx(kernelTransaction27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery29 = null;
    queryLoggingService0.faleForExTh(executingQuery29, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction32 = null;
    queryLoggingService0.rolcForKe(kernelTransaction32);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3062");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService3 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService3.rolcForKe(kernelTransaction4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService3.rolcForKe(kernelTransaction6, throwable7);
    boolean boolean9 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService3);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService3.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService3.strForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService3.strForEx(executingQuery15);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(queryLoggingService3);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test3063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3063");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    java.lang.String str5 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str6 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str7 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str8 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str9 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService10 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService10.strForEx(executingQuery11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService10.faleForExTh(executingQuery13, throwable14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService10.rolcForKe(kernelTransaction16, throwable17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService10.comForKe(kernelTransaction19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    queryLoggingService10.strForEx(executingQuery21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService10.strForEx(executingQuery23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    queryLoggingService10.faleForExTh(executingQuery25,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    queryLoggingService10.rolcForKe(kernelTransaction28);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery30 = null;
    queryLoggingService10.strForEx(executingQuery30);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery32 = null;
    queryLoggingService10.sucsForEx(executingQuery32);
    boolean boolean34 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery32);
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl35 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config38 = null;
    java.nio.file.Path path39 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction36, "hi!",
        config38, path39);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction41 = null;
    org.neo4j.configuration.Config config43 = null;
    java.nio.file.Path path44 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction41,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config43, path44);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction46 = null;
    org.neo4j.configuration.Config config48 = null;
    java.nio.file.Path path49 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction46, "", config48,
        path49);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction51 = null;
    org.neo4j.configuration.Config config53 = null;
    java.nio.file.Path path54 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction51, "hi!",
        config53, path54);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction56 = null;
    org.neo4j.configuration.Config config58 = null;
    java.nio.file.Path path59 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction56, "", config58,
        path59);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction61 = null;
    org.neo4j.configuration.Config config63 = null;
    java.nio.file.Path path64 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction61, "hi!",
        config63, path64);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction66 = null;
    org.neo4j.configuration.Config config68 = null;
    java.nio.file.Path path69 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction66,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config68, path69);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction71 = null;
    org.neo4j.configuration.Config config73 = null;
    java.nio.file.Path path74 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction71,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config73, path74);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction76 = null;
    org.neo4j.configuration.Config config78 = null;
    java.nio.file.Path path79 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction76, "hi!",
        config78, path79);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction81 = null;
    org.neo4j.configuration.Config config83 = null;
    java.nio.file.Path path84 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction81, "hi!",
        config83, path84);
    boolean boolean86 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) path84);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str5, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str6, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str7, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str8, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "query-logging" + "'", str9,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService10);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
  }

  @Test
  public void test3064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3064");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService0.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.strForEx(kernelTransaction13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    java.lang.Throwable throwable18 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17, throwable18);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery20 = null;
    queryLoggingService0.sucsForEx(executingQuery20);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    queryLoggingService0.strForEx(kernelTransaction22);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery24 = null;
    queryLoggingService0.sucsForEx(executingQuery24);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3065");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.sucsForEx(executingQuery4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11, throwable12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.rolcForKe(kernelTransaction16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService0.comForKe(kernelTransaction21);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction23 = null;
    queryLoggingService0.rolcForKe(kernelTransaction23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    queryLoggingService0.faleForExTh(executingQuery25,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    queryLoggingService0.comForKe(kernelTransaction28);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery30 = null;
    queryLoggingService0.strForEx(executingQuery30);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery32 = null;
    java.lang.Throwable throwable33 = null;
    queryLoggingService0.faleForExTh(executingQuery32, throwable33);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3066");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    boolean boolean7 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) 100.0d);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory8 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory9 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean11 = queryLoggingServiceExtensionFactory9.equals((java.lang.Object) (-1L));
    boolean boolean12 = queryLoggingServiceExtensionFactory8.equals((java.lang.Object) boolean11);
    java.lang.String str13 = queryLoggingServiceExtensionFactory8.toString();
    java.lang.String str14 = queryLoggingServiceExtensionFactory8.getName();
    boolean boolean16 = queryLoggingServiceExtensionFactory8.equals((java.lang.Object) 0L);
    java.lang.String str17 = queryLoggingServiceExtensionFactory8.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService18 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService18.rolcForKe(kernelTransaction19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService18.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService18.rolcForKe(kernelTransaction24);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    queryLoggingService18.sucsForEx(executingQuery26);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    queryLoggingService18.strForEx(kernelTransaction28);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction30 = null;
    java.lang.Throwable throwable31 = null;
    queryLoggingService18.rolcForKe(kernelTransaction30, throwable31);
    boolean boolean33 = queryLoggingServiceExtensionFactory8.equals((java.lang.Object) throwable31);
    boolean boolean34 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) boolean33);
    java.lang.String str35 = queryLoggingServiceExtensionFactory3.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory36 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean38 = queryLoggingServiceExtensionFactory36.equals((java.lang.Object) (short) 1);
    java.lang.String str39 = queryLoggingServiceExtensionFactory36.getName();
    java.lang.String str40 = queryLoggingServiceExtensionFactory36.getName();
    java.lang.String str41 = queryLoggingServiceExtensionFactory36.toString();
    java.lang.String str42 = queryLoggingServiceExtensionFactory36.getName();
    java.lang.String str43 = queryLoggingServiceExtensionFactory36.toString();
    java.lang.String str44 = queryLoggingServiceExtensionFactory36.getName();
    boolean boolean45 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) str44);
    java.lang.String str46 = queryLoggingServiceExtensionFactory3.getName();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str13, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "query-logging" + "'", str14,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str17, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService18);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertEquals(
        "'" + str35 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str35, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "query-logging" + "'", str39,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "query-logging" + "'", str40,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str41 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str41, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str42 + "' != '" + "query-logging" + "'", str42,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str43 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str43, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str44 + "' != '" + "query-logging" + "'", str44,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertEquals("'" + str46 + "' != '" + "query-logging" + "'", str46,
        "query-logging");
  }

  @Test
  public void test3067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3067");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    java.lang.Object obj5 = new java.lang.Object();
    boolean boolean6 = queryLoggingServiceExtensionFactory0.equals(obj5);
    java.lang.String str7 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService8 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService8.strForEx(executingQuery9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService8.faleForExTh(executingQuery11, throwable12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService8.rolcForKe(kernelTransaction14, throwable15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService8.comForKe(kernelTransaction17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService8.strForEx(executingQuery19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService8.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService8.comForKe(kernelTransaction24);
    boolean boolean26 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService8.rolcForKe(kernelTransaction27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery29 = null;
    java.lang.Throwable throwable30 = null;
    queryLoggingService8.faleForExTh(executingQuery29, throwable30);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery32 = null;
    java.lang.Throwable throwable33 = null;
    queryLoggingService8.faleForExTh(executingQuery32, throwable33);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "query-logging" + "'", str7,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService8);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
  }

  @Test
  public void test3068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3068");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.faleForExTh(executingQuery1,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.sucsForEx(executingQuery4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.faleForExTh(executingQuery11, "hi!");
    java.lang.Class<?> wildcardClass14 = queryLoggingService0.getClass();
    org.junit.Assert.assertNotNull(queryLoggingService0);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3069");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    java.lang.String str5 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str6 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str7 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str8 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService9 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService9.rolcForKe(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService9.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService9.faleForExTh(executingQuery15, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService9.rolcForKe(kernelTransaction18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService9.rolcForKe(kernelTransaction20);
    java.lang.Class<?> wildcardClass22 = queryLoggingService9.getClass();
    boolean boolean23 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) wildcardClass22);
    java.lang.String str24 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.Class<?> wildcardClass25 = queryLoggingServiceExtensionFactory0.getClass();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str5, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str6, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str7, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str8, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService9);
    org.junit.Assert.assertNotNull(wildcardClass22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertEquals(
        "'" + str24 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str24, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test3070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3070");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    boolean boolean6 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) 0L);
    java.lang.String str7 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str8 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str9 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str10 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory11 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory12 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean14 = queryLoggingServiceExtensionFactory12.equals((java.lang.Object) (-1L));
    boolean boolean15 = queryLoggingServiceExtensionFactory11.equals((java.lang.Object) boolean14);
    boolean boolean17 = queryLoggingServiceExtensionFactory11.equals((java.lang.Object) 0L);
    java.lang.String str18 = queryLoggingServiceExtensionFactory11.toString();
    java.lang.String str19 = queryLoggingServiceExtensionFactory11.getName();
    java.lang.Object obj20 = new java.lang.Object();
    java.lang.Class<?> wildcardClass21 = obj20.getClass();
    boolean boolean22 = queryLoggingServiceExtensionFactory11.equals(obj20);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory23 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean25 = queryLoggingServiceExtensionFactory23.equals((java.lang.Object) (short) 1);
    java.lang.String str26 = queryLoggingServiceExtensionFactory23.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService27 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery28 = null;
    queryLoggingService27.strForEx(executingQuery28);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery30 = null;
    java.lang.Throwable throwable31 = null;
    queryLoggingService27.faleForExTh(executingQuery30, throwable31);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction33 = null;
    java.lang.Throwable throwable34 = null;
    queryLoggingService27.rolcForKe(kernelTransaction33, throwable34);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction36 = null;
    queryLoggingService27.comForKe(kernelTransaction36);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery38 = null;
    queryLoggingService27.strForEx(executingQuery38);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery40 = null;
    queryLoggingService27.strForEx(executingQuery40);
    boolean boolean42 = queryLoggingServiceExtensionFactory23.equals(
        (java.lang.Object) executingQuery40);
    boolean boolean43 = queryLoggingServiceExtensionFactory11.equals(
        (java.lang.Object) executingQuery40);
    java.lang.String str44 = queryLoggingServiceExtensionFactory11.toString();
    boolean boolean45 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory11);
    java.lang.String str46 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService47 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery48 = null;
    queryLoggingService47.faleForExTh(executingQuery48,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction51 = null;
    queryLoggingService47.rolcForKe(kernelTransaction51);
    boolean boolean53 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) kernelTransaction51);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService54 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery55 = null;
    queryLoggingService54.strForEx(executingQuery55);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery57 = null;
    java.lang.Throwable throwable58 = null;
    queryLoggingService54.faleForExTh(executingQuery57, throwable58);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction60 = null;
    java.lang.Throwable throwable61 = null;
    queryLoggingService54.rolcForKe(kernelTransaction60, throwable61);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery63 = null;
    queryLoggingService54.faleForExTh(executingQuery63, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery66 = null;
    queryLoggingService54.sucsForEx(executingQuery66);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery68 = null;
    queryLoggingService54.sucsForEx(executingQuery68);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery70 = null;
    java.lang.Throwable throwable71 = null;
    queryLoggingService54.faleForExTh(executingQuery70, throwable71);
    boolean boolean73 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) throwable71);
    java.lang.String str74 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str75 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService76 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction77 = null;
    queryLoggingService76.rolcForKe(kernelTransaction77);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery79 = null;
    queryLoggingService76.faleForExTh(executingQuery79, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery82 = null;
    java.lang.Throwable throwable83 = null;
    queryLoggingService76.faleForExTh(executingQuery82, throwable83);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery85 = null;
    java.lang.Throwable throwable86 = null;
    queryLoggingService76.faleForExTh(executingQuery85, throwable86);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction88 = null;
    queryLoggingService76.strForEx(kernelTransaction88);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction90 = null;
    queryLoggingService76.comForKe(kernelTransaction90);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction92 = null;
    queryLoggingService76.strForEx(kernelTransaction92);
    boolean boolean94 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService76);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str7, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "query-logging" + "'", str8,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "query-logging" + "'", str9,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str10, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str18, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "query-logging" + "'", str19,
        "query-logging");
    org.junit.Assert.assertNotNull(wildcardClass21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "query-logging" + "'", str26,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService27);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertEquals(
        "'" + str44 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str44, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertEquals(
        "'" + str46 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str46, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService47);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertNotNull(queryLoggingService54);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    org.junit.Assert.assertEquals(
        "'" + str74 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str74, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str75 + "' != '" + "query-logging" + "'", str75,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService76);
    org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
  }

  @Test
  public void test3071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3071");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.rolcForKe(kernelTransaction14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.strForEx(kernelTransaction16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction18, throwable19);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3072");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.faleForExTh(executingQuery6, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService0.faleForExTh(executingQuery14, throwable15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService0.strForEx(executingQuery19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    queryLoggingService0.faleForExTh(executingQuery21, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    java.lang.Throwable throwable25 = null;
    queryLoggingService0.rolcForKe(kernelTransaction24, throwable25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService0.strForEx(kernelTransaction27);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3073");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.strForEx(kernelTransaction6);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    queryLoggingService0.strForEx(kernelTransaction8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService0.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService0.rolcForKe(kernelTransaction13, throwable14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.rolcForKe(kernelTransaction18, throwable19);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3074");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.faleForExTh(executingQuery9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService0.faleForExTh(executingQuery14, throwable15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    java.lang.Throwable throwable18 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17, throwable18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.strForEx(kernelTransaction20);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    java.lang.Throwable throwable23 = null;
    queryLoggingService0.rolcForKe(kernelTransaction22, throwable23);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3075");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "hi!");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.faleForExTh(executingQuery16, "");
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3076");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.faleForExTh(executingQuery9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService0.faleForExTh(executingQuery14, throwable15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.faleForExTh(executingQuery17, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.comForKe(kernelTransaction20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    java.lang.Throwable throwable23 = null;
    queryLoggingService0.faleForExTh(executingQuery22, throwable23);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction25 = null;
    queryLoggingService0.strForEx(kernelTransaction25);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3077");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str1 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str2 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService3 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService3.faleForExTh(executingQuery4,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    queryLoggingService3.faleForExTh(executingQuery7,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService3.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService3.rolcForKe(kernelTransaction12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService3.faleForExTh(executingQuery14,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    boolean boolean17 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory18 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean20 = queryLoggingServiceExtensionFactory18.equals((java.lang.Object) (short) 1);
    java.lang.String str21 = queryLoggingServiceExtensionFactory18.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService22 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService22.strForEx(executingQuery23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    java.lang.Throwable throwable26 = null;
    queryLoggingService22.faleForExTh(executingQuery25, throwable26);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    java.lang.Throwable throwable29 = null;
    queryLoggingService22.rolcForKe(kernelTransaction28, throwable29);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction31 = null;
    queryLoggingService22.comForKe(kernelTransaction31);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery33 = null;
    queryLoggingService22.strForEx(executingQuery33);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery35 = null;
    queryLoggingService22.strForEx(executingQuery35);
    boolean boolean37 = queryLoggingServiceExtensionFactory18.equals(
        (java.lang.Object) executingQuery35);
    java.lang.Class<?> wildcardClass38 = queryLoggingServiceExtensionFactory18.getClass();
    boolean boolean39 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) wildcardClass38);
    java.lang.String str40 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str41 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str42 = queryLoggingServiceExtensionFactory0.toString();
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str1, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str2, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService3);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "query-logging" + "'", str21,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService22);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(wildcardClass38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertEquals(
        "'" + str40 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str40, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str41 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str41, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str42 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str42, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3078");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str1 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService2 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService2.rolcForKe(kernelTransaction3, throwable4);
    boolean boolean6 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) throwable4);
    java.lang.String str7 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str8 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService9 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService9.rolcForKe(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService9.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService9.rolcForKe(kernelTransaction15, throwable16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService9.comForKe(kernelTransaction18);
    boolean boolean20 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService9.faleForExTh(executingQuery21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    java.lang.Throwable throwable25 = null;
    queryLoggingService9.rolcForKe(kernelTransaction24, throwable25);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService9.strForEx(kernelTransaction27);
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str1, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService2);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "query-logging" + "'", str7,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str8, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService9);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
  }

  @Test
  public void test3079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3079");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.faleForExTh(executingQuery10, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService0.faleForExTh(executingQuery13, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.faleForExTh(executingQuery16, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService0.strForEx(kernelTransaction19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.rolcForKe(kernelTransaction21, throwable22);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3080");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.faleForExTh(executingQuery9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.strForEx(executingQuery14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction16, throwable17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    java.lang.Throwable throwable20 = null;
    queryLoggingService0.rolcForKe(kernelTransaction19, throwable20);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3081");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService0.comForKe(kernelTransaction4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.sucsForEx(executingQuery9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.strForEx(kernelTransaction13);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3082");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.sucsForEx(executingQuery10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.faleForExTh(executingQuery12, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.rolcForKe(kernelTransaction15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.strForEx(kernelTransaction17);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3083");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.faleForExTh(executingQuery9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.faleForExTh(executingQuery14, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    java.lang.Throwable throwable18 = null;
    queryLoggingService0.faleForExTh(executingQuery17, throwable18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.comForKe(kernelTransaction20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryLoggingService0.faleForExTh(executingQuery22,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    java.lang.Throwable throwable26 = null;
    queryLoggingService0.faleForExTh(executingQuery25, throwable26);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    queryLoggingService0.strForEx(kernelTransaction28);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction30 = null;
    queryLoggingService0.strForEx(kernelTransaction30);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3084");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction8, throwable9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.sucsForEx(executingQuery11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.strForEx(kernelTransaction13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.comForKe(kernelTransaction17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService0.strForEx(executingQuery19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    queryLoggingService0.faleForExTh(executingQuery21, "");
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3085");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (short) 1);
    java.lang.String str3 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService4 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery5 = null;
    queryLoggingService4.strForEx(executingQuery5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService4.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService4.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService4.comForKe(kernelTransaction13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService4.strForEx(executingQuery15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService4.strForEx(executingQuery17);
    boolean boolean19 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery17);
    java.lang.String str20 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str21 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str22 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str23 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str24 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str25 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str26 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory27 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory28 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean30 = queryLoggingServiceExtensionFactory28.equals((java.lang.Object) (-1L));
    boolean boolean31 = queryLoggingServiceExtensionFactory27.equals((java.lang.Object) boolean30);
    boolean boolean33 = queryLoggingServiceExtensionFactory27.equals((java.lang.Object) 0L);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory34 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory35 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean37 = queryLoggingServiceExtensionFactory35.equals((java.lang.Object) (-1L));
    boolean boolean38 = queryLoggingServiceExtensionFactory34.equals((java.lang.Object) boolean37);
    java.lang.Object obj39 = new java.lang.Object();
    boolean boolean40 = queryLoggingServiceExtensionFactory34.equals(obj39);
    java.lang.String str41 = queryLoggingServiceExtensionFactory34.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService42 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery43 = null;
    queryLoggingService42.strForEx(executingQuery43);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery45 = null;
    java.lang.Throwable throwable46 = null;
    queryLoggingService42.faleForExTh(executingQuery45, throwable46);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction48 = null;
    java.lang.Throwable throwable49 = null;
    queryLoggingService42.rolcForKe(kernelTransaction48, throwable49);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction51 = null;
    queryLoggingService42.comForKe(kernelTransaction51);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery53 = null;
    queryLoggingService42.strForEx(executingQuery53);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction55 = null;
    java.lang.Throwable throwable56 = null;
    queryLoggingService42.rolcForKe(kernelTransaction55, throwable56);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction58 = null;
    queryLoggingService42.comForKe(kernelTransaction58);
    boolean boolean60 = queryLoggingServiceExtensionFactory34.equals(
        (java.lang.Object) queryLoggingService42);
    boolean boolean61 = queryLoggingServiceExtensionFactory27.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory34);
    boolean boolean62 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory34);
    java.lang.String str63 = queryLoggingServiceExtensionFactory34.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService64 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction65 = null;
    java.lang.Throwable throwable66 = null;
    queryLoggingService64.rolcForKe(kernelTransaction65, throwable66);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction68 = null;
    queryLoggingService64.comForKe(kernelTransaction68);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery70 = null;
    queryLoggingService64.strForEx(executingQuery70);
    boolean boolean72 = queryLoggingServiceExtensionFactory34.equals(
        (java.lang.Object) executingQuery70);
    java.lang.String str73 = queryLoggingServiceExtensionFactory34.getName();
    java.lang.String str74 = queryLoggingServiceExtensionFactory34.getName();
    java.lang.String str75 = queryLoggingServiceExtensionFactory34.toString();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "query-logging" + "'", str3,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService4);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "query-logging" + "'", str20,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str21, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str22, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "query-logging" + "'", str23,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "query-logging" + "'", str24,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str25 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str25, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "query-logging" + "'", str26,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertEquals("'" + str41 + "' != '" + "query-logging" + "'", str41,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService42);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertEquals("'" + str63 + "' != '" + "query-logging" + "'", str63,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService64);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    org.junit.Assert.assertEquals("'" + str73 + "' != '" + "query-logging" + "'", str73,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str74 + "' != '" + "query-logging" + "'", str74,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str75 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str75, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3086");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    java.lang.String str5 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str6 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory7 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean9 = queryLoggingServiceExtensionFactory7.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory10 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str11 = queryLoggingServiceExtensionFactory10.toString();
    boolean boolean12 = queryLoggingServiceExtensionFactory7.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory10);
    boolean boolean13 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory7);
    java.lang.String str14 = queryLoggingServiceExtensionFactory0.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService15 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    java.lang.Throwable throwable17 = null;
    queryLoggingService15.rolcForKe(kernelTransaction16, throwable17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService15.sucsForEx(executingQuery19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    queryLoggingService15.comForKe(kernelTransaction21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    java.lang.Throwable throwable24 = null;
    queryLoggingService15.faleForExTh(executingQuery23, throwable24);
    boolean boolean26 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) throwable24);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService27 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    queryLoggingService27.rolcForKe(kernelTransaction28);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction30 = null;
    java.lang.Throwable throwable31 = null;
    queryLoggingService27.rolcForKe(kernelTransaction30, throwable31);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery33 = null;
    queryLoggingService27.faleForExTh(executingQuery33, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction36 = null;
    queryLoggingService27.comForKe(kernelTransaction36);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery38 = null;
    queryLoggingService27.sucsForEx(executingQuery38);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery40 = null;
    queryLoggingService27.sucsForEx(executingQuery40);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction42 = null;
    queryLoggingService27.comForKe(kernelTransaction42);
    boolean boolean44 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery45 = null;
    queryLoggingService27.sucsForEx(executingQuery45);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str5, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "query-logging" + "'", str6,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str11, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "query-logging" + "'", str14,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService15);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(queryLoggingService27);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
  }

  @Test
  public void test3087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3087");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.strForEx(kernelTransaction9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.strForEx(executingQuery11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService0.sucsForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.sucsForEx(executingQuery15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.sucsForEx(executingQuery17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService0.strForEx(kernelTransaction19);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3088");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    java.lang.Throwable throwable5 = null;
    queryLoggingService0.faleForExTh(executingQuery4, throwable5);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery7 = null;
    java.lang.Throwable throwable8 = null;
    queryLoggingService0.faleForExTh(executingQuery7, throwable8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    java.lang.Throwable throwable11 = null;
    queryLoggingService0.rolcForKe(kernelTransaction10, throwable11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    queryLoggingService0.strForEx(kernelTransaction13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService0.faleForExTh(executingQuery15, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.strForEx(executingQuery18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    java.lang.Throwable throwable21 = null;
    queryLoggingService0.rolcForKe(kernelTransaction20, throwable21);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction23 = null;
    queryLoggingService0.comForKe(kernelTransaction23);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction25 = null;
    queryLoggingService0.comForKe(kernelTransaction25);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery27 = null;
    queryLoggingService0.sucsForEx(executingQuery27);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction29 = null;
    queryLoggingService0.rolcForKe(kernelTransaction29);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery31 = null;
    queryLoggingService0.faleForExTh(executingQuery31, "hi!");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction34 = null;
    queryLoggingService0.strForEx(kernelTransaction34);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery36 = null;
    java.lang.Throwable throwable37 = null;
    queryLoggingService0.faleForExTh(executingQuery36, throwable37);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3089");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery10 = null;
    queryLoggingService0.strForEx(executingQuery10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.sucsForEx(executingQuery12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.comForKe(kernelTransaction14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.rolcForKe(kernelTransaction16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.strForEx(executingQuery18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.comForKe(kernelTransaction20);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3090");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService0.comForKe(kernelTransaction4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11, throwable12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.strForEx(executingQuery14);
    java.lang.Class<?> wildcardClass16 = queryLoggingService0.getClass();
    org.junit.Assert.assertNotNull(queryLoggingService0);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test3091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3091");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    queryLoggingService0.comForKe(kernelTransaction9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService0.strForEx(kernelTransaction11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService0.rolcForKe(kernelTransaction13, throwable14);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3092");
    }
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl0 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path4 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction1, "hi!", config3,
        path4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.configuration.Config config8 = null;
    java.nio.file.Path path9 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction6,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config8, path9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config13 = null;
    java.nio.file.Path path14 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction11, "", config13,
        path14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.configuration.Config config18 = null;
    java.nio.file.Path path19 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction16, "hi!", config18,
        path19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.configuration.Config config23 = null;
    java.nio.file.Path path24 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction21, "", config23,
        path24);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    org.neo4j.configuration.Config config28 = null;
    java.nio.file.Path path29 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction26, "hi!", config28,
        path29);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction31 = null;
    org.neo4j.configuration.Config config33 = null;
    java.nio.file.Path path34 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction31,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config33, path34);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config38 = null;
    java.nio.file.Path path39 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction36,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config38, path39);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction41 = null;
    org.neo4j.configuration.Config config43 = null;
    java.nio.file.Path path44 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction41, "hi!", config43,
        path44);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction46 = null;
    org.neo4j.configuration.Config config48 = null;
    java.nio.file.Path path49 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl0.init(fileSystemAbstraction46, "", config48,
        path49);
  }

  @Test
  public void test3093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3093");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.sucsForEx(executingQuery8);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction10 = null;
    queryLoggingService0.strForEx(kernelTransaction10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.sucsForEx(executingQuery17);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    java.lang.Throwable throwable20 = null;
    queryLoggingService0.rolcForKe(kernelTransaction19, throwable20);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    queryLoggingService0.comForKe(kernelTransaction22);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3094");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    boolean boolean7 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) 100.0d);
    java.lang.String str8 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str9 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.Object obj10 = null;
    boolean boolean11 = queryLoggingServiceExtensionFactory3.equals(obj10);
    java.lang.String str12 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str13 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str14 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str15 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str16 = queryLoggingServiceExtensionFactory3.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService17 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService17.rolcForKe(kernelTransaction18, throwable19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    queryLoggingService17.sucsForEx(executingQuery21);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery23 = null;
    queryLoggingService17.faleForExTh(executingQuery23, "hi!");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    java.lang.Throwable throwable27 = null;
    queryLoggingService17.faleForExTh(executingQuery26, throwable27);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction29 = null;
    queryLoggingService17.comForKe(kernelTransaction29);
    boolean boolean31 = queryLoggingServiceExtensionFactory3.equals(
        (java.lang.Object) queryLoggingService17);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str8, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "query-logging" + "'", str9,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str12, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "query-logging" + "'", str13,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str14, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str15, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "query-logging" + "'", str16,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService17);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test3095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3095");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService5 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService5.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService5.faleForExTh(executingQuery8, throwable9);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService5.rolcForKe(kernelTransaction11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService5.sucsForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    queryLoggingService5.strForEx(executingQuery15);
    boolean boolean17 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) executingQuery15);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService18 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction19 = null;
    queryLoggingService18.rolcForKe(kernelTransaction19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService18.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery24 = null;
    queryLoggingService18.faleForExTh(executingQuery24, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction27 = null;
    queryLoggingService18.rolcForKe(kernelTransaction27);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery29 = null;
    java.lang.Throwable throwable30 = null;
    queryLoggingService18.faleForExTh(executingQuery29, throwable30);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery32 = null;
    queryLoggingService18.sucsForEx(executingQuery32);
    boolean boolean34 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService18);
    java.lang.String str35 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str36 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str37 = queryLoggingServiceExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext38 = null;
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies queryLoggingServiceDependencies39 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle40 = queryLoggingServiceExtensionFactory0.newInstance(
          extensionContext38, queryLoggingServiceDependencies39);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(queryLoggingService5);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(queryLoggingService18);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertEquals(
        "'" + str35 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str35, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str36 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str36, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str37 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str37, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3096");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    boolean boolean6 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) 0L);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory7 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory8 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean10 = queryLoggingServiceExtensionFactory8.equals((java.lang.Object) (-1L));
    boolean boolean11 = queryLoggingServiceExtensionFactory7.equals((java.lang.Object) boolean10);
    java.lang.Object obj12 = new java.lang.Object();
    boolean boolean13 = queryLoggingServiceExtensionFactory7.equals(obj12);
    java.lang.String str14 = queryLoggingServiceExtensionFactory7.getName();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService15 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService15.strForEx(executingQuery16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService15.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService15.rolcForKe(kernelTransaction21, throwable22);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    queryLoggingService15.comForKe(kernelTransaction24);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery26 = null;
    queryLoggingService15.strForEx(executingQuery26);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    java.lang.Throwable throwable29 = null;
    queryLoggingService15.rolcForKe(kernelTransaction28, throwable29);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction31 = null;
    queryLoggingService15.comForKe(kernelTransaction31);
    boolean boolean33 = queryLoggingServiceExtensionFactory7.equals(
        (java.lang.Object) queryLoggingService15);
    boolean boolean34 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory7);
    io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl35 = new io.github.onograph.kernel.srv.log.query.DiagnosticsOfflineReportProviderQueryLoggingImpl();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config38 = null;
    java.nio.file.Path path39 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction36, "hi!",
        config38, path39);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction41 = null;
    org.neo4j.configuration.Config config43 = null;
    java.nio.file.Path path44 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction41,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config43, path44);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction46 = null;
    org.neo4j.configuration.Config config48 = null;
    java.nio.file.Path path49 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction46,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config48, path49);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction51 = null;
    org.neo4j.configuration.Config config53 = null;
    java.nio.file.Path path54 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction51,
        "query-logging", config53, path54);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction56 = null;
    org.neo4j.configuration.Config config58 = null;
    java.nio.file.Path path59 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction56,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config58, path59);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction61 = null;
    org.neo4j.configuration.Config config63 = null;
    java.nio.file.Path path64 = null;
    diagnosticsOfflineReportProviderQueryLoggingImpl35.init(fileSystemAbstraction61,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]", config63, path64);
    boolean boolean66 = queryLoggingServiceExtensionFactory7.equals(
        (java.lang.Object) diagnosticsOfflineReportProviderQueryLoggingImpl35);
    java.lang.String str67 = queryLoggingServiceExtensionFactory7.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext68 = null;
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies queryLoggingServiceDependencies69 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle70 = queryLoggingServiceExtensionFactory7.newInstance(
          extensionContext68, queryLoggingServiceDependencies69);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "query-logging" + "'", str14,
        "query-logging");
    org.junit.Assert.assertNotNull(queryLoggingService15);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    org.junit.Assert.assertEquals(
        "'" + str67 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str67, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }

  @Test
  public void test3097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3097");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    java.lang.Object obj5 = new java.lang.Object();
    boolean boolean6 = queryLoggingServiceExtensionFactory0.equals(obj5);
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory7 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory8 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean10 = queryLoggingServiceExtensionFactory8.equals((java.lang.Object) (-1L));
    boolean boolean11 = queryLoggingServiceExtensionFactory7.equals((java.lang.Object) boolean10);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService12 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    queryLoggingService12.strForEx(executingQuery13);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery15 = null;
    java.lang.Throwable throwable16 = null;
    queryLoggingService12.faleForExTh(executingQuery15, throwable16);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction18 = null;
    queryLoggingService12.rolcForKe(kernelTransaction18);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery20 = null;
    queryLoggingService12.sucsForEx(executingQuery20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    queryLoggingService12.strForEx(executingQuery22);
    boolean boolean24 = queryLoggingServiceExtensionFactory7.equals(
        (java.lang.Object) executingQuery22);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService25 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction26 = null;
    queryLoggingService25.rolcForKe(kernelTransaction26);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction28 = null;
    java.lang.Throwable throwable29 = null;
    queryLoggingService25.rolcForKe(kernelTransaction28, throwable29);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery31 = null;
    queryLoggingService25.faleForExTh(executingQuery31, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction34 = null;
    queryLoggingService25.rolcForKe(kernelTransaction34);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery36 = null;
    java.lang.Throwable throwable37 = null;
    queryLoggingService25.faleForExTh(executingQuery36, throwable37);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery39 = null;
    queryLoggingService25.sucsForEx(executingQuery39);
    boolean boolean41 = queryLoggingServiceExtensionFactory7.equals(
        (java.lang.Object) queryLoggingService25);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService42 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction43 = null;
    java.lang.Throwable throwable44 = null;
    queryLoggingService42.rolcForKe(kernelTransaction43, throwable44);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery46 = null;
    queryLoggingService42.sucsForEx(executingQuery46);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction48 = null;
    queryLoggingService42.comForKe(kernelTransaction48);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery50 = null;
    queryLoggingService42.faleForExTh(executingQuery50, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction53 = null;
    queryLoggingService42.strForEx(kernelTransaction53);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction55 = null;
    queryLoggingService42.comForKe(kernelTransaction55);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery57 = null;
    queryLoggingService42.strForEx(executingQuery57);
    boolean boolean59 = queryLoggingServiceExtensionFactory7.equals(
        (java.lang.Object) queryLoggingService42);
    boolean boolean60 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean59);
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService61 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery62 = null;
    queryLoggingService61.strForEx(executingQuery62);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery64 = null;
    java.lang.Throwable throwable65 = null;
    queryLoggingService61.faleForExTh(executingQuery64, throwable65);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction67 = null;
    java.lang.Throwable throwable68 = null;
    queryLoggingService61.rolcForKe(kernelTransaction67, throwable68);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery70 = null;
    queryLoggingService61.faleForExTh(executingQuery70, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery73 = null;
    queryLoggingService61.sucsForEx(executingQuery73);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery75 = null;
    queryLoggingService61.sucsForEx(executingQuery75);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction77 = null;
    queryLoggingService61.strForEx(kernelTransaction77);
    boolean boolean79 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) kernelTransaction77);
    java.lang.String str80 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str81 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.Object obj82 = null;
    boolean boolean83 = queryLoggingServiceExtensionFactory0.equals(obj82);
    java.lang.Class<?> wildcardClass84 = queryLoggingServiceExtensionFactory0.getClass();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(queryLoggingService12);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(queryLoggingService25);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(queryLoggingService42);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(queryLoggingService61);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    org.junit.Assert.assertEquals("'" + str80 + "' != '" + "query-logging" + "'", str80,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str81 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str81, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    org.junit.Assert.assertNotNull(wildcardClass84);
  }

  @Test
  public void test3098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3098");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.rolcForKe(kernelTransaction3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.rolcForKe(kernelTransaction9, throwable10);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.strForEx(executingQuery12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    java.lang.Throwable throwable15 = null;
    queryLoggingService0.faleForExTh(executingQuery14, throwable15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery19 = null;
    queryLoggingService0.sucsForEx(executingQuery19);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3099");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.rolcForKe(kernelTransaction15);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery17 = null;
    queryLoggingService0.faleForExTh(executingQuery17,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService0.strForEx(kernelTransaction20);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery22 = null;
    java.lang.Throwable throwable23 = null;
    queryLoggingService0.faleForExTh(executingQuery22, throwable23);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery25 = null;
    java.lang.Throwable throwable26 = null;
    queryLoggingService0.faleForExTh(executingQuery25, throwable26);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3100");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService0.comForKe(kernelTransaction4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.sucsForEx(executingQuery6);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction8 = null;
    java.lang.Throwable throwable9 = null;
    queryLoggingService0.rolcForKe(kernelTransaction8, throwable9);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.faleForExTh(executingQuery11, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.faleForExTh(executingQuery14,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3101");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory3 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    java.lang.String str4 = queryLoggingServiceExtensionFactory3.toString();
    boolean boolean5 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingServiceExtensionFactory3);
    boolean boolean7 = queryLoggingServiceExtensionFactory3.equals((java.lang.Object) 100.0d);
    java.lang.String str8 = queryLoggingServiceExtensionFactory3.getName();
    java.lang.String str9 = queryLoggingServiceExtensionFactory3.toString();
    java.lang.String str10 = queryLoggingServiceExtensionFactory3.getName();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str4, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "query-logging" + "'", str8,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str9, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "query-logging" + "'", str10,
        "query-logging");
  }

  @Test
  public void test3102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3102");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory1 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean3 = queryLoggingServiceExtensionFactory1.equals((java.lang.Object) (-1L));
    boolean boolean4 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) boolean3);
    java.lang.String str5 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str6 = queryLoggingServiceExtensionFactory0.getName();
    boolean boolean8 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) 0L);
    java.lang.String str9 = queryLoggingServiceExtensionFactory0.toString();
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService10 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    queryLoggingService10.rolcForKe(kernelTransaction11);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService10.rolcForKe(kernelTransaction13, throwable14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService10.rolcForKe(kernelTransaction16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService10.sucsForEx(executingQuery18);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction20 = null;
    queryLoggingService10.strForEx(kernelTransaction20);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction22 = null;
    java.lang.Throwable throwable23 = null;
    queryLoggingService10.rolcForKe(kernelTransaction22, throwable23);
    boolean boolean25 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) throwable23);
    java.lang.Class<?> wildcardClass26 = queryLoggingServiceExtensionFactory0.getClass();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str5, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "query-logging" + "'", str6,
        "query-logging");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str9, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertNotNull(queryLoggingService10);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(wildcardClass26);
  }

  @Test
  public void test3103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3103");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    queryLoggingService0.strForEx(kernelTransaction6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery11 = null;
    queryLoggingService0.strForEx(executingQuery11);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery13 = null;
    java.lang.Throwable throwable14 = null;
    queryLoggingService0.faleForExTh(executingQuery13, throwable14);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3104");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "query-logging");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    java.lang.Throwable throwable13 = null;
    queryLoggingService0.rolcForKe(kernelTransaction12, throwable13);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction15 = null;
    queryLoggingService0.strForEx(kernelTransaction15);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction17 = null;
    queryLoggingService0.rolcForKe(kernelTransaction17);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3105");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    java.lang.Throwable throwable2 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1, throwable2);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery4 = null;
    queryLoggingService0.sucsForEx(executingQuery4);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    queryLoggingService0.strForEx(executingQuery6);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery8 = null;
    queryLoggingService0.faleForExTh(executingQuery8, "");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction11 = null;
    java.lang.Throwable throwable12 = null;
    queryLoggingService0.rolcForKe(kernelTransaction11, throwable12);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery14 = null;
    queryLoggingService0.sucsForEx(executingQuery14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    java.lang.Throwable throwable19 = null;
    queryLoggingService0.faleForExTh(executingQuery18, throwable19);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    queryLoggingService0.faleForExTh(executingQuery21,
        "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.neo4j.kernel.api.KernelTransaction kernelTransaction24 = null;
    java.lang.Throwable throwable25 = null;
    queryLoggingService0.rolcForKe(kernelTransaction24, throwable25);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3106");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction1 = null;
    queryLoggingService0.rolcForKe(kernelTransaction1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    queryLoggingService0.faleForExTh(executingQuery3, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.faleForExTh(executingQuery6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    java.lang.Throwable throwable10 = null;
    queryLoggingService0.faleForExTh(executingQuery9, throwable10);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction12 = null;
    queryLoggingService0.strForEx(kernelTransaction12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.strForEx(kernelTransaction14);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery16 = null;
    queryLoggingService0.sucsForEx(executingQuery16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.faleForExTh(executingQuery18, "hi!");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery21 = null;
    java.lang.Throwable throwable22 = null;
    queryLoggingService0.faleForExTh(executingQuery21, throwable22);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery24 = null;
    queryLoggingService0.sucsForEx(executingQuery24);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3107");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService0 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery1 = null;
    queryLoggingService0.strForEx(executingQuery1);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery3 = null;
    java.lang.Throwable throwable4 = null;
    queryLoggingService0.faleForExTh(executingQuery3, throwable4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService0.rolcForKe(kernelTransaction6, throwable7);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery9 = null;
    queryLoggingService0.faleForExTh(executingQuery9, "");
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery12 = null;
    queryLoggingService0.strForEx(executingQuery12);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction14 = null;
    queryLoggingService0.strForEx(kernelTransaction14);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction16 = null;
    queryLoggingService0.comForKe(kernelTransaction16);
    org.neo4j.kernel.api.query.ExecutingQuery executingQuery18 = null;
    queryLoggingService0.sucsForEx(executingQuery18);
    org.junit.Assert.assertNotNull(queryLoggingService0);
  }

  @Test
  public void test3108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3108");
    }
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory queryLoggingServiceExtensionFactory0 = new io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory();
    boolean boolean2 = queryLoggingServiceExtensionFactory0.equals((java.lang.Object) (-1L));
    io.github.onograph.kernel.srv.log.query.QueryLoggingService queryLoggingService3 = io.github.onograph.kernel.srv.log.query.QueryLoggingService.NO_LG;
    org.neo4j.kernel.api.KernelTransaction kernelTransaction4 = null;
    queryLoggingService3.rolcForKe(kernelTransaction4);
    org.neo4j.kernel.api.KernelTransaction kernelTransaction6 = null;
    java.lang.Throwable throwable7 = null;
    queryLoggingService3.rolcForKe(kernelTransaction6, throwable7);
    boolean boolean9 = queryLoggingServiceExtensionFactory0.equals(
        (java.lang.Object) queryLoggingService3);
    java.lang.String str10 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str11 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str12 = queryLoggingServiceExtensionFactory0.getName();
    java.lang.String str13 = queryLoggingServiceExtensionFactory0.toString();
    java.lang.String str14 = queryLoggingServiceExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext15 = null;
    io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies queryLoggingServiceDependencies16 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle17 = queryLoggingServiceExtensionFactory0.newInstance(
          extensionContext15, queryLoggingServiceDependencies16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(queryLoggingService3);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str10, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "query-logging" + "'", str11,
        "query-logging");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "query-logging" + "'", str12,
        "query-logging");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str13, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "Extension:QueryLoggingServiceExtensionFactory[query-logging]"
            + "'", str14, "Extension:QueryLoggingServiceExtensionFactory[query-logging]");
  }
}

